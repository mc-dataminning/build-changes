import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ctg extends ctl implements cus {
   public static final Supplier<BiMap<dea, dea>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dec.qW, dec.rw)
            .put(dec.qX, dec.ry)
            .put(dec.qY, dec.rx)
            .put(dec.qZ, dec.rz)
            .put(dec.rf, dec.rD)
            .put(dec.re, dec.rC)
            .put(dec.rd, dec.rB)
            .put(dec.rc, dec.rA)
            .put(dec.rv, dec.rL)
            .put(dec.ru, dec.rK)
            .put(dec.rt, dec.rJ)
            .put(dec.rs, dec.rI)
            .put(dec.rr, dec.rH)
            .put(dec.rq, dec.rG)
            .put(dec.rp, dec.rF)
            .put(dec.ro, dec.rE)
            .put(dec.rj, dec.rn)
            .put(dec.ri, dec.rm)
            .put(dec.rh, dec.rl)
            .put(dec.rg, dec.rk)
            .put(dec.rM, dec.rQ)
            .put(dec.rN, dec.rR)
            .put(dec.rP, dec.rT)
            .put(dec.rO, dec.rS)
            .put(dec.rU, dec.rY)
            .put(dec.rV, dec.rZ)
            .put(dec.rX, dec.sb)
            .put(dec.rW, dec.sa)
            .put(dec.sc, dec.sg)
            .put(dec.sd, dec.sh)
            .put(dec.se, dec.si)
            .put(dec.sf, dec.sj)
            .put(dec.sk, dec.so)
            .put(dec.sl, dec.sp)
            .put(dec.sm, dec.sq)
            .put(dec.sn, dec.sr)
            .build()
   );
   public static final Supplier<BiMap<dea, dea>> b = Suppliers.memoize(() -> a.get().inverse());

   public ctg(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cly $$4 = $$0.o();
         ctq $$5 = $$0.n();
         if ($$4 instanceof aqo) {
            am.N.a((aqo)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dvw.c, $$2, dvw.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bpw.a($$1.B);
      }).orElse(bpw.d);
   }

   public static Optional<drd> a(drd $$0) {
      return Optional.ofNullable((dea)a.get().get($$0.b())).map($$1 -> ((dea)$$1).l($$0));
   }

   @Override
   public boolean a(daz $$0, dps $$1, boolean $$2, cly $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dpt $$0, cly $$1) {
      return true;
   }
}
