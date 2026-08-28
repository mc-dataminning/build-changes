public class cni extends crg implements cmw {
   private static final alz a = alz.b("drinking");
   private static final bxh b = new bxh(a, -0.25, bxh.a.a);
   private static final alc<Boolean> bZ = alg.a(cni.class, ale.k);
   private int ca;
   private ceu<crg> cb;
   private cet<cps> cc;

   public cni(bvm<? extends cni> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.cb = new ceu<>(this, crg.class, true, ($$0, $$1) -> this.gC() && $$0.aq() != bvm.bI);
      this.cc = new cet<>(this, cps.class, 10, true, false, null);
      this.bT.a(1, new cct(this));
      this.bT.a(2, new cdy(this, 1.0, 60, 10.0F));
      this.bT.a(2, new cem(this, 1.0));
      this.bT.a(3, new cdh(this, cps.class, 8.0F));
      this.bT.a(3, new cdu(this));
      this.bU.a(1, new cer(this, crg.class));
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
      return axf.CQ;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.CU;
   }

   @Override
   protected axe o_() {
      return axf.CS;
   }

   public void z(boolean $$0) {
      this.au().a(bZ, $$0);
   }

   public boolean m() {
      return this.au().a(bZ);
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.s, 26.0).a(bxj.v, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL()) {
         this.cb.k();
         if (this.cb.i() <= 0) {
            this.cc.a(true);
         } else {
            this.cc.a(false);
         }

         if (this.m()) {
            if (this.ca-- <= 0) {
               this.z(false);
               cxk $$0 = this.eX();
               this.a(bvn.a, cxk.k);
               czj $$1 = $$0.a(ku.Q);
               if ($$0.a(cxo.sZ) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ecj.l);
               this.g(bxj.v).c(b.b());
            }
         } else {
            jq<czh> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(aya.a) && !this.b(bum.m)) {
               $$2 = czk.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eF() != null && this.eF().a(axw.i)) && !this.b(bum.l)) {
               $$2 = czk.l;
            } else if (this.ae.i() < 0.05F && this.eD() < this.eR()) {
               $$2 = czk.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(bum.a) && this.O_().g(this) > 121.0) {
               $$2 = czk.n;
            }

            if ($$2 != null) {
               this.a(bvn.a, czj.a(cxo.sZ, $$2));
               this.ca = this.eX().a((bwb)this);
               this.z(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.CT, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bxf $$3 = this.g(bxj.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dV().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public axe ak_() {
      return axf.CR;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(ls.ao, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(btv $$0, float $$1) {
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
   public void a(bwb $$0, float $$1) {
      if (!this.m()) {
         fbs $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<czh> $$7 = czk.A;
         if ($$0 instanceof crg) {
            if ($$0.eD() <= 4.0F) {
               $$7 = czk.y;
            } else {
               $$7 = czk.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bum.b)) {
            $$7 = czk.q;
         } else if ($$0.eD() >= 8.0F && !$$0.b(bum.s)) {
            $$7 = czk.C;
         } else if ($$6 <= 3.0 && !$$0.b(bum.r) && this.ae.i() < 0.25F) {
            $$7 = czk.L;
         }

         if (this.dV() instanceof ash $$8) {
            cxk $$9 = czj.a(cxo.we, $$7);
            cql.a(cqx::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.CV, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gm() {
      return false;
   }
}
