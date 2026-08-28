import java.util.EnumSet;
import javax.annotation.Nullable;

public class caz extends caa {
   private final bte a;
   private final cjv b;
   @Nullable
   private btc c;
   private int d = -1;
   private final double e;
   private int f;
   private final int g;
   private final int h;
   private final float i;
   private final float j;

   public caz(cjv $$0, double $$1, int $$2, float $$3) {
      this($$0, $$1, $$2, $$2, $$3);
   }

   public caz(cjv $$0, double $$1, int $$2, int $$3, float $$4) {
      if (!($$0 instanceof btc)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = $$0;
         this.a = (bte)$$0;
         this.e = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$4 * $$4;
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }
   }

   @Override
   public boolean a() {
      btc $$0 = this.a.p();
      if ($$0 != null && $$0.bF()) {
         this.c = $$0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      return this.a() || this.c.bF() && !this.a.J().l();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      double $$0 = this.a.i(this.c.dw(), this.c.dy(), this.c.dC());
      boolean $$1 = this.a.L().a(this.c);
      if ($$1) {
         this.f++;
      } else {
         this.f = 0;
      }

      if (!($$0 > (double)this.j) && this.f >= 5) {
         this.a.J().n();
      } else {
         this.a.J().a(this.c, this.e);
      }

      this.a.F().a(this.c, 30.0F, 30.0F);
      if (--this.d == 0) {
         if (!$$1) {
            return;
         }

         float $$2 = (float)Math.sqrt($$0) / this.i;
         float $$3 = ayg.a($$2, 0.1F, 1.0F);
         this.b.a(this.c, $$3);
         this.d = ayg.d($$2 * (float)(this.h - this.g) + (float)this.g);
      } else if (this.d < 0) {
         this.d = ayg.a(ayg.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
      }
   }
}
