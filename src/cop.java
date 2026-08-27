import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cop extends cou implements cpy {
   public static final Supplier<BiMap<cyo, cyo>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cyq.qW, cyq.rw)
            .put(cyq.qX, cyq.ry)
            .put(cyq.qY, cyq.rx)
            .put(cyq.qZ, cyq.rz)
            .put(cyq.rf, cyq.rD)
            .put(cyq.re, cyq.rC)
            .put(cyq.rd, cyq.rB)
            .put(cyq.rc, cyq.rA)
            .put(cyq.rv, cyq.rL)
            .put(cyq.ru, cyq.rK)
            .put(cyq.rt, cyq.rJ)
            .put(cyq.rs, cyq.rI)
            .put(cyq.rr, cyq.rH)
            .put(cyq.rq, cyq.rG)
            .put(cyq.rp, cyq.rF)
            .put(cyq.ro, cyq.rE)
            .put(cyq.rj, cyq.rn)
            .put(cyq.ri, cyq.rm)
            .put(cyq.rh, cyq.rl)
            .put(cyq.rg, cyq.rk)
            .put(cyq.rM, cyq.rQ)
            .put(cyq.rN, cyq.rR)
            .put(cyq.rP, cyq.rT)
            .put(cyq.rO, cyq.rS)
            .put(cyq.rU, cyq.rY)
            .put(cyq.rV, cyq.rZ)
            .put(cyq.rX, cyq.sb)
            .put(cyq.rW, cyq.sa)
            .put(cyq.sc, cyq.sg)
            .put(cyq.sd, cyq.sh)
            .put(cyq.se, cyq.si)
            .put(cyq.sf, cyq.sj)
            .put(cyq.sk, cyq.so)
            .put(cyq.sl, cyq.sp)
            .put(cyq.sm, cyq.sq)
            .put(cyq.sn, cyq.sr)
            .build()
   );
   public static final Supplier<BiMap<cyo, cyo>> b = Suppliers.memoize(() -> a.get().inverse());

   public cop(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         chh $$4 = $$0.o();
         coz $$5 = $$0.n();
         if ($$4 instanceof aow) {
            am.N.a((aow)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dpp.c, $$2, dpp.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return blu.a($$1.B);
      }).orElse(blu.d);
   }

   public static Optional<dlf> b(dlf $$0) {
      return Optional.ofNullable((cyo)a.get().get($$0.b())).map($$1 -> ((cyo)$$1).l($$0));
   }

   @Override
   public boolean a(cvn $$0, dkc $$1, boolean $$2, chh $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aE_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dkd $$0, chh $$1) {
      return true;
   }
}
