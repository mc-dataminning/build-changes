import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cri extends crn implements csr {
   public static final Supplier<BiMap<dch, dch>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dcj.qW, dcj.rw)
            .put(dcj.qX, dcj.ry)
            .put(dcj.qY, dcj.rx)
            .put(dcj.qZ, dcj.rz)
            .put(dcj.rf, dcj.rD)
            .put(dcj.re, dcj.rC)
            .put(dcj.rd, dcj.rB)
            .put(dcj.rc, dcj.rA)
            .put(dcj.rv, dcj.rL)
            .put(dcj.ru, dcj.rK)
            .put(dcj.rt, dcj.rJ)
            .put(dcj.rs, dcj.rI)
            .put(dcj.rr, dcj.rH)
            .put(dcj.rq, dcj.rG)
            .put(dcj.rp, dcj.rF)
            .put(dcj.ro, dcj.rE)
            .put(dcj.rj, dcj.rn)
            .put(dcj.ri, dcj.rm)
            .put(dcj.rh, dcj.rl)
            .put(dcj.rg, dcj.rk)
            .put(dcj.rM, dcj.rQ)
            .put(dcj.rN, dcj.rR)
            .put(dcj.rP, dcj.rT)
            .put(dcj.rO, dcj.rS)
            .put(dcj.rU, dcj.rY)
            .put(dcj.rV, dcj.rZ)
            .put(dcj.rX, dcj.sb)
            .put(dcj.rW, dcj.sa)
            .put(dcj.sc, dcj.sg)
            .put(dcj.sd, dcj.sh)
            .put(dcj.se, dcj.si)
            .put(dcj.sf, dcj.sj)
            .put(dcj.sk, dcj.so)
            .put(dcj.sl, dcj.sp)
            .put(dcj.sm, dcj.sq)
            .put(dcj.sn, dcj.sr)
            .build()
   );
   public static final Supplier<BiMap<dch, dch>> b = Suppliers.memoize(() -> a.get().inverse());

   public cri(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         cka $$4 = $$0.o();
         crs $$5 = $$0.n();
         if ($$4 instanceof apv) {
            am.N.a((apv)$$4, $$2, $$5);
         }

         $$5.g(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dub.c, $$2, dub.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bof.a($$1.B);
      }).orElse(bof.d);
   }

   public static Optional<dpi> b(dpi $$0) {
      return Optional.ofNullable((dch)a.get().get($$0.b())).map($$1 -> ((dch)$$1).l($$0));
   }

   @Override
   public boolean a(czg $$0, dny $$1, boolean $$2, cka $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dnz $$0, cka $$1) {
      return true;
   }
}
