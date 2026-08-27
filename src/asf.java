import java.util.Optional;

public class asf {
   public static <T extends bja> Optional<T> a(bim<T> $$0, bjc $$1, akk $$2, gu $$3, int $$4, int $$5, int $$6, asf.a $$7) {
      gu.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = arp.b($$2.z, -$$5, $$5);
         int $$11 = arp.b($$2.z, -$$5, $$5);
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

   private static boolean a(akk $$0, int $$1, gu.a $$2, asf.a $$3) {
      gu.a $$4 = new gu.a().g($$2);
      dfa $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ha.a);
         $$4.a($$2, ha.b);
         dfa $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ha.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      asf.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(csn.bs)
               && !$$2.a(csn.dQ)
               && !$$2.a(csn.eZ)
               && !($$2.b() instanceof daf)
               && !($$2.b() instanceof dae)
               && !($$2.b() instanceof cwt)
               && !$$2.a(csn.mX)
               && !$$2.a(csn.dO)
               && !$$2.a(csn.ck)
               && !$$2.a(csn.ed)
               && !$$2.a(csn.fO)
               && !$$2.a(csn.ii)
               && !$$2.a(csn.kI)
               && !$$2.a(csn.qB)
               && !$$2.a(csn.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(csn.qC))
            : false;
      asf.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && csm.a($$2.k($$0, $$1), ha.b);

      boolean canSpawnOn(akk var1, gu var2, dfa var3, gu var4, dfa var5);
   }
}
