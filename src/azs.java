import java.util.Optional;

public class azs {
   public static <T extends bts> Optional<T> a(btb<T> $$0, btu $$1, arf $$2, iz $$3, int $$4, int $$5, int $$6, azs.a $$7) {
      iz.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayz.b($$2.z, -$$5, $$5);
         int $$11 = ayz.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ao();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arf $$0, int $$1, iz.a $$2, azs.a $$3) {
      iz.a $$4 = new iz.a().g($$2);
      dsd $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(je.a);
         $$4.a($$2, je.b);
         dsd $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(je.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      azs.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfc.bs)
               && !$$2.a(dfc.dQ)
               && !$$2.a(dfc.eY)
               && !($$2.b() instanceof dmt)
               && !($$2.b() instanceof dms)
               && !($$2.b() instanceof djk)
               && !$$2.a(dfc.mX)
               && !$$2.a(dfc.dO)
               && !$$2.a(dfc.ck)
               && !$$2.a(dfc.ec)
               && !$$2.a(dfc.fO)
               && !$$2.a(dfc.ii)
               && !$$2.a(dfc.kI)
               && !$$2.a(dfc.qO)
               && !$$2.a(dfc.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfc.qP))
            : false;
      azs.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dfa.a($$2.k($$0, $$1), je.b);

      boolean canSpawnOn(arf var1, iz var2, dsd var3, iz var4, dsd var5);
   }
}
