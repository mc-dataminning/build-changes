import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cin extends cit implements cjx {
   public static final Supplier<BiMap<csm, csm>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csn.qM, csn.rb)
            .put(csn.qL, csn.rd)
            .put(csn.qK, csn.rc)
            .put(csn.qJ, csn.re)
            .put(csn.qS, csn.ri)
            .put(csn.qR, csn.rh)
            .put(csn.qQ, csn.rg)
            .put(csn.qP, csn.rf)
            .put(csn.ra, csn.rq)
            .put(csn.qZ, csn.rp)
            .put(csn.qY, csn.ro)
            .put(csn.qX, csn.rn)
            .put(csn.qW, csn.rm)
            .put(csn.qV, csn.rl)
            .put(csn.qU, csn.rk)
            .put(csn.qT, csn.rj)
            .build()
   );
   public static final Supplier<BiMap<csm, csm>> b = Suppliers.memoize(() -> a.get().inverse());

   public cin(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cbn $$4 = $$0.o();
         ciy $$5 = $$0.n();
         if ($$4 instanceof akl) {
            ai.M.a((akl)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(djk.c, $$2, djk.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bgq.a($$1.B);
      }).orElse(bgq.d);
   }

   public static Optional<dfa> b(dfa $$0) {
      return Optional.ofNullable((csm)a.get().get($$0.b())).map($$1 -> ((csm)$$1).l($$0));
   }

   @Override
   public boolean a(cpm $$0, ddu $$1, boolean $$2, cbn $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(ddv $$0, cbn $$1) {
      return true;
   }
}
