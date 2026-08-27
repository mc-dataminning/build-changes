import java.util.Optional;

public class aze {
   public static <T extends bsq> Optional<T> a(bsb<T> $$0, bss $$1, aqt $$2, ir $$3, int $$4, int $$5, int $$6, aze.a $$7) {
      ir.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aym.b($$2.A, -$$5, $$5);
         int $$11 = aym.b($$2.A, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.D_().a($$8) && a($$2, $$6, $$8, $$7)) {
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

   private static boolean a(aqt $$0, int $$1, ir.a $$2, aze.a $$3) {
      ir.a $$4 = new ir.a().g($$2);
      dtc $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.d(iw.a);
         $$4.a($$2, iw.b);
         dtc $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.d(iw.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      aze.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dfe.cc)
               && !$$2.a(dfe.eE)
               && !$$2.a(dfe.fQ)
               && !($$2.b() instanceof dnj)
               && !($$2.b() instanceof dni)
               && !($$2.b() instanceof djq)
               && !$$2.a(dfe.nV)
               && !$$2.a(dfe.eC)
               && !$$2.a(dfe.cV)
               && !$$2.a(dfe.eQ)
               && !$$2.a(dfe.gH)
               && !$$2.a(dfe.jc)
               && !$$2.a(dfe.lG)
               && !$$2.a(dfe.rZ)
               && !$$2.a(dfe.by)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dfe.sa))
            : false;
      aze.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dfc.a($$2.k($$0, $$1), iw.b);

      boolean canSpawnOn(aqt var1, ir var2, dtc var3, ir var4, dtc var5);
   }
}
