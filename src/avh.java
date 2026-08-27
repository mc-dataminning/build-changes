import java.util.Optional;

public class avh {
   public static <T extends bmm> Optional<T> a(bly<T> $$0, bmo $$1, and $$2, hx $$3, int $$4, int $$5, int $$6, avh.a $$7) {
      hx.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aun.b($$2.z, -$$5, $$5);
         int $$11 = aun.b($$2.z, -$$5, $$5);
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

   private static boolean a(and $$0, int $$1, hx.a $$2, avh.a $$3) {
      hx.a $$4 = new hx.a().g($$2);
      djg $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ic.a);
         $$4.a($$2, ic.b);
         djg $$7 = $$0.a_($$2);
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
      avh.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cwr.bs)
               && !$$2.a(cwr.dQ)
               && !$$2.a(cwr.eY)
               && !($$2.b() instanceof deh)
               && !($$2.b() instanceof deg)
               && !($$2.b() instanceof day)
               && !$$2.a(cwr.mX)
               && !$$2.a(cwr.dO)
               && !$$2.a(cwr.ck)
               && !$$2.a(cwr.ec)
               && !$$2.a(cwr.fO)
               && !$$2.a(cwr.ii)
               && !$$2.a(cwr.kI)
               && !$$2.a(cwr.qO)
               && !$$2.a(cwr.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cwr.qP))
            : false;
      avh.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cwp.a($$2.k($$0, $$1), ic.b);

      boolean canSpawnOn(and var1, hx var2, djg var3, hx var4, djg var5);
   }
}
