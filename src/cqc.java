import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cqc extends cqh implements crl {
   public static final Supplier<BiMap<dac, dac>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dae.qW, dae.rw)
            .put(dae.qX, dae.ry)
            .put(dae.qY, dae.rx)
            .put(dae.qZ, dae.rz)
            .put(dae.rf, dae.rD)
            .put(dae.re, dae.rC)
            .put(dae.rd, dae.rB)
            .put(dae.rc, dae.rA)
            .put(dae.rv, dae.rL)
            .put(dae.ru, dae.rK)
            .put(dae.rt, dae.rJ)
            .put(dae.rs, dae.rI)
            .put(dae.rr, dae.rH)
            .put(dae.rq, dae.rG)
            .put(dae.rp, dae.rF)
            .put(dae.ro, dae.rE)
            .put(dae.rj, dae.rn)
            .put(dae.ri, dae.rm)
            .put(dae.rh, dae.rl)
            .put(dae.rg, dae.rk)
            .put(dae.rM, dae.rQ)
            .put(dae.rN, dae.rR)
            .put(dae.rP, dae.rT)
            .put(dae.rO, dae.rS)
            .put(dae.rU, dae.rY)
            .put(dae.rV, dae.rZ)
            .put(dae.rX, dae.sb)
            .put(dae.rW, dae.sa)
            .put(dae.sc, dae.sg)
            .put(dae.sd, dae.sh)
            .put(dae.se, dae.si)
            .put(dae.sf, dae.sj)
            .put(dae.sk, dae.so)
            .put(dae.sl, dae.sp)
            .put(dae.sm, dae.sq)
            .put(dae.sn, dae.sr)
            .build()
   );
   public static final Supplier<BiMap<dac, dac>> b = Suppliers.memoize(() -> a.get().inverse());

   public cqc(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         ciu $$4 = $$0.o();
         cqm $$5 = $$0.n();
         if ($$4 instanceof apg) {
            am.N.a((apg)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(drp.c, $$2, drp.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bnd.a($$1.B);
      }).orElse(bnd.d);
   }

   public static Optional<dnb> b(dnb $$0) {
      return Optional.ofNullable((dac)a.get().get($$0.b())).map($$1 -> ((dac)$$1).l($$0));
   }

   @Override
   public boolean a(cxb $$0, dlr $$1, boolean $$2, ciu $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aC_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dls $$0, ciu $$1) {
      return true;
   }
}
