public class cnz extends crw implements cnn {
   private static final ald a = ald.b("drinking");
   private static final bxv b = new bxv(a, -0.25, bxv.a.a);
   private static final akg<Boolean> bE = akk.a(cnz.class, aki.k);
   private int bF;
   private cfi<crw> bG;
   private cfh<cqi> bH;

   public cnz(bwb<? extends cnz> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bG = new cfi<>(this, crw.class, true, ($$0, $$1) -> this.gE() && $$0.aq() != bwb.bH);
      this.bH = new cfh<>(this, cqi.class, 10, true, false, null);
      this.bB.a(1, new cdh(this));
      this.bB.a(2, new cem(this, 1.0, 60, 10.0F));
      this.bB.a(2, new cfa(this, 1.0));
      this.bB.a(3, new cdv(this, cqi.class, 8.0F));
      this.bB.a(3, new cei(this));
      this.bC.a(1, new cff(this, crw.class));
      this.bC.a(2, this.bG);
      this.bC.a(3, this.bH);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, false);
   }

   @Override
   protected awj u() {
      return awk.Dq;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.Du;
   }

   @Override
   protected awj l_() {
      return awk.Ds;
   }

   public void y(boolean $$0) {
      this.au().a(bE, $$0);
   }

   public boolean j() {
      return this.au().a(bE);
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.s, 26.0).a(bxx.v, 0.25);
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK()) {
         this.bG.k();
         if (this.bG.i() <= 0) {
            this.bH.a(true);
         } else {
            this.bH.a(false);
         }

         if (this.j()) {
            if (this.bF-- <= 0) {
               this.y(false);
               cxy $$0 = this.fa();
               this.a(bwc.a, cxy.k);
               czu $$1 = $$0.a(kx.R);
               if ($$0.a(cyc.tm) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kx.S, 1.0F));
               }

               this.a(edm.l);
               this.g(bxx.v).c(b.b());
            }
         } else {
            js<czs> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axf.a) && !this.b(buy.m)) {
               $$2 = czv.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eH() != null && this.eH().a(axb.i)) && !this.b(buy.l)) {
               $$2 = czv.l;
            } else if (this.ae.i() < 0.05F && this.eF() < this.eT()) {
               $$2 = czv.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(buy.a) && this.f().g(this) > 121.0) {
               $$2 = czv.n;
            }

            if ($$2 != null) {
               this.a(bwc.a, czu.a(cyc.tm, $$2));
               this.bF = this.fa().a((bwr)this);
               this.y(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.Dt, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bxt $$3 = this.g(bxx.v);
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
   public awj ad_() {
      return awk.Dr;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(lv.aq, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(buh $$0, float $$1) {
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
   public void a(bwr $$0, float $$1) {
      if (!this.j()) {
         fcu $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         js<czs> $$7 = czv.A;
         if ($$0 instanceof crw) {
            if ($$0.eF() <= 4.0F) {
               $$7 = czv.y;
            } else {
               $$7 = czv.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(buy.b)) {
            $$7 = czv.q;
         } else if ($$0.eF() >= 8.0F && !$$0.b(buy.s)) {
            $$7 = czv.C;
         } else if ($$6 <= 3.0 && !$$0.b(buy.r) && this.ae.i() < 0.25F) {
            $$7 = czv.L;
         }

         if (this.dV() instanceof arn $$8) {
            cxy $$9 = czu.a(cyc.ws, $$7);
            crb.a(crn::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.Dv, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
