import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cpg extends cpl implements cqp {
   public static final Supplier<BiMap<czf, czf>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(czh.qW, czh.rw)
            .put(czh.qX, czh.ry)
            .put(czh.qY, czh.rx)
            .put(czh.qZ, czh.rz)
            .put(czh.rf, czh.rD)
            .put(czh.re, czh.rC)
            .put(czh.rd, czh.rB)
            .put(czh.rc, czh.rA)
            .put(czh.rv, czh.rL)
            .put(czh.ru, czh.rK)
            .put(czh.rt, czh.rJ)
            .put(czh.rs, czh.rI)
            .put(czh.rr, czh.rH)
            .put(czh.rq, czh.rG)
            .put(czh.rp, czh.rF)
            .put(czh.ro, czh.rE)
            .put(czh.rj, czh.rn)
            .put(czh.ri, czh.rm)
            .put(czh.rh, czh.rl)
            .put(czh.rg, czh.rk)
            .put(czh.rM, czh.rQ)
            .put(czh.rN, czh.rR)
            .put(czh.rP, czh.rT)
            .put(czh.rO, czh.rS)
            .put(czh.rU, czh.rY)
            .put(czh.rV, czh.rZ)
            .put(czh.rX, czh.sb)
            .put(czh.rW, czh.sa)
            .put(czh.sc, czh.sg)
            .put(czh.sd, czh.sh)
            .put(czh.se, czh.si)
            .put(czh.sf, czh.sj)
            .put(czh.sk, czh.so)
            .put(czh.sl, czh.sp)
            .put(czh.sm, czh.sq)
            .put(czh.sn, czh.sr)
            .build()
   );
   public static final Supplier<BiMap<czf, czf>> b = Suppliers.memoize(() -> a.get().inverse());

   public cpg(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cia $$4 = $$0.o();
         cpq $$5 = $$0.n();
         if ($$4 instanceof apb) {
            am.N.a((apb)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dqr.c, $$2, dqr.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bml.a($$1.B);
      }).orElse(bml.d);
   }

   public static Optional<dme> b(dme $$0) {
      return Optional.ofNullable((czf)a.get().get($$0.b())).map($$1 -> ((czf)$$1).l($$0));
   }

   @Override
   public boolean a(cwe $$0, dku $$1, boolean $$2, cia $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aD_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dkv $$0, cia $$1) {
      return true;
   }
}
