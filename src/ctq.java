import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ctq extends ctv implements cvc {
   public static final Supplier<BiMap<dff, dff>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfh.qW, dfh.rw)
            .put(dfh.qX, dfh.ry)
            .put(dfh.qY, dfh.rx)
            .put(dfh.qZ, dfh.rz)
            .put(dfh.rf, dfh.rD)
            .put(dfh.re, dfh.rC)
            .put(dfh.rd, dfh.rB)
            .put(dfh.rc, dfh.rA)
            .put(dfh.rv, dfh.rL)
            .put(dfh.ru, dfh.rK)
            .put(dfh.rt, dfh.rJ)
            .put(dfh.rs, dfh.rI)
            .put(dfh.rr, dfh.rH)
            .put(dfh.rq, dfh.rG)
            .put(dfh.rp, dfh.rF)
            .put(dfh.ro, dfh.rE)
            .put(dfh.rj, dfh.rn)
            .put(dfh.ri, dfh.rm)
            .put(dfh.rh, dfh.rl)
            .put(dfh.rg, dfh.rk)
            .put(dfh.rM, dfh.rQ)
            .put(dfh.rN, dfh.rR)
            .put(dfh.rP, dfh.rT)
            .put(dfh.rO, dfh.rS)
            .put(dfh.rU, dfh.rY)
            .put(dfh.rV, dfh.rZ)
            .put(dfh.rX, dfh.sb)
            .put(dfh.rW, dfh.sa)
            .put(dfh.sc, dfh.sg)
            .put(dfh.sd, dfh.sh)
            .put(dfh.se, dfh.si)
            .put(dfh.sf, dfh.sj)
            .put(dfh.sk, dfh.so)
            .put(dfh.sl, dfh.sp)
            .put(dfh.sm, dfh.sq)
            .put(dfh.sn, dfh.sr)
            .build()
   );
   public static final Supplier<BiMap<dff, dff>> b = Suppliers.memoize(() -> a.get().inverse());

   public ctq(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmh $$4 = $$0.o();
         cua $$5 = $$0.n();
         if ($$4 instanceof aql) {
            am.N.a((aql)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dxa.c, $$2, dxa.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqd.a($$1.B);
      }).orElse(bqd.e);
   }

   public static Optional<dsh> a(dsh $$0) {
      return Optional.ofNullable((dff)a.get().get($$0.b())).map($$1 -> ((dff)$$1).l($$0));
   }

   @Override
   public boolean a(dcd $$0, dqx $$1, boolean $$2, cmh $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqy $$0, cmh $$1) {
      return true;
   }
}
