import java.util.EnumSet;

public class bvs extends bvu {
   public static final int a = 12;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 1;
   private final bpt e;
   private box f;
   private final cwh g;
   private final double h;
   private final byi i;
   private int j;
   private final float k;
   private final float l;
   private float m;
   private final boolean n;

   public bvs(bpt $$0, double $$1, float $$2, float $$3, boolean $$4) {
      this.e = $$0;
      this.g = $$0.dJ();
      this.h = $$1;
      this.i = $$0.N();
      this.l = $$2;
      this.k = $$3;
      this.n = $$4;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      if (!($$0.N() instanceof byh) && !($$0.N() instanceof byg)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean a() {
      box $$0 = this.e.R_();
      if ($$0 == null) {
         return false;
      } else if ($$0.P_()) {
         return false;
      } else if (this.h()) {
         return false;
      } else if (this.e.f($$0) < (double)(this.l * this.l)) {
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
         return this.h() ? false : !(this.e.f(this.f) <= (double)(this.k * this.k));
      }
   }

   private boolean h() {
      return this.e.gl() || this.e.bL() || this.e.fZ();
   }

   @Override
   public void c() {
      this.j = 0;
      this.m = this.e.a(eic.j);
      this.e.a(eic.j, 0.0F);
   }

   @Override
   public void d() {
      this.f = null;
      this.i.n();
      this.e.a(eic.j, this.m);
   }

   @Override
   public void e() {
      this.e.I().a(this.f, 10.0F, (float)this.e.ab());
      if (--this.j <= 0) {
         this.j = this.a(10);
         if (this.e.f(this.f) >= 144.0) {
            this.i();
         } else {
            this.i.a(this.f, this.h);
         }
      }
   }

   private void i() {
      ib $$0 = this.f.dj();

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
      if (Math.abs((double)$$0 - this.f.do()) < 2.0 && Math.abs((double)$$2 - this.f.du()) < 2.0) {
         return false;
      } else if (!this.a(new ib($$0, $$1, $$2))) {
         return false;
      } else {
         this.e.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.e.dz(), this.e.dB());
         this.i.n();
         return true;
      }
   }

   private boolean a(ib $$0) {
      eic $$1 = eil.a(this.g, $$0.j());
      if ($$1 != eic.c) {
         return false;
      } else {
         dme $$2 = this.g.a_($$0.d());
         if (!this.n && $$2.b() instanceof ddo) {
            return false;
         } else {
            ib $$3 = $$0.b(this.e.dj());
            return this.g.a(this.e, this.e.cE().a($$3));
         }
      }
   }

   private int a(int $$0, int $$1) {
      return this.e.ef().a($$1 - $$0 + 1) + $$0;
   }
}
