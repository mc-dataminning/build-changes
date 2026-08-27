import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cmw extends cnb implements cof {
   public static final Supplier<BiMap<cwy, cwy>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cxa.qW, cxa.rw)
            .put(cxa.qX, cxa.ry)
            .put(cxa.qY, cxa.rx)
            .put(cxa.qZ, cxa.rz)
            .put(cxa.rf, cxa.rD)
            .put(cxa.re, cxa.rC)
            .put(cxa.rd, cxa.rB)
            .put(cxa.rc, cxa.rA)
            .put(cxa.rv, cxa.rL)
            .put(cxa.ru, cxa.rK)
            .put(cxa.rt, cxa.rJ)
            .put(cxa.rs, cxa.rI)
            .put(cxa.rr, cxa.rH)
            .put(cxa.rq, cxa.rG)
            .put(cxa.rp, cxa.rF)
            .put(cxa.ro, cxa.rE)
            .put(cxa.rj, cxa.rn)
            .put(cxa.ri, cxa.rm)
            .put(cxa.rh, cxa.rl)
            .put(cxa.rg, cxa.rk)
            .put(cxa.rM, cxa.rQ)
            .put(cxa.rN, cxa.rR)
            .put(cxa.rP, cxa.rT)
            .put(cxa.rO, cxa.rS)
            .put(cxa.rU, cxa.rY)
            .put(cxa.rV, cxa.rZ)
            .put(cxa.rX, cxa.sb)
            .put(cxa.rW, cxa.sa)
            .put(cxa.sc, cxa.sg)
            .put(cxa.sd, cxa.sh)
            .put(cxa.se, cxa.si)
            .put(cxa.sf, cxa.sj)
            .put(cxa.sk, cxa.so)
            .put(cxa.sl, cxa.sp)
            .put(cxa.sm, cxa.sq)
            .put(cxa.sn, cxa.sr)
            .build()
   );
   public static final Supplier<BiMap<cwy, cwy>> b = Suppliers.memoize(() -> a.get().inverse());

   public cmw(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cfq $$4 = $$0.o();
         cng $$5 = $$0.n();
         if ($$4 instanceof anf) {
            am.N.a((anf)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dnz.c, $$2, dnz.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bkc.a($$1.B);
      }).orElse(bkc.d);
   }

   public static Optional<djp> b(djp $$0) {
      return Optional.ofNullable((cwy)a.get().get($$0.b())).map($$1 -> ((cwy)$$1).l($$0));
   }

   @Override
   public boolean a(ctx $$0, dim $$1, boolean $$2, cfq $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aE_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(din $$0, cfq $$1) {
      return true;
   }
}
