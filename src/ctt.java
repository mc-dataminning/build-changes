import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ctt extends cty implements cvf {
   public static final Supplier<BiMap<dfi, dfi>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfk.qW, dfk.rw)
            .put(dfk.qX, dfk.ry)
            .put(dfk.qY, dfk.rx)
            .put(dfk.qZ, dfk.rz)
            .put(dfk.rf, dfk.rD)
            .put(dfk.re, dfk.rC)
            .put(dfk.rd, dfk.rB)
            .put(dfk.rc, dfk.rA)
            .put(dfk.rv, dfk.rL)
            .put(dfk.ru, dfk.rK)
            .put(dfk.rt, dfk.rJ)
            .put(dfk.rs, dfk.rI)
            .put(dfk.rr, dfk.rH)
            .put(dfk.rq, dfk.rG)
            .put(dfk.rp, dfk.rF)
            .put(dfk.ro, dfk.rE)
            .put(dfk.rj, dfk.rn)
            .put(dfk.ri, dfk.rm)
            .put(dfk.rh, dfk.rl)
            .put(dfk.rg, dfk.rk)
            .put(dfk.rM, dfk.rQ)
            .put(dfk.rN, dfk.rR)
            .put(dfk.rP, dfk.rT)
            .put(dfk.rO, dfk.rS)
            .put(dfk.rU, dfk.rY)
            .put(dfk.rV, dfk.rZ)
            .put(dfk.rX, dfk.sb)
            .put(dfk.rW, dfk.sa)
            .put(dfk.sc, dfk.sg)
            .put(dfk.sd, dfk.sh)
            .put(dfk.se, dfk.si)
            .put(dfk.sf, dfk.sj)
            .put(dfk.sk, dfk.so)
            .put(dfk.sl, dfk.sp)
            .put(dfk.sm, dfk.sq)
            .put(dfk.sn, dfk.sr)
            .build()
   );
   public static final Supplier<BiMap<dfi, dfi>> b = Suppliers.memoize(() -> a.get().inverse());

   public ctt(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cml $$4 = $$0.o();
         cud $$5 = $$0.n();
         if ($$4 instanceof aqn) {
            am.N.a((aqn)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dxh.c, $$2, dxh.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqh.a($$1.B);
      }).orElse(bqh.e);
   }

   public static Optional<dsl> a(dsl $$0) {
      return Optional.ofNullable((dfi)a.get().get($$0.b())).map($$1 -> ((dfi)$$1).l($$0));
   }

   @Override
   public boolean a(dcg $$0, drb $$1, boolean $$2, cml $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(drc $$0, cml $$1) {
      return true;
   }
}
