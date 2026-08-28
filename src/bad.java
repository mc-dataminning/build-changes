import java.util.Optional;

public class bad {
   public static <T extends bvc> Optional<T> a(bul<T> $$0, buk $$1, arn $$2, jh $$3, int $$4, int $$5, int $$6, bad.a $$7) {
      jh.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azk.b($$2.A, -$$5, $$5);
         int $$11 = azk.b($$2.A, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.av();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arn $$0, int $$1, jh.a $$2, bad.a $$3) {
      jh.a $$4 = new jh.a().g($$2);
      dvj $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jm.a);
         $$4.a($$2, jm.b);
         dvj $$7 = $$0.a_($$2);
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
      bad.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dig.bs)
               && !$$2.a(dig.dQ)
               && !$$2.a(dig.eY)
               && !($$2.b() instanceof dpx)
               && !($$2.b() instanceof dpw)
               && !($$2.b() instanceof dmn)
               && !$$2.a(dig.mX)
               && !$$2.a(dig.dO)
               && !$$2.a(dig.ck)
               && !$$2.a(dig.ec)
               && !$$2.a(dig.fO)
               && !$$2.a(dig.ii)
               && !$$2.a(dig.kI)
               && !$$2.a(dig.qO)
               && !$$2.a(dig.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dig.qP))
            : false;
      bad.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && die.a($$2.g($$0, $$1), jm.b);

      boolean canSpawnOn(arn var1, jh var2, dvj var3, jh var4, dvj var5);
   }
}
