import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dch extends dbl {
   public dch(dbi $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<cxg, cxg> c(dbj $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         cxg $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cxg $$3 = $$0.a($$2);
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

   private static boolean a(cxg $$0, cxg $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.b(ku.d) && $$1.b(ku.d) && $$0.b(ku.e) && $$1.b(ku.e);
   }

   public boolean a(dbj $$0, dgz $$1) {
      return c($$0) != null;
   }

   public cxg a(dbj $$0, js.a $$1) {
      Pair<cxg, cxg> $$2 = c($$0);
      if ($$2 == null) {
         return cxg.j;
      } else {
         cxg $$3 = (cxg)$$2.getFirst();
         cxg $$4 = (cxg)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cxg $$9 = new cxg($$3.h());
         $$9.b(ku.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         ddw $$10 = dds.b($$3);
         ddw $$11 = dds.b($$4);
         dds.a($$9, $$3x -> $$1.d(mb.aO).c().filter($$0xx -> $$0xx.a(axn.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dcf<dch> a() {
      return dcf.n;
   }
}
