import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwe extends cwj implements cxr {
   public static final Supplier<BiMap<djk, djk>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djm.ry, djm.rY)
            .put(djm.rz, djm.sa)
            .put(djm.rA, djm.rZ)
            .put(djm.rB, djm.sb)
            .put(djm.rH, djm.sf)
            .put(djm.rG, djm.se)
            .put(djm.rF, djm.sd)
            .put(djm.rE, djm.sc)
            .put(djm.rX, djm.sn)
            .put(djm.rW, djm.sm)
            .put(djm.rV, djm.sl)
            .put(djm.rU, djm.sk)
            .put(djm.rT, djm.sj)
            .put(djm.rS, djm.si)
            .put(djm.rR, djm.sh)
            .put(djm.rQ, djm.sg)
            .put(djm.rL, djm.rP)
            .put(djm.rK, djm.rO)
            .put(djm.rJ, djm.rN)
            .put(djm.rI, djm.rM)
            .put(djm.so, djm.ss)
            .put(djm.sp, djm.st)
            .put(djm.sr, djm.sv)
            .put(djm.sq, djm.su)
            .put(djm.sw, djm.sA)
            .put(djm.sx, djm.sB)
            .put(djm.sz, djm.sD)
            .put(djm.sy, djm.sC)
            .put(djm.sE, djm.sI)
            .put(djm.sF, djm.sJ)
            .put(djm.sG, djm.sK)
            .put(djm.sH, djm.sL)
            .put(djm.sM, djm.sQ)
            .put(djm.sN, djm.sR)
            .put(djm.sO, djm.sS)
            .put(djm.sP, djm.sT)
            .build()
   );
   public static final Supplier<BiMap<djk, djk>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwe(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cov $$4 = $$0.o();
         cwn $$5 = $$0.n();
         if ($$4 instanceof ard $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ebr.c, $$2, ebr.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsi.a;
      }).orElse(bsi.e);
   }

   public static Optional<dwv> a(dwv $$0) {
      return Optional.ofNullable((djk)a.get().get($$0.b())).map($$1 -> ((djk)$$1).m($$0));
   }

   @Override
   public boolean a(dgg $$0, dvk $$1, boolean $$2, cov $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dvl $$0, cov $$1) {
      return true;
   }
}
