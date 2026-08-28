import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class czp extends czu implements dba {
   public static final Supplier<BiMap<dnc, dnc>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dne.rE, dne.se)
            .put(dne.rF, dne.sg)
            .put(dne.rG, dne.sf)
            .put(dne.rH, dne.sh)
            .put(dne.rN, dne.sl)
            .put(dne.rM, dne.sk)
            .put(dne.rL, dne.sj)
            .put(dne.rK, dne.si)
            .put(dne.sd, dne.st)
            .put(dne.sc, dne.ss)
            .put(dne.sb, dne.sr)
            .put(dne.sa, dne.sq)
            .put(dne.rZ, dne.sp)
            .put(dne.rY, dne.so)
            .put(dne.rX, dne.sn)
            .put(dne.rW, dne.sm)
            .put(dne.rR, dne.rV)
            .put(dne.rQ, dne.rU)
            .put(dne.rP, dne.rT)
            .put(dne.rO, dne.rS)
            .put(dne.su, dne.sy)
            .put(dne.sv, dne.sz)
            .put(dne.sx, dne.sB)
            .put(dne.sw, dne.sA)
            .put(dne.sC, dne.sG)
            .put(dne.sD, dne.sH)
            .put(dne.sF, dne.sJ)
            .put(dne.sE, dne.sI)
            .put(dne.sK, dne.sO)
            .put(dne.sL, dne.sP)
            .put(dne.sM, dne.sQ)
            .put(dne.sN, dne.sR)
            .put(dne.sS, dne.sW)
            .put(dne.sT, dne.sX)
            .put(dne.sU, dne.sY)
            .put(dne.sV, dne.sZ)
            .build()
   );
   public static final Supplier<BiMap<dnc, dnc>> b = Suppliers.memoize(() -> a.get().inverse());

   public czp(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         crx $$4 = $$0.o();
         czy $$5 = $$0.n();
         if ($$4 instanceof art $$6) {
            aq.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ege.c, $$2, ege.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bur.a;
      }).orElse(bur.e);
   }

   public static Optional<ebe> a(ebe $$0) {
      return Optional.ofNullable((dnc)a.get().get($$0.b())).map($$1 -> ((dnc)$$1).m($$0));
   }

   @Override
   public boolean a(djx $$0, dzq $$1, boolean $$2, crx $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dzr $$0, crx $$1) {
      return true;
   }
}
