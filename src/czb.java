import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class czb extends czg implements dam {
   public static final Supplier<BiMap<dmm, dmm>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmo.rE, dmo.se)
            .put(dmo.rF, dmo.sg)
            .put(dmo.rG, dmo.sf)
            .put(dmo.rH, dmo.sh)
            .put(dmo.rN, dmo.sl)
            .put(dmo.rM, dmo.sk)
            .put(dmo.rL, dmo.sj)
            .put(dmo.rK, dmo.si)
            .put(dmo.sd, dmo.st)
            .put(dmo.sc, dmo.ss)
            .put(dmo.sb, dmo.sr)
            .put(dmo.sa, dmo.sq)
            .put(dmo.rZ, dmo.sp)
            .put(dmo.rY, dmo.so)
            .put(dmo.rX, dmo.sn)
            .put(dmo.rW, dmo.sm)
            .put(dmo.rR, dmo.rV)
            .put(dmo.rQ, dmo.rU)
            .put(dmo.rP, dmo.rT)
            .put(dmo.rO, dmo.rS)
            .put(dmo.su, dmo.sy)
            .put(dmo.sv, dmo.sz)
            .put(dmo.sx, dmo.sB)
            .put(dmo.sw, dmo.sA)
            .put(dmo.sC, dmo.sG)
            .put(dmo.sD, dmo.sH)
            .put(dmo.sF, dmo.sJ)
            .put(dmo.sE, dmo.sI)
            .put(dmo.sK, dmo.sO)
            .put(dmo.sL, dmo.sP)
            .put(dmo.sM, dmo.sQ)
            .put(dmo.sN, dmo.sR)
            .put(dmo.sS, dmo.sW)
            .put(dmo.sT, dmo.sX)
            .put(dmo.sU, dmo.sY)
            .put(dmo.sV, dmo.sZ)
            .build()
   );
   public static final Supplier<BiMap<dmm, dmm>> b = Suppliers.memoize(() -> a.get().inverse());

   public czb(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         crj $$4 = $$0.o();
         czk $$5 = $$0.n();
         if ($$4 instanceof arr $$6) {
            aq.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(efo.c, $$2, efo.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bug.a;
      }).orElse(bug.e);
   }

   public static Optional<eao> a(eao $$0) {
      return Optional.ofNullable((dmm)a.get().get($$0.b())).map($$1 -> ((dmm)$$1).m($$0));
   }

   @Override
   public boolean a(djh $$0, dza $$1, boolean $$2, crj $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ax_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dzb $$0, crj $$1) {
      return true;
   }
}
