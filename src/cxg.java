import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cxg extends cxl implements cyt {
   public static final Supplier<BiMap<dkm, dkm>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dko.rr, dko.rR)
            .put(dko.rs, dko.rT)
            .put(dko.rt, dko.rS)
            .put(dko.ru, dko.rU)
            .put(dko.rA, dko.rY)
            .put(dko.rz, dko.rX)
            .put(dko.ry, dko.rW)
            .put(dko.rx, dko.rV)
            .put(dko.rQ, dko.sg)
            .put(dko.rP, dko.sf)
            .put(dko.rO, dko.se)
            .put(dko.rN, dko.sd)
            .put(dko.rM, dko.sc)
            .put(dko.rL, dko.sb)
            .put(dko.rK, dko.sa)
            .put(dko.rJ, dko.rZ)
            .put(dko.rE, dko.rI)
            .put(dko.rD, dko.rH)
            .put(dko.rC, dko.rG)
            .put(dko.rB, dko.rF)
            .put(dko.sh, dko.sl)
            .put(dko.si, dko.sm)
            .put(dko.sk, dko.so)
            .put(dko.sj, dko.sn)
            .put(dko.sp, dko.st)
            .put(dko.sq, dko.su)
            .put(dko.ss, dko.sw)
            .put(dko.sr, dko.sv)
            .put(dko.sx, dko.sB)
            .put(dko.sy, dko.sC)
            .put(dko.sz, dko.sD)
            .put(dko.sA, dko.sE)
            .put(dko.sF, dko.sJ)
            .put(dko.sG, dko.sK)
            .put(dko.sH, dko.sL)
            .put(dko.sI, dko.sM)
            .build()
   );
   public static final Supplier<BiMap<dkm, dkm>> b = Suppliers.memoize(() -> a.get().inverse());

   public cxg(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cpx $$4 = $$0.o();
         cxp $$5 = $$0.n();
         if ($$4 instanceof asi $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ecr.c, $$2, ecr.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return btj.a;
      }).orElse(btj.e);
   }

   public static Optional<dxv> a(dxv $$0) {
      return Optional.ofNullable((dkm)a.get().get($$0.b())).map($$1 -> ((dkm)$$1).m($$0));
   }

   @Override
   public boolean a(dhi $$0, dwk $$1, boolean $$2, cpx $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dwl $$0, cpx $$1) {
      return true;
   }
}
