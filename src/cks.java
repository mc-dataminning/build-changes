import java.util.UUID;

public class cks extends coi implements ckg {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final buu e = new buu(b, "Drinking speed penalty", -0.25, buu.a.a);
   private static final akj<Boolean> bY = akn.a(cks.class, akl.k);
   private int bZ;
   private cch<coi> ca;
   private ccg<cmw> cb;

   public cks(bsz<? extends cks> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new cch<>(this, coi.class, true, $$0 -> $$0 != null && this.gH() && $$0.ak() != bsz.bo);
      this.cb = new ccg<>(this, cmw.class, 10, true, false, null);
      this.bS.a(1, new cag(this));
      this.bS.a(2, new cbl(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cbz(this, 1.0));
      this.bS.a(3, new cau(this, cmw.class, 8.0F));
      this.bS.a(3, new cbh(this));
      this.bT.a(1, new cce(this, coi.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avy v() {
      return avz.Co;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.Cs;
   }

   @Override
   protected avy o_() {
      return avz.Cq;
   }

   public void y(boolean $$0) {
      this.ap().a(bY, $$0);
   }

   public boolean s() {
      return this.ap().a(bY);
   }

   public static buv.a u() {
      return ckc.gw().a(buw.q, 26.0).a(buw.r, 0.25);
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
               cuo $$0 = this.eX();
               this.a(bta.a, cuo.l);
               cwp $$1 = $$0.a(km.G);
               if ($$0.a(cur.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dwu.l);
               this.f(buw.r).b(e.b());
            }
         } else {
            ji<cwn> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awu.a) && !this.b(bsd.m)) {
               $$2 = cwq.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(awq.j)) && !this.b(bsd.l)) {
               $$2 = cwq.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cwq.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bsd.a) && this.p().g(this) > 121.0) {
               $$2 = cwq.n;
            }

            if ($$2 != null) {
               this.a(bta.a, cwp.a(cur.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avz.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               bus $$3 = this.f(buw.r);
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
   public avy ae_() {
      return avz.Cp;
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
   protected float e(brm $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awq.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bto $$0, float $$1) {
      if (!this.s()) {
         evq $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ji<cwn> $$7 = cwq.A;
         if ($$0 instanceof coi) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cwq.y;
            } else {
               $$7 = cwq.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bsd.b)) {
            $$7 = cwq.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bsd.s)) {
            $$7 = cwq.C;
         } else if ($$6 <= 3.0 && !$$0.b(bsd.r) && this.ah.i() < 0.25F) {
            $$7 = cwq.L;
         }

         coa $$8 = new coa(this.dP(), this);
         $$8.a(cwp.a(cur.vo, $$7));
         $$8.s($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avz.Ct, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
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
