import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dcq extends dbu {
   public dcq(dbr $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<cxp, cxp> c(dbs $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         cxp $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cxp $$3 = $$0.a($$2);
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

   private static boolean a(cxp $$0, cxp $$1) {
      return $$1.a($$0.h()) && $$0.L() == 1 && $$1.L() == 1 && $$0.b(ku.d) && $$1.b(ku.d) && $$0.b(ku.e) && $$1.b(ku.e);
   }

   public boolean a(dbs $$0, dhi $$1) {
      return c($$0) != null;
   }

   public cxp a(dbs $$0, js.a $$1) {
      Pair<cxp, cxp> $$2 = c($$0);
      if ($$2 == null) {
         return cxp.j;
      } else {
         cxp $$3 = (cxp)$$2.getFirst();
         cxp $$4 = (cxp)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cxp $$9 = new cxp($$3.h());
         $$9.b(ku.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         def $$10 = deb.b($$3);
         def $$11 = deb.b($$4);
         deb.a($$9, $$3x -> $$1.d(mb.aO).c().filter($$0xx -> $$0xx.a(axx.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dco<dcq> a() {
      return dco.n;
   }
}
