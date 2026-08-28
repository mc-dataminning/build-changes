public class cmc extends cpw implements clq {
   private static final alh b = alh.b("drinking");
   private static final bwb c = new bwb(b, -0.25, bwb.a.a);
   private static final akk<Boolean> bY = ako.a(cmc.class, akm.k);
   private int bZ;
   private cdo<cpw> ca;
   private cdn<coh> cb;

   public cmc(bug<? extends cmc> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.ca = new cdo<>(this, cpw.class, true, $$0 -> $$0 != null && this.gM() && $$0.aq() != bug.bo);
      this.cb = new cdn<>(this, coh.class, 10, true, false, null);
      this.bS.a(1, new cbn(this));
      this.bS.a(2, new ccs(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdg(this, 1.0));
      this.bS.a(3, new ccb(this, coh.class, 8.0F));
      this.bS.a(3, new cco(this));
      this.bT.a(1, new cdl(this, cpw.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected awj w() {
      return awk.Cw;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.CA;
   }

   @Override
   protected awj o_() {
      return awk.Cy;
   }

   public void z(boolean $$0) {
      this.av().a(bY, $$0);
   }

   @Override
   public boolean q() {
      return this.av().a(bY);
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.s, 26.0).a(bwd.v, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dX().C && this.bM()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.q()) {
            if (this.bZ-- <= 0) {
               this.z(false);
               cvx $$0 = this.fb();
               this.a(buh.a, cvx.k);
               cxw $$1 = $$0.a(kt.P);
               if ($$0.a(cwb.sm) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(eaa.l);
               this.g(bwd.v).c(c.b());
            }
         } else {
            jp<cxu> $$2 = null;
            if (this.af.i() < 0.15F && this.a(axf.a) && !this.b(btg.m)) {
               $$2 = cxx.w;
            } else if (this.af.i() < 0.15F && (this.bZ() || this.eI() != null && this.eI().a(axb.i)) && !this.b(btg.l)) {
               $$2 = cxx.l;
            } else if (this.af.i() < 0.05F && this.eG() < this.eV()) {
               $$2 = cxx.y;
            } else if (this.af.i() < 0.5F && this.m() != null && !this.b(btg.a) && this.m().g(this) > 121.0) {
               $$2 = cxx.n;
            }

            if ($$2 != null) {
               this.a(buh.a, cxw.a(cwb.sm, $$2));
               this.bZ = this.fb().a((buv)this);
               this.z(true);
               if (!this.bc()) {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.Cz, this.dn(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bvz $$3 = this.g(bwd.v);
               $$3.c(b);
               $$3.b(c);
            }
         }

         if (this.af.i() < 7.5E-4F) {
            this.dX().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public awj aj_() {
      return awk.Cx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dX().a(lq.an, this.dC() + this.af.k() * 0.13F, this.cS().e + 0.5 + this.af.k() * 0.13F, this.dI() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bsp $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axb.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(buv $$0, float $$1) {
      if (!this.q()) {
         ezh $$2 = $$0.dA();
         double $$3 = $$0.dC() + $$2.d - this.dC();
         double $$4 = $$0.dG() - 1.1F - this.dE();
         double $$5 = $$0.dI() + $$2.f - this.dI();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jp<cxu> $$7 = cxx.A;
         if ($$0 instanceof cpw) {
            if ($$0.eG() <= 4.0F) {
               $$7 = cxx.y;
            } else {
               $$7 = cxx.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btg.b)) {
            $$7 = cxx.q;
         } else if ($$0.eG() >= 8.0F && !$$0.b(btg.s)) {
            $$7 = cxx.C;
         } else if ($$6 <= 3.0 && !$$0.b(btg.r) && this.af.i() < 0.25F) {
            $$7 = cxx.L;
         }

         if (this.dX() instanceof arm $$8) {
            cvx $$9 = cxw.a(cwb.vq, $$7);
            cpb.a(cpn::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bc()) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.CB, this.dn(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arm $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gw() {
      return false;
   }
}
