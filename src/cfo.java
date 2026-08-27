import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cfo extends cfu implements cgy {
   public static final Supplier<BiMap<cpn, cpn>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cpo.qM, cpo.rb)
            .put(cpo.qL, cpo.rd)
            .put(cpo.qK, cpo.rc)
            .put(cpo.qJ, cpo.re)
            .put(cpo.qS, cpo.ri)
            .put(cpo.qR, cpo.rh)
            .put(cpo.qQ, cpo.rg)
            .put(cpo.qP, cpo.rf)
            .put(cpo.ra, cpo.rq)
            .put(cpo.qZ, cpo.rp)
            .put(cpo.qY, cpo.ro)
            .put(cpo.qX, cpo.rn)
            .put(cpo.qW, cpo.rm)
            .put(cpo.qV, cpo.rl)
            .put(cpo.qU, cpo.rk)
            .put(cpo.qT, cpo.rj)
            .build()
   );
   public static final Supplier<BiMap<cpn, cpn>> b = Suppliers.memoize(() -> a.get().inverse());

   public cfo(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         byo $$4 = $$0.o();
         cfz $$5 = $$0.n();
         if ($$4 instanceof aig) {
            ai.M.a((aig)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dgl.c, $$2, dgl.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bdx.a($$1.B);
      }).orElse(bdx.d);
   }

   public static Optional<dcb> b(dcb $$0) {
      return Optional.ofNullable((cpn)a.get().get($$0.b())).map($$1 -> ((cpn)$$1).l($$0));
   }

   @Override
   public boolean a(cmm $$0, dav $$1, boolean $$2, byo $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(daw $$0, byo $$1) {
      return true;
   }
}
