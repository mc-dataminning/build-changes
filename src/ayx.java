import java.util.Optional;

public class ayx {
   public static <T extends bss> Optional<T> a(bsc<T> $$0, bsu $$1, aqn $$2, io $$3, int $$4, int $$5, int $$6, ayx.a $$7) {
      io.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayf.b($$2.z, -$$5, $$5);
         int $$11 = ayf.b($$2.z, -$$5, $$5);
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

   private static boolean a(aqn $$0, int $$1, io.a $$2, ayx.a $$3) {
      io.a $$4 = new io.a().g($$2);
      drd $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(it.a);
         $$4.a($$2, it.b);
         drd $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(it.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ayx.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dec.bs)
               && !$$2.a(dec.dQ)
               && !$$2.a(dec.eY)
               && !($$2.b() instanceof dlt)
               && !($$2.b() instanceof dls)
               && !($$2.b() instanceof dik)
               && !$$2.a(dec.mX)
               && !$$2.a(dec.dO)
               && !$$2.a(dec.ck)
               && !$$2.a(dec.ec)
               && !$$2.a(dec.fO)
               && !$$2.a(dec.ii)
               && !$$2.a(dec.kI)
               && !$$2.a(dec.qO)
               && !$$2.a(dec.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dec.qP))
            : false;
      ayx.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dea.a($$2.k($$0, $$1), it.b);

      boolean canSpawnOn(aqn var1, io var2, drd var3, io var4, drd var5);
   }
}
