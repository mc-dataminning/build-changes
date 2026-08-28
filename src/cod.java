import java.util.List;
import javax.annotation.Nullable;

public class cod extends cov {
   @Nullable
   private cly a;

   public cod(bwr<? extends cod> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cod.b());
      this.bD.a(2, new cdm<>(this, crj.class, 8.0F, 0.6, 1.0));
      this.bD.a(3, new cdm<>(this, cpp.class, 8.0F, 0.6, 1.0));
      this.bD.a(4, new cod.c());
      this.bD.a(5, new cod.a());
      this.bD.a(6, new cod.d());
      this.bD.a(8, new cfc(this, 0.6));
      this.bD.a(9, new cen(this, crj.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
      this.bE.a(1, new cfx(this, cta.class).a());
      this.bE.a(2, new cfy<>(this, crj.class, true).c(300));
      this.bE.a(3, new cfy<>(this, cqq.class, false).c(300));
      this.bE.a(3, new cfy<>(this, cjp.class, false));
   }

   public static byo.a m() {
      return cok.gw().a(byp.v, 0.5).a(byp.m, 12.0).a(byp.s, 24.0);
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
         if ($$0 instanceof coz $$1 && $$1.m() != null) {
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

   void a(@Nullable cly $$0) {
      this.a = $$0;
   }

   @Nullable
   cly gL() {
      return this.a;
   }

   @Override
   protected awm q() {
      return awn.iW;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   class a extends cov.c {
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
         bxj $$0 = cod.this.f();
         double $$1 = Math.min($$0.dB(), cod.this.dB());
         double $$2 = Math.max($$0.dB(), cod.this.dB()) + 1.0;
         float $$3 = (float)azm.d($$0.dF() - cod.this.dF(), $$0.dz() - cod.this.dz());
         if (cod.this.g((bwi)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cod.this.dz() + (double)azm.b($$5) * 1.5, cod.this.dF() + (double)azm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cod.this.dz() + (double)azm.b($$7) * 2.5, cod.this.dF() + (double)azm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cod.this.dz() + (double)azm.b($$3) * $$9, cod.this.dF() + (double)azm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iv $$6 = iv.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iv $$9 = $$6.e();
            eao $$10 = cod.this.dU().a_($$9);
            if ($$10.c(cod.this.dU(), $$9, jb.b)) {
               if (!cod.this.dU().v($$6)) {
                  eao $$11 = cod.this.dU().a_($$6);
                  ffr $$12 = $$11.g(cod.this.dU(), $$6);
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
            cod.this.dU().b(new crw(cod.this.dU(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cod.this));
            cod.this.dU().a(efo.t, new fex($$0, (double)$$6.v() + $$8, $$1), efo.a.a(cod.this));
         }
      }

      @Override
      protected awm l() {
         return awn.jb;
      }

      @Override
      protected cov.a m() {
         return cov.a.c;
      }
   }

   class b extends cov.b {
      @Override
      public void a() {
         if (cod.this.f() != null) {
            cod.this.J().a(cod.this.f(), (float)cod.this.af(), (float)cod.this.ad());
         } else if (cod.this.gL() != null) {
            cod.this.J().a(cod.this.gL(), (float)cod.this.af(), (float)cod.this.ad());
         }
      }
   }

   class c extends cov.c {
      private final chy e = chy.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cod.this.dU()).a(coz.class, this.e, cod.this, cod.this.cQ().g(16.0)).size();
            return cod.this.ae.a(8) + 1 > $$0;
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
         arq $$0 = (arq)cod.this.dU();
         ffx $$1 = cod.this.cp();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iv $$3 = cod.this.du().b(-2 + cod.this.ae.a(5), 1, -2 + cod.this.ae.a(5));
            coz $$4 = bwr.bC.a(cod.this.dU(), bwq.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cod.this.dU().d_($$3), bwq.f, null);
               $$4.a(cod.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cod.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cH(), $$1);
               }

               $$0.a_($$4);
               $$0.a(efo.t, $$3, efo.a.a(cod.this));
            }
         }
      }

      @Override
      protected awm l() {
         return awn.jc;
      }

      @Override
      protected cov.a m() {
         return cov.a.b;
      }
   }

   public class d extends cov.c {
      private final chy e = chy.b().a(16.0).a(($$0x, $$1) -> ((cly)$$0x).t() == cyi.l);

      @Override
      public boolean b() {
         if (cod.this.f() != null) {
            return false;
         } else if (cod.this.gA()) {
            return false;
         } else if (cod.this.af < this.c) {
            return false;
         } else {
            arq $$0 = a(cod.this.dU());
            if (!$$0.O().c(djd.d)) {
               return false;
            } else {
               List<cly> $$1 = $$0.a(cly.class, this.e, cod.this, cod.this.cQ().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cod.this.a($$1.get(cod.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cod.this.gL() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cod.this.a(null);
      }

      @Override
      protected void k() {
         cly $$0 = cod.this.gL();
         if ($$0 != null && $$0.bI()) {
            $$0.b(cyi.o);
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
      protected cov.a m() {
         return cov.a.d;
      }
   }
}
