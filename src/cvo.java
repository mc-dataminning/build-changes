import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cvo extends cvt implements cxb {
   public static final Supplier<BiMap<dhy, dhy>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dia.qW, dia.rw)
            .put(dia.qX, dia.ry)
            .put(dia.qY, dia.rx)
            .put(dia.qZ, dia.rz)
            .put(dia.rf, dia.rD)
            .put(dia.re, dia.rC)
            .put(dia.rd, dia.rB)
            .put(dia.rc, dia.rA)
            .put(dia.rv, dia.rL)
            .put(dia.ru, dia.rK)
            .put(dia.rt, dia.rJ)
            .put(dia.rs, dia.rI)
            .put(dia.rr, dia.rH)
            .put(dia.rq, dia.rG)
            .put(dia.rp, dia.rF)
            .put(dia.ro, dia.rE)
            .put(dia.rj, dia.rn)
            .put(dia.ri, dia.rm)
            .put(dia.rh, dia.rl)
            .put(dia.rg, dia.rk)
            .put(dia.rM, dia.rQ)
            .put(dia.rN, dia.rR)
            .put(dia.rP, dia.rT)
            .put(dia.rO, dia.rS)
            .put(dia.rU, dia.rY)
            .put(dia.rV, dia.rZ)
            .put(dia.rX, dia.sb)
            .put(dia.rW, dia.sa)
            .put(dia.sc, dia.sg)
            .put(dia.sd, dia.sh)
            .put(dia.se, dia.si)
            .put(dia.sf, dia.sj)
            .put(dia.sk, dia.so)
            .put(dia.sl, dia.sp)
            .put(dia.sm, dia.sq)
            .put(dia.sn, dia.sr)
            .build()
   );
   public static final Supplier<BiMap<dhy, dhy>> b = Suppliers.memoize(() -> a.get().inverse());

   public cvo(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         coh $$4 = $$0.o();
         cvx $$5 = $$0.n();
         if ($$4 instanceof arn $$6) {
            an.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eaa.c, $$2, eaa.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bry.a;
      }).orElse(bry.e);
   }

   public static Optional<dvd> a(dvd $$0) {
      return Optional.ofNullable((dhy)a.get().get($$0.b())).map($$1 -> ((dhy)$$1).m($$0));
   }

   @Override
   public boolean a(dev $$0, dts $$1, boolean $$2, coh $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aC_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dtt $$0, coh $$1) {
      return true;
   }
}
