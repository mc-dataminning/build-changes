import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwy extends cxd implements cyk {
   public static final Supplier<BiMap<dke, dke>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkg.ry, dkg.rY)
            .put(dkg.rz, dkg.sa)
            .put(dkg.rA, dkg.rZ)
            .put(dkg.rB, dkg.sb)
            .put(dkg.rH, dkg.sf)
            .put(dkg.rG, dkg.se)
            .put(dkg.rF, dkg.sd)
            .put(dkg.rE, dkg.sc)
            .put(dkg.rX, dkg.sn)
            .put(dkg.rW, dkg.sm)
            .put(dkg.rV, dkg.sl)
            .put(dkg.rU, dkg.sk)
            .put(dkg.rT, dkg.sj)
            .put(dkg.rS, dkg.si)
            .put(dkg.rR, dkg.sh)
            .put(dkg.rQ, dkg.sg)
            .put(dkg.rL, dkg.rP)
            .put(dkg.rK, dkg.rO)
            .put(dkg.rJ, dkg.rN)
            .put(dkg.rI, dkg.rM)
            .put(dkg.so, dkg.ss)
            .put(dkg.sp, dkg.st)
            .put(dkg.sr, dkg.sv)
            .put(dkg.sq, dkg.su)
            .put(dkg.sw, dkg.sA)
            .put(dkg.sx, dkg.sB)
            .put(dkg.sz, dkg.sD)
            .put(dkg.sy, dkg.sC)
            .put(dkg.sE, dkg.sI)
            .put(dkg.sF, dkg.sJ)
            .put(dkg.sG, dkg.sK)
            .put(dkg.sH, dkg.sL)
            .put(dkg.sM, dkg.sQ)
            .put(dkg.sN, dkg.sR)
            .put(dkg.sO, dkg.sS)
            .put(dkg.sP, dkg.sT)
            .build()
   );
   public static final Supplier<BiMap<dke, dke>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwy(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cpr $$4 = $$0.o();
         cxh $$5 = $$0.n();
         if ($$4 instanceof are $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ecp.c, $$2, ecp.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsy.a;
      }).orElse(bsy.e);
   }

   public static Optional<dxq> a(dxq $$0) {
      return Optional.ofNullable((dke)a.get().get($$0.b())).map($$1 -> ((dke)$$1).m($$0));
   }

   @Override
   public boolean a(dgz $$0, dwf $$1, boolean $$2, cpr $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dwg $$0, cpr $$1) {
      return true;
   }
}
