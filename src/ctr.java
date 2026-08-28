import javax.annotation.Nullable;

public class ctr extends csq {
   private static final aku<Byte> e = aky.a(ctr.class, akw.a);
   private static final aku<Boolean> f = aky.a(ctr.class, akw.k);
   private static final float g = 0.99F;
   private static final boolean h = false;
   private boolean i = false;
   public int d;

   public ctr(bxn<? extends ctr> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctr(dkj $$0, byf $$1, dak $$2) {
      super(bxn.bA, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public ctr(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.bA, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void g() {
      if (this.a > 4) {
         this.i = true;
      }

      bxe $$0 = this.p();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.i || this.v()) && $$0 != null) {
         if (!this.A()) {
            if (this.dV() instanceof asb $$2 && this.b == csq.a.b) {
               this.a($$2, this.m(), 0.1F);
            }

            this.aq();
         } else {
            if (!($$0 instanceof csi) && this.dt().f($$0.bD()) < (double)$$0.dq() + 1.0) {
               this.aq();
               return;
            }

            this.q(true);
            fgc $$3 = $$0.bD().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awy.AG, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.g();
   }

   private boolean A() {
      bxe $$0 = this.p();
      return $$0 == null || !$$0.bJ() ? false : !($$0 instanceof asc) || !$$0.ak();
   }

   @Override
   public boolean x() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected ffz b(fgc $$0, fgc $$1) {
      return this.i ? null : super.b($$0, $$1);
   }

   @Override
   protected void a(ffz $$0) {
      bxe $$1 = $$0.a();
      float $$2 = 8.0F;
      bxe $$3 = this.p();
      bvt $$4 = this.dW().a(this, (bxe)($$3 == null ? this : $$3));
      if (this.dV() instanceof asb $$5) {
         $$2 = dgz.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.an() == bxn.O) {
            return;
         }

         if (this.dV() instanceof asb $$6) {
            dgz.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof byf $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cte.b, $$1, this.p(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awy.AE, 1.0F, 1.0F);
   }

   @Override
   protected void a(asb $$0, ffy $$1, dak $$2) {
      fgc $$3 = $$1.b().a($$1.g());
      dgz.a($$0, $$2, this.p() instanceof byf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public dak dZ() {
      return this.r();
   }

   @Override
   protected boolean a(csi $$0) {
      return super.a($$0) || this.v() && this.e($$0) && $$0.gj().g(this.m());
   }

   @Override
   protected dak n() {
      return new dak(dao.xd);
   }

   @Override
   protected awx i() {
      return awy.AF;
   }

   @Override
   public void a_(csi $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.i = $$0.b("DealtDamage", false);
      this.al.a(e, this.b(this.r()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte b(dak $$0) {
      return this.dV() instanceof asb $$1 ? (byte)azz.a(dgz.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void f() {
      int $$0 = this.al.a(e);
      if (this.b != csq.a.b || $$0 <= 0) {
         super.f();
      }
   }

   @Override
   protected float u() {
      return 0.99F;
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return true;
   }
}
