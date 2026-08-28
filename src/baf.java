import java.util.Optional;

public class baf {
   public static <T extends bvj> Optional<T> a(bus<T> $$0, bur $$1, arp $$2, jh $$3, int $$4, int $$5, int $$6, baf.a $$7) {
      jh.a $$8 = $$3.k();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = azm.b($$2.A, -$$5, $$5);
         int $$11 = azm.b($$2.A, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.E_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a((dfp)$$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arp $$0, int $$1, jh.a $$2, baf.a $$3) {
      jh.a $$4 = new jh.a().g($$2);
      dvv $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jm.a);
         $$4.a($$2, jm.b);
         dvv $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jm.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      baf.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dis.bs)
               && !$$2.a(dis.dQ)
               && !$$2.a(dis.eY)
               && !($$2.b() instanceof dqj)
               && !($$2.b() instanceof dqi)
               && !($$2.b() instanceof dmz)
               && !$$2.a(dis.mX)
               && !$$2.a(dis.dO)
               && !$$2.a(dis.ck)
               && !$$2.a(dis.ec)
               && !$$2.a(dis.fO)
               && !$$2.a(dis.ii)
               && !$$2.a(dis.kI)
               && !$$2.a(dis.qO)
               && !$$2.a(dis.aQ)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dis.qP))
            : false;
      baf.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && diq.a($$2.g($$0, $$1), jm.b);

      boolean canSpawnOn(arp var1, jh var2, dvv var3, jh var4, dvv var5);
   }
}
