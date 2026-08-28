import java.util.List;
import javax.annotation.Nullable;

public class cog extends coy {
   @Nullable
   private clv a;

   public cog(bwr<? extends cog> $$0, djm $$1) {
      super($$0, $$1);
      this.by = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cog.b());
      this.bD.a(2, new cdm<>(this, crm.class, 8.0F, 0.6, 1.0));
      this.bD.a(3, new cdm<>(this, cps.class, 8.0F, 0.6, 1.0));
      this.bD.a(4, new cog.c());
      this.bD.a(5, new cog.a());
      this.bD.a(6, new cog.d());
      this.bD.a(8, new cfc(this, 0.6));
      this.bD.a(9, new cen(this, crm.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
      this.bE.a(1, new cfx(this, ctd.class).a());
      this.bE.a(2, new cfy<>(this, crm.class, true).c(300));
      this.bE.a(3, new cfy<>(this, cqt.class, false).c(300));
      this.bE.a(3, new cfy<>(this, cjp.class, false));
   }

   public static byo.a m() {
      return coo.gw().a(byp.v, 0.5).a(byp.m, 12.0).a(byp.s, 24.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
   }

   @Override
   public awm ae_() {
      return awn.iX;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bwi $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cpc $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awm u() {
      return awn.iV;
   }

   @Override
   protected awm l_() {
      return awn.iY;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.ja;
   }

   void a(@Nullable clv $$0) {
      this.a = $$0;
   }

   @Nullable
   clv gL() {
      return this.a;
   }

   @Override
   protected awm q() {
      return awn.iW;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   class a extends coy.c {
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
         bxj $$0 = cog.this.f();
         double $$1 = Math.min($$0.dB(), cog.this.dB());
         double $$2 = Math.max($$0.dB(), cog.this.dB()) + 1.0;
         float $$3 = (float)azm.d($$0.dF() - cog.this.dF(), $$0.dz() - cog.this.dz());
         if (cog.this.g((bwi)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cog.this.dz() + (double)azm.b($$5) * 1.5, cog.this.dF() + (double)azm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cog.this.dz() + (double)azm.b($$7) * 2.5, cog.this.dF() + (double)azm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cog.this.dz() + (double)azm.b($$3) * $$9, cog.this.dF() + (double)azm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iv $$6 = iv.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iv $$9 = $$6.e();
            eat $$10 = cog.this.dU().a_($$9);
            if ($$10.c(cog.this.dU(), $$9, jb.b)) {
               if (!cog.this.dU().v($$6)) {
                  eat $$11 = cog.this.dU().a_($$6);
                  ffw $$12 = $$11.g(cog.this.dU(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jb.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azm.a($$2) - 1);

         if ($$7) {
            cog.this.dU().b(new crz(cog.this.dU(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cog.this));
            cog.this.dU().a(eft.t, new ffc($$0, (double)$$6.v() + $$8, $$1), eft.a.a(cog.this));
         }
      }

      @Override
      protected awm l() {
         return awn.jb;
      }

      @Override
      protected coy.a m() {
         return coy.a.c;
      }
   }

   class b extends coy.b {
      @Override
      public void a() {
         if (cog.this.f() != null) {
            cog.this.J().a(cog.this.f(), (float)cog.this.af(), (float)cog.this.ad());
         } else if (cog.this.gL() != null) {
            cog.this.J().a(cog.this.gL(), (float)cog.this.af(), (float)cog.this.ad());
         }
      }
   }

   class c extends coy.c {
      private final chy e = chy.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cog.this.dU()).a(cpc.class, this.e, cog.this, cog.this.cQ().g(16.0)).size();
            return cog.this.ae.a(8) + 1 > $$0;
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
         arq $$0 = (arq)cog.this.dU();
         fgc $$1 = cog.this.cp();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iv $$3 = cog.this.du().b(-2 + cog.this.ae.a(5), 1, -2 + cog.this.ae.a(5));
            cpc $$4 = bwr.bC.a(cog.this.dU(), bwq.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cog.this.dU().d_($$3), bwq.f, null);
               $$4.a(cog.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cog.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cH(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eft.t, $$3, eft.a.a(cog.this));
            }
         }
      }

      @Override
      protected awm l() {
         return awn.jc;
      }

      @Override
      protected coy.a m() {
         return coy.a.b;
      }
   }

   public class d extends coy.c {
      private final chy e = chy.b().a(16.0).a(($$0x, $$1) -> ((clv)$$0x).t() == cyl.l);

      @Override
      public boolean b() {
         if (cog.this.f() != null) {
            return false;
         } else if (cog.this.gA()) {
            return false;
         } else if (cog.this.af < this.c) {
            return false;
         } else {
            arq $$0 = a(cog.this.dU());
            if (!$$0.O().c(dji.d)) {
               return false;
            } else {
               List<clv> $$1 = $$0.a(clv.class, this.e, cog.this, cog.this.cQ().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cog.this.a($$1.get(cog.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cog.this.gL() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cog.this.a(null);
      }

      @Override
      protected void k() {
         clv $$0 = cog.this.gL();
         if ($$0 != null && $$0.bI()) {
            $$0.b(cyl.o);
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
      protected awm l() {
         return awn.jd;
      }

      @Override
      protected coy.a m() {
         return coy.a.d;
      }
   }
}
