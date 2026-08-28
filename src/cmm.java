public class cmm extends cqj implements cma {
   private static final aku a = aku.b("drinking");
   private static final bwl b = new bwl(a, -0.25, bwl.a.a);
   private static final ajx<Boolean> bY = akb.a(cmm.class, ajz.k);
   private int bZ;
   private cdy<cqj> ca;
   private cdx<cov> cb;

   public cmm(buq<? extends cmm> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.ca = new cdy<>(this, cqj.class, true, ($$0, $$1) -> this.gF() && $$0.aq() != buq.bH);
      this.cb = new cdx<>(this, cov.class, 10, true, false, null);
      this.bS.a(1, new cbx(this));
      this.bS.a(2, new cdc(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdq(this, 1.0));
      this.bS.a(3, new ccl(this, cov.class, 8.0F));
      this.bS.a(3, new ccy(this));
      this.bT.a(1, new cdv(this, cqj.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avy u() {
      return avz.Dg;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Dk;
   }

   @Override
   protected avy o_() {
      return avz.Di;
   }

   public void z(boolean $$0) {
      this.au().a(bY, $$0);
   }

   public boolean m() {
      return this.au().a(bY);
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.s, 26.0).a(bwn.v, 0.25);
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
               cwn $$0 = this.eZ();
               this.a(bur.a, cwn.j);
               cym $$1 = $$0.a(kv.Q);
               if ($$0.a(cwr.ti) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ebr.l);
               this.g(bwn.v).c(b.b());
            }
         } else {
            jr<cyk> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(awu.a) && !this.b(btq.m)) {
               $$2 = cyn.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eG() != null && this.eG().a(awq.i)) && !this.b(btq.l)) {
               $$2 = cyn.l;
            } else if (this.ae.i() < 0.05F && this.eE() < this.eS()) {
               $$2 = cyn.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(btq.a) && this.O_().g(this) > 121.0) {
               $$2 = cyn.n;
            }

            if ($$2 != null) {
               this.a(bur.a, cym.a(cwr.ti, $$2));
               this.bZ = this.eZ().a((bvf)this);
               this.z(true);
               if (!this.bb()) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.Dj, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bwj $$3 = this.g(bwn.v);
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
   public avy aj_() {
      return avz.Dh;
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
   protected float f(bsz $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awq.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bvf $$0, float $$1) {
      if (!this.m()) {
         fay $$2 = $$0.dz();
         double $$3 = $$0.dB() + $$2.d - this.dB();
         double $$4 = $$0.dF() - 1.1F - this.dD();
         double $$5 = $$0.dH() + $$2.f - this.dH();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jr<cyk> $$7 = cyn.A;
         if ($$0 instanceof cqj) {
            if ($$0.eE() <= 4.0F) {
               $$7 = cyn.y;
            } else {
               $$7 = cyn.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btq.b)) {
            $$7 = cyn.q;
         } else if ($$0.eE() >= 8.0F && !$$0.b(btq.s)) {
            $$7 = cyn.C;
         } else if ($$6 <= 3.0 && !$$0.b(btq.r) && this.ae.i() < 0.25F) {
            $$7 = cyn.L;
         }

         if (this.dW() instanceof arc $$8) {
            cwn $$9 = cym.a(cwr.wo, $$7);
            cpo.a(cqa::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.Dl, this.dn(), 1.0F, 0.8F + this.ae.i() * 0.4F);
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
