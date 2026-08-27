import java.util.Optional;

public class asd {
   public static <T extends biy> Optional<T> a(bik<T> $$0, bja $$1, aki $$2, gv $$3, int $$4, int $$5, int $$6, asd.a $$7) {
      gv.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aro.b($$2.z, -$$5, $$5);
         int $$11 = aro.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.w_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ak();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aki $$0, int $$1, gv.a $$2, asd.a $$3) {
      gv.a $$4 = new gv.a().g($$2);
      dey $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(hb.a);
         $$4.a($$2, hb.b);
         dey $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(hb.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      asd.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(csl.bs)
               && !$$2.a(csl.dQ)
               && !$$2.a(csl.eZ)
               && !($$2.b() instanceof dad)
               && !($$2.b() instanceof dac)
               && !($$2.b() instanceof cwr)
               && !$$2.a(csl.mX)
               && !$$2.a(csl.dO)
               && !$$2.a(csl.ck)
               && !$$2.a(csl.ed)
               && !$$2.a(csl.fO)
               && !$$2.a(csl.ii)
               && !$$2.a(csl.kI)
               && !$$2.a(csl.qB)
               && !$$2.a(csl.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(csl.qC))
            : false;
      asd.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && csk.a($$2.k($$0, $$1), hb.b);

      boolean canSpawnOn(aki var1, gv var2, dey var3, gv var4, dey var5);
   }
}
