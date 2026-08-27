import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class csp extends csu implements ctz {
   public static final Supplier<BiMap<dde, dde>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(ddg.qW, ddg.rw)
            .put(ddg.qX, ddg.ry)
            .put(ddg.qY, ddg.rx)
            .put(ddg.qZ, ddg.rz)
            .put(ddg.rf, ddg.rD)
            .put(ddg.re, ddg.rC)
            .put(ddg.rd, ddg.rB)
            .put(ddg.rc, ddg.rA)
            .put(ddg.rv, ddg.rL)
            .put(ddg.ru, ddg.rK)
            .put(ddg.rt, ddg.rJ)
            .put(ddg.rs, ddg.rI)
            .put(ddg.rr, ddg.rH)
            .put(ddg.rq, ddg.rG)
            .put(ddg.rp, ddg.rF)
            .put(ddg.ro, ddg.rE)
            .put(ddg.rj, ddg.rn)
            .put(ddg.ri, ddg.rm)
            .put(ddg.rh, ddg.rl)
            .put(ddg.rg, ddg.rk)
            .put(ddg.rM, ddg.rQ)
            .put(ddg.rN, ddg.rR)
            .put(ddg.rP, ddg.rT)
            .put(ddg.rO, ddg.rS)
            .put(ddg.rU, ddg.rY)
            .put(ddg.rV, ddg.rZ)
            .put(ddg.rX, ddg.sb)
            .put(ddg.rW, ddg.sa)
            .put(ddg.sc, ddg.sg)
            .put(ddg.sd, ddg.sh)
            .put(ddg.se, ddg.si)
            .put(ddg.sf, ddg.sj)
            .put(ddg.sk, ddg.so)
            .put(ddg.sl, ddg.sp)
            .put(ddg.sm, ddg.sq)
            .put(ddg.sn, ddg.sr)
            .build()
   );
   public static final Supplier<BiMap<dde, dde>> b = Suppliers.memoize(() -> a.get().inverse());

   public csp(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         clh $$4 = $$0.o();
         csz $$5 = $$0.n();
         if ($$4 instanceof aqi) {
            am.N.a((aqi)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dva.c, $$2, dva.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bpm.a($$1.B);
      }).orElse(bpm.d);
   }

   public static Optional<dqh> a(dqh $$0) {
      return Optional.ofNullable((dde)a.get().get($$0.b())).map($$1 -> ((dde)$$1).l($$0));
   }

   @Override
   public boolean a(dad $$0, dow $$1, boolean $$2, clh $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dox $$0, clh $$1) {
      return true;
   }
}
