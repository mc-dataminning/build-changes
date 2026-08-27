import java.util.UUID;

public class cju extends cnk implements cji {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final btw e = new btw(b, "Drinking speed penalty", -0.25, btw.a.a);
   private static final ajs<Boolean> bY = ajw.a(cju.class, aju.k);
   private int bZ;
   private cbj<cnk> ca;
   private cbi<cly> cb;

   public cju(bsc<? extends cju> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new cbj<>(this, cnk.class, true, $$0 -> $$0 != null && this.gG() && $$0.ak() != bsc.bo);
      this.cb = new cbi<>(this, cly.class, 10, true, false, null);
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new can(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cbb(this, 1.0));
      this.bS.a(3, new bzw(this, cly.class, 8.0F));
      this.bS.a(3, new caj(this));
      this.bT.a(1, new cbg(this, cnk.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avh v() {
      return avi.Co;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.Cs;
   }

   @Override
   protected avh o_() {
      return avi.Cq;
   }

   public void y(boolean $$0) {
      this.ap().a(bY, $$0);
   }

   public boolean s() {
      return this.ap().a(bY);
   }

   public static btx.a u() {
      return cje.gv().a(bty.q, 26.0).a(bty.r, 0.25);
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
               ctq $$0 = this.eX();
               this.a(bsd.a, ctq.i);
               cvr $$1 = $$0.a(kb.F);
               if ($$0.a(ctt.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dvw.l);
               this.f(bty.r).b(e.b());
            }
         } else {
            ix<cvp> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awc.a) && !this.b(brg.m)) {
               $$2 = cvs.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(avz.j)) && !this.b(brg.l)) {
               $$2 = cvs.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cvs.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(brg.a) && this.p().g(this) > 121.0) {
               $$2 = cvs.n;
            }

            if ($$2 != null) {
               this.a(bsd.a, cvr.a(ctt.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avi.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               btu $$3 = this.f(bty.r);
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
   public avh ae_() {
      return avi.Cp;
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
   protected float e(bqp $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avz.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bsq $$0, float $$1) {
      if (!this.s()) {
         eum $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ix<cvp> $$7 = cvs.A;
         if ($$0 instanceof cnk) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cvs.y;
            } else {
               $$7 = cvs.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(brg.b)) {
            $$7 = cvs.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(brg.s)) {
            $$7 = cvs.C;
         } else if ($$6 <= 3.0 && !$$0.b(brg.r) && this.ah.i() < 0.25F) {
            $$7 = cvs.L;
         }

         cnc $$8 = new cnc(this.dP(), this);
         $$8.a(cvr.a(ctt.vo, $$7));
         $$8.s($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avi.Ct, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
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
