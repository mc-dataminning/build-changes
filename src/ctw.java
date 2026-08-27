import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class ctw extends cuc implements cvr {
   public static final Supplier<BiMap<dfc, dfc>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfe.sh, dfe.sH)
            .put(dfe.si, dfe.sJ)
            .put(dfe.sj, dfe.sI)
            .put(dfe.sk, dfe.sK)
            .put(dfe.sq, dfe.sO)
            .put(dfe.sp, dfe.sN)
            .put(dfe.so, dfe.sM)
            .put(dfe.sn, dfe.sL)
            .put(dfe.sG, dfe.sW)
            .put(dfe.sF, dfe.sV)
            .put(dfe.sE, dfe.sU)
            .put(dfe.sD, dfe.sT)
            .put(dfe.sC, dfe.sS)
            .put(dfe.sB, dfe.sR)
            .put(dfe.sA, dfe.sQ)
            .put(dfe.sz, dfe.sP)
            .put(dfe.su, dfe.sy)
            .put(dfe.st, dfe.sx)
            .put(dfe.ss, dfe.sw)
            .put(dfe.sr, dfe.sv)
            .put(dfe.sX, dfe.tb)
            .put(dfe.sY, dfe.tc)
            .put(dfe.ta, dfe.te)
            .put(dfe.sZ, dfe.td)
            .put(dfe.tf, dfe.tj)
            .put(dfe.tg, dfe.tk)
            .put(dfe.ti, dfe.tm)
            .put(dfe.th, dfe.tl)
            .put(dfe.tn, dfe.tr)
            .put(dfe.to, dfe.ts)
            .put(dfe.tp, dfe.tt)
            .put(dfe.tq, dfe.tu)
            .put(dfe.tv, dfe.tz)
            .put(dfe.tw, dfe.tA)
            .put(dfe.tx, dfe.tB)
            .put(dfe.ty, dfe.tC)
            .build()
   );
   public static final Supplier<BiMap<dfc, dfc>> b = Suppliers.memoize(() -> a.get().inverse());

   public ctw(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cly $$4 = $$0.o();
         cuh $$5 = $$0.n();
         if ($$4 instanceof aqu) {
            an.N.a((aqu)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dxv.c, $$2, dxv.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqa.a($$1.C);
      }).orElse(bqa.d);
   }

   public static Optional<dtc> a(dtc $$0) {
      return Optional.ofNullable((dfc)a.get().get($$0.b())).map($$1 -> ((dfc)$$1).l($$0));
   }

   @Override
   public boolean a(dca $$0, drr $$1, boolean $$2, cly $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(drs $$0, cly $$1) {
      return true;
   }
}
