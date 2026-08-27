import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cja extends cjg implements ckk {
   public static final Supplier<BiMap<ctc, ctc>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cte.qM, cte.rb)
            .put(cte.qL, cte.rd)
            .put(cte.qK, cte.rc)
            .put(cte.qJ, cte.re)
            .put(cte.qS, cte.ri)
            .put(cte.qR, cte.rh)
            .put(cte.qQ, cte.rg)
            .put(cte.qP, cte.rf)
            .put(cte.ra, cte.rq)
            .put(cte.qZ, cte.rp)
            .put(cte.qY, cte.ro)
            .put(cte.qX, cte.rn)
            .put(cte.qW, cte.rm)
            .put(cte.qV, cte.rl)
            .put(cte.qU, cte.rk)
            .put(cte.qT, cte.rj)
            .build()
   );
   public static final Supplier<BiMap<ctc, ctc>> b = Suppliers.memoize(() -> a.get().inverse());

   public cja(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cca $$4 = $$0.o();
         cjl $$5 = $$0.n();
         if ($$4 instanceof aku) {
            al.M.a((aku)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(djn.c, $$2, djn.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bhe.a($$1.B);
      }).orElse(bhe.d);
   }

   public static Optional<dfd> b(dfd $$0) {
      return Optional.ofNullable((ctc)a.get().get($$0.b())).map($$1 -> ((ctc)$$1).l($$0));
   }

   @Override
   public boolean a(cqb $$0, deh $$1, boolean $$2, cca $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dei $$0, cca $$1) {
      return true;
   }
}
