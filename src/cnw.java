import java.util.List;
import javax.annotation.Nullable;

public class cnw extends coo {
   @Nullable
   private cjw a;

   public cnw(bwo<? extends cnw> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cnw.b());
      this.bD.a(2, new cdh<>(this, crc.class, 8.0F, 0.6, 1.0));
      this.bD.a(3, new cdh<>(this, cpi.class, 8.0F, 0.6, 1.0));
      this.bD.a(4, new cnw.c());
      this.bD.a(5, new cnw.a());
      this.bD.a(6, new cnw.d());
      this.bD.a(8, new cex(this, 0.6));
      this.bD.a(9, new cei(this, crc.class, 3.0F, 1.0F));
      this.bD.a(10, new cei(this, bxg.class, 8.0F));
      this.bE.a(1, new cfs(this, cst.class).a());
      this.bE.a(2, new cft<>(this, crc.class, true).c(300));
      this.bE.a(3, new cft<>(this, cqj.class, false).c(300));
      this.bE.a(3, new cft<>(this, cjk.class, false));
   }

   public static byj.a m() {
      return cod.gu().a(byk.v, 0.5).a(byk.m, 12.0).a(byk.s, 24.0);
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
   protected boolean t(bwf $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cos $$1 && $$1.m() != null) {
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
   protected awm e(buu $$0) {
      return awn.ja;
   }

   void a(@Nullable cjw $$0) {
      this.a = $$0;
   }

   @Nullable
   cjw gJ() {
      return this.a;
   }

   @Override
   protected awm q() {
      return awn.iW;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   class a extends coo.c {
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
         bxe $$0 = cnw.this.f();
         double $$1 = Math.min($$0.dC(), cnw.this.dC());
         double $$2 = Math.max($$0.dC(), cnw.this.dC()) + 1.0;
         float $$3 = (float)azm.d($$0.dG() - cnw.this.dG(), $$0.dA() - cnw.this.dA());
         if (cnw.this.g((bwf)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cnw.this.dA() + (double)azm.b($$5) * 1.5, cnw.this.dG() + (double)azm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cnw.this.dA() + (double)azm.b($$7) * 2.5, cnw.this.dG() + (double)azm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cnw.this.dA() + (double)azm.b($$3) * $$9, cnw.this.dG() + (double)azm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iu $$6 = iu.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iu $$9 = $$6.e();
            eah $$10 = cnw.this.dV().a_($$9);
            if ($$10.c(cnw.this.dV(), $$9, ja.b)) {
               if (!cnw.this.dV().v($$6)) {
                  eah $$11 = cnw.this.dV().a_($$6);
                  ffk $$12 = $$11.g(cnw.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ja.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azm.a($$2) - 1);

         if ($$7) {
            cnw.this.dV().b(new crp(cnw.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cnw.this));
            cnw.this.dV().a(efh.t, new feq($$0, (double)$$6.v() + $$8, $$1), efh.a.a(cnw.this));
         }
      }

      @Override
      protected awm l() {
         return awn.jb;
      }

      @Override
      protected coo.a m() {
         return coo.a.c;
      }
   }

   class b extends coo.b {
      @Override
      public void a() {
         if (cnw.this.f() != null) {
            cnw.this.J().a(cnw.this.f(), (float)cnw.this.ad(), (float)cnw.this.ac());
         } else if (cnw.this.gJ() != null) {
            cnw.this.J().a(cnw.this.gJ(), (float)cnw.this.ad(), (float)cnw.this.ac());
         }
      }
   }

   class c extends coo.c {
      private final cht e = cht.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cnw.this.dV()).a(cos.class, this.e, cnw.this, cnw.this.cR().g(16.0)).size();
            return cnw.this.ae.a(8) + 1 > $$0;
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
         arq $$0 = (arq)cnw.this.dV();
         ffq $$1 = cnw.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iu $$3 = cnw.this.dv().b(-2 + cnw.this.ae.a(5), 1, -2 + cnw.this.ae.a(5));
            cos $$4 = bwo.bC.a(cnw.this.dV(), bwn.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cnw.this.dV().d_($$3), bwn.f, null);
               $$4.a(cnw.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cnw.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(efh.t, $$3, efh.a.a(cnw.this));
            }
         }
      }

      @Override
      protected awm l() {
         return awn.jc;
      }

      @Override
      protected coo.a m() {
         return coo.a.b;
      }
   }

   public class d extends coo.c {
      private final cht e = cht.b().a(16.0).a(($$0x, $$1) -> ((cjw)$$0x).t() == cyb.l);

      @Override
      public boolean b() {
         if (cnw.this.f() != null) {
            return false;
         } else if (cnw.this.gy()) {
            return false;
         } else if (cnw.this.af < this.c) {
            return false;
         } else {
            arq $$0 = a(cnw.this.dV());
            if (!$$0.O().c(diw.d)) {
               return false;
            } else {
               List<cjw> $$1 = $$0.a(cjw.class, this.e, cnw.this, cnw.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cnw.this.a($$1.get(cnw.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cnw.this.gJ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cnw.this.a(null);
      }

      @Override
      protected void k() {
         cjw $$0 = cnw.this.gJ();
         if ($$0 != null && $$0.bK()) {
            $$0.b(cyb.o);
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
      protected coo.a m() {
         return coo.a.d;
      }
   }
}
