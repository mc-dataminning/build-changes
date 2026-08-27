import java.util.function.Predicate;

public class cjh extends clz implements cnd {
   public static final int a = 20;
   public static final int b = 15;

   public cjh(cle.a $$0) {
      super($$0);
   }

   @Override
   public void a(clj $$0, csa $$1, blg $$2, int $$3) {
      if ($$2 instanceof cdu $$4) {
         boolean $$5 = $$4.fU().d || cpw.a(cpy.B, $$0) > 0;
         clj $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new clj(clm.os);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(clm.os);
               if (!$$1.B) {
                  cix $$10 = (cix)($$6.d() instanceof cix ? $$6.d() : clm.os);
                  cea $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dF(), $$4.dD(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cpw.a(cpy.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.z() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cpw.a(cpy.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cpw.a(cpy.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fp()));
                  if ($$9 || $$4.fU().d && ($$6.a(clm.vh) || $$6.a(clm.vi))) {
                     $$11.d = cea.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.ds(), $$4.du(), $$4.dy(), aqr.ar, aqs.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fU().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fT().g($$6);
                  }
               }

               $$4.b(arb.c.b(this));
            }
         }
      }
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int b(clj $$0) {
      return 72000;
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.e;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fU().d && !$$4) {
         return biy.d($$3);
      } else {
         $$1.c($$2);
         return biy.b($$3);
      }
   }

   @Override
   public Predicate<clj> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
