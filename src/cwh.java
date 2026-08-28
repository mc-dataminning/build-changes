import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwh extends cwm implements cxu {
   public static final Supplier<BiMap<djn, djn>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djp.ry, djp.rY)
            .put(djp.rz, djp.sa)
            .put(djp.rA, djp.rZ)
            .put(djp.rB, djp.sb)
            .put(djp.rH, djp.sf)
            .put(djp.rG, djp.se)
            .put(djp.rF, djp.sd)
            .put(djp.rE, djp.sc)
            .put(djp.rX, djp.sn)
            .put(djp.rW, djp.sm)
            .put(djp.rV, djp.sl)
            .put(djp.rU, djp.sk)
            .put(djp.rT, djp.sj)
            .put(djp.rS, djp.si)
            .put(djp.rR, djp.sh)
            .put(djp.rQ, djp.sg)
            .put(djp.rL, djp.rP)
            .put(djp.rK, djp.rO)
            .put(djp.rJ, djp.rN)
            .put(djp.rI, djp.rM)
            .put(djp.so, djp.ss)
            .put(djp.sp, djp.st)
            .put(djp.sr, djp.sv)
            .put(djp.sq, djp.su)
            .put(djp.sw, djp.sA)
            .put(djp.sx, djp.sB)
            .put(djp.sz, djp.sD)
            .put(djp.sy, djp.sC)
            .put(djp.sE, djp.sI)
            .put(djp.sF, djp.sJ)
            .put(djp.sG, djp.sK)
            .put(djp.sH, djp.sL)
            .put(djp.sM, djp.sQ)
            .put(djp.sN, djp.sR)
            .put(djp.sO, djp.sS)
            .put(djp.sP, djp.sT)
            .build()
   );
   public static final Supplier<BiMap<djn, djn>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwh(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         coy $$4 = $$0.o();
         cwq $$5 = $$0.n();
         if ($$4 instanceof are $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ebu.c, $$2, ebu.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsl.a;
      }).orElse(bsl.e);
   }

   public static Optional<dwy> a(dwy $$0) {
      return Optional.ofNullable((djn)a.get().get($$0.b())).map($$1 -> ((djn)$$1).m($$0));
   }

   @Override
   public boolean a(dgj $$0, dvn $$1, boolean $$2, coy $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dvo $$0, coy $$1) {
      return true;
   }
}
