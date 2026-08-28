import java.util.Optional;

public class azw {
   public static <T extends bum> Optional<T> a(btv<T> $$0, btu $$1, arh $$2, je $$3, int $$4, int $$5, int $$6, azw.a $$7) {
      je.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azd.b($$2.z, -$$5, $$5);
         int $$11 = azd.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.A_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.as();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arh $$0, int $$1, je.a $$2, azw.a $$3) {
      je.a $$4 = new je.a().g($$2);
      duo $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jj.a);
         $$4.a($$2, jj.b);
         duo $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jj.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      azw.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dhl.bs)
               && !$$2.a(dhl.dQ)
               && !$$2.a(dhl.eY)
               && !($$2.b() instanceof dpd)
               && !($$2.b() instanceof dpc)
               && !($$2.b() instanceof dlt)
               && !$$2.a(dhl.mX)
               && !$$2.a(dhl.dO)
               && !$$2.a(dhl.ck)
               && !$$2.a(dhl.ec)
               && !$$2.a(dhl.fO)
               && !$$2.a(dhl.ii)
               && !$$2.a(dhl.kI)
               && !$$2.a(dhl.qO)
               && !$$2.a(dhl.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dhl.qP))
            : false;
      azw.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dhj.a($$2.g($$0, $$1), jj.b);

      boolean canSpawnOn(arh var1, je var2, duo var3, je var4, duo var5);
   }
}
