public class coq extends cso implements cod {
   private static final alg a = alg.b("drinking");
   private static final byg b = new byg(a, -0.25, byg.a.a);
   private static final akj<Boolean> bF = akn.a(coq.class, akl.k);
   private int bG;
   private cft<cso> bH;
   private cfs<cqy> bI;

   public coq(bwm<? extends coq> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bH = new cft<>(this, cso.class, true, ($$0, $$1) -> this.gE() && $$0.aq() != bwm.bI);
      this.bI = new cfs<>(this, cqy.class, 10, true, false, null);
      this.bC.a(1, new cds(this));
      this.bC.a(2, new cex(this, 1.0, 60, 10.0F));
      this.bC.a(2, new cfl(this, 1.0));
      this.bC.a(3, new ceg(this, cqy.class, 8.0F));
      this.bC.a(3, new cet(this));
      this.bD.a(1, new cfq(this, cso.class));
      this.bD.a(2, this.bH);
      this.bD.a(3, this.bI);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   protected awm u() {
      return awn.Dt;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.Dx;
   }

   @Override
   protected awm l_() {
      return awn.Dv;
   }

   public void y(boolean $$0) {
      this.au().a(bF, $$0);
   }

   public boolean j() {
      return this.au().a(bF);
   }

   public static byh.a m() {
      return cnz.gt().a(byi.s, 26.0).a(byi.v, 0.25);
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
               cyy $$0 = this.fa();
               this.a(bwn.a, cyy.k);
               dau $$1 = $$0.a(kj.R);
               if ($$0.a(czc.to) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kj.S, 1.0F));
               }

               this.a(eez.l);
               this.g(byi.v).c(b.a());
            }
         } else {
            je<das> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axh.a) && !this.b(bvj.m)) {
               $$2 = dav.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eH() != null && this.eH().a(axd.i)) && !this.b(bvj.l)) {
               $$2 = dav.l;
            } else if (this.ae.i() < 0.05F && this.eF() < this.eT()) {
               $$2 = dav.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bvj.a) && this.f().g(this) > 121.0) {
               $$2 = dav.n;
            }

            if ($$2 != null) {
               this.a(bwn.a, dau.a(czc.to, $$2));
               this.bG = this.fa().a((bxc)this);
               this.y(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.Dw, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bye $$3 = this.g(byi.v);
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
   public awm ad_() {
      return awn.Du;
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
   protected float f(bus $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axd.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bxc $$0, float $$1) {
      if (!this.j()) {
         fei $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         je<das> $$7 = dav.A;
         if ($$0 instanceof cso) {
            if ($$0.eF() <= 4.0F) {
               $$7 = dav.y;
            } else {
               $$7 = dav.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bvj.b)) {
            $$7 = dav.q;
         } else if ($$0.eF() >= 8.0F && !$$0.b(bvj.s)) {
            $$7 = dav.C;
         } else if ($$6 <= 3.0 && !$$0.b(bvj.r) && this.ae.i() < 0.25F) {
            $$7 = dav.L;
         }

         if (this.dV() instanceof arq $$8) {
            cyy $$9 = dau.a(czc.wu, $$7);
            crs.a(csf::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.Dy, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
