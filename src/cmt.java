import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmt extends crc {
   private static final Predicate<bvb> bZ = $$0 -> !($$0 instanceof cmt) && $$0.bL();
   private static final Predicate<bvb> ca = $$0 -> bZ.test($$0) && !$$0.aq().equals(bvi.f);
   private static final Predicate<bvx> cb = $$0 -> !($$0 instanceof cmt) && $$0.bL() && $$0.di();
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

   public cmt(bvi<? extends cmt> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 20;
      this.a(euh.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccp(this));
      this.bT.a(4, new cdf(this, 1.0, true));
      this.bT.a(5, new cei(this, 0.4));
      this.bT.a(6, new cdd(this, cpo.class, 6.0F));
      this.bT.a(10, new cdd(this, bvz.class, 8.0F));
      this.bU.a(2, new cen(this, crc.class).a());
      this.bU.a(3, new ceo<>(this, cpo.class, true));
      this.bU.a(4, new ceo<>(this, cov.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bU.a(4, new ceo<>(this, cia.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cX() instanceof bvz) || this.cX().aq().a(axo.c);
      boolean $$1 = !(this.dl() instanceof crl);
      this.bT.a(ccv.a.a, $$0);
      this.bT.a(ccv.a.c, $$0 && $$1);
      this.bT.a(ccv.a.b, $$0);
      this.bT.a(ccv.a.d, $$0);
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 100.0).a(bxf.v, 0.3).a(bxf.p, 0.75).a(bxf.c, 12.0).a(bxf.d, 1.5).a(bxf.m, 32.0).a(bxf.B, 1.0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ci);
      $$0.a("StunTick", this.cj);
      $$0.a("RoarTick", this.ck);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.ci = $$0.h("AttackTick");
      this.cj = $$0.h("StunTick");
      this.ck = $$0.h("RoarTick");
   }

   @Override
   public awu ak_() {
      return awv.vF;
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
            this.g(bxf.v).a(0.0);
         } else {
            double $$0 = this.O_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bxf.v).b();
            this.g(bxf.v).a(azu.d(0.1, $$1, $$0));
         }

         if (this.dW() instanceof arx $$2 && this.P && $$2.O().b(dgv.c)) {
            boolean $$3 = false;
            fbm $$4 = this.cR().g(0.2);

            for (jh $$5 : jh.b(azu.a($$4.a), azu.a($$4.b), azu.a($$4.c), azu.a($$4.d), azu.a($$4.e), azu.a($$4.f))) {
               dxo $$6 = $$2.a_($$5);
               dkd $$7 = $$6.b();
               if ($$7 instanceof dop) {
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
               this.a(awv.vK, 1.0F, 1.0F);
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
   public boolean E(bvb $$0) {
      return this.cj <= 0 && this.ck <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bvx $$0) {
      if (this.ck == 0) {
         if (this.ae.j() < 0.5) {
            this.cj = 40;
            this.a(awv.vJ, 1.0F, 1.0F);
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
         if (this.dW() instanceof arx $$0) {
            Predicate<bvb> $$1 = $$0.O().b(dgv.c) ? bZ : ca;

            for (bvx $$3 : this.dW().a(bvx.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof clv)) {
                  $$3.a($$0, this.dX().b((bvx)this), 6.0F);
               }

               if (!($$3 instanceof cpo)) {
                  this.b($$3);
               }
            }

            this.a(eck.u);
         } else {
            for (bvx $$5 : this.dW().a(bvx.class, this.cR().g(4.0), cb)) {
               this.b($$5);
            }

            fbr $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dW().a(ls.ad, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bvb $$0) {
      double $$1 = $$0.dB() - this.dB();
      double $$2 = $$0.dH() - this.dH();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ci = 10;
         this.a(awv.vE, 1.0F, 1.0F);
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
   public boolean c(arx $$0, bvb $$1) {
      this.ci = 10;
      $$0.a(this, (byte)4);
      this.a(awv.vE, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awu u() {
      return awv.vD;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.vH;
   }

   @Override
   protected awu o_() {
      return awv.vG;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.vI, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dhc $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(arx $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   protected fbm ge() {
      fbm $$0 = super.ge();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
