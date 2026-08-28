import java.util.Optional;

public class azn {
   public static <T extends btm> Optional<T> a(bsv<T> $$0, bto $$1, arb $$2, iz $$3, int $$4, int $$5, int $$6, azn.a $$7) {
      iz.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayu.b($$2.z, -$$5, $$5);
         int $$11 = ayu.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ao();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arb $$0, int $$1, iz.a $$2, azn.a $$3) {
      iz.a $$4 = new iz.a().g($$2);
      drx $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(je.a);
         $$4.a($$2, je.b);
         drx $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(je.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      azn.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dew.bs)
               && !$$2.a(dew.dQ)
               && !$$2.a(dew.eY)
               && !($$2.b() instanceof dmn)
               && !($$2.b() instanceof dmm)
               && !($$2.b() instanceof dje)
               && !$$2.a(dew.mX)
               && !$$2.a(dew.dO)
               && !$$2.a(dew.ck)
               && !$$2.a(dew.ec)
               && !$$2.a(dew.fO)
               && !$$2.a(dew.ii)
               && !$$2.a(dew.kI)
               && !$$2.a(dew.qO)
               && !$$2.a(dew.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dew.qP))
            : false;
      azn.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && deu.a($$2.k($$0, $$1), je.b);

      boolean canSpawnOn(arb var1, iz var2, drx var3, iz var4, drx var5);
   }
}
