import java.util.Optional;

public class ass {
   public static <T extends bjo> Optional<T> a(bja<T> $$0, bjq $$1, akt $$2, gw $$3, int $$4, int $$5, int $$6, ass.a $$7) {
      gw.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = asb.b($$2.z, -$$5, $$5);
         int $$11 = asb.b($$2.z, -$$5, $$5);
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

   private static boolean a(akt $$0, int $$1, gw.a $$2, ass.a $$3) {
      gw.a $$4 = new gw.a().g($$2);
      dfd $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ha.a);
         $$4.a($$2, ha.b);
         dfd $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ha.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ass.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cte.bs)
               && !$$2.a(cte.dQ)
               && !$$2.a(cte.eY)
               && !($$2.b() instanceof dat)
               && !($$2.b() instanceof das)
               && !($$2.b() instanceof cxk)
               && !$$2.a(cte.mX)
               && !$$2.a(cte.dO)
               && !$$2.a(cte.ck)
               && !$$2.a(cte.ec)
               && !$$2.a(cte.fO)
               && !$$2.a(cte.ii)
               && !$$2.a(cte.kI)
               && !$$2.a(cte.qB)
               && !$$2.a(cte.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cte.qC))
            : false;
      ass.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && ctc.a($$2.k($$0, $$1), ha.b);

      boolean canSpawnOn(akt var1, gw var2, dfd var3, gw var4, dfd var5);
   }
}
