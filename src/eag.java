import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eag extends eab {
   public static final float e = 0.44444445F;

   @Override
   public eac d() {
      return eae.d;
   }

   @Override
   public eac e() {
      return eae.e;
   }

   @Override
   public cit a() {
      return cjb.pM;
   }

   @Override
   public void a(cpm $$0, gu $$1, ead $$2, aru $$3) {
      gu $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(iv.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aow.mp, aox.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aow.mn, aox.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cpm $$0, gu $$1, ead $$2, aru $$3) {
      if ($$0.X().b(cpi.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gu $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dfa $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cpp)$$0, $$5)) {
                     $$0.b($$5, csa.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               gu $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), csa.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cpp $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cpp $$0, gu $$1) {
      return $$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public it h() {
      return iv.j;
   }

   @Override
   protected void a(cpn $$0, gu $$1, dfa $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cpp $$0) {
      return $$0.x_().i() ? 4 : 2;
   }

   @Override
   public dfa b(ead $$0) {
      return csn.H.n().a(cwz.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eac $$0) {
      return $$0 == eae.e || $$0 == eae.d;
   }

   @Override
   public int c(cpp $$0) {
      return $$0.x_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ead $$0, cos $$1, gu $$2, eac $$3, ha $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(apq.a);
   }

   @Override
   public int a(cpp $$0) {
      return $$0.x_().i() ? 10 : 30;
   }

   @Override
   public int a(cpm $$0, gu $$1, ead $$2, ead $$3) {
      int $$4 = this.a((cpp)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cos)$$0, $$1) > $$2.a((cos)$$0, $$1) && $$0.y_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cpn $$0, gu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cpm $$0) {
      return $$0.X().b(cpi.R);
   }

   @Override
   protected void a(cpn $$0, gu $$1, dfa $$2, ha $$3, ead $$4) {
      if ($$3 == ha.a) {
         ead $$5 = $$0.b_($$1);
         if (this.a(apq.b) && $$5.a(apq.a)) {
            if ($$2.b() instanceof cwz) {
               $$0.a($$1, csn.b.n(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aov> j() {
      return Optional.of(aow.cE);
   }

   public static class a extends eag {
      @Override
      protected void a(dfb.a<eac, ead> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ead $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ead $$0) {
         return false;
      }
   }

   public static class b extends eag {
      @Override
      public int d(ead $$0) {
         return 8;
      }

      @Override
      public boolean c(ead $$0) {
         return true;
      }
   }
}
