import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cky extends cle implements cmi {
   public static final Supplier<BiMap<cva, cva>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cvc.qZ, cvc.rw)
            .put(cvc.qY, cvc.ry)
            .put(cvc.qX, cvc.rx)
            .put(cvc.qW, cvc.rz)
            .put(cvc.rf, cvc.rD)
            .put(cvc.re, cvc.rC)
            .put(cvc.rd, cvc.rB)
            .put(cvc.rc, cvc.rA)
            .put(cvc.rv, cvc.rL)
            .put(cvc.ru, cvc.rK)
            .put(cvc.rt, cvc.rJ)
            .put(cvc.rs, cvc.rI)
            .put(cvc.rr, cvc.rH)
            .put(cvc.rq, cvc.rG)
            .put(cvc.rp, cvc.rF)
            .put(cvc.ro, cvc.rE)
            .put(cvc.rj, cvc.rn)
            .put(cvc.ri, cvc.rm)
            .put(cvc.rh, cvc.rl)
            .put(cvc.rg, cvc.rk)
            .put(cvc.rM, cvc.rQ)
            .put(cvc.rN, cvc.rR)
            .put(cvc.rP, cvc.rT)
            .put(cvc.rO, cvc.rS)
            .put(cvc.rU, cvc.rY)
            .put(cvc.rV, cvc.rZ)
            .put(cvc.rX, cvc.sb)
            .put(cvc.rW, cvc.sa)
            .put(cvc.sc, cvc.sg)
            .put(cvc.sd, cvc.sh)
            .put(cvc.se, cvc.si)
            .put(cvc.sf, cvc.sj)
            .put(cvc.sk, cvc.so)
            .put(cvc.sl, cvc.sp)
            .put(cvc.sm, cvc.sq)
            .put(cvc.sn, cvc.sr)
            .build()
   );
   public static final Supplier<BiMap<cva, cva>> b = Suppliers.memoize(() -> a.get().inverse());

   public cky(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cdu $$4 = $$0.o();
         clj $$5 = $$0.n();
         if ($$4 instanceof amf) {
            al.M.a((amf)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dls.c, $$2, dls.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bix.a($$1.B);
      }).orElse(bix.d);
   }

   public static Optional<dhi> b(dhi $$0) {
      return Optional.ofNullable((cva)a.get().get($$0.b())).map($$1 -> ((cva)$$1).l($$0));
   }

   @Override
   public boolean a(csa $$0, dgm $$1, boolean $$2, cdu $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.p(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dgn $$0, cdu $$1) {
      return true;
   }
}
