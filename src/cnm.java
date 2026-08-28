import java.util.List;
import javax.annotation.Nullable;

public class cnm extends cod {
   @Nullable
   private cjm a;

   public cnm(bwj<? extends cnm> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cnm.b());
      this.bC.a(2, new cdc<>(this, cqs.class, 8.0F, 0.6, 1.0));
      this.bC.a(3, new cdc<>(this, coy.class, 8.0F, 0.6, 1.0));
      this.bC.a(4, new cnm.c());
      this.bC.a(5, new cnm.a());
      this.bC.a(6, new cnm.d());
      this.bC.a(8, new ces(this, 0.6));
      this.bC.a(9, new ced(this, cqs.class, 3.0F, 1.0F));
      this.bC.a(10, new ced(this, bxb.class, 8.0F));
      this.bD.a(1, new cfn(this, csi.class).a());
      this.bD.a(2, new cfo<>(this, cqs.class, true).c(300));
      this.bD.a(3, new cfo<>(this, cpz.class, false).c(300));
      this.bD.a(3, new cfo<>(this, cja.class, false));
   }

   public static bye.a m() {
      return cnt.gt().a(byf.v, 0.5).a(byf.m, 12.0).a(byf.s, 24.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
   }

   @Override
   public awk ad_() {
      return awl.iU;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bwa $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof coh $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awk u() {
      return awl.iS;
   }

   @Override
   protected awk l_() {
      return awl.iV;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.iX;
   }

   void a(@Nullable cjm $$0) {
      this.a = $$0;
   }

   @Nullable
   cjm gI() {
      return this.a;
   }

   @Override
   protected awk q() {
      return awl.iT;
   }

   @Override
   public void a(aro $$0, int $$1, boolean $$2) {
   }

   class a extends cod.c {
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
         bwz $$0 = cnm.this.f();
         double $$1 = Math.min($$0.dC(), cnm.this.dC());
         double $$2 = Math.max($$0.dC(), cnm.this.dC()) + 1.0;
         float $$3 = (float)azk.d($$0.dG() - cnm.this.dG(), $$0.dA() - cnm.this.dA());
         if (cnm.this.g((bwa)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cnm.this.dA() + (double)azk.b($$5) * 1.5, cnm.this.dG() + (double)azk.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cnm.this.dA() + (double)azk.b($$7) * 2.5, cnm.this.dG() + (double)azk.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cnm.this.dA() + (double)azk.b($$3) * $$9, cnm.this.dG() + (double)azk.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iu $$6 = iu.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iu $$9 = $$6.e();
            dzo $$10 = cnm.this.dV().a_($$9);
            if ($$10.c(cnm.this.dV(), $$9, ja.b)) {
               if (!cnm.this.dV().v($$6)) {
                  dzo $$11 = cnm.this.dV().a_($$6);
                  feq $$12 = $$11.g(cnm.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ja.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azk.a($$2) - 1);

         if ($$7) {
            cnm.this.dV().b(new cre(cnm.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cnm.this));
            cnm.this.dV().a(eeo.t, new fdw($$0, (double)$$6.v() + $$8, $$1), eeo.a.a(cnm.this));
         }
      }

      @Override
      protected awk l() {
         return awl.iY;
      }

      @Override
      protected cod.a m() {
         return cod.a.c;
      }
   }

   class b extends cod.b {
      @Override
      public void a() {
         if (cnm.this.f() != null) {
            cnm.this.J().a(cnm.this.f(), (float)cnm.this.ad(), (float)cnm.this.ac());
         } else if (cnm.this.gI() != null) {
            cnm.this.J().a(cnm.this.gI(), (float)cnm.this.ad(), (float)cnm.this.ac());
         }
      }
   }

   class c extends cod.c {
      private final cho e = cho.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cnm.this.dV()).a(coh.class, this.e, cnm.this, cnm.this.cR().g(16.0)).size();
            return cnm.this.ae.a(8) + 1 > $$0;
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
         aro $$0 = (aro)cnm.this.dV();
         few $$1 = cnm.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iu $$3 = cnm.this.dv().b(-2 + cnm.this.ae.a(5), 1, -2 + cnm.this.ae.a(5));
            coh $$4 = bwj.bC.a(cnm.this.dV(), bwi.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cnm.this.dV().d_($$3), bwi.f, null);
               $$4.a(cnm.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cnm.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eeo.t, $$3, eeo.a.a(cnm.this));
            }
         }
      }

      @Override
      protected awk l() {
         return awl.iZ;
      }

      @Override
      protected cod.a m() {
         return cod.a.b;
      }
   }

   public class d extends cod.c {
      private final cho e = cho.b().a(16.0).a(($$0x, $$1) -> ((cjm)$$0x).t() == cxq.l);

      @Override
      public boolean b() {
         if (cnm.this.f() != null) {
            return false;
         } else if (cnm.this.gx()) {
            return false;
         } else if (cnm.this.af < this.c) {
            return false;
         } else {
            aro $$0 = a(cnm.this.dV());
            if (!$$0.O().c(dil.c)) {
               return false;
            } else {
               List<cjm> $$1 = $$0.a(cjm.class, this.e, cnm.this, cnm.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cnm.this.a($$1.get(cnm.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cnm.this.gI() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cnm.this.a(null);
      }

      @Override
      protected void k() {
         cjm $$0 = cnm.this.gI();
         if ($$0 != null && $$0.bK()) {
            $$0.b(cxq.o);
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
      protected awk l() {
         return awl.ja;
      }

      @Override
      protected cod.a m() {
         return cod.a.d;
      }
   }
}
