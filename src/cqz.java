import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cqz extends cre implements csi {
   public static final Supplier<BiMap<dby, dby>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dca.qW, dca.rw)
            .put(dca.qX, dca.ry)
            .put(dca.qY, dca.rx)
            .put(dca.qZ, dca.rz)
            .put(dca.rf, dca.rD)
            .put(dca.re, dca.rC)
            .put(dca.rd, dca.rB)
            .put(dca.rc, dca.rA)
            .put(dca.rv, dca.rL)
            .put(dca.ru, dca.rK)
            .put(dca.rt, dca.rJ)
            .put(dca.rs, dca.rI)
            .put(dca.rr, dca.rH)
            .put(dca.rq, dca.rG)
            .put(dca.rp, dca.rF)
            .put(dca.ro, dca.rE)
            .put(dca.rj, dca.rn)
            .put(dca.ri, dca.rm)
            .put(dca.rh, dca.rl)
            .put(dca.rg, dca.rk)
            .put(dca.rM, dca.rQ)
            .put(dca.rN, dca.rR)
            .put(dca.rP, dca.rT)
            .put(dca.rO, dca.rS)
            .put(dca.rU, dca.rY)
            .put(dca.rV, dca.rZ)
            .put(dca.rX, dca.sb)
            .put(dca.rW, dca.sa)
            .put(dca.sc, dca.sg)
            .put(dca.sd, dca.sh)
            .put(dca.se, dca.si)
            .put(dca.sf, dca.sj)
            .put(dca.sk, dca.so)
            .put(dca.sl, dca.sp)
            .put(dca.sm, dca.sq)
            .put(dca.sn, dca.sr)
            .build()
   );
   public static final Supplier<BiMap<dby, dby>> b = Suppliers.memoize(() -> a.get().inverse());

   public cqz(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cjt $$4 = $$0.o();
         crj $$5 = $$0.n();
         if ($$4 instanceof apt) {
            am.N.a((apt)$$4, $$2, $$5);
         }

         $$5.g(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dts.c, $$2, dts.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return boa.a($$1.B);
      }).orElse(boa.d);
   }

   public static Optional<doz> b(doz $$0) {
      return Optional.ofNullable((dby)a.get().get($$0.b())).map($$1 -> ((dby)$$1).l($$0));
   }

   @Override
   public boolean a(cyx $$0, dnp $$1, boolean $$2, cjt $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dnq $$0, cjt $$1) {
      return true;
   }
}
