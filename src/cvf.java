import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cvf extends cvk implements cwt {
   public static final Supplier<BiMap<dhj, dhj>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dhl.qW, dhl.rw)
            .put(dhl.qX, dhl.ry)
            .put(dhl.qY, dhl.rx)
            .put(dhl.qZ, dhl.rz)
            .put(dhl.rf, dhl.rD)
            .put(dhl.re, dhl.rC)
            .put(dhl.rd, dhl.rB)
            .put(dhl.rc, dhl.rA)
            .put(dhl.rv, dhl.rL)
            .put(dhl.ru, dhl.rK)
            .put(dhl.rt, dhl.rJ)
            .put(dhl.rs, dhl.rI)
            .put(dhl.rr, dhl.rH)
            .put(dhl.rq, dhl.rG)
            .put(dhl.rp, dhl.rF)
            .put(dhl.ro, dhl.rE)
            .put(dhl.rj, dhl.rn)
            .put(dhl.ri, dhl.rm)
            .put(dhl.rh, dhl.rl)
            .put(dhl.rg, dhl.rk)
            .put(dhl.rM, dhl.rQ)
            .put(dhl.rN, dhl.rR)
            .put(dhl.rP, dhl.rT)
            .put(dhl.rO, dhl.rS)
            .put(dhl.rU, dhl.rY)
            .put(dhl.rV, dhl.rZ)
            .put(dhl.rX, dhl.sb)
            .put(dhl.rW, dhl.sa)
            .put(dhl.sc, dhl.sg)
            .put(dhl.sd, dhl.sh)
            .put(dhl.se, dhl.si)
            .put(dhl.sf, dhl.sj)
            .put(dhl.sk, dhl.so)
            .put(dhl.sl, dhl.sp)
            .put(dhl.sm, dhl.sq)
            .put(dhl.sn, dhl.sr)
            .build()
   );
   public static final Supplier<BiMap<dhj, dhj>> b = Suppliers.memoize(() -> a.get().inverse());

   public cvf(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cnu $$4 = $$0.o();
         cvp $$5 = $$0.n();
         if ($$4 instanceof ari $$6) {
            an.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dzl.c, $$2, dzl.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return brp.a;
      }).orElse(brp.e);
   }

   public static Optional<duo> a(duo $$0) {
      return Optional.ofNullable((dhj)a.get().get($$0.b())).map($$1 -> ((dhj)$$1).m($$0));
   }

   @Override
   public boolean a(deg $$0, dte $$1, boolean $$2, cnu $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dtf $$0, cnu $$1) {
      return true;
   }
}
