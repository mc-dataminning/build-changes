import java.util.Optional;

public class avj {
   public static <T extends bmq> Optional<T> a(bmc<T> $$0, bms $$1, ane $$2, hx $$3, int $$4, int $$5, int $$6, avj.a $$7) {
      hx.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aup.b($$2.z, -$$5, $$5);
         int $$11 = aup.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.D_().a($$8) && a($$2, $$6, $$8, $$7)) {
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

   private static boolean a(ane $$0, int $$1, hx.a $$2, avj.a $$3) {
      hx.a $$4 = new hx.a().g($$2);
      djp $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ic.a);
         $$4.a($$2, ic.b);
         djp $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ic.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      avj.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cxa.bs)
               && !$$2.a(cxa.dQ)
               && !$$2.a(cxa.eY)
               && !($$2.b() instanceof deq)
               && !($$2.b() instanceof dep)
               && !($$2.b() instanceof dbh)
               && !$$2.a(cxa.mX)
               && !$$2.a(cxa.dO)
               && !$$2.a(cxa.ck)
               && !$$2.a(cxa.ec)
               && !$$2.a(cxa.fO)
               && !$$2.a(cxa.ii)
               && !$$2.a(cxa.kI)
               && !$$2.a(cxa.qO)
               && !$$2.a(cxa.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cxa.qP))
            : false;
      avj.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cwy.a($$2.k($$0, $$1), ic.b);

      boolean canSpawnOn(ane var1, hx var2, djp var3, hx var4, djp var5);
   }
}
