import java.util.Optional;

public class ban {
   public static <T extends bvz> Optional<T> a(bvi<T> $$0, bvh $$1, arx $$2, jh $$3, int $$4, int $$5, int $$6, ban.a $$7, boolean $$8) {
      jh.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azu.b($$2.A, -$$5, $$5);
         int $$12 = azu.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.F_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dhc)$$2)) {
                  $$2.a_($$13);
                  return Optional.of($$13);
               }

               $$13.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arx $$0, int $$1, jh.a $$2, ban.a $$3) {
      jh.a $$4 = new jh.a().g($$2);
      dxo $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jm.a);
         $$4.a($$2, jm.b);
         dxo $$7 = $$0.a_($$2);
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
      ban.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dkf.bz)
               && !$$2.a(dkf.ed)
               && !$$2.a(dkf.fm)
               && !($$2.b() instanceof dsb)
               && !($$2.b() instanceof dsa)
               && !($$2.b() instanceof dop)
               && !$$2.a(dkf.nz)
               && !$$2.a(dkf.eb)
               && !$$2.a(dkf.cr)
               && !$$2.a(dkf.ep)
               && !$$2.a(dkf.gj)
               && !$$2.a(dkf.iG)
               && !$$2.a(dkf.lk)
               && !$$2.a(dkf.rq)
               && !$$2.a(dkf.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dkf.rr))
            : false;
      ban.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dkd.a($$2.g($$0, $$1), jm.b);
      ban.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axk.Q) && dkd.a($$2.g($$0, $$1), jm.b);

      boolean canSpawnOn(arx var1, jh var2, dxo var3, jh var4, dxo var5);
   }
}
