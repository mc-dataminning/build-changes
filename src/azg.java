import java.util.Optional;

public class azg {
   public static <T extends btn> Optional<T> a(bsw<T> $$0, btp $$1, aqt $$2, jd $$3, int $$4, int $$5, int $$6, azg.a $$7) {
      jd.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayn.b($$2.z, -$$5, $$5);
         int $$11 = ayn.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.aq();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aqt $$0, int $$1, jd.a $$2, azg.a $$3) {
      jd.a $$4 = new jd.a().g($$2);
      dta $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ji.a);
         $$4.a($$2, ji.b);
         dta $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ji.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      azg.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfy.bs)
               && !$$2.a(dfy.dQ)
               && !$$2.a(dfy.eY)
               && !($$2.b() instanceof dnq)
               && !($$2.b() instanceof dnp)
               && !($$2.b() instanceof dkg)
               && !$$2.a(dfy.mX)
               && !$$2.a(dfy.dO)
               && !$$2.a(dfy.ck)
               && !$$2.a(dfy.ec)
               && !$$2.a(dfy.fO)
               && !$$2.a(dfy.ii)
               && !$$2.a(dfy.kI)
               && !$$2.a(dfy.qO)
               && !$$2.a(dfy.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfy.qP))
            : false;
      azg.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dfw.a($$2.k($$0, $$1), ji.b);

      boolean canSpawnOn(aqt var1, jd var2, dta var3, jd var4, dta var5);
   }
}
