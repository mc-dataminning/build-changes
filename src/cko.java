import java.util.UUID;

public class cko extends coe implements ckc {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final buq e = new buq(b, "Drinking speed penalty", -0.25, buq.a.a);
   private static final akg<Boolean> bY = akk.a(cko.class, aki.k);
   private int bZ;
   private ccd<coe> ca;
   private ccc<cms> cb;

   public cko(bsv<? extends cko> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new ccd<>(this, coe.class, true, $$0 -> $$0 != null && this.gH() && $$0.ak() != bsv.bo);
      this.cb = new ccc<>(this, cms.class, 10, true, false, null);
      this.bS.a(1, new cac(this));
      this.bS.a(2, new cbh(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cbv(this, 1.0));
      this.bS.a(3, new caq(this, cms.class, 8.0F));
      this.bS.a(3, new cbd(this));
      this.bT.a(1, new cca(this, coe.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avv v() {
      return avw.Co;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.Cs;
   }

   @Override
   protected avv o_() {
      return avw.Cq;
   }

   public void y(boolean $$0) {
      this.ap().a(bY, $$0);
   }

   public boolean s() {
      return this.ap().a(bY);
   }

   public static bur.a u() {
      return cjy.gw().a(bus.q, 26.0).a(bus.r, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.s()) {
            if (this.bZ-- <= 0) {
               this.y(false);
               cuk $$0 = this.eX();
               this.a(bsw.a, cuk.l);
               cwl $$1 = $$0.a(km.F);
               if ($$0.a(cun.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dwq.l);
               this.f(bus.r).b(e.b());
            }
         } else {
            ji<cwj> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awr.a) && !this.b(brz.m)) {
               $$2 = cwm.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(awn.j)) && !this.b(brz.l)) {
               $$2 = cwm.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cwm.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(brz.a) && this.p().g(this) > 121.0) {
               $$2 = cwm.n;
            }

            if ($$2 != null) {
               this.a(bsw.a, cwl.a(cun.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avw.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               buo $$3 = this.f(bus.r);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dP().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public avv ae_() {
      return avw.Cp;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dP().a(lj.an, this.du() + this.ah.k() * 0.13F, this.cK().e + 0.5 + this.ah.k() * 0.13F, this.dA() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bri $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awn.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btk $$0, float $$1) {
      if (!this.s()) {
         evm $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ji<cwj> $$7 = cwm.A;
         if ($$0 instanceof coe) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cwm.y;
            } else {
               $$7 = cwm.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(brz.b)) {
            $$7 = cwm.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(brz.s)) {
            $$7 = cwm.C;
         } else if ($$6 <= 3.0 && !$$0.b(brz.r) && this.ah.i() < 0.25F) {
            $$7 = cwm.L;
         }

         cnw $$8 = new cnw(this.dP(), this);
         $$8.a(cwl.a(cun.vo, $$7));
         $$8.s($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avw.Ct, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dP().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gr() {
      return false;
   }
}
