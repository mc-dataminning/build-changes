import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwf extends cwk implements cxs {
   public static final Supplier<BiMap<djl, djl>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djn.ry, djn.rY)
            .put(djn.rz, djn.sa)
            .put(djn.rA, djn.rZ)
            .put(djn.rB, djn.sb)
            .put(djn.rH, djn.sf)
            .put(djn.rG, djn.se)
            .put(djn.rF, djn.sd)
            .put(djn.rE, djn.sc)
            .put(djn.rX, djn.sn)
            .put(djn.rW, djn.sm)
            .put(djn.rV, djn.sl)
            .put(djn.rU, djn.sk)
            .put(djn.rT, djn.sj)
            .put(djn.rS, djn.si)
            .put(djn.rR, djn.sh)
            .put(djn.rQ, djn.sg)
            .put(djn.rL, djn.rP)
            .put(djn.rK, djn.rO)
            .put(djn.rJ, djn.rN)
            .put(djn.rI, djn.rM)
            .put(djn.so, djn.ss)
            .put(djn.sp, djn.st)
            .put(djn.sr, djn.sv)
            .put(djn.sq, djn.su)
            .put(djn.sw, djn.sA)
            .put(djn.sx, djn.sB)
            .put(djn.sz, djn.sD)
            .put(djn.sy, djn.sC)
            .put(djn.sE, djn.sI)
            .put(djn.sF, djn.sJ)
            .put(djn.sG, djn.sK)
            .put(djn.sH, djn.sL)
            .put(djn.sM, djn.sQ)
            .put(djn.sN, djn.sR)
            .put(djn.sO, djn.sS)
            .put(djn.sP, djn.sT)
            .build()
   );
   public static final Supplier<BiMap<djl, djl>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwf(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cow $$4 = $$0.o();
         cwo $$5 = $$0.n();
         if ($$4 instanceof are $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ebs.c, $$2, ebs.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsj.a;
      }).orElse(bsj.e);
   }

   public static Optional<dww> a(dww $$0) {
      return Optional.ofNullable((djl)a.get().get($$0.b())).map($$1 -> ((djl)$$1).m($$0));
   }

   @Override
   public boolean a(dgh $$0, dvl $$1, boolean $$2, cow $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dvm $$0, cow $$1) {
      return true;
   }
}
