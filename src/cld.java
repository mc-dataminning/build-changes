import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cld extends clj implements cmn {
   public static final Supplier<BiMap<cvf, cvf>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cvh.qZ, cvh.rw)
            .put(cvh.qY, cvh.ry)
            .put(cvh.qX, cvh.rx)
            .put(cvh.qW, cvh.rz)
            .put(cvh.rf, cvh.rD)
            .put(cvh.re, cvh.rC)
            .put(cvh.rd, cvh.rB)
            .put(cvh.rc, cvh.rA)
            .put(cvh.rv, cvh.rL)
            .put(cvh.ru, cvh.rK)
            .put(cvh.rt, cvh.rJ)
            .put(cvh.rs, cvh.rI)
            .put(cvh.rr, cvh.rH)
            .put(cvh.rq, cvh.rG)
            .put(cvh.rp, cvh.rF)
            .put(cvh.ro, cvh.rE)
            .put(cvh.rj, cvh.rn)
            .put(cvh.ri, cvh.rm)
            .put(cvh.rh, cvh.rl)
            .put(cvh.rg, cvh.rk)
            .put(cvh.rM, cvh.rQ)
            .put(cvh.rN, cvh.rR)
            .put(cvh.rP, cvh.rT)
            .put(cvh.rO, cvh.rS)
            .put(cvh.rU, cvh.rY)
            .put(cvh.rV, cvh.rZ)
            .put(cvh.rX, cvh.sb)
            .put(cvh.rW, cvh.sa)
            .put(cvh.sc, cvh.sg)
            .put(cvh.sd, cvh.sh)
            .put(cvh.se, cvh.si)
            .put(cvh.sf, cvh.sj)
            .put(cvh.sk, cvh.so)
            .put(cvh.sl, cvh.sp)
            .put(cvh.sm, cvh.sq)
            .put(cvh.sn, cvh.sr)
            .build()
   );
   public static final Supplier<BiMap<cvf, cvf>> b = Suppliers.memoize(() -> a.get().inverse());

   public cld(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cdz $$4 = $$0.o();
         clo $$5 = $$0.n();
         if ($$4 instanceof amj) {
            al.M.a((amj)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dlx.c, $$2, dlx.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bjb.a($$1.B);
      }).orElse(bjb.d);
   }

   public static Optional<dhn> b(dhn $$0) {
      return Optional.ofNullable((cvf)a.get().get($$0.b())).map($$1 -> ((cvf)$$1).l($$0));
   }

   @Override
   public boolean a(csf $$0, dgr $$1, boolean $$2, cdz $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aC_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dgs $$0, cdz $$1) {
      return true;
   }
}
