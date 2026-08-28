import java.util.UUID;

public class ckt extends coj implements ckh {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final buv e = new buv(b, "Drinking speed penalty", -0.25, buv.a.a);
   private static final akk<Boolean> bY = ako.a(ckt.class, akm.k);
   private int bZ;
   private cci<coj> ca;
   private cch<cmx> cb;

   public ckt(bta<? extends ckt> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new cci<>(this, coj.class, true, $$0 -> $$0 != null && this.gH() && $$0.ak() != bta.bo);
      this.cb = new cch<>(this, cmx.class, 10, true, false, null);
      this.bS.a(1, new cah(this));
      this.bS.a(2, new cbm(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cca(this, 1.0));
      this.bS.a(3, new cav(this, cmx.class, 8.0F));
      this.bS.a(3, new cbi(this));
      this.bT.a(1, new ccf(this, coj.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avz v() {
      return awa.Co;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.Cs;
   }

   @Override
   protected avz o_() {
      return awa.Cq;
   }

   public void y(boolean $$0) {
      this.ap().a(bY, $$0);
   }

   public boolean s() {
      return this.ap().a(bY);
   }

   public static buw.a u() {
      return ckd.gw().a(bux.q, 26.0).a(bux.r, 0.25);
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
               cup $$0 = this.eX();
               this.a(btb.a, cup.l);
               cwq $$1 = $$0.a(km.G);
               if ($$0.a(cus.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dwv.l);
               this.f(bux.r).b(e.b());
            }
         } else {
            ji<cwo> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awv.a) && !this.b(bse.m)) {
               $$2 = cwr.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(awr.j)) && !this.b(bse.l)) {
               $$2 = cwr.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cwr.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bse.a) && this.p().g(this) > 121.0) {
               $$2 = cwr.n;
            }

            if ($$2 != null) {
               this.a(btb.a, cwq.a(cus.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), awa.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               but $$3 = this.f(bux.r);
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
   public avz ae_() {
      return awa.Cp;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dP().a(li.an, this.du() + this.ah.k() * 0.13F, this.cK().e + 0.5 + this.ah.k() * 0.13F, this.dA() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(brn $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awr.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btp $$0, float $$1) {
      if (!this.s()) {
         evr $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ji<cwo> $$7 = cwr.A;
         if ($$0 instanceof coj) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cwr.y;
            } else {
               $$7 = cwr.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bse.b)) {
            $$7 = cwr.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bse.s)) {
            $$7 = cwr.C;
         } else if ($$6 <= 3.0 && !$$0.b(bse.r) && this.ah.i() < 0.25F) {
            $$7 = cwr.L;
         }

         cob $$8 = new cob(this.dP(), this);
         $$8.a(cwq.a(cus.vo, $$7));
         $$8.s($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), awa.Ct, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
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
