import java.util.Optional;

public class asp {
   public static <T extends bjk> Optional<T> a(biw<T> $$0, bjm $$1, aks $$2, gw $$3, int $$4, int $$5, int $$6, asp.a $$7) {
      gw.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ary.b($$2.z, -$$5, $$5);
         int $$11 = ary.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.B_().a($$8) && a($$2, $$6, $$8, $$7)) {
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

   private static boolean a(aks $$0, int $$1, gw.a $$2, asp.a $$3) {
      gw.a $$4 = new gw.a().g($$2);
      dfl $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(hc.a);
         $$4.a($$2, hc.b);
         dfl $$7 = $$0.a_($$2);
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
      asp.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(csy.bs)
               && !$$2.a(csy.dQ)
               && !$$2.a(csy.eZ)
               && !($$2.b() instanceof daq)
               && !($$2.b() instanceof dap)
               && !($$2.b() instanceof cxe)
               && !$$2.a(csy.mX)
               && !$$2.a(csy.dO)
               && !$$2.a(csy.ck)
               && !$$2.a(csy.ed)
               && !$$2.a(csy.fO)
               && !$$2.a(csy.ii)
               && !$$2.a(csy.kI)
               && !$$2.a(csy.qB)
               && !$$2.a(csy.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(csy.qC))
            : false;
      asp.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && csx.a($$2.k($$0, $$1), hc.b);

      boolean canSpawnOn(aks var1, gw var2, dfl var3, gw var4, dfl var5);
   }
}
