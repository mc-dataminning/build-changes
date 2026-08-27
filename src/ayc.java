import java.util.Optional;

public class ayc {
   public static <T extends bqq> Optional<T> a(bqb<T> $$0, bqs $$1, aps $$2, ib $$3, int $$4, int $$5, int $$6, ayc.a $$7) {
      ib.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = axk.b($$2.z, -$$5, $$5);
         int $$11 = axk.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
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

   private static boolean a(aps $$0, int $$1, ib.a $$2, ayc.a $$3) {
      ib.a $$4 = new ib.a().g($$2);
      doz $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ih.a);
         $$4.a($$2, ih.b);
         doz $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ih.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ayc.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dca.bs)
               && !$$2.a(dca.dQ)
               && !$$2.a(dca.eY)
               && !($$2.b() instanceof djq)
               && !($$2.b() instanceof djp)
               && !($$2.b() instanceof dgh)
               && !$$2.a(dca.mX)
               && !$$2.a(dca.dO)
               && !$$2.a(dca.ck)
               && !$$2.a(dca.ec)
               && !$$2.a(dca.fO)
               && !$$2.a(dca.ii)
               && !$$2.a(dca.kI)
               && !$$2.a(dca.qO)
               && !$$2.a(dca.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dca.qP))
            : false;
      ayc.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dby.a($$2.k($$0, $$1), ih.b);

      boolean canSpawnOn(aps var1, ib var2, doz var3, ib var4, doz var5);
   }
}
