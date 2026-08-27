import java.util.Optional;

public class axo {
   public static <T extends bpq> Optional<T> a(bpc<T> $$0, bps $$1, apf $$2, ib $$3, int $$4, int $$5, int $$6, axo.a $$7) {
      ib.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aww.b($$2.z, -$$5, $$5);
         int $$11 = aww.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
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

   private static boolean a(apf $$0, int $$1, ib.a $$2, axo.a $$3) {
      ib.a $$4 = new ib.a().g($$2);
      dmz $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ih.a);
         $$4.a($$2, ih.b);
         dmz $$7 = $$0.a_($$2);
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
      axo.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dac.bs)
               && !$$2.a(dac.dQ)
               && !$$2.a(dac.eY)
               && !($$2.b() instanceof dhs)
               && !($$2.b() instanceof dhr)
               && !($$2.b() instanceof dej)
               && !$$2.a(dac.mX)
               && !$$2.a(dac.dO)
               && !$$2.a(dac.ck)
               && !$$2.a(dac.ec)
               && !$$2.a(dac.fO)
               && !$$2.a(dac.ii)
               && !$$2.a(dac.kI)
               && !$$2.a(dac.qO)
               && !$$2.a(dac.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dac.qP))
            : false;
      axo.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && daa.a($$2.k($$0, $$1), ih.b);

      boolean canSpawnOn(apf var1, ib var2, dmz var3, ib var4, dmz var5);
   }
}
