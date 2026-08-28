public class cll extends cpd implements ckz {
   private static final alb b = alb.b("drinking");
   private static final bvk c = new bvk(b, -0.25, bvk.a.a);
   private static final akg<Boolean> bZ = akk.a(cll.class, aki.k);
   private int ca;
   private ccx<cpd> cb;
   private ccw<cnp> cc;

   public cll(btq<? extends cll> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.cb = new ccx<>(this, cpd.class, true, $$0 -> $$0 != null && this.gF() && $$0.ao() != btq.bo);
      this.cc = new ccw<>(this, cnp.class, 10, true, false, null);
      this.bT.a(1, new caw(this));
      this.bT.a(2, new ccb(this, 1.0, 60, 10.0F));
      this.bT.a(2, new ccp(this, 1.0));
      this.bT.a(3, new cbk(this, cnp.class, 8.0F));
      this.bT.a(3, new cbx(this));
      this.bU.a(1, new ccu(this, cpd.class));
      this.bU.a(2, this.cb);
      this.bU.a(3, this.cc);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   protected awc w() {
      return awd.Cy;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.CC;
   }

   @Override
   protected awc n_() {
      return awd.CA;
   }

   public void z(boolean $$0) {
      this.at().a(bZ, $$0);
   }

   @Override
   public boolean q() {
      return this.at().a(bZ);
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.s, 26.0).a(bvm.v, 0.25);
   }

   @Override
   public void m_() {
      if (!this.dS().B && this.bI()) {
         this.cb.k();
         if (this.cb.i() <= 0) {
            this.cc.a(true);
         } else {
            this.cc.a(false);
         }

         if (this.q()) {
            if (this.ca-- <= 0) {
               this.z(false);
               cvl $$0 = this.eW();
               this.a(btr.a, cvl.k);
               cxn $$1 = $$0.a(kr.I);
               if ($$0.a(cvo.sl) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dyx.l);
               this.g(bvm.v).c(c.b());
            }
         } else {
            jn<cxl> $$2 = null;
            if (this.af.i() < 0.15F && this.a(awy.a) && !this.b(bss.m)) {
               $$2 = cxo.w;
            } else if (this.af.i() < 0.15F && (this.bV() || this.eC() != null && this.eC().a(awu.i)) && !this.b(bss.l)) {
               $$2 = cxo.l;
            } else if (this.af.i() < 0.05F && this.eA() < this.eQ()) {
               $$2 = cxo.y;
            } else if (this.af.i() < 0.5F && this.m() != null && !this.b(bss.a) && this.m().g(this) > 121.0) {
               $$2 = cxo.n;
            }

            if ($$2 != null) {
               this.a(btr.a, cxn.a(cvo.sl, $$2));
               this.ca = this.eW().a((buf)this);
               this.z(true);
               if (!this.ba()) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.CB, this.di(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bvi $$3 = this.g(bvm.v);
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
   public awc ah_() {
      return awd.Cz;
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
   protected float e(bsb $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awu.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(buf $$0, float $$1) {
      if (!this.q()) {
         eye $$2 = $$0.dv();
         double $$3 = $$0.dx() + $$2.d - this.dx();
         double $$4 = $$0.dB() - 1.1F - this.dz();
         double $$5 = $$0.dD() + $$2.f - this.dD();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jn<cxl> $$7 = cxo.A;
         if ($$0 instanceof cpd) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cxo.y;
            } else {
               $$7 = cxo.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bss.b)) {
            $$7 = cxo.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bss.s)) {
            $$7 = cxo.C;
         } else if ($$6 <= 3.0 && !$$0.b(bss.r) && this.af.i() < 0.25F) {
            $$7 = cxo.L;
         }

         if (this.dS() instanceof arg $$8) {
            cvl $$9 = cxn.a(cvo.vq, $$7);
            coi.a(cov::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.CD, this.di(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arg $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gp() {
      return false;
   }
}
