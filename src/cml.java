import java.util.List;
import javax.annotation.Nullable;

public class cml extends cnc {
   @Nullable
   private cin a;

   public cml(bvi<? extends cml> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cml.b());
      this.bC.a(2, new ccd<>(this, cpr.class, 8.0F, 0.6, 1.0));
      this.bC.a(3, new ccd<>(this, cnw.class, 8.0F, 0.6, 1.0));
      this.bC.a(4, new cml.c());
      this.bC.a(5, new cml.a());
      this.bC.a(6, new cml.d());
      this.bC.a(8, new cdt(this, 0.6));
      this.bC.a(9, new cde(this, cpr.class, 3.0F, 1.0F));
      this.bC.a(10, new cde(this, bwa.class, 8.0F));
      this.bD.a(1, new ceo(this, crf.class).a());
      this.bD.a(2, new cep<>(this, cpr.class, true).c(300));
      this.bD.a(3, new cep<>(this, coy.class, false).c(300));
      this.bD.a(3, new cep<>(this, cib.class, false));
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.v, 0.5).a(bxg.m, 12.0).a(bxg.s, 24.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
   }

   @Override
   public avz ah_() {
      return awa.iU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bva $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cng $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected avz u() {
      return awa.iS;
   }

   @Override
   protected avz l_() {
      return awa.iV;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.iX;
   }

   void a(@Nullable cin $$0) {
      this.a = $$0;
   }

   @Nullable
   cin gK() {
      return this.a;
   }

   @Override
   protected avz q() {
      return awa.iT;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
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
         bvy $$0 = cml.this.f();
         double $$1 = Math.min($$0.dB(), cml.this.dB());
         double $$2 = Math.max($$0.dB(), cml.this.dB()) + 1.0;
         float $$3 = (float)ayz.d($$0.dF() - cml.this.dF(), $$0.dz() - cml.this.dz());
         if (cml.this.g((bva)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cml.this.dz() + (double)ayz.b($$5) * 1.5, cml.this.dF() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cml.this.dz() + (double)ayz.b($$7) * 2.5, cml.this.dF() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cml.this.dz() + (double)ayz.b($$3) * $$9, cml.this.dF() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ji $$6 = ji.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ji $$9 = $$6.e();
            dxq $$10 = cml.this.dU().a_($$9);
            if ($$10.c(cml.this.dU(), $$9, jn.b)) {
               if (!cml.this.dU().u($$6)) {
                  dxq $$11 = cml.this.dU().a_($$6);
                  fcr $$12 = $$11.g(cml.this.dU(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jn.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= ayz.a($$2) - 1);

         if ($$7) {
            cml.this.dU().b(new cqc(cml.this.dU(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cml.this));
            cml.this.dU().a(ecp.t, new fbx($$0, (double)$$6.v() + $$8, $$1), ecp.a.a(cml.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iY;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.c;
      }
   }

   class b extends cnc.b {
      @Override
      public void a() {
         if (cml.this.f() != null) {
            cml.this.J().a(cml.this.f(), (float)cml.this.ad(), (float)cml.this.ac());
         } else if (cml.this.gK() != null) {
            cml.this.J().a(cml.this.gK(), (float)cml.this.ad(), (float)cml.this.ac());
         }
      }
   }

   class c extends cnc.c {
      private final cgp e = cgp.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cml.this.dU()).a(cng.class, this.e, cml.this, cml.this.cQ().g(16.0)).size();
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
         ard $$0 = (ard)cml.this.dU();
         fcx $$1 = cml.this.cq();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ji $$3 = cml.this.du().b(-2 + cml.this.ae.a(5), 1, -2 + cml.this.ae.a(5));
            cng $$4 = bvi.bB.a(cml.this.dU(), bvh.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cml.this.dU().d_($$3), bvh.f, null);
               $$4.a(cml.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cml.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cH(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ecp.t, $$3, ecp.a.a(cml.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iZ;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.b;
      }
   }

   public class d extends cnc.c {
      private final cgp e = cgp.b().a(16.0).a(($$0x, $$1) -> ((cin)$$0x).t() == cwe.l);

      @Override
      public boolean b() {
         if (cml.this.f() != null) {
            return false;
         } else if (cml.this.gz()) {
            return false;
         } else if (cml.this.af < this.c) {
            return false;
         } else {
            ard $$0 = a(cml.this.dU());
            if (!$$0.O().b(dgv.c)) {
               return false;
            } else {
               List<cin> $$1 = $$0.a(cin.class, this.e, cml.this, cml.this.cQ().c(16.0, 4.0, 16.0));
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
         return cml.this.gK() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cml.this.a(null);
      }

      @Override
      protected void k() {
         cin $$0 = cml.this.gK();
         if ($$0 != null && $$0.bJ()) {
            $$0.b(cwe.o);
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
      protected avz l() {
         return awa.ja;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.d;
      }
   }
}
