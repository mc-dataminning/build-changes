import java.util.Optional;

public class asn {
   public static <T extends bji> Optional<T> a(biu<T> $$0, bjk $$1, akq $$2, gw $$3, int $$4, int $$5, int $$6, asn.a $$7) {
      gw.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = arw.b($$2.z, -$$5, $$5);
         int $$11 = arw.b($$2.z, -$$5, $$5);
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

   private static boolean a(akq $$0, int $$1, gw.a $$2, asn.a $$3) {
      gw.a $$4 = new gw.a().g($$2);
      dfj $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ha.a);
         $$4.a($$2, ha.b);
         dfj $$7 = $$0.a_($$2);
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
      asn.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(csw.bs)
               && !$$2.a(csw.dQ)
               && !$$2.a(csw.eZ)
               && !($$2.b() instanceof dao)
               && !($$2.b() instanceof dan)
               && !($$2.b() instanceof cxc)
               && !$$2.a(csw.mX)
               && !$$2.a(csw.dO)
               && !$$2.a(csw.ck)
               && !$$2.a(csw.ed)
               && !$$2.a(csw.fO)
               && !$$2.a(csw.ii)
               && !$$2.a(csw.kI)
               && !$$2.a(csw.qB)
               && !$$2.a(csw.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(csw.qC))
            : false;
      asn.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && csv.a($$2.k($$0, $$1), ha.b);

      boolean canSpawnOn(akq var1, gw var2, dfj var3, gw var4, dfj var5);
   }
}
