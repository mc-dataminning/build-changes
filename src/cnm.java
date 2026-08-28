public class cnm extends crk implements cna {
   private static final alz a = alz.b("drinking");
   private static final bxl b = new bxl(a, -0.25, bxl.a.a);
   private static final alc<Boolean> bZ = alg.a(cnm.class, ale.k);
   private int ca;
   private cey<crk> cb;
   private cex<cpw> cc;

   public cnm(bvq<? extends cnm> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.cb = new cey<>(this, crk.class, true, ($$0, $$1) -> this.gE() && $$0.aq() != bvq.bI);
      this.cc = new cex<>(this, cpw.class, 10, true, false, null);
      this.bT.a(1, new ccx(this));
      this.bT.a(2, new cec(this, 1.0, 60, 10.0F));
      this.bT.a(2, new ceq(this, 1.0));
      this.bT.a(3, new cdl(this, cpw.class, 8.0F));
      this.bT.a(3, new cdy(this));
      this.bU.a(1, new cev(this, crk.class));
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
   protected axe e(btz $$0) {
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

   public static bxm.a p() {
      return cmw.gt().a(bxn.s, 26.0).a(bxn.v, 0.25);
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
               cxo $$0 = this.eZ();
               this.a(bvr.a, cxo.j);
               czn $$1 = $$0.a(ku.Q);
               if ($$0.a(cxs.sZ) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ecq.l);
               this.g(bxn.v).c(b.b());
            }
         } else {
            jq<czl> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(aya.a) && !this.b(buq.m)) {
               $$2 = czo.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eG() != null && this.eG().a(axw.i)) && !this.b(buq.l)) {
               $$2 = czo.l;
            } else if (this.ae.i() < 0.05F && this.eE() < this.eS()) {
               $$2 = czo.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(buq.a) && this.O_().g(this) > 121.0) {
               $$2 = czo.n;
            }

            if ($$2 != null) {
               this.a(bvr.a, czn.a(cxs.sZ, $$2));
               this.ca = this.eZ().a((bwf)this);
               this.z(true);
               if (!this.bb()) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.CU, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bxj $$3 = this.g(bxn.v);
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
   protected float f(btz $$0, float $$1) {
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
   public void a(bwf $$0, float $$1) {
      if (!this.m()) {
         fbx $$2 = $$0.dz();
         double $$3 = $$0.dB() + $$2.d - this.dB();
         double $$4 = $$0.dF() - 1.1F - this.dD();
         double $$5 = $$0.dH() + $$2.f - this.dH();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<czl> $$7 = czo.A;
         if ($$0 instanceof crk) {
            if ($$0.eE() <= 4.0F) {
               $$7 = czo.y;
            } else {
               $$7 = czo.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(buq.b)) {
            $$7 = czo.q;
         } else if ($$0.eE() >= 8.0F && !$$0.b(buq.s)) {
            $$7 = czo.C;
         } else if ($$6 <= 3.0 && !$$0.b(buq.r) && this.ae.i() < 0.25F) {
            $$7 = czo.L;
         }

         if (this.dW() instanceof ash $$8) {
            cxo $$9 = czn.a(cxs.we, $$7);
            cqp.a(crb::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
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
