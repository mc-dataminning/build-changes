public class cmn extends cql implements cmb {
   private static final aku a = aku.b("drinking");
   private static final bwm b = new bwm(a, -0.25, bwm.a.a);
   private static final ajx<Boolean> bY = akb.a(cmn.class, ajz.k);
   private int bZ;
   private cdz<cql> ca;
   private cdy<cox> cb;

   public cmn(bur<? extends cmn> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.ca = new cdz<>(this, cql.class, true, ($$0, $$1) -> this.gF() && $$0.aq() != bur.bI);
      this.cb = new cdy<>(this, cox.class, 10, true, false, null);
      this.bS.a(1, new cby(this));
      this.bS.a(2, new cdd(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdr(this, 1.0));
      this.bS.a(3, new ccm(this, cox.class, 8.0F));
      this.bS.a(3, new ccz(this));
      this.bT.a(1, new cdw(this, cql.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avz u() {
      return awa.Dh;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Dl;
   }

   @Override
   protected avz o_() {
      return awa.Dj;
   }

   public void z(boolean $$0) {
      this.au().a(bY, $$0);
   }

   public boolean m() {
      return this.au().a(bY);
   }

   public static bwn.a p() {
      return clx.gu().a(bwo.s, 26.0).a(bwo.v, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dW().C && this.bL()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.m()) {
            if (this.bZ-- <= 0) {
               this.z(false);
               cwp $$0 = this.eZ();
               this.a(bus.a, cwp.j);
               cyo $$1 = $$0.a(kv.Q);
               if ($$0.a(cwt.ti) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ebt.l);
               this.g(bwo.v).c(b.b());
            }
         } else {
            jr<cym> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(awv.a) && !this.b(btr.m)) {
               $$2 = cyp.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eG() != null && this.eG().a(awr.i)) && !this.b(btr.l)) {
               $$2 = cyp.l;
            } else if (this.ae.i() < 0.05F && this.eE() < this.eS()) {
               $$2 = cyp.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(btr.a) && this.O_().g(this) > 121.0) {
               $$2 = cyp.n;
            }

            if ($$2 != null) {
               this.a(bus.a, cyo.a(cwt.ti, $$2));
               this.bZ = this.eZ().a((bvg)this);
               this.z(true);
               if (!this.bb()) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), awa.Dk, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bwk $$3 = this.g(bwo.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dW().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public avz aj_() {
      return awa.Di;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dW().a(lt.ap, this.dB() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dH() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bta $$0, float $$1) {
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
   public void a(bvg $$0, float $$1) {
      if (!this.m()) {
         fba $$2 = $$0.dz();
         double $$3 = $$0.dB() + $$2.d - this.dB();
         double $$4 = $$0.dF() - 1.1F - this.dD();
         double $$5 = $$0.dH() + $$2.f - this.dH();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jr<cym> $$7 = cyp.A;
         if ($$0 instanceof cql) {
            if ($$0.eE() <= 4.0F) {
               $$7 = cyp.y;
            } else {
               $$7 = cyp.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btr.b)) {
            $$7 = cyp.q;
         } else if ($$0.eE() >= 8.0F && !$$0.b(btr.s)) {
            $$7 = cyp.C;
         } else if ($$6 <= 3.0 && !$$0.b(btr.r) && this.ae.i() < 0.25F) {
            $$7 = cyp.L;
         }

         if (this.dW() instanceof arc $$8) {
            cwp $$9 = cyo.a(cwt.wo, $$7);
            cpq.a(cqc::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), awa.Dm, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gp() {
      return false;
   }
}
