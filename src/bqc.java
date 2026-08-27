import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bqc {
   public static final int a = 100;
   public static final int b = 300;
   private static final xr c = xr.a.a(new ws(ws.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xa(xa.a.a, wu.b("MCPE-28723")));
   private final List<bqa> d = Lists.newArrayList();
   private final bsa e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bqc(bsa $$0) {
      this.e = $$0;
   }

   public void a(bqf $$0, float $$1) {
      this.c();
      bqk $$2 = bqk.a(this.e);
      bqa $$3 = new bqa($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bB() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bqf $$0) {
      return $$0.d() instanceof bsa;
   }

   private wu a(brh $$0, wu $$1, String $$2, String $$3) {
      csz $$5 = $$0 instanceof bsa $$4 ? $$4.eV() : csz.i;
      return !$$5.d() && $$5.b(ka.f) ? wu.a($$2, this.e.O_(), $$1, $$5.E()) : wu.a($$3, this.e.O_(), $$1);
   }

   private wu a(bqa $$0, @Nullable brh $$1) {
      bqf $$2 = $$0.a();
      if (!$$2.a(avt.n) && !$$2.a(avt.t)) {
         wu $$4 = a($$1);
         brh $$5 = $$2.d();
         wu $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wu)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wu.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bqk $$3 = Objects.requireNonNullElse($$0.c(), bqk.a);
         return wu.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static wu a(@Nullable brh $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public wu a() {
      if (this.d.isEmpty()) {
         return wu.a("death.attack.generic", this.e.O_());
      } else {
         bqa $$0 = this.d.get(this.d.size() - 1);
         bqf $$1 = $$0.a();
         bqa $$2 = this.d();
         bqj $$3 = $$1.j().e();
         if ($$3 == bqj.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bqj.c) {
            String $$4 = "death.attack." + $$1.e();
            wu $$5 = wx.a((wu)wu.c($$4 + ".link")).c(c);
            return wu.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bqa d() {
      bqa $$0 = null;
      bqa $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bqa $$5 = this.d.get($$4);
         bqa $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bqf $$7 = $$5.a();
         boolean $$8 = $$7.a(avt.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(avt.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bB() || this.e.ai - this.f > $$0)) {
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
