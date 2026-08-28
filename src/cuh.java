import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cuh extends cum implements cvt {
   public static final Supplier<BiMap<dfb, dfb>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfd.qW, dfd.rw)
            .put(dfd.qX, dfd.ry)
            .put(dfd.qY, dfd.rx)
            .put(dfd.qZ, dfd.rz)
            .put(dfd.rf, dfd.rD)
            .put(dfd.re, dfd.rC)
            .put(dfd.rd, dfd.rB)
            .put(dfd.rc, dfd.rA)
            .put(dfd.rv, dfd.rL)
            .put(dfd.ru, dfd.rK)
            .put(dfd.rt, dfd.rJ)
            .put(dfd.rs, dfd.rI)
            .put(dfd.rr, dfd.rH)
            .put(dfd.rq, dfd.rG)
            .put(dfd.rp, dfd.rF)
            .put(dfd.ro, dfd.rE)
            .put(dfd.rj, dfd.rn)
            .put(dfd.ri, dfd.rm)
            .put(dfd.rh, dfd.rl)
            .put(dfd.rg, dfd.rk)
            .put(dfd.rM, dfd.rQ)
            .put(dfd.rN, dfd.rR)
            .put(dfd.rP, dfd.rT)
            .put(dfd.rO, dfd.rS)
            .put(dfd.rU, dfd.rY)
            .put(dfd.rV, dfd.rZ)
            .put(dfd.rX, dfd.sb)
            .put(dfd.rW, dfd.sa)
            .put(dfd.sc, dfd.sg)
            .put(dfd.sd, dfd.sh)
            .put(dfd.se, dfd.si)
            .put(dfd.sf, dfd.sj)
            .put(dfd.sk, dfd.so)
            .put(dfd.sl, dfd.sp)
            .put(dfd.sm, dfd.sq)
            .put(dfd.sn, dfd.sr)
            .build()
   );
   public static final Supplier<BiMap<dfb, dfb>> b = Suppliers.memoize(() -> a.get().inverse());

   public cuh(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmz $$4 = $$0.o();
         cur $$5 = $$0.n();
         if ($$4 instanceof arg) {
            am.N.a((arg)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dwx.c, $$2, dwx.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqw.a($$1.B);
      }).orElse(bqw.e);
   }

   public static Optional<dse> a(dse $$0) {
      return Optional.ofNullable((dfb)a.get().get($$0.b())).map($$1 -> ((dfb)$$1).l($$0));
   }

   @Override
   public boolean a(dca $$0, dqt $$1, boolean $$2, cmz $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ay_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqu $$0, cmz $$1) {
      return true;
   }
}
