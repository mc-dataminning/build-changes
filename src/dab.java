import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class dab extends dag implements dbm {
   public static final Supplier<BiMap<dno, dno>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dnq.rE, dnq.se)
            .put(dnq.rF, dnq.sg)
            .put(dnq.rG, dnq.sf)
            .put(dnq.rH, dnq.sh)
            .put(dnq.rN, dnq.sl)
            .put(dnq.rM, dnq.sk)
            .put(dnq.rL, dnq.sj)
            .put(dnq.rK, dnq.si)
            .put(dnq.sd, dnq.st)
            .put(dnq.sc, dnq.ss)
            .put(dnq.sb, dnq.sr)
            .put(dnq.sa, dnq.sq)
            .put(dnq.rZ, dnq.sp)
            .put(dnq.rY, dnq.so)
            .put(dnq.rX, dnq.sn)
            .put(dnq.rW, dnq.sm)
            .put(dnq.rR, dnq.rV)
            .put(dnq.rQ, dnq.rU)
            .put(dnq.rP, dnq.rT)
            .put(dnq.rO, dnq.rS)
            .put(dnq.su, dnq.sy)
            .put(dnq.sv, dnq.sz)
            .put(dnq.sx, dnq.sB)
            .put(dnq.sw, dnq.sA)
            .put(dnq.sC, dnq.sG)
            .put(dnq.sD, dnq.sH)
            .put(dnq.sF, dnq.sJ)
            .put(dnq.sE, dnq.sI)
            .put(dnq.sK, dnq.sO)
            .put(dnq.sL, dnq.sP)
            .put(dnq.sM, dnq.sQ)
            .put(dnq.sN, dnq.sR)
            .put(dnq.sS, dnq.sW)
            .put(dnq.sT, dnq.sX)
            .put(dnq.sU, dnq.sY)
            .put(dnq.sV, dnq.sZ)
            .build()
   );
   public static final Supplier<BiMap<dno, dno>> b = Suppliers.memoize(() -> a.get().inverse());

   public dab(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         csi $$4 = $$0.o();
         dak $$5 = $$0.n();
         if ($$4 instanceof asc $$6) {
            aq.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(egq.c, $$2, egq.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bvc.a;
      }).orElse(bvc.e);
   }

   public static Optional<ebq> a(ebq $$0) {
      return Optional.ofNullable((dno)a.get().get($$0.b())).map($$1 -> ((dno)$$1).m($$0));
   }

   @Override
   public boolean a(dkj $$0, eac $$1, boolean $$2, csi $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aC_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(ead $$0, csi $$1) {
      return true;
   }
}
