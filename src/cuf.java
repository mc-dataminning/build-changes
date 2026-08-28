import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cuf extends cuk implements cvr {
   public static final Supplier<BiMap<dez, dez>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfb.qW, dfb.rw)
            .put(dfb.qX, dfb.ry)
            .put(dfb.qY, dfb.rx)
            .put(dfb.qZ, dfb.rz)
            .put(dfb.rf, dfb.rD)
            .put(dfb.re, dfb.rC)
            .put(dfb.rd, dfb.rB)
            .put(dfb.rc, dfb.rA)
            .put(dfb.rv, dfb.rL)
            .put(dfb.ru, dfb.rK)
            .put(dfb.rt, dfb.rJ)
            .put(dfb.rs, dfb.rI)
            .put(dfb.rr, dfb.rH)
            .put(dfb.rq, dfb.rG)
            .put(dfb.rp, dfb.rF)
            .put(dfb.ro, dfb.rE)
            .put(dfb.rj, dfb.rn)
            .put(dfb.ri, dfb.rm)
            .put(dfb.rh, dfb.rl)
            .put(dfb.rg, dfb.rk)
            .put(dfb.rM, dfb.rQ)
            .put(dfb.rN, dfb.rR)
            .put(dfb.rP, dfb.rT)
            .put(dfb.rO, dfb.rS)
            .put(dfb.rU, dfb.rY)
            .put(dfb.rV, dfb.rZ)
            .put(dfb.rX, dfb.sb)
            .put(dfb.rW, dfb.sa)
            .put(dfb.sc, dfb.sg)
            .put(dfb.sd, dfb.sh)
            .put(dfb.se, dfb.si)
            .put(dfb.sf, dfb.sj)
            .put(dfb.sk, dfb.so)
            .put(dfb.sl, dfb.sp)
            .put(dfb.sm, dfb.sq)
            .put(dfb.sn, dfb.sr)
            .build()
   );
   public static final Supplier<BiMap<dez, dez>> b = Suppliers.memoize(() -> a.get().inverse());

   public cuf(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmx $$4 = $$0.o();
         cup $$5 = $$0.n();
         if ($$4 instanceof arg) {
            am.N.a((arg)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dwv.c, $$2, dwv.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqu.a($$1.B);
      }).orElse(bqu.e);
   }

   public static Optional<dsc> a(dsc $$0) {
      return Optional.ofNullable((dez)a.get().get($$0.b())).map($$1 -> ((dez)$$1).l($$0));
   }

   @Override
   public boolean a(dby $$0, dqr $$1, boolean $$2, cmx $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ay_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqs $$0, cmx $$1) {
      return true;
   }
}
