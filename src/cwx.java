import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwx extends cxc implements cyk {
   public static final Supplier<BiMap<dkd, dkd>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkf.ry, dkf.rY)
            .put(dkf.rz, dkf.sa)
            .put(dkf.rA, dkf.rZ)
            .put(dkf.rB, dkf.sb)
            .put(dkf.rH, dkf.sf)
            .put(dkf.rG, dkf.se)
            .put(dkf.rF, dkf.sd)
            .put(dkf.rE, dkf.sc)
            .put(dkf.rX, dkf.sn)
            .put(dkf.rW, dkf.sm)
            .put(dkf.rV, dkf.sl)
            .put(dkf.rU, dkf.sk)
            .put(dkf.rT, dkf.sj)
            .put(dkf.rS, dkf.si)
            .put(dkf.rR, dkf.sh)
            .put(dkf.rQ, dkf.sg)
            .put(dkf.rL, dkf.rP)
            .put(dkf.rK, dkf.rO)
            .put(dkf.rJ, dkf.rN)
            .put(dkf.rI, dkf.rM)
            .put(dkf.so, dkf.ss)
            .put(dkf.sp, dkf.st)
            .put(dkf.sr, dkf.sv)
            .put(dkf.sq, dkf.su)
            .put(dkf.sw, dkf.sA)
            .put(dkf.sx, dkf.sB)
            .put(dkf.sz, dkf.sD)
            .put(dkf.sy, dkf.sC)
            .put(dkf.sE, dkf.sI)
            .put(dkf.sF, dkf.sJ)
            .put(dkf.sG, dkf.sK)
            .put(dkf.sH, dkf.sL)
            .put(dkf.sM, dkf.sQ)
            .put(dkf.sN, dkf.sR)
            .put(dkf.sO, dkf.sS)
            .put(dkf.sP, dkf.sT)
            .build()
   );
   public static final Supplier<BiMap<dkd, dkd>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwx(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cpo $$4 = $$0.o();
         cxg $$5 = $$0.n();
         if ($$4 instanceof ary $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eck.c, $$2, eck.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bta.a;
      }).orElse(bta.e);
   }

   public static Optional<dxo> a(dxo $$0) {
      return Optional.ofNullable((dkd)a.get().get($$0.b())).map($$1 -> ((dkd)$$1).m($$0));
   }

   @Override
   public boolean a(dgz $$0, dwd $$1, boolean $$2, cpo $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dwe $$0, cpo $$1) {
      return true;
   }
}
