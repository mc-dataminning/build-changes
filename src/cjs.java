import java.util.UUID;

public class cjs extends cni implements cjg {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final btu e = new btu(b, "Drinking speed penalty", -0.25, btu.a.a);
   private static final ajr<Boolean> bY = ajv.a(cjs.class, ajt.k);
   private int bZ;
   private cbh<cni> ca;
   private cbg<clw> cb;

   public cjs(bsa<? extends cjs> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new cbh<>(this, cni.class, true, $$0 -> $$0 != null && this.gG() && $$0.ak() != bsa.bo);
      this.cb = new cbg<>(this, clw.class, 10, true, false, null);
      this.bS.a(1, new bzg(this));
      this.bS.a(2, new cal(this, 1.0, 60, 10.0F));
      this.bS.a(2, new caz(this, 1.0));
      this.bS.a(3, new bzu(this, clw.class, 8.0F));
      this.bS.a(3, new cah(this));
      this.bT.a(1, new cbe(this, cni.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avg v() {
      return avh.Co;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.Cs;
   }

   @Override
   protected avg o_() {
      return avh.Cq;
   }

   public void y(boolean $$0) {
      this.ap().a(bY, $$0);
   }

   public boolean s() {
      return this.ap().a(bY);
   }

   public static btv.a u() {
      return cjc.gv().a(btw.q, 26.0).a(btw.r, 0.25);
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
               cto $$0 = this.eX();
               this.a(bsb.a, cto.i);
               cvp $$1 = $$0.a(kb.F);
               if ($$0.a(ctr.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dvu.l);
               this.f(btw.r).b(e.b());
            }
         } else {
            ix<cvn> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awb.a) && !this.b(bre.m)) {
               $$2 = cvq.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(avy.j)) && !this.b(bre.l)) {
               $$2 = cvq.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cvq.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bre.a) && this.p().g(this) > 121.0) {
               $$2 = cvq.n;
            }

            if ($$2 != null) {
               this.a(bsb.a, cvp.a(ctr.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avh.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               bts $$3 = this.f(btw.r);
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
   public avg ae_() {
      return avh.Cp;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dP().a(ky.an, this.du() + this.ah.k() * 0.13F, this.cK().e + 0.5 + this.ah.k() * 0.13F, this.dA() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bqn $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avy.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bso $$0, float $$1) {
      if (!this.s()) {
         euk $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ix<cvn> $$7 = cvq.A;
         if ($$0 instanceof cni) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cvq.y;
            } else {
               $$7 = cvq.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bre.b)) {
            $$7 = cvq.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bre.s)) {
            $$7 = cvq.C;
         } else if ($$6 <= 3.0 && !$$0.b(bre.r) && this.ah.i() < 0.25F) {
            $$7 = cvq.L;
         }

         cna $$8 = new cna(this.dP(), this);
         $$8.a(cvp.a(ctr.vo, $$7));
         $$8.s($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avh.Ct, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dP().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gq() {
      return false;
   }
}
