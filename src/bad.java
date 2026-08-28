import java.util.Optional;

public class bad {
   public static <T extends bwt> Optional<T> a(bwb<T> $$0, bwa $$1, arn $$2, jj $$3, int $$4, int $$5, int $$6, bad.a $$7, boolean $$8) {
      jj.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azk.b($$2.A, -$$5, $$5);
         int $$12 = azk.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.A_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dhs)$$2)) {
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

   private static boolean a(arn $$0, int $$1, jj.a $$2, bad.a $$3) {
      jj.a $$4 = new jj.a().g($$2);
      dym $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jo.a);
         $$4.a($$2, jo.b);
         dym $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jo.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bad.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dkw.bz)
               && !$$2.a(dkw.ed)
               && !$$2.a(dkw.fm)
               && !($$2.b() instanceof dst)
               && !($$2.b() instanceof dss)
               && !($$2.b() instanceof dpi)
               && !$$2.a(dkw.nz)
               && !$$2.a(dkw.eb)
               && !$$2.a(dkw.cr)
               && !$$2.a(dkw.ep)
               && !$$2.a(dkw.gj)
               && !$$2.a(dkw.iG)
               && !$$2.a(dkw.lk)
               && !$$2.a(dkw.rs)
               && !$$2.a(dkw.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dkw.rt))
            : false;
      bad.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dku.a($$2.g($$0, $$1), jo.b);
      bad.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(awz.Q) && dku.a($$2.g($$0, $$1), jo.b);

      boolean canSpawnOn(arn var1, jj var2, dym var3, jj var4, dym var5);
   }
}
