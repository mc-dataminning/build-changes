import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwg extends cwl implements cxt {
   public static final Supplier<BiMap<djm, djm>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djo.ry, djo.rY)
            .put(djo.rz, djo.sa)
            .put(djo.rA, djo.rZ)
            .put(djo.rB, djo.sb)
            .put(djo.rH, djo.sf)
            .put(djo.rG, djo.se)
            .put(djo.rF, djo.sd)
            .put(djo.rE, djo.sc)
            .put(djo.rX, djo.sn)
            .put(djo.rW, djo.sm)
            .put(djo.rV, djo.sl)
            .put(djo.rU, djo.sk)
            .put(djo.rT, djo.sj)
            .put(djo.rS, djo.si)
            .put(djo.rR, djo.sh)
            .put(djo.rQ, djo.sg)
            .put(djo.rL, djo.rP)
            .put(djo.rK, djo.rO)
            .put(djo.rJ, djo.rN)
            .put(djo.rI, djo.rM)
            .put(djo.so, djo.ss)
            .put(djo.sp, djo.st)
            .put(djo.sr, djo.sv)
            .put(djo.sq, djo.su)
            .put(djo.sw, djo.sA)
            .put(djo.sx, djo.sB)
            .put(djo.sz, djo.sD)
            .put(djo.sy, djo.sC)
            .put(djo.sE, djo.sI)
            .put(djo.sF, djo.sJ)
            .put(djo.sG, djo.sK)
            .put(djo.sH, djo.sL)
            .put(djo.sM, djo.sQ)
            .put(djo.sN, djo.sR)
            .put(djo.sO, djo.sS)
            .put(djo.sP, djo.sT)
            .build()
   );
   public static final Supplier<BiMap<djm, djm>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwg(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cox $$4 = $$0.o();
         cwp $$5 = $$0.n();
         if ($$4 instanceof ard $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ebt.c, $$2, ebt.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsj.a;
      }).orElse(bsj.e);
   }

   public static Optional<dwx> a(dwx $$0) {
      return Optional.ofNullable((djm)a.get().get($$0.b())).map($$1 -> ((djm)$$1).m($$0));
   }

   @Override
   public boolean a(dgi $$0, dvm $$1, boolean $$2, cox $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dvn $$0, cox $$1) {
      return true;
   }
}
