import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cyu extends cyz implements daf {
   public static final Supplier<BiMap<dmf, dmf>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmh.rE, dmh.se)
            .put(dmh.rF, dmh.sg)
            .put(dmh.rG, dmh.sf)
            .put(dmh.rH, dmh.sh)
            .put(dmh.rN, dmh.sl)
            .put(dmh.rM, dmh.sk)
            .put(dmh.rL, dmh.sj)
            .put(dmh.rK, dmh.si)
            .put(dmh.sd, dmh.st)
            .put(dmh.sc, dmh.ss)
            .put(dmh.sb, dmh.sr)
            .put(dmh.sa, dmh.sq)
            .put(dmh.rZ, dmh.sp)
            .put(dmh.rY, dmh.so)
            .put(dmh.rX, dmh.sn)
            .put(dmh.rW, dmh.sm)
            .put(dmh.rR, dmh.rV)
            .put(dmh.rQ, dmh.rU)
            .put(dmh.rP, dmh.rT)
            .put(dmh.rO, dmh.rS)
            .put(dmh.su, dmh.sy)
            .put(dmh.sv, dmh.sz)
            .put(dmh.sx, dmh.sB)
            .put(dmh.sw, dmh.sA)
            .put(dmh.sC, dmh.sG)
            .put(dmh.sD, dmh.sH)
            .put(dmh.sF, dmh.sJ)
            .put(dmh.sE, dmh.sI)
            .put(dmh.sK, dmh.sO)
            .put(dmh.sL, dmh.sP)
            .put(dmh.sM, dmh.sQ)
            .put(dmh.sN, dmh.sR)
            .put(dmh.sS, dmh.sW)
            .put(dmh.sT, dmh.sX)
            .put(dmh.sU, dmh.sY)
            .put(dmh.sV, dmh.sZ)
            .build()
   );
   public static final Supplier<BiMap<dmf, dmf>> b = Suppliers.memoize(() -> a.get().inverse());

   public cyu(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         crc $$4 = $$0.o();
         czd $$5 = $$0.n();
         if ($$4 instanceof arr $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(efh.c, $$2, efh.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bud.a;
      }).orElse(bud.e);
   }

   public static Optional<eah> a(eah $$0) {
      return Optional.ofNullable((dmf)a.get().get($$0.b())).map($$1 -> ((dmf)$$1).m($$0));
   }

   @Override
   public boolean a(dja $$0, dyt $$1, boolean $$2, crc $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ax_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dyu $$0, crc $$1) {
      return true;
   }
}
