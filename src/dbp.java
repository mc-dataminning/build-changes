import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dbp extends dat {
   public dbp(daq $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<cwo, cwo> c(dar $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         cwo $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cwo $$3 = $$0.a($$2);
            if (!$$3.f()) {
               if ($$1 != null) {
                  return a($$1, $$3) ? Pair.of($$1, $$3) : null;
               }

               $$1 = $$3;
            }
         }

         return null;
      }
   }

   private static boolean a(cwo $$0, cwo $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.b(kv.d) && $$1.b(kv.d) && $$0.b(kv.e) && $$1.b(kv.e);
   }

   public boolean a(dar $$0, dgh $$1) {
      return c($$0) != null;
   }

   public cwo a(dar $$0, jt.a $$1) {
      Pair<cwo, cwo> $$2 = c($$0);
      if ($$2 == null) {
         return cwo.j;
      } else {
         cwo $$3 = (cwo)$$2.getFirst();
         cwo $$4 = (cwo)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cwo $$9 = new cwo($$3.h());
         $$9.b(kv.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dde $$10 = dda.b($$3);
         dde $$11 = dda.b($$4);
         dda.a($$9, $$3x -> $$1.d(mc.aO).c().filter($$0xx -> $$0xx.a(aws.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dbn<dbp> a() {
      return dbn.n;
   }
}
