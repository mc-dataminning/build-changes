import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cqa extends cqf implements crj {
   public static final Supplier<BiMap<daa, daa>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dac.qW, dac.rw)
            .put(dac.qX, dac.ry)
            .put(dac.qY, dac.rx)
            .put(dac.qZ, dac.rz)
            .put(dac.rf, dac.rD)
            .put(dac.re, dac.rC)
            .put(dac.rd, dac.rB)
            .put(dac.rc, dac.rA)
            .put(dac.rv, dac.rL)
            .put(dac.ru, dac.rK)
            .put(dac.rt, dac.rJ)
            .put(dac.rs, dac.rI)
            .put(dac.rr, dac.rH)
            .put(dac.rq, dac.rG)
            .put(dac.rp, dac.rF)
            .put(dac.ro, dac.rE)
            .put(dac.rj, dac.rn)
            .put(dac.ri, dac.rm)
            .put(dac.rh, dac.rl)
            .put(dac.rg, dac.rk)
            .put(dac.rM, dac.rQ)
            .put(dac.rN, dac.rR)
            .put(dac.rP, dac.rT)
            .put(dac.rO, dac.rS)
            .put(dac.rU, dac.rY)
            .put(dac.rV, dac.rZ)
            .put(dac.rX, dac.sb)
            .put(dac.rW, dac.sa)
            .put(dac.sc, dac.sg)
            .put(dac.sd, dac.sh)
            .put(dac.se, dac.si)
            .put(dac.sf, dac.sj)
            .put(dac.sk, dac.so)
            .put(dac.sl, dac.sp)
            .put(dac.sm, dac.sq)
            .put(dac.sn, dac.sr)
            .build()
   );
   public static final Supplier<BiMap<daa, daa>> b = Suppliers.memoize(() -> a.get().inverse());

   public cqa(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cis $$4 = $$0.o();
         cqk $$5 = $$0.n();
         if ($$4 instanceof apg) {
            am.N.a((apg)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(drn.c, $$2, drn.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bnc.a($$1.B);
      }).orElse(bnc.d);
   }

   public static Optional<dmz> b(dmz $$0) {
      return Optional.ofNullable((daa)a.get().get($$0.b())).map($$1 -> ((daa)$$1).l($$0));
   }

   @Override
   public boolean a(cwz $$0, dlp $$1, boolean $$2, cis $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aC_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dlq $$0, cis $$1) {
      return true;
   }
}
