import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cip extends civ implements cjz {
   public static final Supplier<BiMap<csq, csq>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csr.qM, csr.rb)
            .put(csr.qL, csr.rd)
            .put(csr.qK, csr.rc)
            .put(csr.qJ, csr.re)
            .put(csr.qS, csr.ri)
            .put(csr.qR, csr.rh)
            .put(csr.qQ, csr.rg)
            .put(csr.qP, csr.rf)
            .put(csr.ra, csr.rq)
            .put(csr.qZ, csr.rp)
            .put(csr.qY, csr.ro)
            .put(csr.qX, csr.rn)
            .put(csr.qW, csr.rm)
            .put(csr.qV, csr.rl)
            .put(csr.qU, csr.rk)
            .put(csr.qT, csr.rj)
            .build()
   );
   public static final Supplier<BiMap<csq, csq>> b = Suppliers.memoize(() -> a.get().inverse());

   public cip(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cbp $$4 = $$0.o();
         cja $$5 = $$0.n();
         if ($$4 instanceof ako) {
            al.M.a((ako)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(djo.c, $$2, djo.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bgt.a($$1.B);
      }).orElse(bgt.d);
   }

   public static Optional<dfe> b(dfe $$0) {
      return Optional.ofNullable((csq)a.get().get($$0.b())).map($$1 -> ((csq)$$1).l($$0));
   }

   @Override
   public boolean a(cpq $$0, ddy $$1, boolean $$2, cbp $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(ddz $$0, cbp $$1) {
      return true;
   }
}
