import java.util.Optional;

public class ayr {
   public static <T extends bsc> Optional<T> a(brn<T> $$0, bse $$1, aqh $$2, in $$3, int $$4, int $$5, int $$6, ayr.a $$7) {
      in.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = axz.b($$2.z, -$$5, $$5);
         int $$11 = axz.b($$2.z, -$$5, $$5);
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

   private static boolean a(aqh $$0, int $$1, in.a $$2, ayr.a $$3) {
      in.a $$4 = new in.a().g($$2);
      dqh $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(is.a);
         $$4.a($$2, is.b);
         dqh $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(is.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ayr.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(ddg.bs)
               && !$$2.a(ddg.dQ)
               && !$$2.a(ddg.eY)
               && !($$2.b() instanceof dkx)
               && !($$2.b() instanceof dkw)
               && !($$2.b() instanceof dho)
               && !$$2.a(ddg.mX)
               && !$$2.a(ddg.dO)
               && !$$2.a(ddg.ck)
               && !$$2.a(ddg.ec)
               && !$$2.a(ddg.fO)
               && !$$2.a(ddg.ii)
               && !$$2.a(ddg.kI)
               && !$$2.a(ddg.qO)
               && !$$2.a(ddg.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(ddg.qP))
            : false;
      ayr.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dde.a($$2.k($$0, $$1), is.b);

      boolean canSpawnOn(aqh var1, in var2, dqh var3, in var4, dqh var5);
   }
}
