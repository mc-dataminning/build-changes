public class cnn extends crl implements cnb {
   private static final alz a = alz.b("drinking");
   private static final bxm b = new bxm(a, -0.25, bxm.a.a);
   private static final alc<Boolean> bZ = alg.a(cnn.class, ale.k);
   private int ca;
   private cez<crl> cb;
   private cey<cpx> cc;

   public cnn(bvr<? extends cnn> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.cb = new cez<>(this, crl.class, true, ($$0, $$1) -> this.gE() && $$0.aq() != bvr.bI);
      this.cc = new cey<>(this, cpx.class, 10, true, false, null);
      this.bT.a(1, new ccy(this));
      this.bT.a(2, new ced(this, 1.0, 60, 10.0F));
      this.bT.a(2, new cer(this, 1.0));
      this.bT.a(3, new cdm(this, cpx.class, 8.0F));
      this.bT.a(3, new cdz(this));
      this.bU.a(1, new cew(this, crl.class));
      this.bU.a(2, this.cb);
      this.bU.a(3, this.cc);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   protected axe u() {
      return axf.CR;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.CV;
   }

   @Override
   protected axe o_() {
      return axf.CT;
   }

   public void z(boolean $$0) {
      this.au().a(bZ, $$0);
   }

   public boolean m() {
      return this.au().a(bZ);
   }

   public static bxn.a p() {
      return cmx.gt().a(bxo.s, 26.0).a(bxo.v, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dW().C && this.bL()) {
         this.cb.k();
         if (this.cb.i() <= 0) {
            this.cc.a(true);
         } else {
            this.cc.a(false);
         }

         if (this.m()) {
            if (this.ca-- <= 0) {
               this.z(false);
               cxp $$0 = this.eZ();
               this.a(bvs.a, cxp.j);
               czo $$1 = $$0.a(ku.Q);
               if ($$0.a(cxt.sZ) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ecr.l);
               this.g(bxo.v).c(b.b());
            }
         } else {
            jq<czm> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(aya.a) && !this.b(bur.m)) {
               $$2 = czp.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eG() != null && this.eG().a(axw.i)) && !this.b(bur.l)) {
               $$2 = czp.l;
            } else if (this.ae.i() < 0.05F && this.eE() < this.eS()) {
               $$2 = czp.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(bur.a) && this.O_().g(this) > 121.0) {
               $$2 = czp.n;
            }

            if ($$2 != null) {
               this.a(bvs.a, czo.a(cxt.sZ, $$2));
               this.ca = this.eZ().a((bwg)this);
               this.z(true);
               if (!this.bb()) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.CU, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bxk $$3 = this.g(bxo.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dW().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public axe ak_() {
      return axf.CS;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dW().a(ls.ao, this.dB() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dH() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bua $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axw.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bwg $$0, float $$1) {
      if (!this.m()) {
         fby $$2 = $$0.dz();
         double $$3 = $$0.dB() + $$2.d - this.dB();
         double $$4 = $$0.dF() - 1.1F - this.dD();
         double $$5 = $$0.dH() + $$2.f - this.dH();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<czm> $$7 = czp.A;
         if ($$0 instanceof crl) {
            if ($$0.eE() <= 4.0F) {
               $$7 = czp.y;
            } else {
               $$7 = czp.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bur.b)) {
            $$7 = czp.q;
         } else if ($$0.eE() >= 8.0F && !$$0.b(bur.s)) {
            $$7 = czp.C;
         } else if ($$6 <= 3.0 && !$$0.b(bur.r) && this.ae.i() < 0.25F) {
            $$7 = czp.L;
         }

         if (this.dW() instanceof ash $$8) {
            cxp $$9 = czo.a(cxt.we, $$7);
            cqq.a(crc::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.CW, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean go() {
      return false;
   }
}
