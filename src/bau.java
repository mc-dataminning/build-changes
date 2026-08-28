import java.util.Optional;

public class bau {
   public static <T extends byh> Optional<T> a(bxn<T> $$0, bxm $$1, asb $$2, iw $$3, int $$4, int $$5, int $$6, bau.a $$7, boolean $$8) {
      iw.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azz.b($$2.A, -$$5, $$5);
         int $$12 = azz.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.E_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dkm)$$2)) {
                  $$2.a_($$13);
                  $$13.T();
                  return Optional.of($$13);
               }

               $$13.aq();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(asb $$0, int $$1, iw.a $$2, bau.a $$3) {
      iw.a $$4 = new iw.a().g($$2);
      ebq $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jc.a);
         $$4.a($$2, jc.b);
         ebq $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jc.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bau.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dnq.bz)
               && !$$2.a(dnq.eg)
               && !$$2.a(dnq.fq)
               && !($$2.b() instanceof dvr)
               && !($$2.b() instanceof dvq)
               && !($$2.b() instanceof dse)
               && !$$2.a(dnq.nD)
               && !$$2.a(dnq.ee)
               && !$$2.a(dnq.cu)
               && !$$2.a(dnq.et)
               && !$$2.a(dnq.gn)
               && !$$2.a(dnq.iK)
               && !$$2.a(dnq.lo)
               && !$$2.a(dnq.rw)
               && !$$2.a(dnq.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dnq.rx))
            : false;
      bau.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dno.a($$2.g($$0, $$1), jc.b);
      bau.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axn.Q) && dno.a($$2.g($$0, $$1), jc.b);

      boolean canSpawnOn(asb var1, iw var2, ebq var3, iw var4, ebq var5);
   }
}
