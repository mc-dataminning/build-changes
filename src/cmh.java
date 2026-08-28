public class cmh extends cqb implements clv {
   private static final ali b = ali.b("drinking");
   private static final bwg c = new bwg(b, -0.25, bwg.a.a);
   private static final akl<Boolean> bY = akp.a(cmh.class, akn.k);
   private int bZ;
   private cdt<cqb> ca;
   private cds<com> cb;

   public cmh(bul<? extends cmh> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.ca = new cdt<>(this, cqb.class, true, $$0 -> $$0 != null && this.gL() && $$0.ar() != bul.bo);
      this.cb = new cds<>(this, com.class, 10, true, false, null);
      this.bS.a(1, new cbs(this));
      this.bS.a(2, new ccx(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdl(this, 1.0));
      this.bS.a(3, new ccg(this, com.class, 8.0F));
      this.bS.a(3, new cct(this));
      this.bT.a(1, new cdq(this, cqb.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected awk w() {
      return awl.Cw;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.CA;
   }

   @Override
   protected awk o_() {
      return awl.Cy;
   }

   public void z(boolean $$0) {
      this.aw().a(bY, $$0);
   }

   @Override
   public boolean q() {
      return this.aw().a(bY);
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.s, 26.0).a(bwi.v, 0.25);
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
               cwb $$0 = this.fb();
               this.a(bum.a, cwb.k);
               cya $$1 = $$0.a(ku.Q);
               if ($$0.a(cwf.sm) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(eag.l);
               this.g(bwi.v).c(c.b());
            }
         } else {
            jq<cxy> $$2 = null;
            if (this.af.i() < 0.15F && this.a(axg.a) && !this.b(btl.m)) {
               $$2 = cyb.w;
            } else if (this.af.i() < 0.15F && (this.bZ() || this.eI() != null && this.eI().a(axc.i)) && !this.b(btl.l)) {
               $$2 = cyb.l;
            } else if (this.af.i() < 0.05F && this.eG() < this.eV()) {
               $$2 = cyb.y;
            } else if (this.af.i() < 0.5F && this.m() != null && !this.b(btl.a) && this.m().g(this) > 121.0) {
               $$2 = cyb.n;
            }

            if ($$2 != null) {
               this.a(bum.a, cya.a(cwf.sm, $$2));
               this.bZ = this.fb().a((bva)this);
               this.z(true);
               if (!this.bc()) {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.Cz, this.dn(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bwe $$3 = this.g(bwi.v);
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
   public awk aj_() {
      return awl.Cx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dX().a(lr.an, this.dC() + this.af.k() * 0.13F, this.cS().e + 0.5 + this.af.k() * 0.13F, this.dI() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bsu $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axc.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bva $$0, float $$1) {
      if (!this.q()) {
         ezn $$2 = $$0.dA();
         double $$3 = $$0.dC() + $$2.d - this.dC();
         double $$4 = $$0.dG() - 1.1F - this.dE();
         double $$5 = $$0.dI() + $$2.f - this.dI();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<cxy> $$7 = cyb.A;
         if ($$0 instanceof cqb) {
            if ($$0.eG() <= 4.0F) {
               $$7 = cyb.y;
            } else {
               $$7 = cyb.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btl.b)) {
            $$7 = cyb.q;
         } else if ($$0.eG() >= 8.0F && !$$0.b(btl.s)) {
            $$7 = cyb.C;
         } else if ($$6 <= 3.0 && !$$0.b(btl.r) && this.af.i() < 0.25F) {
            $$7 = cyb.L;
         }

         if (this.dX() instanceof arn $$8) {
            cwb $$9 = cya.a(cwf.vq, $$7);
            cpg.a(cps::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bc()) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.CB, this.dn(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gv() {
      return false;
   }
}
