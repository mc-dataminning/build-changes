import java.util.Optional;

public class aue {
   public static <T extends bli> Optional<T> a(bku<T> $$0, blk $$1, ame $$2, ht $$3, int $$4, int $$5, int $$6, aue.a $$7) {
      ht.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = atm.b($$2.z, -$$5, $$5);
         int $$11 = atm.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, null, $$8, $$1, false, false);
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

   private static boolean a(ame $$0, int $$1, ht.a $$2, aue.a $$3) {
      ht.a $$4 = new ht.a().g($$2);
      dhi $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(hx.a);
         $$4.a($$2, hx.b);
         dhi $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(hx.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      aue.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cvc.bs)
               && !$$2.a(cvc.dQ)
               && !$$2.a(cvc.eY)
               && !($$2.b() instanceof dcs)
               && !($$2.b() instanceof dcr)
               && !($$2.b() instanceof czj)
               && !$$2.a(cvc.mX)
               && !$$2.a(cvc.dO)
               && !$$2.a(cvc.ck)
               && !$$2.a(cvc.ec)
               && !$$2.a(cvc.fO)
               && !$$2.a(cvc.ii)
               && !$$2.a(cvc.kI)
               && !$$2.a(cvc.qO)
               && !$$2.a(cvc.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cvc.qP))
            : false;
      aue.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cva.a($$2.k($$0, $$1), hx.b);

      boolean canSpawnOn(ame var1, ht var2, dhi var3, ht var4, dhi var5);
   }
}
