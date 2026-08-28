public class cpe extends ctd implements cos {
   private static final alg a = alg.b("drinking");
   private static final byn b = new byn(a, -0.25, byn.a.a);
   private static final akj<Boolean> bG = akn.a(cpe.class, akl.k);
   private int bH;
   private cga<ctd> bI;
   private cfz<crm> bJ;

   public cpe(bwr<? extends cpe> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bI = new cga<>(this, ctd.class, true, ($$0, $$1) -> this.gH() && $$0.an() != bwr.bI);
      this.bJ = new cfz<>(this, crm.class, 10, true, false, null);
      this.bD.a(1, new cdz(this));
      this.bD.a(2, new cfe(this, 1.0, 60, 10.0F));
      this.bD.a(2, new cfs(this, 1.0));
      this.bD.a(3, new cen(this, crm.class, 8.0F));
      this.bD.a(3, new cfa(this));
      this.bE.a(1, new cfx(this, ctd.class));
      this.bE.a(2, this.bI);
      this.bE.a(3, this.bJ);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   @Override
   protected awm u() {
      return awn.Dw;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.DA;
   }

   @Override
   protected awm l_() {
      return awn.Dy;
   }

   public void y(boolean $$0) {
      this.ar().a(bG, $$0);
   }

   public boolean j() {
      return this.ar().a(bG);
   }

   public static byo.a m() {
      return coo.gw().a(byp.s, 26.0).a(byp.v, 0.25);
   }

   @Override
   public void k_() {
      if (!this.dU().C && this.bI()) {
         this.bI.k();
         if (this.bI.i() <= 0) {
            this.bJ.a(true);
         } else {
            this.bJ.a(false);
         }

         if (this.j()) {
            if (this.bH-- <= 0) {
               this.y(false);
               czn $$0 = this.fa();
               this.a(bws.a, czn.k);
               dbj $$1 = $$0.a(kk.R);
               if ($$0.a(czr.tt) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kk.S, 1.0F));
               }

               this.a(eft.l);
               this.g(byp.v).c(b.a());
            }
         } else {
            jf<dbh> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axh.a) && !this.b(bvo.m)) {
               $$2 = dbk.w;
            } else if (this.ae.i() < 0.15F && (this.bW() || this.eH() != null && this.eH().a(axd.i)) && !this.b(bvo.l)) {
               $$2 = dbk.l;
            } else if (this.ae.i() < 0.05F && this.eF() < this.eT()) {
               $$2 = dbk.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bvo.a) && this.f().g(this) > 121.0) {
               $$2 = dbk.n;
            }

            if ($$2 != null) {
               this.a(bws.a, dbj.a(czr.tt, $$2));
               this.bH = this.fa().a((bxj)this);
               this.y(true);
               if (!this.aZ()) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.Dz, this.dl(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               byl $$3 = this.g(byp.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dU().a(this, (byte)15);
         }
      }

      super.k_();
   }

   @Override
   public awm ae_() {
      return awn.Dx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dU().a(ly.aq, this.dz() + this.ae.k() * 0.13F, this.cQ().e + 0.5 + this.ae.k() * 0.13F, this.dF() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bux $$0, float $$1) {
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
   public void a(bxj $$0, float $$1) {
      if (!this.j()) {
         ffc $$2 = $$0.dx();
         double $$3 = $$0.dz() + $$2.d - this.dz();
         double $$4 = $$0.dD() - 1.1F - this.dB();
         double $$5 = $$0.dF() + $$2.f - this.dF();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jf<dbh> $$7 = dbk.A;
         if ($$0 instanceof ctd) {
            if ($$0.eF() <= 4.0F) {
               $$7 = dbk.y;
            } else {
               $$7 = dbk.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bvo.b)) {
            $$7 = dbk.q;
         } else if ($$0.eF() >= 8.0F && !$$0.b(bvo.s)) {
            $$7 = dbk.C;
         } else if ($$6 <= 3.0 && !$$0.b(bvo.r) && this.ae.i() < 0.25F) {
            $$7 = dbk.L;
         }

         if (this.dU() instanceof arq $$8) {
            czn $$9 = dbj.a(czr.wz, $$7);
            csh.a(csu::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.aZ()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.DB, this.dl(), 1.0F, 0.8F + this.ae.i() * 0.4F);
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
