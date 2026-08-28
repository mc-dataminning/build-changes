import java.util.List;
import javax.annotation.Nullable;

public class cns extends coj {
   @Nullable
   private cjs a;

   public cns(bwm<? extends cns> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cns.b());
      this.bC.a(2, new cdf<>(this, cqy.class, 8.0F, 0.6, 1.0));
      this.bC.a(3, new cdf<>(this, cpe.class, 8.0F, 0.6, 1.0));
      this.bC.a(4, new cns.c());
      this.bC.a(5, new cns.a());
      this.bC.a(6, new cns.d());
      this.bC.a(8, new cev(this, 0.6));
      this.bC.a(9, new ceg(this, cqy.class, 3.0F, 1.0F));
      this.bC.a(10, new ceg(this, bxe.class, 8.0F));
      this.bD.a(1, new cfq(this, cso.class).a());
      this.bD.a(2, new cfr<>(this, cqy.class, true).c(300));
      this.bD.a(3, new cfr<>(this, cqf.class, false).c(300));
      this.bD.a(3, new cfr<>(this, cjg.class, false));
   }

   public static byh.a m() {
      return cnz.gt().a(byi.v, 0.5).a(byi.m, 12.0).a(byi.s, 24.0);
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
   public awm ad_() {
      return awn.iV;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bwd $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof coo $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awm u() {
      return awn.iT;
   }

   @Override
   protected awm l_() {
      return awn.iW;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.iY;
   }

   void a(@Nullable cjs $$0) {
      this.a = $$0;
   }

   @Nullable
   cjs gI() {
      return this.a;
   }

   @Override
   protected awm q() {
      return awn.iU;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   class a extends coj.c {
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
         bxc $$0 = cns.this.f();
         double $$1 = Math.min($$0.dC(), cns.this.dC());
         double $$2 = Math.max($$0.dC(), cns.this.dC()) + 1.0;
         float $$3 = (float)azm.d($$0.dG() - cns.this.dG(), $$0.dA() - cns.this.dA());
         if (cns.this.g((bwd)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cns.this.dA() + (double)azm.b($$5) * 1.5, cns.this.dG() + (double)azm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cns.this.dA() + (double)azm.b($$7) * 2.5, cns.this.dG() + (double)azm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cns.this.dA() + (double)azm.b($$3) * $$9, cns.this.dG() + (double)azm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iu $$6 = iu.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iu $$9 = $$6.e();
            dzz $$10 = cns.this.dV().a_($$9);
            if ($$10.c(cns.this.dV(), $$9, ja.b)) {
               if (!cns.this.dV().v($$6)) {
                  dzz $$11 = cns.this.dV().a_($$6);
                  ffc $$12 = $$11.g(cns.this.dV(), $$6);
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
            cns.this.dV().b(new crk(cns.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cns.this));
            cns.this.dV().a(eez.t, new fei($$0, (double)$$6.v() + $$8, $$1), eez.a.a(cns.this));
         }
      }

      @Override
      protected awm l() {
         return awn.iZ;
      }

      @Override
      protected coj.a m() {
         return coj.a.c;
      }
   }

   class b extends coj.b {
      @Override
      public void a() {
         if (cns.this.f() != null) {
            cns.this.J().a(cns.this.f(), (float)cns.this.ad(), (float)cns.this.ac());
         } else if (cns.this.gI() != null) {
            cns.this.J().a(cns.this.gI(), (float)cns.this.ad(), (float)cns.this.ac());
         }
      }
   }

   class c extends coj.c {
      private final chr e = chr.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cns.this.dV()).a(coo.class, this.e, cns.this, cns.this.cR().g(16.0)).size();
            return cns.this.ae.a(8) + 1 > $$0;
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
         arq $$0 = (arq)cns.this.dV();
         ffi $$1 = cns.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iu $$3 = cns.this.dv().b(-2 + cns.this.ae.a(5), 1, -2 + cns.this.ae.a(5));
            coo $$4 = bwm.bC.a(cns.this.dV(), bwl.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cns.this.dV().d_($$3), bwl.f, null);
               $$4.a(cns.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cns.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eez.t, $$3, eez.a.a(cns.this));
            }
         }
      }

      @Override
      protected awm l() {
         return awn.ja;
      }

      @Override
      protected coj.a m() {
         return coj.a.b;
      }
   }

   public class d extends coj.c {
      private final chr e = chr.b().a(16.0).a(($$0x, $$1) -> ((cjs)$$0x).t() == cxw.l);

      @Override
      public boolean b() {
         if (cns.this.f() != null) {
            return false;
         } else if (cns.this.gx()) {
            return false;
         } else if (cns.this.af < this.c) {
            return false;
         } else {
            arq $$0 = a(cns.this.dV());
            if (!$$0.O().c(dir.c)) {
               return false;
            } else {
               List<cjs> $$1 = $$0.a(cjs.class, this.e, cns.this, cns.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cns.this.a($$1.get(cns.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cns.this.gI() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cns.this.a(null);
      }

      @Override
      protected void k() {
         cjs $$0 = cns.this.gI();
         if ($$0 != null && $$0.bK()) {
            $$0.b(cxw.o);
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
         return awn.jb;
      }

      @Override
      protected coj.a m() {
         return coj.a.d;
      }
   }
}
