import java.util.Optional;

public class aye {
   public static <T extends bqv> Optional<T> a(bqg<T> $$0, bqx $$1, apu $$2, id $$3, int $$4, int $$5, int $$6, aye.a $$7) {
      id.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = axm.b($$2.z, -$$5, $$5);
         int $$11 = axm.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
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

   private static boolean a(apu $$0, int $$1, id.a $$2, aye.a $$3) {
      id.a $$4 = new id.a().g($$2);
      dpi $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ij.a);
         $$4.a($$2, ij.b);
         dpi $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ij.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      aye.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dcj.bs)
               && !$$2.a(dcj.dQ)
               && !$$2.a(dcj.eY)
               && !($$2.b() instanceof djz)
               && !($$2.b() instanceof djy)
               && !($$2.b() instanceof dgq)
               && !$$2.a(dcj.mX)
               && !$$2.a(dcj.dO)
               && !$$2.a(dcj.ck)
               && !$$2.a(dcj.ec)
               && !$$2.a(dcj.fO)
               && !$$2.a(dcj.ii)
               && !$$2.a(dcj.kI)
               && !$$2.a(dcj.qO)
               && !$$2.a(dcj.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dcj.qP))
            : false;
      aye.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dch.a($$2.k($$0, $$1), ij.b);

      boolean canSpawnOn(apu var1, id var2, dpi var3, id var4, dpi var5);
   }
}
