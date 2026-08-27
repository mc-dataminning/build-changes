import java.util.Optional;

public class aur {
   public static <T extends blx> Optional<T> a(blj<T> $$0, blz $$1, amp $$2, hv $$3, int $$4, int $$5, int $$6, aur.a $$7) {
      hv.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aty.b($$2.z, -$$5, $$5);
         int $$11 = aty.b($$2.z, -$$5, $$5);
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

   private static boolean a(amp $$0, int $$1, hv.a $$2, aur.a $$3) {
      hv.a $$4 = new hv.a().g($$2);
      dip $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ia.a);
         $$4.a($$2, ia.b);
         dip $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ia.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      aur.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cwb.bs)
               && !$$2.a(cwb.dQ)
               && !$$2.a(cwb.eY)
               && !($$2.b() instanceof ddr)
               && !($$2.b() instanceof ddq)
               && !($$2.b() instanceof dai)
               && !$$2.a(cwb.mX)
               && !$$2.a(cwb.dO)
               && !$$2.a(cwb.ck)
               && !$$2.a(cwb.ec)
               && !$$2.a(cwb.fO)
               && !$$2.a(cwb.ii)
               && !$$2.a(cwb.kI)
               && !$$2.a(cwb.qO)
               && !$$2.a(cwb.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cwb.qP))
            : false;
      aur.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cvz.a($$2.k($$0, $$1), ia.b);

      boolean canSpawnOn(amp var1, hv var2, dip var3, hv var4, dip var5);
   }
}
