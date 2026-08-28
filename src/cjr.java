import java.util.List;
import javax.annotation.Nullable;

public class cjr extends cki {
   @Nullable
   private cfw e;

   public cjr(bsv<? extends cjr> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cjr.b());
      this.bS.a(2, new bzp<>(this, cms.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cjr.c());
      this.bS.a(5, new cjr.a());
      this.bS.a(6, new cjr.d());
      this.bS.a(8, new cbf(this, 0.6));
      this.bS.a(9, new caq(this, cms.class, 3.0F, 1.0F));
      this.bS.a(10, new caq(this, btm.class, 8.0F));
      this.bT.a(1, new cca(this, coe.class).a());
      this.bT.a(2, new ccb<>(this, cms.class, true).c(300));
      this.bT.a(3, new ccb<>(this, cma.class, false).c(300));
      this.bT.a(3, new ccb<>(this, cfm.class, false));
   }

   public static bur.a u() {
      return cjy.gw().a(bus.r, 0.5).a(bus.k, 12.0).a(bus.q, 24.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
   }

   @Override
   public avv ae_() {
      return avw.iz;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bsp $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckm $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected avv v() {
      return avw.ix;
   }

   @Override
   protected avv o_() {
      return avw.iA;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.iC;
   }

   void a(@Nullable cfw $$0) {
      this.e = $$0;
   }

   @Nullable
   cfw gL() {
      return this.e;
   }

   @Override
   protected avv gq() {
      return avw.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cki.c {
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
         btk $$0 = cjr.this.p();
         double $$1 = Math.min($$0.dw(), cjr.this.dw());
         double $$2 = Math.max($$0.dw(), cjr.this.dw()) + 1.0;
         float $$3 = (float)ayu.d($$0.dA() - cjr.this.dA(), $$0.du() - cjr.this.du());
         if (cjr.this.g((bsp)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjr.this.du() + (double)ayu.b($$5) * 1.5, cjr.this.dA() + (double)ayu.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjr.this.du() + (double)ayu.b($$7) * 2.5, cjr.this.dA() + (double)ayu.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjr.this.du() + (double)ayu.b($$3) * $$9, cjr.this.dA() + (double)ayu.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iz $$6 = iz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iz $$9 = $$6.d();
            drx $$10 = cjr.this.dP().a_($$9);
            if ($$10.d(cjr.this.dP(), $$9, je.b)) {
               if (!cjr.this.dP().u($$6)) {
                  drx $$11 = cjr.this.dP().a_($$6);
                  ewf $$12 = $$11.k(cjr.this.dP(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(je.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ayu.a($$2) - 1);

         if ($$7) {
            cjr.this.dP().b(new cnc(cjr.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjr.this));
            cjr.this.dP().a(dwq.t, new evm($$0, (double)$$6.v() + $$8, $$1), dwq.a.a(cjr.this));
         }
      }

      @Override
      protected avv l() {
         return avw.iD;
      }

      @Override
      protected cki.a m() {
         return cki.a.c;
      }
   }

   class b extends cki.b {
      @Override
      public void e() {
         if (cjr.this.p() != null) {
            cjr.this.G().a(cjr.this.p(), (float)cjr.this.ab(), (float)cjr.this.aa());
         } else if (cjr.this.gL() != null) {
            cjr.this.G().a(cjr.this.gL(), (float)cjr.this.ab(), (float)cjr.this.aa());
         }
      }
   }

   class c extends cki.c {
      private final ceb e = ceb.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjr.this.dP().a(ckm.class, this.e, cjr.this, cjr.this.cK().g(16.0)).size();
            return cjr.this.ah.a(8) + 1 > $$0;
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
         arb $$0 = (arb)cjr.this.dP();
         ewl $$1 = cjr.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iz $$3 = cjr.this.dp().b(-2 + cjr.this.ah.a(5), 1, -2 + cjr.this.ah.a(5));
            ckm $$4 = bsv.bi.a(cjr.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjr.this.dP().d_($$3), bto.f, null);
               $$4.a(cjr.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cjr.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dwq.t, $$3, dwq.a.a(cjr.this));
            }
         }
      }

      @Override
      protected avv l() {
         return avw.iE;
      }

      @Override
      protected cki.a m() {
         return cki.a.b;
      }
   }

   public class d extends cki.c {
      private final ceb e = ceb.b().a(16.0).a($$0x -> ((cfw)$$0x).u() == ctd.l);

      @Override
      public boolean a() {
         if (cjr.this.p() != null) {
            return false;
         } else if (cjr.this.gA()) {
            return false;
         } else if (cjr.this.ai < this.c) {
            return false;
         } else if (!cjr.this.dP().ab().b(dbp.c)) {
            return false;
         } else {
            List<cfw> $$0 = cjr.this.dP().a(cfw.class, this.e, cjr.this, cjr.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjr.this.a($$0.get(cjr.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjr.this.gL() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjr.this.a(null);
      }

      @Override
      protected void k() {
         cfw $$0 = cjr.this.gL();
         if ($$0 != null && $$0.bD()) {
            $$0.b(ctd.o);
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
      protected avv l() {
         return avw.iF;
      }

      @Override
      protected cki.a m() {
         return cki.a.d;
      }
   }
}
