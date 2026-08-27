import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ciw extends cjc implements ckg {
   public static final Supplier<BiMap<csx, csx>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csy.qM, csy.rb)
            .put(csy.qL, csy.rd)
            .put(csy.qK, csy.rc)
            .put(csy.qJ, csy.re)
            .put(csy.qS, csy.ri)
            .put(csy.qR, csy.rh)
            .put(csy.qQ, csy.rg)
            .put(csy.qP, csy.rf)
            .put(csy.ra, csy.rq)
            .put(csy.qZ, csy.rp)
            .put(csy.qY, csy.ro)
            .put(csy.qX, csy.rn)
            .put(csy.qW, csy.rm)
            .put(csy.qV, csy.rl)
            .put(csy.qU, csy.rk)
            .put(csy.qT, csy.rj)
            .build()
   );
   public static final Supplier<BiMap<csx, csx>> b = Suppliers.memoize(() -> a.get().inverse());

   public ciw(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cbw $$4 = $$0.o();
         cjh $$5 = $$0.n();
         if ($$4 instanceof akt) {
            al.M.a((akt)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(djv.c, $$2, djv.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bha.a($$1.B);
      }).orElse(bha.d);
   }

   public static Optional<dfl> b(dfl $$0) {
      return Optional.ofNullable((csx)a.get().get($$0.b())).map($$1 -> ((csx)$$1).l($$0));
   }

   @Override
   public boolean a(cpx $$0, def $$1, boolean $$2, cbw $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(deg $$0, cbw $$1) {
      return true;
   }
}
