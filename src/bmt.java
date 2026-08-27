import java.util.EnumSet;

public class bmt extends bmv {
   public static final int a = 12;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 1;
   private final bgv e;
   private bfz f;
   private final cmp g;
   private final double h;
   private final bpj i;
   private int j;
   private final float k;
   private final float l;
   private float m;
   private final boolean n;

   public bmt(bgv $$0, double $$1, float $$2, float $$3, boolean $$4) {
      this.e = $$0;
      this.g = $$0.dI();
      this.h = $$1;
      this.i = $$0.J();
      this.l = $$2;
      this.k = $$3;
      this.n = $$4;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      if (!($$0.J() instanceof bpi) && !($$0.J() instanceof bph)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean a() {
      bfz $$0 = this.e.I_();
      if ($$0 == null) {
         return false;
      } else if ($$0.G_()) {
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
      return this.e.fY() || this.e.bM() || this.e.fO();
   }

   @Override
   public void c() {
      this.j = 0;
      this.m = this.e.a(dxp.j);
      this.e.a(dxp.j, 0.0F);
   }

   @Override
   public void d() {
      this.f = null;
      this.i.n();
      this.e.a(dxp.j, this.m);
   }

   @Override
   public void e() {
      this.e.E().a(this.f, 10.0F, (float)this.e.X());
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
      gu $$0 = this.f.di();

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
      if (Math.abs((double)$$0 - this.f.dn()) < 2.0 && Math.abs((double)$$2 - this.f.dt()) < 2.0) {
         return false;
      } else if (!this.a(new gu($$0, $$1, $$2))) {
         return false;
      } else {
         this.e.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.e.dy(), this.e.dA());
         this.i.n();
         return true;
      }
   }

   private boolean a(gu $$0) {
      dxp $$1 = dxy.a(this.g, $$0.j());
      if ($$1 != dxp.c) {
         return false;
      } else {
         dcb $$2 = this.g.a_($$0.d());
         if (!this.n && $$2.b() instanceof ctu) {
            return false;
         } else {
            gu $$3 = $$0.b(this.e.di());
            return this.g.a(this.e, this.e.cE().a($$3));
         }
      }
   }

   private int a(int $$0, int $$1) {
      return this.e.ec().a($$1 - $$0 + 1) + $$0;
   }
}
