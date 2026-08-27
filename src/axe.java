import java.util.Optional;

public class axe {
   public static <T extends boz> Optional<T> a(bol<T> $$0, bpb $$1, apa $$2, ib $$3, int $$4, int $$5, int $$6, axe.a $$7) {
      ib.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = awm.b($$2.z, -$$5, $$5);
         int $$11 = awm.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.D_().a($$8) && a($$2, $$6, $$8, $$7)) {
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

   private static boolean a(apa $$0, int $$1, ib.a $$2, axe.a $$3) {
      ib.a $$4 = new ib.a().g($$2);
      dme $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ih.a);
         $$4.a($$2, ih.b);
         dme $$7 = $$0.a_($$2);
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
      axe.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(czh.bs)
               && !$$2.a(czh.dQ)
               && !$$2.a(czh.eY)
               && !($$2.b() instanceof dgx)
               && !($$2.b() instanceof dgw)
               && !($$2.b() instanceof ddo)
               && !$$2.a(czh.mX)
               && !$$2.a(czh.dO)
               && !$$2.a(czh.ck)
               && !$$2.a(czh.ec)
               && !$$2.a(czh.fO)
               && !$$2.a(czh.ii)
               && !$$2.a(czh.kI)
               && !$$2.a(czh.qO)
               && !$$2.a(czh.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(czh.qP))
            : false;
      axe.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && czf.a($$2.k($$0, $$1), ih.b);

      boolean canSpawnOn(apa var1, ib var2, dme var3, ib var4, dme var5);
   }
}
