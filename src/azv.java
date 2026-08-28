import java.util.Optional;

public class azv {
   public static <T extends buh> Optional<T> a(btq<T> $$0, btp $$1, arg $$2, je $$3, int $$4, int $$5, int $$6, azv.a $$7) {
      je.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azc.b($$2.z, -$$5, $$5);
         int $$11 = azc.b($$2.z, -$$5, $$5);
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

   private static boolean a(arg $$0, int $$1, je.a $$2, azv.a $$3) {
      je.a $$4 = new je.a().g($$2);
      dua $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jj.a);
         $$4.a($$2, jj.b);
         dua $$7 = $$0.a_($$2);
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
      azv.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dgx.bs)
               && !$$2.a(dgx.dQ)
               && !$$2.a(dgx.eY)
               && !($$2.b() instanceof dop)
               && !($$2.b() instanceof doo)
               && !($$2.b() instanceof dlf)
               && !$$2.a(dgx.mX)
               && !$$2.a(dgx.dO)
               && !$$2.a(dgx.ck)
               && !$$2.a(dgx.ec)
               && !$$2.a(dgx.fO)
               && !$$2.a(dgx.ii)
               && !$$2.a(dgx.kI)
               && !$$2.a(dgx.qO)
               && !$$2.a(dgx.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dgx.qP))
            : false;
      azv.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dgv.a($$2.g($$0, $$1), jj.b);

      boolean canSpawnOn(arg var1, je var2, dua var3, je var4, dua var5);
   }
}
