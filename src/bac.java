import java.util.Optional;

public class bac {
   public static <T extends bux> Optional<T> a(bug<T> $$0, buf $$1, arm $$2, jg $$3, int $$4, int $$5, int $$6, bac.a $$7) {
      jg.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azj.b($$2.A, -$$5, $$5);
         int $$11 = azj.b($$2.A, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.au();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arm $$0, int $$1, jg.a $$2, bac.a $$3) {
      jg.a $$4 = new jg.a().g($$2);
      dvd $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jl.a);
         $$4.a($$2, jl.b);
         dvd $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jl.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bac.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dia.bs)
               && !$$2.a(dia.dQ)
               && !$$2.a(dia.eY)
               && !($$2.b() instanceof dpr)
               && !($$2.b() instanceof dpq)
               && !($$2.b() instanceof dmh)
               && !$$2.a(dia.mX)
               && !$$2.a(dia.dO)
               && !$$2.a(dia.ck)
               && !$$2.a(dia.ec)
               && !$$2.a(dia.fO)
               && !$$2.a(dia.ii)
               && !$$2.a(dia.kI)
               && !$$2.a(dia.qO)
               && !$$2.a(dia.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dia.qP))
            : false;
      bac.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dhy.a($$2.g($$0, $$1), jl.b);

      boolean canSpawnOn(arm var1, jg var2, dvd var3, jg var4, dvd var5);
   }
}
