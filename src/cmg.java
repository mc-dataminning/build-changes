import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cmg extends cmm implements cnq {
   public static final Supplier<BiMap<cwj, cwj>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cwl.qW, cwl.rw)
            .put(cwl.qX, cwl.ry)
            .put(cwl.qY, cwl.rx)
            .put(cwl.qZ, cwl.rz)
            .put(cwl.rf, cwl.rD)
            .put(cwl.re, cwl.rC)
            .put(cwl.rd, cwl.rB)
            .put(cwl.rc, cwl.rA)
            .put(cwl.rv, cwl.rL)
            .put(cwl.ru, cwl.rK)
            .put(cwl.rt, cwl.rJ)
            .put(cwl.rs, cwl.rI)
            .put(cwl.rr, cwl.rH)
            .put(cwl.rq, cwl.rG)
            .put(cwl.rp, cwl.rF)
            .put(cwl.ro, cwl.rE)
            .put(cwl.rj, cwl.rn)
            .put(cwl.ri, cwl.rm)
            .put(cwl.rh, cwl.rl)
            .put(cwl.rg, cwl.rk)
            .put(cwl.rM, cwl.rQ)
            .put(cwl.rN, cwl.rR)
            .put(cwl.rP, cwl.rT)
            .put(cwl.rO, cwl.rS)
            .put(cwl.rU, cwl.rY)
            .put(cwl.rV, cwl.rZ)
            .put(cwl.rX, cwl.sb)
            .put(cwl.rW, cwl.sa)
            .put(cwl.sc, cwl.sg)
            .put(cwl.sd, cwl.sh)
            .put(cwl.se, cwl.si)
            .put(cwl.sf, cwl.sj)
            .put(cwl.sk, cwl.so)
            .put(cwl.sl, cwl.sp)
            .put(cwl.sm, cwl.sq)
            .put(cwl.sn, cwl.sr)
            .build()
   );
   public static final Supplier<BiMap<cwj, cwj>> b = Suppliers.memoize(() -> a.get().inverse());

   public cmg(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cfb $$4 = $$0.o();
         cmr $$5 = $$0.n();
         if ($$4 instanceof ana) {
            am.N.a((ana)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dnk.c, $$2, dnk.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bjv.a($$1.B);
      }).orElse(bjv.d);
   }

   public static Optional<dja> b(dja $$0) {
      return Optional.ofNullable((cwj)a.get().get($$0.b())).map($$1 -> ((cwj)$$1).l($$0));
   }

   @Override
   public boolean a(cti $$0, dhx $$1, boolean $$2, cfb $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dhy $$0, cfb $$1) {
      return true;
   }
}
