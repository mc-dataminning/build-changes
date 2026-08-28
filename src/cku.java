import java.util.UUID;

public class cku extends cok implements cki {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final buw e = new buw(b, "Drinking speed penalty", -0.25, buw.a.a);
   private static final akk<Boolean> bY = ako.a(cku.class, akm.k);
   private int bZ;
   private ccj<cok> ca;
   private cci<cmy> cb;

   public cku(btb<? extends cku> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new ccj<>(this, cok.class, true, $$0 -> $$0 != null && this.gH() && $$0.ak() != btb.bo);
      this.cb = new cci<>(this, cmy.class, 10, true, false, null);
      this.bS.a(1, new cai(this));
      this.bS.a(2, new cbn(this, 1.0, 60, 10.0F));
      this.bS.a(2, new ccb(this, 1.0));
      this.bS.a(3, new caw(this, cmy.class, 8.0F));
      this.bS.a(3, new cbj(this));
      this.bT.a(1, new ccg(this, cok.class));
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
   protected avz d(bro $$0) {
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

   public static bux.a u() {
      return cke.gw().a(buy.q, 26.0).a(buy.r, 0.25);
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
               cuq $$0 = this.eX();
               this.a(btc.a, cuq.l);
               cwr $$1 = $$0.a(km.G);
               if ($$0.a(cut.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dww.l);
               this.f(buy.r).b(e.b());
            }
         } else {
            ji<cwp> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awv.a) && !this.b(bsf.m)) {
               $$2 = cws.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(awr.j)) && !this.b(bsf.l)) {
               $$2 = cws.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cws.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bsf.a) && this.p().g(this) > 121.0) {
               $$2 = cws.n;
            }

            if ($$2 != null) {
               this.a(btc.a, cwr.a(cut.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), awa.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               buu $$3 = this.f(buy.r);
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
   protected float e(bro $$0, float $$1) {
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
   public void a(btq $$0, float $$1) {
      if (!this.s()) {
         evs $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ji<cwp> $$7 = cws.A;
         if ($$0 instanceof cok) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cws.y;
            } else {
               $$7 = cws.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bsf.b)) {
            $$7 = cws.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bsf.s)) {
            $$7 = cws.C;
         } else if ($$6 <= 3.0 && !$$0.b(bsf.r) && this.ah.i() < 0.25F) {
            $$7 = cws.L;
         }

         coc $$8 = new coc(this.dP(), this);
         $$8.a(cwr.a(cut.vo, $$7));
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
