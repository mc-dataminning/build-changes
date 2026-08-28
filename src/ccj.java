import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccj extends cbk {
   private final bup a;
   private final clh b;
   @Nullable
   private bun c;
   private int d = -1;
   private final double e;
   private int f;
   private final int g;
   private final int h;
   private final float i;
   private final float j;

   public ccj(clh $$0, double $$1, int $$2, float $$3) {
      this($$0, $$1, $$2, $$2, $$3);
   }

   public ccj(clh $$0, double $$1, int $$2, int $$3, float $$4) {
      if (!($$0 instanceof bun)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = $$0;
         this.a = (bup)$$0;
         this.e = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$4 * $$4;
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }
   }

   @Override
   public boolean b() {
      bun $$0 = this.a.m();
      if ($$0 != null && $$0.bI()) {
         this.c = $$0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean c() {
      return this.b() || this.c.bI() && !this.a.P().m();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public void a() {
      double $$0 = this.a.i(this.c.dx(), this.c.dz(), this.c.dD());
      boolean $$1 = this.a.Q().a(this.c);
      if ($$1) {
         this.f++;
      } else {
         this.f = 0;
      }

      if (!($$0 > (double)this.j) && this.f >= 5) {
         this.a.P().o();
      } else {
         this.a.P().a(this.c, this.e);
      }

      this.a.K().a(this.c, 30.0F, 30.0F);
      if (--this.d == 0) {
         if (!$$1) {
            return;
         }

         float $$2 = (float)Math.sqrt($$0) / this.i;
         float $$3 = azf.a($$2, 0.1F, 1.0F);
         this.b.a(this.c, $$3);
         this.d = azf.d($$2 * (float)(this.h - this.g) + (float)this.g);
      } else if (this.d < 0) {
         this.d = azf.a(azf.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
      }
   }
}
