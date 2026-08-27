import java.util.Optional;

public class atp {
   public static <T extends bkl> Optional<T> a(bjx<T> $$0, bkn $$1, alq $$2, ht $$3, int $$4, int $$5, int $$6, atp.a $$7) {
      ht.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = asy.b($$2.z, -$$5, $$5);
         int $$11 = asy.b($$2.z, -$$5, $$5);
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

   private static boolean a(alq $$0, int $$1, ht.a $$2, atp.a $$3) {
      ht.a $$4 = new ht.a().g($$2);
      dgb $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(hx.a);
         $$4.a($$2, hx.b);
         dgb $$7 = $$0.a_($$2);
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
      atp.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cuc.bs)
               && !$$2.a(cuc.dQ)
               && !$$2.a(cuc.eY)
               && !($$2.b() instanceof dbr)
               && !($$2.b() instanceof dbq)
               && !($$2.b() instanceof cyi)
               && !$$2.a(cuc.mX)
               && !$$2.a(cuc.dO)
               && !$$2.a(cuc.ck)
               && !$$2.a(cuc.ec)
               && !$$2.a(cuc.fO)
               && !$$2.a(cuc.ii)
               && !$$2.a(cuc.kI)
               && !$$2.a(cuc.qB)
               && !$$2.a(cuc.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cuc.qC))
            : false;
      atp.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cua.a($$2.k($$0, $$1), hx.b);

      boolean canSpawnOn(alq var1, ht var2, dgb var3, ht var4, dgb var5);
   }
}
