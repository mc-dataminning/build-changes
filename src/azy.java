import java.util.Optional;

public class azy {
   public static <T extends bup> Optional<T> a(bty<T> $$0, btx $$1, arj $$2, jf $$3, int $$4, int $$5, int $$6, azy.a $$7) {
      jf.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azf.b($$2.z, -$$5, $$5);
         int $$11 = azf.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.B_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.as();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arj $$0, int $$1, jf.a $$2, azy.a $$3) {
      jf.a $$4 = new jf.a().g($$2);
      dus $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jk.a);
         $$4.a($$2, jk.b);
         dus $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jk.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      azy.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dho.bs)
               && !$$2.a(dho.dQ)
               && !$$2.a(dho.eY)
               && !($$2.b() instanceof dpg)
               && !($$2.b() instanceof dpf)
               && !($$2.b() instanceof dlw)
               && !$$2.a(dho.mX)
               && !$$2.a(dho.dO)
               && !$$2.a(dho.ck)
               && !$$2.a(dho.ec)
               && !$$2.a(dho.fO)
               && !$$2.a(dho.ii)
               && !$$2.a(dho.kI)
               && !$$2.a(dho.qO)
               && !$$2.a(dho.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dho.qP))
            : false;
      azy.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dhm.a($$2.g($$0, $$1), jk.b);

      boolean canSpawnOn(arj var1, jf var2, dus var3, jf var4, dus var5);
   }
}
