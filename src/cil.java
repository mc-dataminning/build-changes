import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cil extends cir implements cjv {
   public static final Supplier<BiMap<csk, csk>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csl.qM, csl.rb)
            .put(csl.qL, csl.rd)
            .put(csl.qK, csl.rc)
            .put(csl.qJ, csl.re)
            .put(csl.qS, csl.ri)
            .put(csl.qR, csl.rh)
            .put(csl.qQ, csl.rg)
            .put(csl.qP, csl.rf)
            .put(csl.ra, csl.rq)
            .put(csl.qZ, csl.rp)
            .put(csl.qY, csl.ro)
            .put(csl.qX, csl.rn)
            .put(csl.qW, csl.rm)
            .put(csl.qV, csl.rl)
            .put(csl.qU, csl.rk)
            .put(csl.qT, csl.rj)
            .build()
   );
   public static final Supplier<BiMap<csk, csk>> b = Suppliers.memoize(() -> a.get().inverse());

   public cil(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cbl $$4 = $$0.o();
         ciw $$5 = $$0.n();
         if ($$4 instanceof akj) {
            ai.M.a((akj)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dji.c, $$2, dji.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bgo.a($$1.B);
      }).orElse(bgo.d);
   }

   public static Optional<dey> b(dey $$0) {
      return Optional.ofNullable((csk)a.get().get($$0.b())).map($$1 -> ((csk)$$1).l($$0));
   }

   @Override
   public boolean a(cpk $$0, dds $$1, boolean $$2, cbl $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(ddt $$0, cbl $$1) {
      return true;
   }
}
