import java.util.Optional;

public class azs {
   public static <T extends btr> Optional<T> a(bta<T> $$0, btt $$1, arf $$2, iz $$3, int $$4, int $$5, int $$6, azs.a $$7) {
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
      dsc $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(je.a);
         $$4.a($$2, je.b);
         dsc $$7 = $$0.a_($$2);
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
      azs.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfb.bs)
               && !$$2.a(dfb.dQ)
               && !$$2.a(dfb.eY)
               && !($$2.b() instanceof dms)
               && !($$2.b() instanceof dmr)
               && !($$2.b() instanceof djj)
               && !$$2.a(dfb.mX)
               && !$$2.a(dfb.dO)
               && !$$2.a(dfb.ck)
               && !$$2.a(dfb.ec)
               && !$$2.a(dfb.fO)
               && !$$2.a(dfb.ii)
               && !$$2.a(dfb.kI)
               && !$$2.a(dfb.qO)
               && !$$2.a(dfb.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfb.qP))
            : false;
      azs.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dez.a($$2.k($$0, $$1), je.b);

      boolean canSpawnOn(arf var1, iz var2, dsc var3, iz var4, dsc var5);
   }
}
