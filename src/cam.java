import java.util.EnumSet;

public class cam extends cao {
   public static final int a = 12;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 1;
   private final bun e;
   private btq f;
   private final dcc g;
   private final double h;
   private final cdc i;
   private int j;
   private final float k;
   private final float l;
   private float m;
   private final boolean n;

   public cam(bun $$0, double $$1, float $$2, float $$3, boolean $$4) {
      this.e = $$0;
      this.g = $$0.dP();
      this.h = $$1;
      this.i = $$0.K();
      this.l = $$2;
      this.k = $$3;
      this.n = $$4;
      this.a(EnumSet.of(cao.a.a, cao.a.b));
      if (!($$0.K() instanceof cdb) && !($$0.K() instanceof cda)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean a() {
      btq $$0 = this.e.P_();
      if ($$0 == null) {
         return false;
      } else if ($$0.N_()) {
         return false;
      } else if (this.h()) {
         return false;
      } else if (this.e.g((bsv)$$0) < (double)(this.l * this.l)) {
         return false;
      } else {
         this.f = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (this.i.l()) {
         return false;
      } else {
         return this.h() ? false : !(this.e.g((bsv)this.f) <= (double)(this.k * this.k));
      }
   }

   private boolean h() {
      return this.e.gq() || this.e.bR() || this.e.ge();
   }

   @Override
   public void c() {
      this.j = 0;
      this.m = this.e.a(eon.j);
      this.e.a(eon.j, 0.0F);
   }

   @Override
   public void d() {
      this.f = null;
      this.i.n();
      this.e.a(eon.j, this.m);
   }

   @Override
   public void e() {
      this.e.G().a(this.f, 10.0F, (float)this.e.aa());
      if (--this.j <= 0) {
         this.j = this.a(10);
         if (this.e.g((bsv)this.f) >= 144.0) {
            this.i();
         } else {
            this.i.a(this.f, this.h);
         }
      }
   }

   private void i() {
      iz $$0 = this.f.dp();

      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.a(-3, 3);
         int $$3 = this.a(-1, 1);
         int $$4 = this.a(-3, 3);
         boolean $$5 = this.a($$0.u() + $$2, $$0.v() + $$3, $$0.w() + $$4);
         if ($$5) {
            return;
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (Math.abs((double)$$0 - this.f.du()) < 2.0 && Math.abs((double)$$2 - this.f.dA()) < 2.0) {
         return false;
      } else if (!this.a(new iz($$0, $$1, $$2))) {
         return false;
      } else {
         this.e.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.e.dF(), this.e.dH());
         this.i.n();
         return true;
      }
   }

   private boolean a(iz $$0) {
      eon $$1 = eos.b(this.e, $$0);
      if ($$1 != eon.c) {
         return false;
      } else {
         dsd $$2 = this.g.a_($$0.d());
         if (!this.n && $$2.b() instanceof djk) {
            return false;
         } else {
            iz $$3 = $$0.b(this.e.dp());
            return this.g.a(this.e, this.e.cK().a($$3));
         }
      }
   }

   private int a(int $$0, int $$1) {
      return this.e.el().a($$1 - $$0 + 1) + $$0;
   }
}
