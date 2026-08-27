import java.util.Optional;

public class app {
   public static <T extends bgb> Optional<T> a(bfn<T> $$0, bgd $$1, aif $$2, gu $$3, int $$4, int $$5, int $$6, app.a $$7) {
      gu.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = apa.b($$2.z, -$$5, $$5);
         int $$11 = apa.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.w_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ai();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aif $$0, int $$1, gu.a $$2, app.a $$3) {
      gu.a $$4 = new gu.a().g($$2);
      dcb $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ha.a);
         $$4.a($$2, ha.b);
         dcb $$7 = $$0.a_($$2);
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
      app.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cpo.bs)
               && !$$2.a(cpo.dQ)
               && !$$2.a(cpo.eZ)
               && !($$2.b() instanceof cxg)
               && !($$2.b() instanceof cxf)
               && !($$2.b() instanceof ctu)
               && !$$2.a(cpo.mX)
               && !$$2.a(cpo.dO)
               && !$$2.a(cpo.ck)
               && !$$2.a(cpo.ed)
               && !$$2.a(cpo.fO)
               && !$$2.a(cpo.ii)
               && !$$2.a(cpo.kI)
               && !$$2.a(cpo.qB)
               && !$$2.a(cpo.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cpo.qC))
            : false;
      app.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).b() && cpn.a($$2.k($$0, $$1), ha.b);

      boolean canSpawnOn(aif var1, gu var2, dcb var3, gu var4, dcb var5);
   }
}
