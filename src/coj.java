public class coj extends csi implements cnx {
   private static final ale a = ale.b("drinking");
   private static final byd b = new byd(a, -0.25, byd.a.a);
   private static final akh<Boolean> bF = akl.a(coj.class, akj.k);
   private int bG;
   private cfq<csi> bH;
   private cfp<cqs> bI;

   public coj(bwj<? extends coj> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bH = new cfq<>(this, csi.class, true, ($$0, $$1) -> this.gE() && $$0.aq() != bwj.bI);
      this.bI = new cfp<>(this, cqs.class, 10, true, false, null);
      this.bC.a(1, new cdp(this));
      this.bC.a(2, new ceu(this, 1.0, 60, 10.0F));
      this.bC.a(2, new cfi(this, 1.0));
      this.bC.a(3, new ced(this, cqs.class, 8.0F));
      this.bC.a(3, new ceq(this));
      this.bD.a(1, new cfn(this, csi.class));
      this.bD.a(2, this.bH);
      this.bD.a(3, this.bI);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   protected awk u() {
      return awl.Dq;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.Du;
   }

   @Override
   protected awk l_() {
      return awl.Ds;
   }

   public void y(boolean $$0) {
      this.au().a(bF, $$0);
   }

   public boolean j() {
      return this.au().a(bF);
   }

   public static bye.a m() {
      return cnt.gt().a(byf.s, 26.0).a(byf.v, 0.25);
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK()) {
         this.bH.k();
         if (this.bH.i() <= 0) {
            this.bI.a(true);
         } else {
            this.bI.a(false);
         }

         if (this.j()) {
            if (this.bG-- <= 0) {
               this.y(false);
               cys $$0 = this.fa();
               this.a(bwk.a, cys.k);
               dao $$1 = $$0.a(kj.R);
               if ($$0.a(cyw.tm) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kj.S, 1.0F));
               }

               this.a(eeo.l);
               this.g(byf.v).c(b.b());
            }
         } else {
            je<dam> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axf.a) && !this.b(bvg.m)) {
               $$2 = dap.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eH() != null && this.eH().a(axb.i)) && !this.b(bvg.l)) {
               $$2 = dap.l;
            } else if (this.ae.i() < 0.05F && this.eF() < this.eT()) {
               $$2 = dap.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bvg.a) && this.f().g(this) > 121.0) {
               $$2 = dap.n;
            }

            if ($$2 != null) {
               this.a(bwk.a, dao.a(cyw.tm, $$2));
               this.bG = this.fa().a((bwz)this);
               this.y(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.Dt, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               byb $$3 = this.g(byf.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dV().a(this, (byte)15);
         }
      }

      super.k_();
   }

   @Override
   public awk ad_() {
      return awl.Dr;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(lx.aq, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bup $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axb.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bwz $$0, float $$1) {
      if (!this.j()) {
         fdw $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         je<dam> $$7 = dap.A;
         if ($$0 instanceof csi) {
            if ($$0.eF() <= 4.0F) {
               $$7 = dap.y;
            } else {
               $$7 = dap.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bvg.b)) {
            $$7 = dap.q;
         } else if ($$0.eF() >= 8.0F && !$$0.b(bvg.s)) {
            $$7 = dap.C;
         } else if ($$6 <= 3.0 && !$$0.b(bvg.r) && this.ae.i() < 0.25F) {
            $$7 = dap.L;
         }

         if (this.dV() instanceof aro $$8) {
            cys $$9 = dao.a(cyw.ws, $$7);
            crm.a(crz::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.Dv, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(aro $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
