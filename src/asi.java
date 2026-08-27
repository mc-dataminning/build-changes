import java.util.Optional;

public class asi {
   public static <T extends bjd> Optional<T> a(bip<T> $$0, bjf $$1, akn $$2, gw $$3, int $$4, int $$5, int $$6, asi.a $$7) {
      gw.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ars.b($$2.z, -$$5, $$5);
         int $$11 = ars.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.w_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ak();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(akn $$0, int $$1, gw.a $$2, asi.a $$3) {
      gw.a $$4 = new gw.a().g($$2);
      dfe $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(hc.a);
         $$4.a($$2, hc.b);
         dfe $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(hc.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      asi.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(csr.bs)
               && !$$2.a(csr.dQ)
               && !$$2.a(csr.eZ)
               && !($$2.b() instanceof daj)
               && !($$2.b() instanceof dai)
               && !($$2.b() instanceof cwx)
               && !$$2.a(csr.mX)
               && !$$2.a(csr.dO)
               && !$$2.a(csr.ck)
               && !$$2.a(csr.ed)
               && !$$2.a(csr.fO)
               && !$$2.a(csr.ii)
               && !$$2.a(csr.kI)
               && !$$2.a(csr.qB)
               && !$$2.a(csr.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(csr.qC))
            : false;
      asi.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && csq.a($$2.k($$0, $$1), hc.b);

      boolean canSpawnOn(akn var1, gw var2, dfe var3, gw var4, dfe var5);
   }
}
