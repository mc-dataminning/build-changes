import java.util.Optional;

public class bah {
   public static <T extends bxl> Optional<T> a(bwr<T> $$0, bwq $$1, arq $$2, iv $$3, int $$4, int $$5, int $$6, bah.a $$7, boolean $$8) {
      iv.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azm.b($$2.A, -$$5, $$5);
         int $$12 = azm.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.A_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((djk)$$2)) {
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

   private static boolean a(arq $$0, int $$1, iv.a $$2, bah.a $$3) {
      iv.a $$4 = new iv.a().g($$2);
      eao $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jb.a);
         $$4.a($$2, jb.b);
         eao $$7 = $$0.a_($$2);
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
      bah.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dmo.bz)
               && !$$2.a(dmo.eg)
               && !$$2.a(dmo.fq)
               && !($$2.b() instanceof dup)
               && !($$2.b() instanceof duo)
               && !($$2.b() instanceof drc)
               && !$$2.a(dmo.nD)
               && !$$2.a(dmo.ee)
               && !$$2.a(dmo.cu)
               && !$$2.a(dmo.et)
               && !$$2.a(dmo.gn)
               && !$$2.a(dmo.iK)
               && !$$2.a(dmo.lo)
               && !$$2.a(dmo.rw)
               && !$$2.a(dmo.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dmo.rx))
            : false;
      bah.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dmm.a($$2.g($$0, $$1), jb.b);
      bah.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axc.Q) && dmm.a($$2.g($$0, $$1), jb.b);

      boolean canSpawnOn(arq var1, iv var2, eao var3, iv var4, eao var5);
   }
}
