import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cxf extends cxk implements cys {
   public static final Supplier<BiMap<dkl, dkl>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkn.rr, dkn.rR)
            .put(dkn.rs, dkn.rT)
            .put(dkn.rt, dkn.rS)
            .put(dkn.ru, dkn.rU)
            .put(dkn.rA, dkn.rY)
            .put(dkn.rz, dkn.rX)
            .put(dkn.ry, dkn.rW)
            .put(dkn.rx, dkn.rV)
            .put(dkn.rQ, dkn.sg)
            .put(dkn.rP, dkn.sf)
            .put(dkn.rO, dkn.se)
            .put(dkn.rN, dkn.sd)
            .put(dkn.rM, dkn.sc)
            .put(dkn.rL, dkn.sb)
            .put(dkn.rK, dkn.sa)
            .put(dkn.rJ, dkn.rZ)
            .put(dkn.rE, dkn.rI)
            .put(dkn.rD, dkn.rH)
            .put(dkn.rC, dkn.rG)
            .put(dkn.rB, dkn.rF)
            .put(dkn.sh, dkn.sl)
            .put(dkn.si, dkn.sm)
            .put(dkn.sk, dkn.so)
            .put(dkn.sj, dkn.sn)
            .put(dkn.sp, dkn.st)
            .put(dkn.sq, dkn.su)
            .put(dkn.ss, dkn.sw)
            .put(dkn.sr, dkn.sv)
            .put(dkn.sx, dkn.sB)
            .put(dkn.sy, dkn.sC)
            .put(dkn.sz, dkn.sD)
            .put(dkn.sA, dkn.sE)
            .put(dkn.sF, dkn.sJ)
            .put(dkn.sG, dkn.sK)
            .put(dkn.sH, dkn.sL)
            .put(dkn.sI, dkn.sM)
            .build()
   );
   public static final Supplier<BiMap<dkl, dkl>> b = Suppliers.memoize(() -> a.get().inverse());

   public cxf(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cpw $$4 = $$0.o();
         cxo $$5 = $$0.n();
         if ($$4 instanceof asi $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ecq.c, $$2, ecq.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bti.a;
      }).orElse(bti.e);
   }

   public static Optional<dxu> a(dxu $$0) {
      return Optional.ofNullable((dkl)a.get().get($$0.b())).map($$1 -> ((dkl)$$1).m($$0));
   }

   @Override
   public boolean a(dhh $$0, dwj $$1, boolean $$2, cpw $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aB_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dwk $$0, cpw $$1) {
      return true;
   }
}
