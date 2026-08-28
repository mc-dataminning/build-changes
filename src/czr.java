import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class czr extends czw implements dbc {
   public static final Supplier<BiMap<dne, dne>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dng.rE, dng.se)
            .put(dng.rF, dng.sg)
            .put(dng.rG, dng.sf)
            .put(dng.rH, dng.sh)
            .put(dng.rN, dng.sl)
            .put(dng.rM, dng.sk)
            .put(dng.rL, dng.sj)
            .put(dng.rK, dng.si)
            .put(dng.sd, dng.st)
            .put(dng.sc, dng.ss)
            .put(dng.sb, dng.sr)
            .put(dng.sa, dng.sq)
            .put(dng.rZ, dng.sp)
            .put(dng.rY, dng.so)
            .put(dng.rX, dng.sn)
            .put(dng.rW, dng.sm)
            .put(dng.rR, dng.rV)
            .put(dng.rQ, dng.rU)
            .put(dng.rP, dng.rT)
            .put(dng.rO, dng.rS)
            .put(dng.su, dng.sy)
            .put(dng.sv, dng.sz)
            .put(dng.sx, dng.sB)
            .put(dng.sw, dng.sA)
            .put(dng.sC, dng.sG)
            .put(dng.sD, dng.sH)
            .put(dng.sF, dng.sJ)
            .put(dng.sE, dng.sI)
            .put(dng.sK, dng.sO)
            .put(dng.sL, dng.sP)
            .put(dng.sM, dng.sQ)
            .put(dng.sN, dng.sR)
            .put(dng.sS, dng.sW)
            .put(dng.sT, dng.sX)
            .put(dng.sU, dng.sY)
            .put(dng.sV, dng.sZ)
            .build()
   );
   public static final Supplier<BiMap<dne, dne>> b = Suppliers.memoize(() -> a.get().inverse());

   public czr(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         crz $$4 = $$0.o();
         daa $$5 = $$0.n();
         if ($$4 instanceof arv $$6) {
            aq.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(egg.c, $$2, egg.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return but.a;
      }).orElse(but.e);
   }

   public static Optional<ebg> a(ebg $$0) {
      return Optional.ofNullable((dne)a.get().get($$0.b())).map($$1 -> ((dne)$$1).m($$0));
   }

   @Override
   public boolean a(djz $$0, dzs $$1, boolean $$2, crz $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dzt $$0, crz $$1) {
      return true;
   }
}
