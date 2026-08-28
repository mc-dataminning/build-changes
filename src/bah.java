import java.util.Optional;

public class bah {
   public static <T extends bxe> Optional<T> a(bwm<T> $$0, bwl $$1, arq $$2, iu $$3, int $$4, int $$5, int $$6, bah.a $$7, boolean $$8) {
      iu.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azm.b($$2.A, -$$5, $$5);
         int $$12 = azm.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.A_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((diy)$$2)) {
                  $$2.a_($$13);
                  $$13.T();
                  return Optional.of($$13);
               }

               $$13.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arq $$0, int $$1, iu.a $$2, bah.a $$3) {
      iu.a $$4 = new iu.a().g($$2);
      dzz $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ja.a);
         $$4.a($$2, ja.b);
         dzz $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ja.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bah.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dmc.bz)
               && !$$2.a(dmc.ee)
               && !$$2.a(dmc.fn)
               && !($$2.b() instanceof dub)
               && !($$2.b() instanceof dua)
               && !($$2.b() instanceof dqp)
               && !$$2.a(dmc.nA)
               && !$$2.a(dmc.ec)
               && !$$2.a(dmc.cs)
               && !$$2.a(dmc.eq)
               && !$$2.a(dmc.gk)
               && !$$2.a(dmc.iH)
               && !$$2.a(dmc.ll)
               && !$$2.a(dmc.rt)
               && !$$2.a(dmc.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dmc.ru))
            : false;
      bah.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dma.a($$2.g($$0, $$1), ja.b);
      bah.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axc.Q) && dma.a($$2.g($$0, $$1), ja.b);

      boolean canSpawnOn(arq var1, iu var2, dzz var3, iu var4, dzz var5);
   }
}
