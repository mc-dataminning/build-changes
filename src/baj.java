import java.util.Optional;

public class baj {
   public static <T extends bxw> Optional<T> a(bxc<T> $$0, bxb $$1, ars $$2, iv $$3, int $$4, int $$5, int $$6, baj.a $$7, boolean $$8) {
      iv.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azo.b($$2.A, -$$5, $$5);
         int $$12 = azo.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.E_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dka)$$2)) {
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

   private static boolean a(ars $$0, int $$1, iv.a $$2, baj.a $$3) {
      iv.a $$4 = new iv.a().g($$2);
      ebe $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jb.a);
         $$4.a($$2, jb.b);
         ebe $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jb.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      baj.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dne.bz)
               && !$$2.a(dne.eg)
               && !$$2.a(dne.fq)
               && !($$2.b() instanceof dvf)
               && !($$2.b() instanceof dve)
               && !($$2.b() instanceof drs)
               && !$$2.a(dne.nD)
               && !$$2.a(dne.ee)
               && !$$2.a(dne.cu)
               && !$$2.a(dne.et)
               && !$$2.a(dne.gn)
               && !$$2.a(dne.iK)
               && !$$2.a(dne.lo)
               && !$$2.a(dne.rw)
               && !$$2.a(dne.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dne.rx))
            : false;
      baj.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dnc.a($$2.g($$0, $$1), jb.b);
      baj.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axe.Q) && dnc.a($$2.g($$0, $$1), jb.b);

      boolean canSpawnOn(ars var1, iv var2, ebe var3, iv var4, ebe var5);
   }
}
