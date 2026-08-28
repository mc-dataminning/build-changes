import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdd extends cce {
   private final bvi a;
   private final cmb b;
   @Nullable
   private bvg c;
   private int d = -1;
   private final double e;
   private int f;
   private final int g;
   private final int h;
   private final float i;
   private final float j;

   public cdd(cmb $$0, double $$1, int $$2, float $$3) {
      this($$0, $$1, $$2, $$2, $$3);
   }

   public cdd(cmb $$0, double $$1, int $$2, int $$3, float $$4) {
      if (!($$0 instanceof bvg)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = $$0;
         this.a = (bvi)$$0;
         this.e = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$4 * $$4;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }
   }

   @Override
   public boolean b() {
      bvg $$0 = this.a.O_();
      if ($$0 != null && $$0.bL()) {
         this.c = $$0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean c() {
      return this.b() || this.c.bL() && !this.a.L().k();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      double $$0 = this.a.i(this.c.dB(), this.c.dD(), this.c.dH());
      boolean $$1 = this.a.N().a(this.c);
      if ($$1) {
         this.f++;
      } else {
         this.f = 0;
      }

      if (!($$0 > (double)this.j) && this.f >= 5) {
         this.a.L().m();
      } else {
         this.a.L().a(this.c, this.e);
      }

      this.a.H().a(this.c, 30.0F, 30.0F);
      if (--this.d == 0) {
         if (!$$1) {
            return;
         }

         float $$2 = (float)Math.sqrt($$0) / this.i;
         float $$3 = ayz.a($$2, 0.1F, 1.0F);
         this.b.a(this.c, $$3);
         this.d = ayz.d($$2 * (float)(this.h - this.g) + (float)this.g);
      } else if (this.d < 0) {
         this.d = ayz.a(ayz.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
      }
   }
}
