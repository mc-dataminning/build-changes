import java.util.List;
import javax.annotation.Nullable;

public class clq extends cmh {
   @Nullable
   private cht a;

   public clq(bur<? extends clq> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cby(this));
      this.bS.a(1, new clq.b());
      this.bS.a(2, new cbl<>(this, cox.class, 8.0F, 0.6, 1.0));
      this.bS.a(3, new cbl<>(this, cnb.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new clq.c());
      this.bS.a(5, new clq.a());
      this.bS.a(6, new clq.d());
      this.bS.a(8, new cdb(this, 0.6));
      this.bS.a(9, new ccm(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
      this.bT.a(1, new cdw(this, cql.class).a());
      this.bT.a(2, new cdx<>(this, cox.class, true).c(300));
      this.bT.a(3, new cdx<>(this, cod.class, false).c(300));
      this.bT.a(3, new cdx<>(this, chj.class, false));
   }

   public static bwn.a p() {
      return clx.gu().a(bwo.v, 0.5).a(bwo.m, 12.0).a(bwo.s, 24.0);
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
   public avz aj_() {
      return awa.iU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(buk $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cml $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected avz u() {
      return awa.iS;
   }

   @Override
   protected avz o_() {
      return awa.iV;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.iX;
   }

   void a(@Nullable cht $$0) {
      this.a = $$0;
   }

   @Nullable
   cht gJ() {
      return this.a;
   }

   @Override
   protected avz x() {
      return awa.iT;
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
   }

   class a extends cmh.c {
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
         bvg $$0 = clq.this.O_();
         double $$1 = Math.min($$0.dD(), clq.this.dD());
         double $$2 = Math.max($$0.dD(), clq.this.dD()) + 1.0;
         float $$3 = (float)ayz.d($$0.dH() - clq.this.dH(), $$0.dB() - clq.this.dB());
         if (clq.this.g((buk)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(clq.this.dB() + (double)ayz.b($$5) * 1.5, clq.this.dH() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(clq.this.dB() + (double)ayz.b($$7) * 2.5, clq.this.dH() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(clq.this.dB() + (double)ayz.b($$3) * $$9, clq.this.dH() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ji $$6 = ji.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ji $$9 = $$6.e();
            dwx $$10 = clq.this.dW().a_($$9);
            if ($$10.c(clq.this.dW(), $$9, jn.b)) {
               if (!clq.this.dW().u($$6)) {
                  dwx $$11 = clq.this.dW().a_($$6);
                  fbu $$12 = $$11.g(clq.this.dW(), $$6);
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
            clq.this.dW().b(new cpi(clq.this.dW(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, clq.this));
            clq.this.dW().a(ebt.t, new fba($$0, (double)$$6.v() + $$8, $$1), ebt.a.a(clq.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iY;
      }

      @Override
      protected cmh.a m() {
         return cmh.a.c;
      }
   }

   class b extends cmh.b {
      @Override
      public void a() {
         if (clq.this.O_() != null) {
            clq.this.H().a(clq.this.O_(), (float)clq.this.ab(), (float)clq.this.aa());
         } else if (clq.this.gJ() != null) {
            clq.this.H().a(clq.this.gJ(), (float)clq.this.ab(), (float)clq.this.aa());
         }
      }
   }

   class c extends cmh.c {
      private final cfx e = cfx.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(clq.this.dW()).a(cml.class, this.e, clq.this, clq.this.cR().g(16.0)).size();
            return clq.this.ae.a(8) + 1 > $$0;
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
         arc $$0 = (arc)clq.this.dW();
         fca $$1 = clq.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ji $$3 = clq.this.dw().b(-2 + clq.this.ae.a(5), 1, -2 + clq.this.ae.a(5));
            cml $$4 = bur.bC.a(clq.this.dW(), buq.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, clq.this.dW().d_($$3), buq.f, null);
               $$4.a(clq.this);
               $$4.h($$3);
               $$4.b(20 * (30 + clq.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ebt.t, $$3, ebt.a.a(clq.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iZ;
      }

      @Override
      protected cmh.a m() {
         return cmh.a.b;
      }
   }

   public class d extends cmh.c {
      private final cfx e = cfx.b().a(16.0).a(($$0x, $$1) -> ((cht)$$0x).t() == cvm.l);

      @Override
      public boolean b() {
         if (clq.this.O_() != null) {
            return false;
         } else if (clq.this.gy()) {
            return false;
         } else if (clq.this.af < this.c) {
            return false;
         } else {
            arc $$0 = a(clq.this.dW());
            if (!$$0.O().b(dge.c)) {
               return false;
            } else {
               List<cht> $$1 = $$0.a(cht.class, this.e, clq.this, clq.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  clq.this.a($$1.get(clq.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return clq.this.gJ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         clq.this.a(null);
      }

      @Override
      protected void k() {
         cht $$0 = clq.this.gJ();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cvm.o);
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
      protected cmh.a m() {
         return cmh.a.d;
      }
   }
}
