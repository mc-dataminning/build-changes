import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class clw extends cmc implements cng {
   public static final Supplier<BiMap<cvz, cvz>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cwb.qW, cwb.rw)
            .put(cwb.qX, cwb.ry)
            .put(cwb.qY, cwb.rx)
            .put(cwb.qZ, cwb.rz)
            .put(cwb.rf, cwb.rD)
            .put(cwb.re, cwb.rC)
            .put(cwb.rd, cwb.rB)
            .put(cwb.rc, cwb.rA)
            .put(cwb.rv, cwb.rL)
            .put(cwb.ru, cwb.rK)
            .put(cwb.rt, cwb.rJ)
            .put(cwb.rs, cwb.rI)
            .put(cwb.rr, cwb.rH)
            .put(cwb.rq, cwb.rG)
            .put(cwb.rp, cwb.rF)
            .put(cwb.ro, cwb.rE)
            .put(cwb.rj, cwb.rn)
            .put(cwb.ri, cwb.rm)
            .put(cwb.rh, cwb.rl)
            .put(cwb.rg, cwb.rk)
            .put(cwb.rM, cwb.rQ)
            .put(cwb.rN, cwb.rR)
            .put(cwb.rP, cwb.rT)
            .put(cwb.rO, cwb.rS)
            .put(cwb.rU, cwb.rY)
            .put(cwb.rV, cwb.rZ)
            .put(cwb.rX, cwb.sb)
            .put(cwb.rW, cwb.sa)
            .put(cwb.sc, cwb.sg)
            .put(cwb.sd, cwb.sh)
            .put(cwb.se, cwb.si)
            .put(cwb.sf, cwb.sj)
            .put(cwb.sk, cwb.so)
            .put(cwb.sl, cwb.sp)
            .put(cwb.sm, cwb.sq)
            .put(cwb.sn, cwb.sr)
            .build()
   );
   public static final Supplier<BiMap<cvz, cvz>> b = Suppliers.memoize(() -> a.get().inverse());

   public clw(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cer $$4 = $$0.o();
         cmh $$5 = $$0.n();
         if ($$4 instanceof amq) {
            am.N.a((amq)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dmz.c, $$2, dmz.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bjl.a($$1.B);
      }).orElse(bjl.d);
   }

   public static Optional<dip> b(dip $$0) {
      return Optional.ofNullable((cvz)a.get().get($$0.b())).map($$1 -> ((cvz)$$1).l($$0));
   }

   @Override
   public boolean a(csy $$0, dhm $$1, boolean $$2, cer $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dhn $$0, cer $$1) {
      return true;
   }
}
