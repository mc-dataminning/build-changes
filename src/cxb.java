import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cxb extends cxg implements cyo {
   public static final Supplier<BiMap<dke, dke>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkg.rr, dkg.rR)
            .put(dkg.rs, dkg.rT)
            .put(dkg.rt, dkg.rS)
            .put(dkg.ru, dkg.rU)
            .put(dkg.rA, dkg.rY)
            .put(dkg.rz, dkg.rX)
            .put(dkg.ry, dkg.rW)
            .put(dkg.rx, dkg.rV)
            .put(dkg.rQ, dkg.sg)
            .put(dkg.rP, dkg.sf)
            .put(dkg.rO, dkg.se)
            .put(dkg.rN, dkg.sd)
            .put(dkg.rM, dkg.sc)
            .put(dkg.rL, dkg.sb)
            .put(dkg.rK, dkg.sa)
            .put(dkg.rJ, dkg.rZ)
            .put(dkg.rE, dkg.rI)
            .put(dkg.rD, dkg.rH)
            .put(dkg.rC, dkg.rG)
            .put(dkg.rB, dkg.rF)
            .put(dkg.sh, dkg.sl)
            .put(dkg.si, dkg.sm)
            .put(dkg.sk, dkg.so)
            .put(dkg.sj, dkg.sn)
            .put(dkg.sp, dkg.st)
            .put(dkg.sq, dkg.su)
            .put(dkg.ss, dkg.sw)
            .put(dkg.sr, dkg.sv)
            .put(dkg.sx, dkg.sB)
            .put(dkg.sy, dkg.sC)
            .put(dkg.sz, dkg.sD)
            .put(dkg.sA, dkg.sE)
            .put(dkg.sF, dkg.sJ)
            .put(dkg.sG, dkg.sK)
            .put(dkg.sH, dkg.sL)
            .put(dkg.sI, dkg.sM)
            .build()
   );
   public static final Supplier<BiMap<dke, dke>> b = Suppliers.memoize(() -> a.get().inverse());

   public cxb(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cps $$4 = $$0.o();
         cxk $$5 = $$0.n();
         if ($$4 instanceof asi $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ecj.c, $$2, ecj.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bte.a;
      }).orElse(bte.e);
   }

   public static Optional<dxn> a(dxn $$0) {
      return Optional.ofNullable((dke)a.get().get($$0.b())).map($$1 -> ((dke)$$1).m($$0));
   }

   @Override
   public boolean a(dha $$0, dwc $$1, boolean $$2, cps $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dwd $$0, cps $$1) {
      return true;
   }
}
