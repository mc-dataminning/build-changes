import java.util.Optional;

public class ayv {
   public static <T extends bsq> Optional<T> a(bsa<T> $$0, bss $$1, aqm $$2, io $$3, int $$4, int $$5, int $$6, ayv.a $$7) {
      io.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayd.b($$2.z, -$$5, $$5);
         int $$11 = ayd.b($$2.z, -$$5, $$5);
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

   private static boolean a(aqm $$0, int $$1, io.a $$2, ayv.a $$3) {
      io.a $$4 = new io.a().g($$2);
      drb $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(it.a);
         $$4.a($$2, it.b);
         drb $$7 = $$0.a_($$2);
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
      ayv.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dea.bs)
               && !$$2.a(dea.dQ)
               && !$$2.a(dea.eY)
               && !($$2.b() instanceof dlr)
               && !($$2.b() instanceof dlq)
               && !($$2.b() instanceof dii)
               && !$$2.a(dea.mX)
               && !$$2.a(dea.dO)
               && !$$2.a(dea.ck)
               && !$$2.a(dea.ec)
               && !$$2.a(dea.fO)
               && !$$2.a(dea.ii)
               && !$$2.a(dea.kI)
               && !$$2.a(dea.qO)
               && !$$2.a(dea.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dea.qP))
            : false;
      ayv.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && ddy.a($$2.k($$0, $$1), it.b);

      boolean canSpawnOn(aqm var1, io var2, drb var3, io var4, drb var5);
   }
}
