import java.util.Optional;

public class azh {
   public static <T extends btp> Optional<T> a(bsx<T> $$0, btr $$1, aqu $$2, jd $$3, int $$4, int $$5, int $$6, azh.a $$7) {
      jd.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = ayo.b($$2.z, -$$5, $$5);
         int $$11 = ayo.b($$2.z, -$$5, $$5);
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

   private static boolean a(aqu $$0, int $$1, jd.a $$2, azh.a $$3) {
      jd.a $$4 = new jd.a().g($$2);
      dtc $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ji.a);
         $$4.a($$2, ji.b);
         dtc $$7 = $$0.a_($$2);
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
      azh.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dga.bs)
               && !$$2.a(dga.dQ)
               && !$$2.a(dga.eY)
               && !($$2.b() instanceof dns)
               && !($$2.b() instanceof dnr)
               && !($$2.b() instanceof dki)
               && !$$2.a(dga.mX)
               && !$$2.a(dga.dO)
               && !$$2.a(dga.ck)
               && !$$2.a(dga.ec)
               && !$$2.a(dga.fO)
               && !$$2.a(dga.ii)
               && !$$2.a(dga.kI)
               && !$$2.a(dga.qO)
               && !$$2.a(dga.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dga.qP))
            : false;
      azh.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dfy.a($$2.k($$0, $$1), ji.b);

      boolean canSpawnOn(aqu var1, jd var2, dtc var3, jd var4, dtc var5);
   }
}
