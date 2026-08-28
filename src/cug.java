import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cug extends cul implements cvv {
   public static final Supplier<BiMap<dfy, dfy>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dga.qW, dga.rw)
            .put(dga.qX, dga.ry)
            .put(dga.qY, dga.rx)
            .put(dga.qZ, dga.rz)
            .put(dga.rf, dga.rD)
            .put(dga.re, dga.rC)
            .put(dga.rd, dga.rB)
            .put(dga.rc, dga.rA)
            .put(dga.rv, dga.rL)
            .put(dga.ru, dga.rK)
            .put(dga.rt, dga.rJ)
            .put(dga.rs, dga.rI)
            .put(dga.rr, dga.rH)
            .put(dga.rq, dga.rG)
            .put(dga.rp, dga.rF)
            .put(dga.ro, dga.rE)
            .put(dga.rj, dga.rn)
            .put(dga.ri, dga.rm)
            .put(dga.rh, dga.rl)
            .put(dga.rg, dga.rk)
            .put(dga.rM, dga.rQ)
            .put(dga.rN, dga.rR)
            .put(dga.rP, dga.rT)
            .put(dga.rO, dga.rS)
            .put(dga.rU, dga.rY)
            .put(dga.rV, dga.rZ)
            .put(dga.rX, dga.sb)
            .put(dga.rW, dga.sa)
            .put(dga.sc, dga.sg)
            .put(dga.sd, dga.sh)
            .put(dga.se, dga.si)
            .put(dga.sf, dga.sj)
            .put(dga.sk, dga.so)
            .put(dga.sl, dga.sp)
            .put(dga.sm, dga.sq)
            .put(dga.sn, dga.sr)
            .build()
   );
   public static final Supplier<BiMap<dfy, dfy>> b = Suppliers.memoize(() -> a.get().inverse());

   public cug(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmx $$4 = $$0.o();
         cuq $$5 = $$0.n();
         if ($$4 instanceof aqv) {
            an.N.a((aqv)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dxz.c, $$2, dxz.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqr.a($$1.B);
      }).orElse(bqr.e);
   }

   public static Optional<dtc> a(dtc $$0) {
      return Optional.ofNullable((dfy)a.get().get($$0.b())).map($$1 -> ((dfy)$$1).l($$0));
   }

   @Override
   public boolean a(dcw $$0, drs $$1, boolean $$2, cmx $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aD_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(drt $$0, cmx $$1) {
      return true;
   }
}
