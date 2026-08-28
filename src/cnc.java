import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnc extends crl {
   private static final Predicate<bvk> bZ = $$0 -> !($$0 instanceof cnc) && $$0.bL();
   private static final Predicate<bvk> ca = $$0 -> bZ.test($$0) && !$$0.aq().equals(bvr.f);
   private static final Predicate<bwg> cb = $$0 -> !($$0 instanceof cnc) && $$0.bL() && $$0.di();
   private static final double cc = 0.3;
   private static final double cd = 0.35;
   private static final int ce = 8356754;
   private static final float cf = 0.57254905F;
   private static final float cg = 0.5137255F;
   private static final float ch = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int ci;
   private int cj;
   private int ck;

   public cnc(bvr<? extends cnc> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 20;
      this.a(euo.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(3, new ccl<>(this, cob.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cdo(this, 1.0, true));
      this.bT.a(5, new cer(this, 0.4));
      this.bT.a(6, new cdm(this, cpx.class, 6.0F));
      this.bT.a(10, new cdm(this, bwi.class, 8.0F));
      this.bU.a(2, new cew(this, crl.class).a());
      this.bU.a(3, new cex<>(this, cpx.class, true));
      this.bU.a(4, new cex<>(this, cpe.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bU.a(4, new cex<>(this, cij.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cX() instanceof bwi) || this.cX().aq().a(axy.c);
      boolean $$1 = !(this.dl() instanceof cru);
      this.bT.a(cde.a.a, $$0);
      this.bT.a(cde.a.c, $$0 && $$1);
      this.bT.a(cde.a.b, $$0);
      this.bT.a(cde.a.d, $$0);
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 100.0).a(bxo.v, 0.3).a(bxo.p, 0.75).a(bxo.c, 12.0).a(bxo.d, 1.5).a(bxo.m, 32.0).a(bxo.B, 1.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ci);
      $$0.a("StunTick", this.cj);
      $$0.a("RoarTick", this.ck);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.ci = $$0.h("AttackTick");
      this.cj = $$0.h("StunTick");
      this.ck = $$0.h("RoarTick");
   }

   @Override
   public axe ak_() {
      return axf.vz;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL()) {
         if (this.fi()) {
            this.g(bxo.v).a(0.0);
         } else {
            double $$0 = this.O_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bxo.v).b();
            this.g(bxo.v).a(bae.d(0.1, $$1, $$0));
         }

         if (this.dW() instanceof ash $$2 && this.P && $$2.N().b(dhe.c)) {
            boolean $$3 = false;
            fbt $$4 = this.cR().g(0.2);

            for (jh $$5 : jh.b(bae.a($$4.a), bae.a($$4.b), bae.a($$4.c), bae.a($$4.d), bae.a($$4.e), bae.a($$4.f))) {
               dxv $$6 = $$2.a_($$5);
               dkm $$7 = $$6.b();
               if ($$7 instanceof doy) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
            }
         }

         if (this.ck > 0) {
            this.ck--;
            if (this.ck == 10) {
               this.gz();
            }
         }

         if (this.ci > 0) {
            this.ci--;
         }

         if (this.cj > 0) {
            this.cj--;
            this.gy();
            if (this.cj == 0) {
               this.a(axf.vE, 1.0F, 1.0F);
               this.ck = 20;
            }
         }
      }
   }

   private void gy() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dB() - (double)this.dr() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dD() + (double)this.ds() - 0.3;
         double $$2 = this.dH() + (double)this.dr() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dW().a(ll.a(ls.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fi() {
      return super.fi() || this.ci > 0 || this.cj > 0 || this.ck > 0;
   }

   @Override
   public boolean E(bvk $$0) {
      return this.cj <= 0 && this.ck <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bwg $$0) {
      if (this.ck == 0) {
         if (this.ae.j() < 0.5) {
            this.cj = 40;
            this.a(axf.vD, 1.0F, 1.0F);
            this.dW().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gz() {
      if (this.bL()) {
         if (this.dW() instanceof ash $$0) {
            Predicate<bvk> $$1 = $$0.N().b(dhe.c) ? bZ : ca;

            for (bwg $$3 : this.dW().a(bwg.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cme)) {
                  $$3.a($$0, this.dX().b((bwg)this), 6.0F);
               }

               if (!($$3 instanceof cpx)) {
                  this.b($$3);
               }
            }

            this.a(ecr.u);
         } else {
            for (bwg $$5 : this.dW().a(bwg.class, this.cR().g(4.0), cb)) {
               this.b($$5);
            }

            fby $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dW().a(ls.ac, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bvk $$0) {
      double $$1 = $$0.dB() - this.dB();
      double $$2 = $$0.dH() - this.dH();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ci = 10;
         this.a(axf.vy, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cj = 40;
      }

      super.b($$0);
   }

   public int p() {
      return this.ci;
   }

   public int x() {
      return this.cj;
   }

   public int gx() {
      return this.ck;
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      this.ci = 10;
      $$0.a(this, (byte)4);
      this.a(axf.vy, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.vx;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.vB;
   }

   @Override
   protected axe o_() {
      return axf.vA;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.vC, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dhl $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   protected fbt ge() {
      fbt $$0 = super.ge();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
