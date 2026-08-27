import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cmn extends cmt implements cnx {
   public static final Supplier<BiMap<cwq, cwq>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cws.qW, cws.rw)
            .put(cws.qX, cws.ry)
            .put(cws.qY, cws.rx)
            .put(cws.qZ, cws.rz)
            .put(cws.rf, cws.rD)
            .put(cws.re, cws.rC)
            .put(cws.rd, cws.rB)
            .put(cws.rc, cws.rA)
            .put(cws.rv, cws.rL)
            .put(cws.ru, cws.rK)
            .put(cws.rt, cws.rJ)
            .put(cws.rs, cws.rI)
            .put(cws.rr, cws.rH)
            .put(cws.rq, cws.rG)
            .put(cws.rp, cws.rF)
            .put(cws.ro, cws.rE)
            .put(cws.rj, cws.rn)
            .put(cws.ri, cws.rm)
            .put(cws.rh, cws.rl)
            .put(cws.rg, cws.rk)
            .put(cws.rM, cws.rQ)
            .put(cws.rN, cws.rR)
            .put(cws.rP, cws.rT)
            .put(cws.rO, cws.rS)
            .put(cws.rU, cws.rY)
            .put(cws.rV, cws.rZ)
            .put(cws.rX, cws.sb)
            .put(cws.rW, cws.sa)
            .put(cws.sc, cws.sg)
            .put(cws.sd, cws.sh)
            .put(cws.se, cws.si)
            .put(cws.sf, cws.sj)
            .put(cws.sk, cws.so)
            .put(cws.sl, cws.sp)
            .put(cws.sm, cws.sq)
            .put(cws.sn, cws.sr)
            .build()
   );
   public static final Supplier<BiMap<cwq, cwq>> b = Suppliers.memoize(() -> a.get().inverse());

   public cmn(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cfi $$4 = $$0.o();
         cmy $$5 = $$0.n();
         if ($$4 instanceof ane) {
            am.N.a((ane)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dnr.c, $$2, dnr.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bkb.a($$1.B);
      }).orElse(bkb.d);
   }

   public static Optional<djh> b(djh $$0) {
      return Optional.ofNullable((cwq)a.get().get($$0.b())).map($$1 -> ((cwq)$$1).l($$0));
   }

   @Override
   public boolean a(ctp $$0, die $$1, boolean $$2, cfi $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dif $$0, cfi $$1) {
      return true;
   }
}
