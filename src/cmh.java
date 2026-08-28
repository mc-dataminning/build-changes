import java.util.List;
import javax.annotation.Nullable;

public class cmh extends cmy {
   @Nullable
   private cik a;

   public cmh(bvi<? extends cmh> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cmh.b());
      this.bT.a(2, new ccc<>(this, cpo.class, 8.0F, 0.6, 1.0));
      this.bT.a(3, new ccc<>(this, cns.class, 8.0F, 0.6, 1.0));
      this.bT.a(4, new cmh.c());
      this.bT.a(5, new cmh.a());
      this.bT.a(6, new cmh.d());
      this.bT.a(8, new cds(this, 0.6));
      this.bT.a(9, new cdd(this, cpo.class, 3.0F, 1.0F));
      this.bT.a(10, new cdd(this, bvz.class, 8.0F));
      this.bU.a(1, new cen(this, crc.class).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true).c(300));
      this.bU.a(3, new ceo<>(this, cov.class, false).c(300));
      this.bU.a(3, new ceo<>(this, cia.class, false));
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.v, 0.5).a(bxf.m, 12.0).a(bxf.s, 24.0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
   }

   @Override
   public awu ak_() {
      return awv.iU;
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bvb $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cnc $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awu u() {
      return awv.iS;
   }

   @Override
   protected awu o_() {
      return awv.iV;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.iX;
   }

   void a(@Nullable cik $$0) {
      this.a = $$0;
   }

   @Nullable
   cik gI() {
      return this.a;
   }

   @Override
   protected awu x() {
      return awv.iT;
   }

   @Override
   public void a(arx $$0, int $$1, boolean $$2) {
   }

   class a extends cmy.c {
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
         bvx $$0 = cmh.this.O_();
         double $$1 = Math.min($$0.dD(), cmh.this.dD());
         double $$2 = Math.max($$0.dD(), cmh.this.dD()) + 1.0;
         float $$3 = (float)azu.d($$0.dH() - cmh.this.dH(), $$0.dB() - cmh.this.dB());
         if (cmh.this.g((bvb)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cmh.this.dB() + (double)azu.b($$5) * 1.5, cmh.this.dH() + (double)azu.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cmh.this.dB() + (double)azu.b($$7) * 2.5, cmh.this.dH() + (double)azu.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cmh.this.dB() + (double)azu.b($$3) * $$9, cmh.this.dH() + (double)azu.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jh $$6 = jh.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jh $$9 = $$6.e();
            dxo $$10 = cmh.this.dW().a_($$9);
            if ($$10.c(cmh.this.dW(), $$9, jm.b)) {
               if (!cmh.this.dW().u($$6)) {
                  dxo $$11 = cmh.this.dW().a_($$6);
                  fcl $$12 = $$11.g(cmh.this.dW(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jm.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azu.a($$2) - 1);

         if ($$7) {
            cmh.this.dW().b(new cpz(cmh.this.dW(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cmh.this));
            cmh.this.dW().a(eck.t, new fbr($$0, (double)$$6.v() + $$8, $$1), eck.a.a(cmh.this));
         }
      }

      @Override
      protected awu l() {
         return awv.iY;
      }

      @Override
      protected cmy.a m() {
         return cmy.a.c;
      }
   }

   class b extends cmy.b {
      @Override
      public void a() {
         if (cmh.this.O_() != null) {
            cmh.this.H().a(cmh.this.O_(), (float)cmh.this.aa(), (float)cmh.this.Z());
         } else if (cmh.this.gI() != null) {
            cmh.this.H().a(cmh.this.gI(), (float)cmh.this.aa(), (float)cmh.this.Z());
         }
      }
   }

   class c extends cmy.c {
      private final cgo e = cgo.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cmh.this.dW()).a(cnc.class, this.e, cmh.this, cmh.this.cR().g(16.0)).size();
            return cmh.this.ae.a(8) + 1 > $$0;
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
         arx $$0 = (arx)cmh.this.dW();
         fcr $$1 = cmh.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jh $$3 = cmh.this.dw().b(-2 + cmh.this.ae.a(5), 1, -2 + cmh.this.ae.a(5));
            cnc $$4 = bvi.bC.a(cmh.this.dW(), bvh.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cmh.this.dW().d_($$3), bvh.f, null);
               $$4.a(cmh.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cmh.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eck.t, $$3, eck.a.a(cmh.this));
            }
         }
      }

      @Override
      protected awu l() {
         return awv.iZ;
      }

      @Override
      protected cmy.a m() {
         return cmy.a.b;
      }
   }

   public class d extends cmy.c {
      private final cgo e = cgo.b().a(16.0).a(($$0x, $$1) -> ((cik)$$0x).t() == cwd.l);

      @Override
      public boolean b() {
         if (cmh.this.O_() != null) {
            return false;
         } else if (cmh.this.gx()) {
            return false;
         } else if (cmh.this.af < this.c) {
            return false;
         } else {
            arx $$0 = a(cmh.this.dW());
            if (!$$0.O().b(dgv.c)) {
               return false;
            } else {
               List<cik> $$1 = $$0.a(cik.class, this.e, cmh.this, cmh.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cmh.this.a($$1.get(cmh.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cmh.this.gI() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cmh.this.a(null);
      }

      @Override
      protected void k() {
         cik $$0 = cmh.this.gI();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cwd.o);
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
      protected awu l() {
         return awv.ja;
      }

      @Override
      protected cmy.a m() {
         return cmy.a.d;
      }
   }
}
