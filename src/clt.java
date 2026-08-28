public class clt extends cpm implements clh {
   private static final ale b = ale.b("drinking");
   private static final bvs c = new bvs(b, -0.25, bvs.a.a);
   private static final akh<Boolean> bY = akl.a(clt.class, akj.k);
   private int bZ;
   private cdf<cpm> ca;
   private cde<cnx> cb;

   public clt(bty<? extends clt> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.ca = new cdf<>(this, cpm.class, true, $$0 -> $$0 != null && this.gF() && $$0.ao() != bty.bo);
      this.cb = new cde<>(this, cnx.class, 10, true, false, null);
      this.bS.a(1, new cbe(this));
      this.bS.a(2, new ccj(this, 1.0, 60, 10.0F));
      this.bS.a(2, new ccx(this, 1.0));
      this.bS.a(3, new cbs(this, cnx.class, 8.0F));
      this.bS.a(3, new ccf(this));
      this.bT.a(1, new cdc(this, cpm.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected awf w() {
      return awg.Cy;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.CC;
   }

   @Override
   protected awf o_() {
      return awg.CA;
   }

   public void z(boolean $$0) {
      this.at().a(bY, $$0);
   }

   @Override
   public boolean q() {
      return this.at().a(bY);
   }

   public static bvt.a t() {
      return cld.gu().a(bvu.s, 26.0).a(bvu.v, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dS().B && this.bI()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.q()) {
            if (this.bZ-- <= 0) {
               this.z(false);
               cvs $$0 = this.eW();
               this.a(btz.a, cvs.k);
               cxr $$1 = $$0.a(ks.L);
               if ($$0.a(cvw.sm) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(dzp.l);
               this.g(bvu.v).c(c.b());
            }
         } else {
            jo<cxp> $$2 = null;
            if (this.af.i() < 0.15F && this.a(axb.a) && !this.b(bta.m)) {
               $$2 = cxs.w;
            } else if (this.af.i() < 0.15F && (this.bV() || this.eD() != null && this.eD().a(awx.i)) && !this.b(bta.l)) {
               $$2 = cxs.l;
            } else if (this.af.i() < 0.05F && this.eB() < this.eQ()) {
               $$2 = cxs.y;
            } else if (this.af.i() < 0.5F && this.m() != null && !this.b(bta.a) && this.m().g(this) > 121.0) {
               $$2 = cxs.n;
            }

            if ($$2 != null) {
               this.a(btz.a, cxr.a(cvw.sm, $$2));
               this.bZ = this.eW().a((bun)this);
               this.z(true);
               if (!this.ba()) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.CB, this.di(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bvq $$3 = this.g(bvu.v);
               $$3.c(b);
               $$3.b(c);
            }
         }

         if (this.af.i() < 7.5E-4F) {
            this.dS().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public awf ai_() {
      return awg.Cz;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dS().a(lo.an, this.dx() + this.af.k() * 0.13F, this.cO().e + 0.5 + this.af.k() * 0.13F, this.dD() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bsj $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awx.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bun $$0, float $$1) {
      if (!this.q()) {
         eyw $$2 = $$0.dv();
         double $$3 = $$0.dx() + $$2.d - this.dx();
         double $$4 = $$0.dB() - 1.1F - this.dz();
         double $$5 = $$0.dD() + $$2.f - this.dD();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jo<cxp> $$7 = cxs.A;
         if ($$0 instanceof cpm) {
            if ($$0.eB() <= 4.0F) {
               $$7 = cxs.y;
            } else {
               $$7 = cxs.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bta.b)) {
            $$7 = cxs.q;
         } else if ($$0.eB() >= 8.0F && !$$0.b(bta.s)) {
            $$7 = cxs.C;
         } else if ($$6 <= 3.0 && !$$0.b(bta.r) && this.af.i() < 0.25F) {
            $$7 = cxs.L;
         }

         if (this.dS() instanceof arj $$8) {
            cvs $$9 = cxr.a(cvw.vq, $$7);
            cor.a(cpd::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.CD, this.di(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arj $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gp() {
      return false;
   }
}
