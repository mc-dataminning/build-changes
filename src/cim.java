import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cim extends cis implements cjw {
   public static final Supplier<BiMap<csl, csl>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csm.qM, csm.rb)
            .put(csm.qL, csm.rd)
            .put(csm.qK, csm.rc)
            .put(csm.qJ, csm.re)
            .put(csm.qS, csm.ri)
            .put(csm.qR, csm.rh)
            .put(csm.qQ, csm.rg)
            .put(csm.qP, csm.rf)
            .put(csm.ra, csm.rq)
            .put(csm.qZ, csm.rp)
            .put(csm.qY, csm.ro)
            .put(csm.qX, csm.rn)
            .put(csm.qW, csm.rm)
            .put(csm.qV, csm.rl)
            .put(csm.qU, csm.rk)
            .put(csm.qT, csm.rj)
            .build()
   );
   public static final Supplier<BiMap<csl, csl>> b = Suppliers.memoize(() -> a.get().inverse());

   public cim(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cbm $$4 = $$0.o();
         cix $$5 = $$0.n();
         if ($$4 instanceof akl) {
            ai.M.a((akl)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(djj.c, $$2, djj.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bgq.a($$1.B);
      }).orElse(bgq.d);
   }

   public static Optional<dez> b(dez $$0) {
      return Optional.ofNullable((csl)a.get().get($$0.b())).map($$1 -> ((csl)$$1).l($$0));
   }

   @Override
   public boolean a(cpl $$0, ddt $$1, boolean $$2, cbm $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(ddu $$0, cbm $$1) {
      return true;
   }
}
