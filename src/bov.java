import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bov {
   public static final int a = 100;
   public static final int b = 300;
   private static final xf c = xf.a.a(new wg(wg.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new wo(wo.a.a, wi.b("MCPE-28723")));
   private final List<bot> d = Lists.newArrayList();
   private final bqt e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bov(bqt $$0) {
      this.e = $$0;
   }

   public void a(boy $$0, float $$1) {
      this.c();
      bpd $$2 = bpd.a(this.e);
      bot $$3 = new bot($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bA() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(boy $$0) {
      return $$0.d() instanceof bqt;
   }

   private wi a(bqa $$0, wi $$1, String $$2, String $$3) {
      crs $$5 = $$0 instanceof bqt $$4 ? $$4.eU() : crs.i;
      return !$$5.d() && $$5.b(jr.d) ? wi.a($$2, this.e.O_(), $$1, $$5.E()) : wi.a($$3, this.e.O_(), $$1);
   }

   private wi a(bot $$0, @Nullable bqa $$1) {
      boy $$2 = $$0.a();
      if (!$$2.a(avg.n) && !$$2.a(avg.t)) {
         wi $$4 = a($$1);
         bqa $$5 = $$2.d();
         wi $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wi)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wi.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bpd $$3 = Objects.requireNonNullElse($$0.c(), bpd.a);
         return wi.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static wi a(@Nullable bqa $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public wi a() {
      if (this.d.isEmpty()) {
         return wi.a("death.attack.generic", this.e.O_());
      } else {
         bot $$0 = this.d.get(this.d.size() - 1);
         boy $$1 = $$0.a();
         bot $$2 = this.d();
         bpc $$3 = $$1.j().e();
         if ($$3 == bpc.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bpc.c) {
            String $$4 = "death.attack." + $$1.e();
            wi $$5 = wl.a((wi)wi.c($$4 + ".link")).c(c);
            return wi.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bot d() {
      bot $$0 = null;
      bot $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bot $$5 = this.d.get($$4);
         bot $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         boy $$7 = $$5.a();
         boolean $$8 = $$7.a(avg.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(avg.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ah - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bA() || this.e.ah - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ah;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
