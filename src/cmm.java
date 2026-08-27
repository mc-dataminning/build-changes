import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cmm extends cms implements cnw {
   public static final Supplier<BiMap<cwp, cwp>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cwr.qW, cwr.rw)
            .put(cwr.qX, cwr.ry)
            .put(cwr.qY, cwr.rx)
            .put(cwr.qZ, cwr.rz)
            .put(cwr.rf, cwr.rD)
            .put(cwr.re, cwr.rC)
            .put(cwr.rd, cwr.rB)
            .put(cwr.rc, cwr.rA)
            .put(cwr.rv, cwr.rL)
            .put(cwr.ru, cwr.rK)
            .put(cwr.rt, cwr.rJ)
            .put(cwr.rs, cwr.rI)
            .put(cwr.rr, cwr.rH)
            .put(cwr.rq, cwr.rG)
            .put(cwr.rp, cwr.rF)
            .put(cwr.ro, cwr.rE)
            .put(cwr.rj, cwr.rn)
            .put(cwr.ri, cwr.rm)
            .put(cwr.rh, cwr.rl)
            .put(cwr.rg, cwr.rk)
            .put(cwr.rM, cwr.rQ)
            .put(cwr.rN, cwr.rR)
            .put(cwr.rP, cwr.rT)
            .put(cwr.rO, cwr.rS)
            .put(cwr.rU, cwr.rY)
            .put(cwr.rV, cwr.rZ)
            .put(cwr.rX, cwr.sb)
            .put(cwr.rW, cwr.sa)
            .put(cwr.sc, cwr.sg)
            .put(cwr.sd, cwr.sh)
            .put(cwr.se, cwr.si)
            .put(cwr.sf, cwr.sj)
            .put(cwr.sk, cwr.so)
            .put(cwr.sl, cwr.sp)
            .put(cwr.sm, cwr.sq)
            .put(cwr.sn, cwr.sr)
            .build()
   );
   public static final Supplier<BiMap<cwp, cwp>> b = Suppliers.memoize(() -> a.get().inverse());

   public cmm(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cfh $$4 = $$0.o();
         cmx $$5 = $$0.n();
         if ($$4 instanceof ane) {
            am.N.a((ane)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dnq.c, $$2, dnq.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bka.a($$1.B);
      }).orElse(bka.d);
   }

   public static Optional<djg> b(djg $$0) {
      return Optional.ofNullable((cwp)a.get().get($$0.b())).map($$1 -> ((cwp)$$1).l($$0));
   }

   @Override
   public boolean a(cto $$0, did $$1, boolean $$2, cfh $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(die $$0, cfh $$1) {
      return true;
   }
}
