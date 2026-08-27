import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class crt extends cry implements ctd {
   public static final Supplier<BiMap<dcv, dcv>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dcx.qW, dcx.rw)
            .put(dcx.qX, dcx.ry)
            .put(dcx.qY, dcx.rx)
            .put(dcx.qZ, dcx.rz)
            .put(dcx.rf, dcx.rD)
            .put(dcx.re, dcx.rC)
            .put(dcx.rd, dcx.rB)
            .put(dcx.rc, dcx.rA)
            .put(dcx.rv, dcx.rL)
            .put(dcx.ru, dcx.rK)
            .put(dcx.rt, dcx.rJ)
            .put(dcx.rs, dcx.rI)
            .put(dcx.rr, dcx.rH)
            .put(dcx.rq, dcx.rG)
            .put(dcx.rp, dcx.rF)
            .put(dcx.ro, dcx.rE)
            .put(dcx.rj, dcx.rn)
            .put(dcx.ri, dcx.rm)
            .put(dcx.rh, dcx.rl)
            .put(dcx.rg, dcx.rk)
            .put(dcx.rM, dcx.rQ)
            .put(dcx.rN, dcx.rR)
            .put(dcx.rP, dcx.rT)
            .put(dcx.rO, dcx.rS)
            .put(dcx.rU, dcx.rY)
            .put(dcx.rV, dcx.rZ)
            .put(dcx.rX, dcx.sb)
            .put(dcx.rW, dcx.sa)
            .put(dcx.sc, dcx.sg)
            .put(dcx.sd, dcx.sh)
            .put(dcx.se, dcx.si)
            .put(dcx.sf, dcx.sj)
            .put(dcx.sk, dcx.so)
            .put(dcx.sl, dcx.sp)
            .put(dcx.sm, dcx.sq)
            .put(dcx.sn, dcx.sr)
            .build()
   );
   public static final Supplier<BiMap<dcv, dcv>> b = Suppliers.memoize(() -> a.get().inverse());

   public crt(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         ckl $$4 = $$0.o();
         csd $$5 = $$0.n();
         if ($$4 instanceof aqf) {
            am.N.a((aqf)$$4, $$2, $$5);
         }

         $$5.g(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dur.c, $$2, dur.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return boq.a($$1.B);
      }).orElse(boq.d);
   }

   public static Optional<dpy> b(dpy $$0) {
      return Optional.ofNullable((dcv)a.get().get($$0.b())).map($$1 -> ((dcv)$$1).l($$0));
   }

   @Override
   public boolean a(czu $$0, don $$1, boolean $$2, ckl $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(doo $$0, ckl $$1) {
      return true;
   }
}
