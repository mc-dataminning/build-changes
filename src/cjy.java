import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cjy extends cke implements cli {
   public static final Supplier<BiMap<cua, cua>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cuc.qM, cuc.rb)
            .put(cuc.qL, cuc.rd)
            .put(cuc.qK, cuc.rc)
            .put(cuc.qJ, cuc.re)
            .put(cuc.qS, cuc.ri)
            .put(cuc.qR, cuc.rh)
            .put(cuc.qQ, cuc.rg)
            .put(cuc.qP, cuc.rf)
            .put(cuc.ra, cuc.rq)
            .put(cuc.qZ, cuc.rp)
            .put(cuc.qY, cuc.ro)
            .put(cuc.qX, cuc.rn)
            .put(cuc.qW, cuc.rm)
            .put(cuc.qV, cuc.rl)
            .put(cuc.qU, cuc.rk)
            .put(cuc.qT, cuc.rj)
            .build()
   );
   public static final Supplier<BiMap<cua, cua>> b = Suppliers.memoize(() -> a.get().inverse());

   public cjy(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         ccx $$4 = $$0.o();
         ckj $$5 = $$0.n();
         if ($$4 instanceof alr) {
            al.M.a((alr)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dkl.c, $$2, dkl.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bib.a($$1.B);
      }).orElse(bib.d);
   }

   public static Optional<dgb> b(dgb $$0) {
      return Optional.ofNullable((cua)a.get().get($$0.b())).map($$1 -> ((cua)$$1).l($$0));
   }

   @Override
   public boolean a(cqz $$0, dff $$1, boolean $$2, ccx $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dfg $$0, ccx $$1) {
      return true;
   }
}
