import java.util.List;
import javax.annotation.Nullable;

public class cmq extends cnh {
   @Nullable
   private cit a;

   public cmq(bvr<? extends cmq> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cmq.b());
      this.bT.a(2, new ccl<>(this, cpx.class, 8.0F, 0.6, 1.0));
      this.bT.a(3, new ccl<>(this, cob.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cmq.c());
      this.bT.a(5, new cmq.a());
      this.bT.a(6, new cmq.d());
      this.bT.a(8, new ceb(this, 0.6));
      this.bT.a(9, new cdm(this, cpx.class, 3.0F, 1.0F));
      this.bT.a(10, new cdm(this, bwi.class, 8.0F));
      this.bU.a(1, new cew(this, crl.class).a());
      this.bU.a(2, new cex<>(this, cpx.class, true).c(300));
      this.bU.a(3, new cex<>(this, cpe.class, false).c(300));
      this.bU.a(3, new cex<>(this, cij.class, false));
   }

   public static bxn.a p() {
      return cmx.gt().a(bxo.v, 0.5).a(bxo.m, 12.0).a(bxo.s, 24.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
   }

   @Override
   public axe ak_() {
      return axf.iT;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bvk $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cnl $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected axe u() {
      return axf.iR;
   }

   @Override
   protected axe o_() {
      return axf.iU;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.iW;
   }

   void a(@Nullable cit $$0) {
      this.a = $$0;
   }

   @Nullable
   cit gI() {
      return this.a;
   }

   @Override
   protected axe x() {
      return axf.iS;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   class a extends cnh.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         bwg $$0 = cmq.this.O_();
         double $$1 = Math.min($$0.dD(), cmq.this.dD());
         double $$2 = Math.max($$0.dD(), cmq.this.dD()) + 1.0;
         float $$3 = (float)bae.d($$0.dH() - cmq.this.dH(), $$0.dB() - cmq.this.dB());
         if (cmq.this.g((bvk)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cmq.this.dB() + (double)bae.b($$5) * 1.5, cmq.this.dH() + (double)bae.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cmq.this.dB() + (double)bae.b($$7) * 2.5, cmq.this.dH() + (double)bae.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cmq.this.dB() + (double)bae.b($$3) * $$9, cmq.this.dH() + (double)bae.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jh $$6 = jh.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jh $$9 = $$6.e();
            dxv $$10 = cmq.this.dW().a_($$9);
            if ($$10.c(cmq.this.dW(), $$9, jm.b)) {
               if (!cmq.this.dW().u($$6)) {
                  dxv $$11 = cmq.this.dW().a_($$6);
                  fcs $$12 = $$11.g(cmq.this.dW(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jm.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= bae.a($$2) - 1);

         if ($$7) {
            cmq.this.dW().b(new cqi(cmq.this.dW(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cmq.this));
            cmq.this.dW().a(ecr.t, new fby($$0, (double)$$6.v() + $$8, $$1), ecr.a.a(cmq.this));
         }
      }

      @Override
      protected axe l() {
         return axf.iX;
      }

      @Override
      protected cnh.a m() {
         return cnh.a.c;
      }
   }

   class b extends cnh.b {
      @Override
      public void a() {
         if (cmq.this.O_() != null) {
            cmq.this.H().a(cmq.this.O_(), (float)cmq.this.aa(), (float)cmq.this.Z());
         } else if (cmq.this.gI() != null) {
            cmq.this.H().a(cmq.this.gI(), (float)cmq.this.aa(), (float)cmq.this.Z());
         }
      }
   }

   class c extends cnh.c {
      private final cgx e = cgx.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cmq.this.dW()).a(cnl.class, this.e, cmq.this, cmq.this.cR().g(16.0)).size();
            return cmq.this.ae.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         ash $$0 = (ash)cmq.this.dW();
         fcy $$1 = cmq.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jh $$3 = cmq.this.dw().b(-2 + cmq.this.ae.a(5), 1, -2 + cmq.this.ae.a(5));
            cnl $$4 = bvr.bC.a(cmq.this.dW(), bvq.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cmq.this.dW().d_($$3), bvq.f, null);
               $$4.a(cmq.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cmq.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ecr.t, $$3, ecr.a.a(cmq.this));
            }
         }
      }

      @Override
      protected axe l() {
         return axf.iY;
      }

      @Override
      protected cnh.a m() {
         return cnh.a.b;
      }
   }

   public class d extends cnh.c {
      private final cgx e = cgx.b().a(16.0).a(($$0x, $$1) -> ((cit)$$0x).t() == cwm.l);

      @Override
      public boolean b() {
         if (cmq.this.O_() != null) {
            return false;
         } else if (cmq.this.gx()) {
            return false;
         } else if (cmq.this.af < this.c) {
            return false;
         } else {
            ash $$0 = a(cmq.this.dW());
            if (!$$0.N().b(dhe.c)) {
               return false;
            } else {
               List<cit> $$1 = $$0.a(cit.class, this.e, cmq.this, cmq.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cmq.this.a($$1.get(cmq.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cmq.this.gI() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cmq.this.a(null);
      }

      @Override
      protected void k() {
         cit $$0 = cmq.this.gI();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cwm.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected axe l() {
         return axf.iZ;
      }

      @Override
      protected cnh.a m() {
         return cnh.a.d;
      }
   }
}
