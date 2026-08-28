import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cvs extends cvx implements cxf {
   public static final Supplier<BiMap<die, die>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dig.qW, dig.rw)
            .put(dig.qX, dig.ry)
            .put(dig.qY, dig.rx)
            .put(dig.qZ, dig.rz)
            .put(dig.rf, dig.rD)
            .put(dig.re, dig.rC)
            .put(dig.rd, dig.rB)
            .put(dig.rc, dig.rA)
            .put(dig.rv, dig.rL)
            .put(dig.ru, dig.rK)
            .put(dig.rt, dig.rJ)
            .put(dig.rs, dig.rI)
            .put(dig.rr, dig.rH)
            .put(dig.rq, dig.rG)
            .put(dig.rp, dig.rF)
            .put(dig.ro, dig.rE)
            .put(dig.rj, dig.rn)
            .put(dig.ri, dig.rm)
            .put(dig.rh, dig.rl)
            .put(dig.rg, dig.rk)
            .put(dig.rM, dig.rQ)
            .put(dig.rN, dig.rR)
            .put(dig.rP, dig.rT)
            .put(dig.rO, dig.rS)
            .put(dig.rU, dig.rY)
            .put(dig.rV, dig.rZ)
            .put(dig.rX, dig.sb)
            .put(dig.rW, dig.sa)
            .put(dig.sc, dig.sg)
            .put(dig.sd, dig.sh)
            .put(dig.se, dig.si)
            .put(dig.sf, dig.sj)
            .put(dig.sk, dig.so)
            .put(dig.sl, dig.sp)
            .put(dig.sm, dig.sq)
            .put(dig.sn, dig.sr)
            .build()
   );
   public static final Supplier<BiMap<die, die>> b = Suppliers.memoize(() -> a.get().inverse());

   public cvs(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         com $$4 = $$0.o();
         cwb $$5 = $$0.n();
         if ($$4 instanceof aro $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eag.c, $$2, eag.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsd.a;
      }).orElse(bsd.e);
   }

   public static Optional<dvj> a(dvj $$0) {
      return Optional.ofNullable((die)a.get().get($$0.b())).map($$1 -> ((die)$$1).m($$0));
   }

   @Override
   public boolean a(dfb $$0, dty $$1, boolean $$2, com $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dtz $$0, com $$1) {
      return true;
   }
}
