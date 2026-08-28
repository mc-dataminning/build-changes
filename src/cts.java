import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cts extends ctx implements cve {
   public static final Supplier<BiMap<dfh, dfh>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfj.qW, dfj.rw)
            .put(dfj.qX, dfj.ry)
            .put(dfj.qY, dfj.rx)
            .put(dfj.qZ, dfj.rz)
            .put(dfj.rf, dfj.rD)
            .put(dfj.re, dfj.rC)
            .put(dfj.rd, dfj.rB)
            .put(dfj.rc, dfj.rA)
            .put(dfj.rv, dfj.rL)
            .put(dfj.ru, dfj.rK)
            .put(dfj.rt, dfj.rJ)
            .put(dfj.rs, dfj.rI)
            .put(dfj.rr, dfj.rH)
            .put(dfj.rq, dfj.rG)
            .put(dfj.rp, dfj.rF)
            .put(dfj.ro, dfj.rE)
            .put(dfj.rj, dfj.rn)
            .put(dfj.ri, dfj.rm)
            .put(dfj.rh, dfj.rl)
            .put(dfj.rg, dfj.rk)
            .put(dfj.rM, dfj.rQ)
            .put(dfj.rN, dfj.rR)
            .put(dfj.rP, dfj.rT)
            .put(dfj.rO, dfj.rS)
            .put(dfj.rU, dfj.rY)
            .put(dfj.rV, dfj.rZ)
            .put(dfj.rX, dfj.sb)
            .put(dfj.rW, dfj.sa)
            .put(dfj.sc, dfj.sg)
            .put(dfj.sd, dfj.sh)
            .put(dfj.se, dfj.si)
            .put(dfj.sf, dfj.sj)
            .put(dfj.sk, dfj.so)
            .put(dfj.sl, dfj.sp)
            .put(dfj.sm, dfj.sq)
            .put(dfj.sn, dfj.sr)
            .build()
   );
   public static final Supplier<BiMap<dfh, dfh>> b = Suppliers.memoize(() -> a.get().inverse());

   public cts(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmk $$4 = $$0.o();
         cuc $$5 = $$0.n();
         if ($$4 instanceof aqn) {
            am.N.a((aqn)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dxg.c, $$2, dxg.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqg.a($$1.B);
      }).orElse(bqg.e);
   }

   public static Optional<dsk> a(dsk $$0) {
      return Optional.ofNullable((dfh)a.get().get($$0.b())).map($$1 -> ((dfh)$$1).l($$0));
   }

   @Override
   public boolean a(dcf $$0, dra $$1, boolean $$2, cmk $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(drb $$0, cmk $$1) {
      return true;
   }
}
