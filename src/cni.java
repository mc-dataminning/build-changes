public class cni extends crf implements cmw {
   private static final aku a = aku.b("drinking");
   private static final bxe b = new bxe(a, -0.25, bxe.a.a);
   private static final ajx<Boolean> bF = akb.a(cni.class, ajz.k);
   private int bG;
   private cer<crf> bH;
   private ceq<cpr> bI;

   public cni(bvi<? extends cni> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bH = new cer<>(this, crf.class, true, ($$0, $$1) -> this.gG() && $$0.aq() != bvi.bH);
      this.bI = new ceq<>(this, cpr.class, 10, true, false, null);
      this.bC.a(1, new ccq(this));
      this.bC.a(2, new cdv(this, 1.0, 60, 10.0F));
      this.bC.a(2, new cej(this, 1.0));
      this.bC.a(3, new cde(this, cpr.class, 8.0F));
      this.bC.a(3, new cdr(this));
      this.bD.a(1, new ceo(this, crf.class));
      this.bD.a(2, this.bH);
      this.bD.a(3, this.bI);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   protected avz u() {
      return awa.Dq;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.Du;
   }

   @Override
   protected avz l_() {
      return awa.Ds;
   }

   public void y(boolean $$0) {
      this.au().a(bF, $$0);
   }

   public boolean j() {
      return this.au().a(bF);
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.s, 26.0).a(bxg.v, 0.25);
   }

   @Override
   public void k_() {
      if (!this.dU().C && this.bJ()) {
         this.bH.k();
         if (this.bH.i() <= 0) {
            this.bI.a(true);
         } else {
            this.bI.a(false);
         }

         if (this.j()) {
            if (this.bG-- <= 0) {
               this.y(false);
               cxh $$0 = this.eZ();
               this.a(bvj.a, cxh.k);
               cze $$1 = $$0.a(kv.R);
               if ($$0.a(cxl.tk) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kv.S, 1.0F));
               }

               this.a(ecp.l);
               this.g(bxg.v).c(b.b());
            }
         } else {
            jr<czc> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(awv.a) && !this.b(bug.m)) {
               $$2 = czf.w;
            } else if (this.ae.i() < 0.15F && (this.bX() || this.eG() != null && this.eG().a(awr.i)) && !this.b(bug.l)) {
               $$2 = czf.l;
            } else if (this.ae.i() < 0.05F && this.eE() < this.eS()) {
               $$2 = czf.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bug.a) && this.f().g(this) > 121.0) {
               $$2 = czf.n;
            }

            if ($$2 != null) {
               this.a(bvj.a, cze.a(cxl.tk, $$2));
               this.bG = this.eZ().a((bvy)this);
               this.y(true);
               if (!this.bb()) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.Dt, this.dl(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bxc $$3 = this.g(bxg.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dU().a(this, (byte)15);
         }
      }

      super.k_();
   }

   @Override
   public avz ah_() {
      return awa.Dr;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dU().a(lt.aq, this.dz() + this.ae.k() * 0.13F, this.cQ().e + 0.5 + this.ae.k() * 0.13F, this.dF() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(btp $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awr.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bvy $$0, float $$1) {
      if (!this.j()) {
         fbx $$2 = $$0.dx();
         double $$3 = $$0.dz() + $$2.d - this.dz();
         double $$4 = $$0.dD() - 1.1F - this.dB();
         double $$5 = $$0.dF() + $$2.f - this.dF();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jr<czc> $$7 = czf.A;
         if ($$0 instanceof crf) {
            if ($$0.eE() <= 4.0F) {
               $$7 = czf.y;
            } else {
               $$7 = czf.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bug.b)) {
            $$7 = czf.q;
         } else if ($$0.eE() >= 8.0F && !$$0.b(bug.s)) {
            $$7 = czf.C;
         } else if ($$6 <= 3.0 && !$$0.b(bug.r) && this.ae.i() < 0.25F) {
            $$7 = czf.L;
         }

         if (this.dU() instanceof ard $$8) {
            cxh $$9 = cze.a(cxl.wq, $$7);
            cqk.a(cqw::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.Dv, this.dl(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
