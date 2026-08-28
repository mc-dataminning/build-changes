import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cze extends czj implements dap {
   public static final Supplier<BiMap<dmr, dmr>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmt.rE, dmt.se)
            .put(dmt.rF, dmt.sg)
            .put(dmt.rG, dmt.sf)
            .put(dmt.rH, dmt.sh)
            .put(dmt.rN, dmt.sl)
            .put(dmt.rM, dmt.sk)
            .put(dmt.rL, dmt.sj)
            .put(dmt.rK, dmt.si)
            .put(dmt.sd, dmt.st)
            .put(dmt.sc, dmt.ss)
            .put(dmt.sb, dmt.sr)
            .put(dmt.sa, dmt.sq)
            .put(dmt.rZ, dmt.sp)
            .put(dmt.rY, dmt.so)
            .put(dmt.rX, dmt.sn)
            .put(dmt.rW, dmt.sm)
            .put(dmt.rR, dmt.rV)
            .put(dmt.rQ, dmt.rU)
            .put(dmt.rP, dmt.rT)
            .put(dmt.rO, dmt.rS)
            .put(dmt.su, dmt.sy)
            .put(dmt.sv, dmt.sz)
            .put(dmt.sx, dmt.sB)
            .put(dmt.sw, dmt.sA)
            .put(dmt.sC, dmt.sG)
            .put(dmt.sD, dmt.sH)
            .put(dmt.sF, dmt.sJ)
            .put(dmt.sE, dmt.sI)
            .put(dmt.sK, dmt.sO)
            .put(dmt.sL, dmt.sP)
            .put(dmt.sM, dmt.sQ)
            .put(dmt.sN, dmt.sR)
            .put(dmt.sS, dmt.sW)
            .put(dmt.sT, dmt.sX)
            .put(dmt.sU, dmt.sY)
            .put(dmt.sV, dmt.sZ)
            .build()
   );
   public static final Supplier<BiMap<dmr, dmr>> b = Suppliers.memoize(() -> a.get().inverse());

   public cze(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         crm $$4 = $$0.o();
         czn $$5 = $$0.n();
         if ($$4 instanceof arr $$6) {
            aq.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eft.c, $$2, eft.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bug.a;
      }).orElse(bug.e);
   }

   public static Optional<eat> a(eat $$0) {
      return Optional.ofNullable((dmr)a.get().get($$0.b())).map($$1 -> ((dmr)$$1).m($$0));
   }

   @Override
   public boolean a(djm $$0, dzf $$1, boolean $$2, crm $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ax_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dzg $$0, crm $$1) {
      return true;
   }
}
