import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bqw {
   public static final int a = 100;
   public static final int b = 300;
   private static final xr c = xr.a.a(new ws(ws.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xa(xa.a.a, wu.b("MCPE-28723")));
   private final List<bqu> d = Lists.newArrayList();
   private final btb e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bqw(btb $$0) {
      this.e = $$0;
   }

   public void a(bqz $$0, float $$1) {
      this.c();
      bre $$2 = bre.a(this.e);
      bqu $$3 = new bqu($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bE() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bqz $$0) {
      return $$0.d() instanceof btb;
   }

   private wu a(bsg $$0, wu $$1, String $$2, String $$3) {
      cuc $$5 = $$0 instanceof btb $$4 ? $$4.eU() : cuc.l;
      return !$$5.e() && $$5.b(kn.g) ? wu.a($$2, this.e.O_(), $$1, $$5.F()) : wu.a($$3, this.e.O_(), $$1);
   }

   private wu a(bqu $$0, @Nullable bsg $$1) {
      bqz $$2 = $$0.a();
      if (!$$2.a(avy.n) && !$$2.a(avy.t)) {
         wu $$4 = a($$1);
         bsg $$5 = $$2.d();
         wu $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wu)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wu.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bre $$3 = Objects.requireNonNullElse($$0.c(), bre.a);
         return wu.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static wu a(@Nullable bsg $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public wu a() {
      if (this.d.isEmpty()) {
         return wu.a("death.attack.generic", this.e.O_());
      } else {
         bqu $$0 = this.d.get(this.d.size() - 1);
         bqz $$1 = $$0.a();
         bqu $$2 = this.d();
         brd $$3 = $$1.j().e();
         if ($$3 == brd.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == brd.c) {
            String $$4 = "death.attack." + $$1.e();
            wu $$5 = wx.a((wu)wu.c($$4 + ".link")).c(c);
            return wu.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bqu d() {
      bqu $$0 = null;
      bqu $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bqu $$5 = this.d.get($$4);
         bqu $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bqz $$7 = $$5.a();
         boolean $$8 = $$7.a(avy.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(avy.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
            if ($$4 > 0) {
               $$0 = $$6;
            } else {
               $$0 = $$5;
            }

            $$3 = $$9;
         }

         if ($$5.c() != null && ($$1 == null || $$5.b() > $$2)) {
            $$1 = $$5;
            $$2 = $$5.b();
         }
      }

      if ($$3 > 5.0F && $$0 != null) {
         return $$0;
      } else {
         return $$2 > 5.0F && $$1 != null ? $$1 : null;
      }
   }

   public int b() {
      return this.i ? this.e.ai - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bE() || this.e.ai - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ai;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
