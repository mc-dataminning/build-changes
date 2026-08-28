import java.util.Optional;

public class ayx {
   public static <T extends bta> Optional<T> a(bsj<T> $$0, btc $$1, aqk $$2, ja $$3, int $$4, int $$5, int $$6, ayx.a $$7) {
      ja.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aye.b($$2.z, -$$5, $$5);
         int $$11 = aye.b($$2.z, -$$5, $$5);
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

   private static boolean a(aqk $$0, int $$1, ja.a $$2, ayx.a $$3) {
      ja.a $$4 = new ja.a().g($$2);
      dsh $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jf.a);
         $$4.a($$2, jf.b);
         dsh $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jf.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ayx.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfh.bs)
               && !$$2.a(dfh.dQ)
               && !$$2.a(dfh.eY)
               && !($$2.b() instanceof dmy)
               && !($$2.b() instanceof dmx)
               && !($$2.b() instanceof djp)
               && !$$2.a(dfh.mX)
               && !$$2.a(dfh.dO)
               && !$$2.a(dfh.ck)
               && !$$2.a(dfh.ec)
               && !$$2.a(dfh.fO)
               && !$$2.a(dfh.ii)
               && !$$2.a(dfh.kI)
               && !$$2.a(dfh.qO)
               && !$$2.a(dfh.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfh.qP))
            : false;
      ayx.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dff.a($$2.k($$0, $$1), jf.b);

      boolean canSpawnOn(aqk var1, ja var2, dsh var3, ja var4, dsh var5);
   }
}
