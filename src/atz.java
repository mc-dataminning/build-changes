import java.util.Optional;

public class atz {
   public static <T extends bla> Optional<T> a(bkm<T> $$0, blc $$1, ama $$2, ht $$3, int $$4, int $$5, int $$6, atz.a $$7) {
      ht.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ati.b($$2.z, -$$5, $$5);
         int $$11 = ati.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
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

   private static boolean a(ama $$0, int $$1, ht.a $$2, atz.a $$3) {
      ht.a $$4 = new ht.a().g($$2);
      dgw $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(hx.a);
         $$4.a($$2, hx.b);
         dgw $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(hx.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      atz.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cuv.bs)
               && !$$2.a(cuv.dQ)
               && !$$2.a(cuv.eY)
               && !($$2.b() instanceof dcl)
               && !($$2.b() instanceof dck)
               && !($$2.b() instanceof czc)
               && !$$2.a(cuv.mX)
               && !$$2.a(cuv.dO)
               && !$$2.a(cuv.ck)
               && !$$2.a(cuv.ec)
               && !$$2.a(cuv.fO)
               && !$$2.a(cuv.ii)
               && !$$2.a(cuv.kI)
               && !$$2.a(cuv.qB)
               && !$$2.a(cuv.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cuv.qC))
            : false;
      atz.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cut.a($$2.k($$0, $$1), hx.b);

      boolean canSpawnOn(ama var1, ht var2, dgw var3, ht var4, dgw var5);
   }
}
