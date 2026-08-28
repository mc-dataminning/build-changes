import java.util.Optional;

public class azs {
   public static <T extends btt> Optional<T> a(btc<T> $$0, btv $$1, arf $$2, iz $$3, int $$4, int $$5, int $$6, azs.a $$7) {
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
      dse $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(je.a);
         $$4.a($$2, je.b);
         dse $$7 = $$0.a_($$2);
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
      azs.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfd.bs)
               && !$$2.a(dfd.dQ)
               && !$$2.a(dfd.eY)
               && !($$2.b() instanceof dmu)
               && !($$2.b() instanceof dmt)
               && !($$2.b() instanceof djl)
               && !$$2.a(dfd.mX)
               && !$$2.a(dfd.dO)
               && !$$2.a(dfd.ck)
               && !$$2.a(dfd.ec)
               && !$$2.a(dfd.fO)
               && !$$2.a(dfd.ii)
               && !$$2.a(dfd.kI)
               && !$$2.a(dfd.qO)
               && !$$2.a(dfd.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfd.qP))
            : false;
      azs.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dfb.a($$2.k($$0, $$1), je.b);

      boolean canSpawnOn(arf var1, iz var2, dse var3, iz var4, dse var5);
   }
}
