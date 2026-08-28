import javax.annotation.Nullable;

public class ctg extends csf {
   private static final akl<Byte> e = akp.a(ctg.class, akn.a);
   private static final akl<Boolean> f = akp.a(ctg.class, akn.k);
   private static final float g = 0.99F;
   private static final boolean h = false;
   private boolean i = false;
   public int d;

   public ctg(bxc<? extends ctg> $$0, djx $$1) {
      super($$0, $$1);
   }

   public ctg(djx $$0, bxu $$1, czy $$2) {
      super(bxc.bA, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public ctg(djx $$0, double $$1, double $$2, double $$3, czy $$4) {
      super(bxc.bA, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.i = true;
      }

      bwt $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.i || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dV() instanceof ars $$2 && this.b == csf.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.aq();
         } else {
            if (!($$0 instanceof crx) && this.dt().f($$0.bD()) < (double)$$0.dq() + 1.0) {
               this.aq();
               return;
            }

            this.q(true);
            ffq $$3 = $$0.bD().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awp.AG, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bwt $$0 = this.q();
      return $$0 == null || !$$0.bJ() ? false : !($$0 instanceof art) || !$$0.Z_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected ffn b(ffq $$0, ffq $$1) {
      return this.i ? null : super.b($$0, $$1);
   }

   @Override
   protected void a(ffn $$0) {
      bwt $$1 = $$0.a();
      float $$2 = 8.0F;
      bwt $$3 = this.q();
      bvi $$4 = this.dW().a(this, (bwt)($$3 == null ? this : $$3));
      if (this.dV() instanceof ars $$5) {
         $$2 = dgn.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.an() == bxc.O) {
            return;
         }

         if (this.dV() instanceof ars $$6) {
            dgn.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bxu $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cst.b, $$1, this.q(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awp.AE, 1.0F, 1.0F);
   }

   @Override
   protected void a(ars $$0, ffm $$1, czy $$2) {
      ffq $$3 = $$1.b().a($$1.g());
      dgn.a($$0, $$2, this.q() instanceof bxu $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public czy dZ() {
      return this.s();
   }

   @Override
   protected boolean a(crx $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gj().g(this.n());
   }

   @Override
   protected czy o() {
      return new czy(dac.xd);
   }

   @Override
   protected awo j() {
      return awp.AF;
   }

   @Override
   public void a_(crx $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.i = $$0.b("DealtDamage", false);
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte b(czy $$0) {
      return this.dV() instanceof ars $$1 ? (byte)azo.a(dgn.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != csf.a.b || $$0 <= 0) {
         super.g();
      }
   }

   @Override
   protected float v() {
      return 0.99F;
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return true;
   }
}
