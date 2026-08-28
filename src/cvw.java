import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cvw extends cwb implements cxj {
   public static final Supplier<BiMap<dij, dij>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dil.qW, dil.rw)
            .put(dil.qX, dil.ry)
            .put(dil.qY, dil.rx)
            .put(dil.qZ, dil.rz)
            .put(dil.rf, dil.rD)
            .put(dil.re, dil.rC)
            .put(dil.rd, dil.rB)
            .put(dil.rc, dil.rA)
            .put(dil.rv, dil.rL)
            .put(dil.ru, dil.rK)
            .put(dil.rt, dil.rJ)
            .put(dil.rs, dil.rI)
            .put(dil.rr, dil.rH)
            .put(dil.rq, dil.rG)
            .put(dil.rp, dil.rF)
            .put(dil.ro, dil.rE)
            .put(dil.rj, dil.rn)
            .put(dil.ri, dil.rm)
            .put(dil.rh, dil.rl)
            .put(dil.rg, dil.rk)
            .put(dil.rM, dil.rQ)
            .put(dil.rN, dil.rR)
            .put(dil.rP, dil.rT)
            .put(dil.rO, dil.rS)
            .put(dil.rU, dil.rY)
            .put(dil.rV, dil.rZ)
            .put(dil.rX, dil.sb)
            .put(dil.rW, dil.sa)
            .put(dil.sc, dil.sg)
            .put(dil.sd, dil.sh)
            .put(dil.se, dil.si)
            .put(dil.sf, dil.sj)
            .put(dil.sk, dil.so)
            .put(dil.sl, dil.sp)
            .put(dil.sm, dil.sq)
            .put(dil.sn, dil.sr)
            .build()
   );
   public static final Supplier<BiMap<dij, dij>> b = Suppliers.memoize(() -> a.get().inverse());

   public cvw(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cor $$4 = $$0.o();
         cwf $$5 = $$0.n();
         if ($$4 instanceof arr $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eak.c, $$2, eak.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsh.a;
      }).orElse(bsh.e);
   }

   public static Optional<dvo> a(dvo $$0) {
      return Optional.ofNullable((dij)a.get().get($$0.b())).map($$1 -> ((dij)$$1).m($$0));
   }

   @Override
   public boolean a(dff $$0, dud $$1, boolean $$2, cor $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(due $$0, cor $$1) {
      return true;
   }
}
