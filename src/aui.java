import java.util.Optional;

public class aui {
   public static <T extends bln> Optional<T> a(bkz<T> $$0, blp $$1, ami $$2, hx $$3, int $$4, int $$5, int $$6, aui.a $$7) {
      hx.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = atq.b($$2.z, -$$5, $$5);
         int $$11 = atq.b($$2.z, -$$5, $$5);
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

   private static boolean a(ami $$0, int $$1, hx.a $$2, aui.a $$3) {
      hx.a $$4 = new hx.a().g($$2);
      dhn $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ib.a);
         $$4.a($$2, ib.b);
         dhn $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ib.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      aui.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cvh.bs)
               && !$$2.a(cvh.dQ)
               && !$$2.a(cvh.eY)
               && !($$2.b() instanceof dcx)
               && !($$2.b() instanceof dcw)
               && !($$2.b() instanceof czo)
               && !$$2.a(cvh.mX)
               && !$$2.a(cvh.dO)
               && !$$2.a(cvh.ck)
               && !$$2.a(cvh.ec)
               && !$$2.a(cvh.fO)
               && !$$2.a(cvh.ii)
               && !$$2.a(cvh.kI)
               && !$$2.a(cvh.qO)
               && !$$2.a(cvh.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cvh.qP))
            : false;
      aui.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cvf.a($$2.k($$0, $$1), ib.b);

      boolean canSpawnOn(ami var1, hx var2, dhn var3, hx var4, dhn var5);
   }
}
