import java.util.Optional;

public class axa {
   public static <T extends bok> Optional<T> a(bnw<T> $$0, bom $$1, aow $$2, hz $$3, int $$4, int $$5, int $$6, axa.a $$7) {
      hz.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = awi.b($$2.z, -$$5, $$5);
         int $$11 = awi.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.D_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.am();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aow $$0, int $$1, hz.a $$2, axa.a $$3) {
      hz.a $$4 = new hz.a().g($$2);
      dlj $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ie.a);
         $$4.a($$2, ie.b);
         dlj $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ie.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      axa.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cyu.bs)
               && !$$2.a(cyu.dQ)
               && !$$2.a(cyu.eY)
               && !($$2.b() instanceof dgk)
               && !($$2.b() instanceof dgj)
               && !($$2.b() instanceof ddb)
               && !$$2.a(cyu.mX)
               && !$$2.a(cyu.dO)
               && !$$2.a(cyu.ck)
               && !$$2.a(cyu.ec)
               && !$$2.a(cyu.fO)
               && !$$2.a(cyu.ii)
               && !$$2.a(cyu.kI)
               && !$$2.a(cyu.qO)
               && !$$2.a(cyu.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cyu.qP))
            : false;
      axa.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cys.a($$2.k($$0, $$1), ie.b);

      boolean canSpawnOn(aow var1, hz var2, dlj var3, hz var4, dlj var5);
   }
}
