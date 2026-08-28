import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cue extends cuj implements cvt {
   public static final Supplier<BiMap<dfw, dfw>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfy.qW, dfy.rw)
            .put(dfy.qX, dfy.ry)
            .put(dfy.qY, dfy.rx)
            .put(dfy.qZ, dfy.rz)
            .put(dfy.rf, dfy.rD)
            .put(dfy.re, dfy.rC)
            .put(dfy.rd, dfy.rB)
            .put(dfy.rc, dfy.rA)
            .put(dfy.rv, dfy.rL)
            .put(dfy.ru, dfy.rK)
            .put(dfy.rt, dfy.rJ)
            .put(dfy.rs, dfy.rI)
            .put(dfy.rr, dfy.rH)
            .put(dfy.rq, dfy.rG)
            .put(dfy.rp, dfy.rF)
            .put(dfy.ro, dfy.rE)
            .put(dfy.rj, dfy.rn)
            .put(dfy.ri, dfy.rm)
            .put(dfy.rh, dfy.rl)
            .put(dfy.rg, dfy.rk)
            .put(dfy.rM, dfy.rQ)
            .put(dfy.rN, dfy.rR)
            .put(dfy.rP, dfy.rT)
            .put(dfy.rO, dfy.rS)
            .put(dfy.rU, dfy.rY)
            .put(dfy.rV, dfy.rZ)
            .put(dfy.rX, dfy.sb)
            .put(dfy.rW, dfy.sa)
            .put(dfy.sc, dfy.sg)
            .put(dfy.sd, dfy.sh)
            .put(dfy.se, dfy.si)
            .put(dfy.sf, dfy.sj)
            .put(dfy.sk, dfy.so)
            .put(dfy.sl, dfy.sp)
            .put(dfy.sm, dfy.sq)
            .put(dfy.sn, dfy.sr)
            .build()
   );
   public static final Supplier<BiMap<dfw, dfw>> b = Suppliers.memoize(() -> a.get().inverse());

   public cue(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmv $$4 = $$0.o();
         cuo $$5 = $$0.n();
         if ($$4 instanceof aqu) {
            an.N.a((aqu)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dxw.c, $$2, dxw.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqq.a($$1.B);
      }).orElse(bqq.e);
   }

   public static Optional<dta> a(dta $$0) {
      return Optional.ofNullable((dfw)a.get().get($$0.b())).map($$1 -> ((dfw)$$1).l($$0));
   }

   @Override
   public boolean a(dcu $$0, drq $$1, boolean $$2, cmv $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(drr $$0, cmv $$1) {
      return true;
   }
}
