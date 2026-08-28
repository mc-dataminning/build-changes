import java.util.List;
import javax.annotation.Nullable;

public class cml extends cnc {
   @Nullable
   private cio a;

   public cml(bvm<? extends cml> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cml.b());
      this.bT.a(2, new ccg<>(this, cps.class, 8.0F, 0.6, 1.0));
      this.bT.a(3, new ccg<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cml.c());
      this.bT.a(5, new cml.a());
      this.bT.a(6, new cml.d());
      this.bT.a(8, new cdw(this, 0.6));
      this.bT.a(9, new cdh(this, cps.class, 3.0F, 1.0F));
      this.bT.a(10, new cdh(this, bwd.class, 8.0F));
      this.bU.a(1, new cer(this, crg.class).a());
      this.bU.a(2, new ces<>(this, cps.class, true).c(300));
      this.bU.a(3, new ces<>(this, coz.class, false).c(300));
      this.bU.a(3, new ces<>(this, cie.class, false));
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.v, 0.5).a(bxj.m, 12.0).a(bxj.s, 24.0);
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
      return axf.iS;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bvf $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cng $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected axe u() {
      return axf.iQ;
   }

   @Override
   protected axe o_() {
      return axf.iT;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.iV;
   }

   void a(@Nullable cio $$0) {
      this.a = $$0;
   }

   @Nullable
   cio gG() {
      return this.a;
   }

   @Override
   protected axe x() {
      return axf.iR;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   class a extends cnc.c {
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
         bwb $$0 = cml.this.O_();
         double $$1 = Math.min($$0.dC(), cml.this.dC());
         double $$2 = Math.max($$0.dC(), cml.this.dC()) + 1.0;
         float $$3 = (float)bae.d($$0.dG() - cml.this.dG(), $$0.dA() - cml.this.dA());
         if (cml.this.g((bvf)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cml.this.dA() + (double)bae.b($$5) * 1.5, cml.this.dG() + (double)bae.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cml.this.dA() + (double)bae.b($$7) * 2.5, cml.this.dG() + (double)bae.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cml.this.dA() + (double)bae.b($$3) * $$9, cml.this.dG() + (double)bae.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jh $$6 = jh.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jh $$9 = $$6.e();
            dxn $$10 = cml.this.dV().a_($$9);
            if ($$10.c(cml.this.dV(), $$9, jm.b)) {
               if (!cml.this.dV().u($$6)) {
                  dxn $$11 = cml.this.dV().a_($$6);
                  fcm $$12 = $$11.g(cml.this.dV(), $$6);
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
            cml.this.dV().b(new cqd(cml.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cml.this));
            cml.this.dV().a(ecj.t, new fbs($$0, (double)$$6.v() + $$8, $$1), ecj.a.a(cml.this));
         }
      }

      @Override
      protected axe l() {
         return axf.iW;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.c;
      }
   }

   class b extends cnc.b {
      @Override
      public void a() {
         if (cml.this.O_() != null) {
            cml.this.H().a(cml.this.O_(), (float)cml.this.aa(), (float)cml.this.Z());
         } else if (cml.this.gG() != null) {
            cml.this.H().a(cml.this.gG(), (float)cml.this.aa(), (float)cml.this.Z());
         }
      }
   }

   class c extends cnc.c {
      private final cgs e = cgs.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cml.this.dV()).a(cng.class, this.e, cml.this, cml.this.cR().g(16.0)).size();
            return cml.this.ae.a(8) + 1 > $$0;
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
         ash $$0 = (ash)cml.this.dV();
         fcs $$1 = cml.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jh $$3 = cml.this.dv().b(-2 + cml.this.ae.a(5), 1, -2 + cml.this.ae.a(5));
            cng $$4 = bvm.bC.a(cml.this.dV(), bvl.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cml.this.dV().d_($$3), bvl.f, null);
               $$4.a(cml.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cml.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ecj.t, $$3, ecj.a.a(cml.this));
            }
         }
      }

      @Override
      protected axe l() {
         return axf.iX;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.b;
      }
   }

   public class d extends cnc.c {
      private final cgs e = cgs.b().a(16.0).a(($$0x, $$1) -> ((cio)$$0x).t() == cwh.l);

      @Override
      public boolean b() {
         if (cml.this.O_() != null) {
            return false;
         } else if (cml.this.gv()) {
            return false;
         } else if (cml.this.af < this.c) {
            return false;
         } else {
            ash $$0 = a(cml.this.dV());
            if (!$$0.N().b(dgw.c)) {
               return false;
            } else {
               List<cio> $$1 = $$0.a(cio.class, this.e, cml.this, cml.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cml.this.a($$1.get(cml.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cml.this.gG() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cml.this.a(null);
      }

      @Override
      protected void k() {
         cio $$0 = cml.this.gG();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cwh.o);
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
         return axf.iY;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.d;
      }
   }
}
