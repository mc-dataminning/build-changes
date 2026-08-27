import java.util.Optional;

public class axa {
   public static <T extends boi> Optional<T> a(bnu<T> $$0, bok $$1, aov $$2, hz $$3, int $$4, int $$5, int $$6, axa.a $$7) {
      hz.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = awh.b($$2.z, -$$5, $$5);
         int $$11 = awh.b($$2.z, -$$5, $$5);
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

   private static boolean a(aov $$0, int $$1, hz.a $$2, axa.a $$3) {
      hz.a $$4 = new hz.a().g($$2);
      dlf $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ie.a);
         $$4.a($$2, ie.b);
         dlf $$7 = $$0.a_($$2);
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
      axa.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cyq.bs)
               && !$$2.a(cyq.dQ)
               && !$$2.a(cyq.eY)
               && !($$2.b() instanceof dgg)
               && !($$2.b() instanceof dgf)
               && !($$2.b() instanceof dcx)
               && !$$2.a(cyq.mX)
               && !$$2.a(cyq.dO)
               && !$$2.a(cyq.ck)
               && !$$2.a(cyq.ec)
               && !$$2.a(cyq.fO)
               && !$$2.a(cyq.ii)
               && !$$2.a(cyq.kI)
               && !$$2.a(cyq.qO)
               && !$$2.a(cyq.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cyq.qP))
            : false;
      axa.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cyo.a($$2.k($$0, $$1), ie.b);

      boolean canSpawnOn(aov var1, hz var2, dlf var3, hz var4, dlf var5);
   }
}
