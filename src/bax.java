import java.util.Optional;

public class bax {
   public static <T extends bwi> Optional<T> a(bvr<T> $$0, bvq $$1, ash $$2, jh $$3, int $$4, int $$5, int $$6, bax.a $$7) {
      jh.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = bae.b($$2.A, -$$5, $$5);
         int $$11 = bae.b($$2.A, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.F_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a((dhl)$$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(ash $$0, int $$1, jh.a $$2, bax.a $$3) {
      jh.a $$4 = new jh.a().g($$2);
      dxv $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jm.a);
         $$4.a($$2, jm.b);
         dxv $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jm.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bax.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dko.bz)
               && !$$2.a(dko.ed)
               && !$$2.a(dko.fm)
               && !($$2.b() instanceof dsi)
               && !($$2.b() instanceof dsh)
               && !($$2.b() instanceof doy)
               && !$$2.a(dko.ns)
               && !$$2.a(dko.eb)
               && !$$2.a(dko.cr)
               && !$$2.a(dko.ep)
               && !$$2.a(dko.gc)
               && !$$2.a(dko.iz)
               && !$$2.a(dko.ld)
               && !$$2.a(dko.rj)
               && !$$2.a(dko.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dko.rk))
            : false;
      bax.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dkm.a($$2.g($$0, $$1), jm.b);
      bax.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axu.Q) && dkm.a($$2.g($$0, $$1), jm.b);

      boolean canSpawnOn(ash var1, jh var2, dxv var3, jh var4, dxv var5);
   }
}
