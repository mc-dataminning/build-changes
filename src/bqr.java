import java.util.EnumSet;
import javax.annotation.Nullable;

public class bqr extends bps {
   private final biy a;
   private final bzd b;
   @Nullable
   private biw c;
   private int d = -1;
   private final double e;
   private int f;
   private final int g;
   private final int h;
   private final float i;
   private final float j;

   public bqr(bzd $$0, double $$1, int $$2, float $$3) {
      this($$0, $$1, $$2, $$2, $$3);
   }

   public bqr(bzd $$0, double $$1, int $$2, int $$3, float $$4) {
      if (!($$0 instanceof biw)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = $$0;
         this.a = (biy)$$0;
         this.e = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$4 * $$4;
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }
   }

   @Override
   public boolean a() {
      biw $$0 = this.a.j();
      if ($$0 != null && $$0.bv()) {
         this.c = $$0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      return this.a() || this.c.bv() && !this.a.H().l();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      double $$0 = this.a.i(this.c.dp(), this.c.dr(), this.c.dv());
      boolean $$1 = this.a.J().a(this.c);
      if ($$1) {
         this.f++;
      } else {
         this.f = 0;
      }

      if (!($$0 > (double)this.j) && this.f >= 5) {
         this.a.H().n();
      } else {
         this.a.H().a(this.c, this.e);
      }

      this.a.D().a(this.c, 30.0F, 30.0F);
      if (--this.d == 0) {
         if (!$$1) {
            return;
         }

         float $$2 = (float)Math.sqrt($$0) / this.i;
         float $$3 = aro.a($$2, 0.1F, 1.0F);
         this.b.a(this.c, $$3);
         this.d = aro.d($$2 * (float)(this.h - this.g) + (float)this.g);
      } else if (this.d < 0) {
         this.d = aro.a(aro.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
      }
   }
}
