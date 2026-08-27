import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ciu extends cja implements cke {
   public static final Supplier<BiMap<csv, csv>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csw.qM, csw.rb)
            .put(csw.qL, csw.rd)
            .put(csw.qK, csw.rc)
            .put(csw.qJ, csw.re)
            .put(csw.qS, csw.ri)
            .put(csw.qR, csw.rh)
            .put(csw.qQ, csw.rg)
            .put(csw.qP, csw.rf)
            .put(csw.ra, csw.rq)
            .put(csw.qZ, csw.rp)
            .put(csw.qY, csw.ro)
            .put(csw.qX, csw.rn)
            .put(csw.qW, csw.rm)
            .put(csw.qV, csw.rl)
            .put(csw.qU, csw.rk)
            .put(csw.qT, csw.rj)
            .build()
   );
   public static final Supplier<BiMap<csv, csv>> b = Suppliers.memoize(() -> a.get().inverse());

   public ciu(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cbu $$4 = $$0.o();
         cjf $$5 = $$0.n();
         if ($$4 instanceof akr) {
            al.M.a((akr)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(djt.c, $$2, djt.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bgy.a($$1.B);
      }).orElse(bgy.d);
   }

   public static Optional<dfj> b(dfj $$0) {
      return Optional.ofNullable((csv)a.get().get($$0.b())).map($$1 -> ((csv)$$1).l($$0));
   }

   @Override
   public boolean a(cpv $$0, ded $$1, boolean $$2, cbu $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dee $$0, cbu $$1) {
      return true;
   }
}
