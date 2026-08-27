import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cte extends ctj implements cuq {
   public static final Supplier<BiMap<ddy, ddy>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dea.qW, dea.rw)
            .put(dea.qX, dea.ry)
            .put(dea.qY, dea.rx)
            .put(dea.qZ, dea.rz)
            .put(dea.rf, dea.rD)
            .put(dea.re, dea.rC)
            .put(dea.rd, dea.rB)
            .put(dea.rc, dea.rA)
            .put(dea.rv, dea.rL)
            .put(dea.ru, dea.rK)
            .put(dea.rt, dea.rJ)
            .put(dea.rs, dea.rI)
            .put(dea.rr, dea.rH)
            .put(dea.rq, dea.rG)
            .put(dea.rp, dea.rF)
            .put(dea.ro, dea.rE)
            .put(dea.rj, dea.rn)
            .put(dea.ri, dea.rm)
            .put(dea.rh, dea.rl)
            .put(dea.rg, dea.rk)
            .put(dea.rM, dea.rQ)
            .put(dea.rN, dea.rR)
            .put(dea.rP, dea.rT)
            .put(dea.rO, dea.rS)
            .put(dea.rU, dea.rY)
            .put(dea.rV, dea.rZ)
            .put(dea.rX, dea.sb)
            .put(dea.rW, dea.sa)
            .put(dea.sc, dea.sg)
            .put(dea.sd, dea.sh)
            .put(dea.se, dea.si)
            .put(dea.sf, dea.sj)
            .put(dea.sk, dea.so)
            .put(dea.sl, dea.sp)
            .put(dea.sm, dea.sq)
            .put(dea.sn, dea.sr)
            .build()
   );
   public static final Supplier<BiMap<ddy, ddy>> b = Suppliers.memoize(() -> a.get().inverse());

   public cte(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         clw $$4 = $$0.o();
         cto $$5 = $$0.n();
         if ($$4 instanceof aqn) {
            am.N.a((aqn)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dvu.c, $$2, dvu.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bpu.a($$1.B);
      }).orElse(bpu.d);
   }

   public static Optional<drb> a(drb $$0) {
      return Optional.ofNullable((ddy)a.get().get($$0.b())).map($$1 -> ((ddy)$$1).l($$0));
   }

   @Override
   public boolean a(dax $$0, dpq $$1, boolean $$2, clw $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dpr $$0, clw $$1) {
      return true;
   }
}
