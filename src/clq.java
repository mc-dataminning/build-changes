public class clq extends cpj implements cle {
   private static final alc b = alc.b("drinking");
   private static final bvp c = new bvp(b, -0.25, bvp.a.a);
   private static final akg<Boolean> bY = akk.a(clq.class, aki.k);
   private int bZ;
   private cdc<cpj> ca;
   private cdb<cnu> cb;

   public clq(btv<? extends clq> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.ca = new cdc<>(this, cpj.class, true, $$0 -> $$0 != null && this.gG() && $$0.ao() != btv.bo);
      this.cb = new cdb<>(this, cnu.class, 10, true, false, null);
      this.bS.a(1, new cbb(this));
      this.bS.a(2, new ccg(this, 1.0, 60, 10.0F));
      this.bS.a(2, new ccu(this, 1.0));
      this.bS.a(3, new cbp(this, cnu.class, 8.0F));
      this.bS.a(3, new ccc(this));
      this.bT.a(1, new ccz(this, cpj.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected awd w() {
      return awe.Cy;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.CC;
   }

   @Override
   protected awd n_() {
      return awe.CA;
   }

   public void z(boolean $$0) {
      this.at().a(bY, $$0);
   }

   @Override
   public boolean q() {
      return this.at().a(bY);
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.s, 26.0).a(bvr.v, 0.25);
   }

   @Override
   public void m_() {
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
               cvp $$0 = this.eW();
               this.a(btw.a, cvp.k);
               cxo $$1 = $$0.a(kr.L);
               if ($$0.a(cvt.sm) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(dzl.l);
               this.g(bvr.v).c(c.b());
            }
         } else {
            jn<cxm> $$2 = null;
            if (this.af.i() < 0.15F && this.a(awz.a) && !this.b(bsx.m)) {
               $$2 = cxp.w;
            } else if (this.af.i() < 0.15F && (this.bV() || this.eC() != null && this.eC().a(awv.i)) && !this.b(bsx.l)) {
               $$2 = cxp.l;
            } else if (this.af.i() < 0.05F && this.eA() < this.eQ()) {
               $$2 = cxp.y;
            } else if (this.af.i() < 0.5F && this.m() != null && !this.b(bsx.a) && this.m().g(this) > 121.0) {
               $$2 = cxp.n;
            }

            if ($$2 != null) {
               this.a(btw.a, cxo.a(cvt.sm, $$2));
               this.bZ = this.eW().a((buk)this);
               this.z(true);
               if (!this.ba()) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.CB, this.di(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bvn $$3 = this.g(bvr.v);
               $$3.c(b);
               $$3.b(c);
            }
         }

         if (this.af.i() < 7.5E-4F) {
            this.dS().a(this, (byte)15);
         }
      }

      super.m_();
   }

   @Override
   public awd ah_() {
      return awe.Cz;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dS().a(ln.an, this.dx() + this.af.k() * 0.13F, this.cO().e + 0.5 + this.af.k() * 0.13F, this.dD() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bsg $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awv.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(buk $$0, float $$1) {
      if (!this.q()) {
         eys $$2 = $$0.dv();
         double $$3 = $$0.dx() + $$2.d - this.dx();
         double $$4 = $$0.dB() - 1.1F - this.dz();
         double $$5 = $$0.dD() + $$2.f - this.dD();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jn<cxm> $$7 = cxp.A;
         if ($$0 instanceof cpj) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cxp.y;
            } else {
               $$7 = cxp.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bsx.b)) {
            $$7 = cxp.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bsx.s)) {
            $$7 = cxp.C;
         } else if ($$6 <= 3.0 && !$$0.b(bsx.r) && this.af.i() < 0.25F) {
            $$7 = cxp.L;
         }

         if (this.dS() instanceof arh $$8) {
            cvp $$9 = cxo.a(cvt.vq, $$7);
            coo.a(cpa::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.CD, this.di(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arh $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gq() {
      return false;
   }
}
