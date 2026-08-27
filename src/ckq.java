import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ckq extends ckw implements cma {
   public static final Supplier<BiMap<cut, cut>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cuv.qM, cuv.rb)
            .put(cuv.qL, cuv.rd)
            .put(cuv.qK, cuv.rc)
            .put(cuv.qJ, cuv.re)
            .put(cuv.qS, cuv.ri)
            .put(cuv.qR, cuv.rh)
            .put(cuv.qQ, cuv.rg)
            .put(cuv.qP, cuv.rf)
            .put(cuv.ra, cuv.rq)
            .put(cuv.qZ, cuv.rp)
            .put(cuv.qY, cuv.ro)
            .put(cuv.qX, cuv.rn)
            .put(cuv.qW, cuv.rm)
            .put(cuv.qV, cuv.rl)
            .put(cuv.qU, cuv.rk)
            .put(cuv.qT, cuv.rj)
            .build()
   );
   public static final Supplier<BiMap<cut, cut>> b = Suppliers.memoize(() -> a.get().inverse());

   public ckq(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cdm $$4 = $$0.o();
         clb $$5 = $$0.n();
         if ($$4 instanceof amb) {
            al.M.a((amb)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dlg.c, $$2, dlg.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return biq.a($$1.B);
      }).orElse(biq.d);
   }

   public static Optional<dgw> b(dgw $$0) {
      return Optional.ofNullable((cut)a.get().get($$0.b())).map($$1 -> ((cut)$$1).l($$0));
   }

   @Override
   public boolean a(crs $$0, dga $$1, boolean $$2, cdm $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dgb $$0, cdm $$1) {
      return true;
   }
}
