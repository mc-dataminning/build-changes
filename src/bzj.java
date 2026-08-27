import java.util.EnumSet;

public class bzj extends bzl {
   public static final int a = 12;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 1;
   private final btk e;
   private bso f;
   private final dcd g;
   private final double h;
   private final cbz i;
   private int j;
   private final float k;
   private final float l;
   private float m;
   private final boolean n;

   public bzj(btk $$0, double $$1, float $$2, float $$3, boolean $$4) {
      this.e = $$0;
      this.g = $$0.dU();
      this.h = $$1;
      this.i = $$0.J();
      this.l = $$2;
      this.k = $$3;
      this.n = $$4;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      if (!($$0.J() instanceof cby) && !($$0.J() instanceof cbx)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean a() {
      bso $$0 = this.e.Q_();
      if ($$0 == null) {
         return false;
      } else if ($$0.O_()) {
         return false;
      } else if (this.h()) {
         return false;
      } else if (this.e.g((brv)$$0) < (double)(this.l * this.l)) {
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
         return this.h() ? false : !(this.e.g((brv)this.f) <= (double)(this.k * this.k));
      }
   }

   private boolean h() {
      return this.e.gy() || this.e.bW() || this.e.gm();
   }

   @Override
   public void c() {
      this.j = 0;
      this.m = this.e.a(epv.j);
      this.e.a(epv.j, 0.0F);
   }

   @Override
   public void d() {
      this.f = null;
      this.i.n();
      this.e.a(epv.j, this.m);
   }

   @Override
   public void e() {
      this.e.F().a(this.f, 10.0F, (float)this.e.Z());
      if (--this.j <= 0) {
         this.j = this.a(10);
         if (this.e.g((brv)this.f) >= 144.0) {
            this.i();
         } else {
            this.i.a(this.f, this.h);
         }
      }
   }

   private void i() {
      ir $$0 = this.f.du();

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
      if (Math.abs((double)$$0 - this.f.dz()) < 2.0 && Math.abs((double)$$2 - this.f.dF()) < 2.0) {
         return false;
      } else if (!this.a(new ir($$0, $$1, $$2))) {
         return false;
      } else {
         this.e.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.e.dK(), this.e.dM());
         this.i.n();
         return true;
      }
   }

   private boolean a(ir $$0) {
      epv $$1 = eqa.b(this.e, $$0);
      if ($$1 != epv.c) {
         return false;
      } else {
         dtc $$2 = this.g.a_($$0.d());
         if (!this.n && $$2.b() instanceof djq) {
            return false;
         } else {
            ir $$3 = $$0.b(this.e.du());
            return this.g.b(this.e, this.e.cP().a($$3));
         }
      }
   }

   private int a(int $$0, int $$1) {
      return this.e.et().a($$1 - $$0 + 1) + $$0;
   }
}
