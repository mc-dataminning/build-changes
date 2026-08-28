import java.util.Optional;

public class azr {
   public static <T extends btq> Optional<T> a(bsz<T> $$0, bts $$1, are $$2, iz $$3, int $$4, int $$5, int $$6, azr.a $$7) {
      iz.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayy.b($$2.z, -$$5, $$5);
         int $$11 = ayy.b($$2.z, -$$5, $$5);
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

   private static boolean a(are $$0, int $$1, iz.a $$2, azr.a $$3) {
      iz.a $$4 = new iz.a().g($$2);
      dsb $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(je.a);
         $$4.a($$2, je.b);
         dsb $$7 = $$0.a_($$2);
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
      azr.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfa.bs)
               && !$$2.a(dfa.dQ)
               && !$$2.a(dfa.eY)
               && !($$2.b() instanceof dmr)
               && !($$2.b() instanceof dmq)
               && !($$2.b() instanceof dji)
               && !$$2.a(dfa.mX)
               && !$$2.a(dfa.dO)
               && !$$2.a(dfa.ck)
               && !$$2.a(dfa.ec)
               && !$$2.a(dfa.fO)
               && !$$2.a(dfa.ii)
               && !$$2.a(dfa.kI)
               && !$$2.a(dfa.qO)
               && !$$2.a(dfa.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfa.qP))
            : false;
      azr.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dey.a($$2.k($$0, $$1), je.b);

      boolean canSpawnOn(are var1, iz var2, dsb var3, iz var4, dsb var5);
   }
}
