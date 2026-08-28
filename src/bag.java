import java.util.Optional;

public class bag {
   public static <T extends bvg> Optional<T> a(bup<T> $$0, buo $$1, arq $$2, jh $$3, int $$4, int $$5, int $$6, bag.a $$7) {
      jh.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azn.b($$2.A, -$$5, $$5);
         int $$11 = azn.b($$2.A, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.av();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arq $$0, int $$1, jh.a $$2, bag.a $$3) {
      jh.a $$4 = new jh.a().g($$2);
      dvo $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jm.a);
         $$4.a($$2, jm.b);
         dvo $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jm.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bag.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dil.bs)
               && !$$2.a(dil.dQ)
               && !$$2.a(dil.eY)
               && !($$2.b() instanceof dqc)
               && !($$2.b() instanceof dqb)
               && !($$2.b() instanceof dms)
               && !$$2.a(dil.mX)
               && !$$2.a(dil.dO)
               && !$$2.a(dil.ck)
               && !$$2.a(dil.ec)
               && !$$2.a(dil.fO)
               && !$$2.a(dil.ii)
               && !$$2.a(dil.kI)
               && !$$2.a(dil.qO)
               && !$$2.a(dil.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dil.qP))
            : false;
      bag.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dij.a($$2.g($$0, $$1), jm.b);

      boolean canSpawnOn(arq var1, jh var2, dvo var3, jh var4, dvo var5);
   }
}
