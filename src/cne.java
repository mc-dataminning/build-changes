public class cne extends crc implements cms {
   private static final alp a = alp.b("drinking");
   private static final bxd b = new bxd(a, -0.25, bxd.a.a);
   private static final aks<Boolean> bZ = akw.a(cne.class, aku.k);
   private int ca;
   private ceq<crc> cb;
   private cep<cpo> cc;

   public cne(bvi<? extends cne> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.cb = new ceq<>(this, crc.class, true, ($$0, $$1) -> this.gE() && $$0.aq() != bvi.bI);
      this.cc = new cep<>(this, cpo.class, 10, true, false, null);
      this.bT.a(1, new ccp(this));
      this.bT.a(2, new cdu(this, 1.0, 60, 10.0F));
      this.bT.a(2, new cei(this, 1.0));
      this.bT.a(3, new cdd(this, cpo.class, 8.0F));
      this.bT.a(3, new cdq(this));
      this.bU.a(1, new cen(this, crc.class));
      this.bU.a(2, this.cb);
      this.bU.a(3, this.cc);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   protected awu u() {
      return awv.Dh;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Dl;
   }

   @Override
   protected awu o_() {
      return awv.Dj;
   }

   public void z(boolean $$0) {
      this.au().a(bZ, $$0);
   }

   public boolean m() {
      return this.au().a(bZ);
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.s, 26.0).a(bxf.v, 0.25);
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
               cxg $$0 = this.eZ();
               this.a(bvj.a, cxg.j);
               czf $$1 = $$0.a(ku.Q);
               if ($$0.a(cxk.ti) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(eck.l);
               this.g(bxf.v).c(b.b());
            }
         } else {
            jq<czd> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axq.a) && !this.b(bui.m)) {
               $$2 = czg.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eG() != null && this.eG().a(axm.i)) && !this.b(bui.l)) {
               $$2 = czg.l;
            } else if (this.ae.i() < 0.05F && this.eE() < this.eS()) {
               $$2 = czg.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(bui.a) && this.O_().g(this) > 121.0) {
               $$2 = czg.n;
            }

            if ($$2 != null) {
               this.a(bvj.a, czf.a(cxk.ti, $$2));
               this.ca = this.eZ().a((bvx)this);
               this.z(true);
               if (!this.bb()) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.Dk, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bxb $$3 = this.g(bxf.v);
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
   public awu ak_() {
      return awv.Di;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dW().a(ls.ap, this.dB() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dH() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(btr $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axm.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bvx $$0, float $$1) {
      if (!this.m()) {
         fbr $$2 = $$0.dz();
         double $$3 = $$0.dB() + $$2.d - this.dB();
         double $$4 = $$0.dF() - 1.1F - this.dD();
         double $$5 = $$0.dH() + $$2.f - this.dH();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<czd> $$7 = czg.A;
         if ($$0 instanceof crc) {
            if ($$0.eE() <= 4.0F) {
               $$7 = czg.y;
            } else {
               $$7 = czg.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bui.b)) {
            $$7 = czg.q;
         } else if ($$0.eE() >= 8.0F && !$$0.b(bui.s)) {
            $$7 = czg.C;
         } else if ($$6 <= 3.0 && !$$0.b(bui.r) && this.ae.i() < 0.25F) {
            $$7 = czg.L;
         }

         if (this.dW() instanceof arx $$8) {
            cxg $$9 = czf.a(cxk.wo, $$7);
            cqh.a(cqt::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.Dm, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arx $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean go() {
      return false;
   }
}
