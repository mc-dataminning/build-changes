import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cyp extends cyu implements daa {
   public static final Supplier<BiMap<dma, dma>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmc.rB, dmc.sb)
            .put(dmc.rC, dmc.sd)
            .put(dmc.rD, dmc.sc)
            .put(dmc.rE, dmc.se)
            .put(dmc.rK, dmc.si)
            .put(dmc.rJ, dmc.sh)
            .put(dmc.rI, dmc.sg)
            .put(dmc.rH, dmc.sf)
            .put(dmc.sa, dmc.sq)
            .put(dmc.rZ, dmc.sp)
            .put(dmc.rY, dmc.so)
            .put(dmc.rX, dmc.sn)
            .put(dmc.rW, dmc.sm)
            .put(dmc.rV, dmc.sl)
            .put(dmc.rU, dmc.sk)
            .put(dmc.rT, dmc.sj)
            .put(dmc.rO, dmc.rS)
            .put(dmc.rN, dmc.rR)
            .put(dmc.rM, dmc.rQ)
            .put(dmc.rL, dmc.rP)
            .put(dmc.sr, dmc.sv)
            .put(dmc.ss, dmc.sw)
            .put(dmc.su, dmc.sy)
            .put(dmc.st, dmc.sx)
            .put(dmc.sz, dmc.sD)
            .put(dmc.sA, dmc.sE)
            .put(dmc.sC, dmc.sG)
            .put(dmc.sB, dmc.sF)
            .put(dmc.sH, dmc.sL)
            .put(dmc.sI, dmc.sM)
            .put(dmc.sJ, dmc.sN)
            .put(dmc.sK, dmc.sO)
            .put(dmc.sP, dmc.sT)
            .put(dmc.sQ, dmc.sU)
            .put(dmc.sR, dmc.sV)
            .put(dmc.sS, dmc.sW)
            .build()
   );
   public static final Supplier<BiMap<dma, dma>> b = Suppliers.memoize(() -> a.get().inverse());

   public cyp(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cqy $$4 = $$0.o();
         cyy $$5 = $$0.n();
         if ($$4 instanceof arr $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eez.c, $$2, eez.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bub.a;
      }).orElse(bub.e);
   }

   public static Optional<dzz> a(dzz $$0) {
      return Optional.ofNullable((dma)a.get().get($$0.b())).map($$1 -> ((dma)$$1).m($$0));
   }

   @Override
   public boolean a(div $$0, dyl $$1, boolean $$2, cqy $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aw_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dym $$0, cqy $$1) {
      return true;
   }
}
