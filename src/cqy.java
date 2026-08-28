import javax.annotation.Nullable;

public class cqy extends cpz {
   private static final alc<Byte> f = alg.a(cqy.class, ale.a);
   private static final alc<Boolean> g = alg.a(cqy.class, ale.k);
   private boolean h;
   public int e;

   public cqy(bvm<? extends cqy> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqy(dha $$0, bwb $$1, cxk $$2) {
      super(bvm.bz, $$1, $$0, $$2, null);
      this.al.a(f, this.b($$2));
      this.al.a(g, $$2.B());
   }

   public cqy(dha $$0, double $$1, double $$2, double $$3, cxk $$4) {
      super(bvm.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(f, this.b($$4));
      this.al.a(g, $$4.B());
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(f, (byte)0);
      $$0.a(g, false);
   }

   @Override
   public void h() {
      if (this.b > 4) {
         this.h = true;
      }

      bvf $$0 = this.p();
      int $$1 = this.al.a(f);
      if ($$1 > 0 && (this.h || this.A()) && $$0 != null) {
         if (!this.F()) {
            if (this.dV() instanceof ash $$2 && this.c == cpz.a.b) {
               this.a($$2, this.t(), 0.1F);
            }

            this.at();
         } else {
            this.b(true);
            fbs $$3 = $$0.bF().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.e == 0) {
               this.a(axf.Aa, 10.0F, 1.0F);
            }

            this.e++;
         }
      }

      super.h();
   }

   private boolean F() {
      bvf $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof asi) || !$$0.aa_();
   }

   public boolean C() {
      return this.al.a(g);
   }

   @Nullable
   @Override
   protected fbp c(fbs $$0, fbs $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fbp $$0) {
      bvf $$1 = $$0.a();
      float $$2 = 8.0F;
      bvf $$3 = this.p();
      btv $$4 = this.dW().a(this, (bvf)($$3 == null ? this : $$3));
      if (this.dV() instanceof ash $$5) {
         $$2 = ddt.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bvm.O) {
            return;
         }

         if (this.dV() instanceof ash $$6) {
            ddt.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bwb $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cqm.b, $$1, this.p(), false);
      this.h(this.dy().d(0.02, 0.2, 0.02));
      this.a(axf.zY, 1.0F, 1.0F);
   }

   @Override
   protected void a(ash $$0, fbo $$1, cxk $$2) {
      fbs $$3 = $$1.b().a($$1.g());
      ddt.a($$0, $$2, this.p() instanceof bwb $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cxk dZ() {
      return this.v();
   }

   @Override
   protected boolean a(cps $$0) {
      return super.a($$0) || this.A() && this.e($$0) && $$0.gg().f(this.t());
   }

   @Override
   protected cxk u() {
      return new cxk(cxo.wI);
   }

   @Override
   protected axe m() {
      return axf.zZ;
   }

   @Override
   public void a_(cps $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(f, this.b(this.v()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cxk $$0) {
      return this.dV() instanceof ash $$1 ? (byte)bae.a(ddt.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void l() {
      int $$0 = this.al.a(f);
      if (this.c != cpz.a.b || $$0 <= 0) {
         super.l();
      }
   }

   @Override
   protected float z() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
