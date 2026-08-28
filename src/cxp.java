import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cxp extends cxu implements cza {
   public static final Supplier<BiMap<dku, dku>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkw.rA, dkw.sa)
            .put(dkw.rB, dkw.sc)
            .put(dkw.rC, dkw.sb)
            .put(dkw.rD, dkw.sd)
            .put(dkw.rJ, dkw.sh)
            .put(dkw.rI, dkw.sg)
            .put(dkw.rH, dkw.sf)
            .put(dkw.rG, dkw.se)
            .put(dkw.rZ, dkw.sp)
            .put(dkw.rY, dkw.so)
            .put(dkw.rX, dkw.sn)
            .put(dkw.rW, dkw.sm)
            .put(dkw.rV, dkw.sl)
            .put(dkw.rU, dkw.sk)
            .put(dkw.rT, dkw.sj)
            .put(dkw.rS, dkw.si)
            .put(dkw.rN, dkw.rR)
            .put(dkw.rM, dkw.rQ)
            .put(dkw.rL, dkw.rP)
            .put(dkw.rK, dkw.rO)
            .put(dkw.sq, dkw.su)
            .put(dkw.sr, dkw.sv)
            .put(dkw.st, dkw.sx)
            .put(dkw.ss, dkw.sw)
            .put(dkw.sy, dkw.sC)
            .put(dkw.sz, dkw.sD)
            .put(dkw.sB, dkw.sF)
            .put(dkw.sA, dkw.sE)
            .put(dkw.sG, dkw.sK)
            .put(dkw.sH, dkw.sL)
            .put(dkw.sI, dkw.sM)
            .put(dkw.sJ, dkw.sN)
            .put(dkw.sO, dkw.sS)
            .put(dkw.sP, dkw.sT)
            .put(dkw.sQ, dkw.sU)
            .put(dkw.sR, dkw.sV)
            .build()
   );
   public static final Supplier<BiMap<dku, dku>> b = Suppliers.memoize(() -> a.get().inverse());

   public cxp(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cqi $$4 = $$0.o();
         cxy $$5 = $$0.n();
         if ($$4 instanceof aro $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(edm.c, $$2, edm.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return btq.a;
      }).orElse(btq.e);
   }

   public static Optional<dym> a(dym $$0) {
      return Optional.ofNullable((dku)a.get().get($$0.b())).map($$1 -> ((dku)$$1).m($$0));
   }

   @Override
   public boolean a(dhp $$0, dwz $$1, boolean $$2, cqi $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aw_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dxa $$0, cqi $$1) {
      return true;
   }
}
