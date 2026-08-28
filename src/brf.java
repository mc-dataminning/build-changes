import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class brf {
   public static final int a = 100;
   public static final int b = 300;
   private static final yi c = yi.a.a(new xj(xj.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xr(xr.a.a, xl.b("MCPE-28723")));
   private final List<brd> d = Lists.newArrayList();
   private final btk e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public brf(btk $$0) {
      this.e = $$0;
   }

   public void a(bri $$0, float $$1) {
      this.c();
      brn $$2 = brn.a(this.e);
      brd $$3 = new brd($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bD() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bri $$0) {
      return $$0.d() instanceof btk;
   }

   private xl a(bsp $$0, xl $$1, String $$2, String $$3) {
      cuk $$5 = $$0 instanceof btk $$4 ? $$4.eX() : cuk.l;
      return !$$5.e() && $$5.b(km.f) ? xl.a($$2, this.e.O_(), $$1, $$5.G()) : xl.a($$3, this.e.O_(), $$1);
   }

   private xl a(brd $$0, @Nullable bsp $$1) {
      bri $$2 = $$0.a();
      if (!$$2.a(awn.n) && !$$2.a(awn.t)) {
         xl $$4 = a($$1);
         bsp $$5 = $$2.d();
         xl $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xl)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xl.a("death.fell.killer", this.e.O_()));
         }
      } else {
         brn $$3 = Objects.requireNonNullElse($$0.c(), brn.a);
         return xl.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static xl a(@Nullable bsp $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public xl a() {
      if (this.d.isEmpty()) {
         return xl.a("death.attack.generic", this.e.O_());
      } else {
         brd $$0 = this.d.get(this.d.size() - 1);
         bri $$1 = $$0.a();
         brd $$2 = this.d();
         brm $$3 = $$1.j().e();
         if ($$3 == brm.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == brm.c) {
            String $$4 = "death.attack." + $$1.e();
            xl $$5 = xo.a((xl)xl.c($$4 + ".link")).c(c);
            return xl.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private brd d() {
      brd $$0 = null;
      brd $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         brd $$5 = this.d.get($$4);
         brd $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bri $$7 = $$5.a();
         boolean $$8 = $$7.a(awn.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awn.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bD() || this.e.ai - this.f > $$0)) {
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
