import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cyj extends cyo implements czu {
   public static final Supplier<BiMap<dlu, dlu>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dlw.rA, dlw.sa)
            .put(dlw.rB, dlw.sc)
            .put(dlw.rC, dlw.sb)
            .put(dlw.rD, dlw.sd)
            .put(dlw.rJ, dlw.sh)
            .put(dlw.rI, dlw.sg)
            .put(dlw.rH, dlw.sf)
            .put(dlw.rG, dlw.se)
            .put(dlw.rZ, dlw.sp)
            .put(dlw.rY, dlw.so)
            .put(dlw.rX, dlw.sn)
            .put(dlw.rW, dlw.sm)
            .put(dlw.rV, dlw.sl)
            .put(dlw.rU, dlw.sk)
            .put(dlw.rT, dlw.sj)
            .put(dlw.rS, dlw.si)
            .put(dlw.rN, dlw.rR)
            .put(dlw.rM, dlw.rQ)
            .put(dlw.rL, dlw.rP)
            .put(dlw.rK, dlw.rO)
            .put(dlw.sq, dlw.su)
            .put(dlw.sr, dlw.sv)
            .put(dlw.st, dlw.sx)
            .put(dlw.ss, dlw.sw)
            .put(dlw.sy, dlw.sC)
            .put(dlw.sz, dlw.sD)
            .put(dlw.sB, dlw.sF)
            .put(dlw.sA, dlw.sE)
            .put(dlw.sG, dlw.sK)
            .put(dlw.sH, dlw.sL)
            .put(dlw.sI, dlw.sM)
            .put(dlw.sJ, dlw.sN)
            .put(dlw.sO, dlw.sS)
            .put(dlw.sP, dlw.sT)
            .put(dlw.sQ, dlw.sU)
            .put(dlw.sR, dlw.sV)
            .build()
   );
   public static final Supplier<BiMap<dlu, dlu>> b = Suppliers.memoize(() -> a.get().inverse());

   public cyj(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cqs $$4 = $$0.o();
         cys $$5 = $$0.n();
         if ($$4 instanceof arp $$6) {
            ap.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(eeo.c, $$2, eeo.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bty.a;
      }).orElse(bty.e);
   }

   public static Optional<dzo> a(dzo $$0) {
      return Optional.ofNullable((dlu)a.get().get($$0.b())).map($$1 -> ((dlu)$$1).m($$0));
   }

   @Override
   public boolean a(dip $$0, dyb $$1, boolean $$2, cqs $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aw_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dyc $$0, cqs $$1) {
      return true;
   }
}
