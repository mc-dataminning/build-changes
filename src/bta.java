import java.util.EnumSet;
import javax.annotation.Nullable;

public class bta extends bsb {
   private final bli a;
   private final cbm b;
   @Nullable
   private blg c;
   private int d = -1;
   private final double e;
   private int f;
   private final int g;
   private final int h;
   private final float i;
   private final float j;

   public bta(cbm $$0, double $$1, int $$2, float $$3) {
      this($$0, $$1, $$2, $$2, $$3);
   }

   public bta(cbm $$0, double $$1, int $$2, int $$3, float $$4) {
      if (!($$0 instanceof blg)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = $$0;
         this.a = (bli)$$0;
         this.e = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$4 * $$4;
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }
   }

   @Override
   public boolean a() {
      blg $$0 = this.a.q();
      if ($$0 != null && $$0.bx()) {
         this.c = $$0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      return this.a() || this.c.bx() && !this.a.N().l();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      double $$0 = this.a.i(this.c.ds(), this.c.du(), this.c.dy());
      boolean $$1 = this.a.O().a(this.c);
      if ($$1) {
         this.f++;
      } else {
         this.f = 0;
      }

      if (!($$0 > (double)this.j) && this.f >= 5) {
         this.a.N().n();
      } else {
         this.a.N().a(this.c, this.e);
      }

      this.a.I().a(this.c, 30.0F, 30.0F);
      if (--this.d == 0) {
         if (!$$1) {
            return;
         }

         float $$2 = (float)Math.sqrt($$0) / this.i;
         float $$3 = atm.a($$2, 0.1F, 1.0F);
         this.b.a(this.c, $$3);
         this.d = atm.d($$2 * (float)(this.h - this.g) + (float)this.g);
      } else if (this.d < 0) {
         this.d = atm.a(atm.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
      }
   }
}
