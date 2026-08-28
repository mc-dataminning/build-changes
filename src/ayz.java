import java.util.Optional;

public class ayz {
   public static <T extends btd> Optional<T> a(bsm<T> $$0, btf $$1, aqm $$2, ja $$3, int $$4, int $$5, int $$6, ayz.a $$7) {
      ja.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayg.b($$2.z, -$$5, $$5);
         int $$11 = ayg.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ap();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aqm $$0, int $$1, ja.a $$2, ayz.a $$3) {
      ja.a $$4 = new ja.a().g($$2);
      dsk $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jf.a);
         $$4.a($$2, jf.b);
         dsk $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jf.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ayz.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfj.bs)
               && !$$2.a(dfj.dQ)
               && !$$2.a(dfj.eY)
               && !($$2.b() instanceof dna)
               && !($$2.b() instanceof dmz)
               && !($$2.b() instanceof djr)
               && !$$2.a(dfj.mX)
               && !$$2.a(dfj.dO)
               && !$$2.a(dfj.ck)
               && !$$2.a(dfj.ec)
               && !$$2.a(dfj.fO)
               && !$$2.a(dfj.ii)
               && !$$2.a(dfj.kI)
               && !$$2.a(dfj.qO)
               && !$$2.a(dfj.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfj.qP))
            : false;
      ayz.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dfh.a($$2.k($$0, $$1), jf.b);

      boolean canSpawnOn(aqm var1, ja var2, dsk var3, ja var4, dsk var5);
   }
}
