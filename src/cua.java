import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cua extends cuf implements cvm {
   public static final Supplier<BiMap<deu, deu>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dew.qW, dew.rw)
            .put(dew.qX, dew.ry)
            .put(dew.qY, dew.rx)
            .put(dew.qZ, dew.rz)
            .put(dew.rf, dew.rD)
            .put(dew.re, dew.rC)
            .put(dew.rd, dew.rB)
            .put(dew.rc, dew.rA)
            .put(dew.rv, dew.rL)
            .put(dew.ru, dew.rK)
            .put(dew.rt, dew.rJ)
            .put(dew.rs, dew.rI)
            .put(dew.rr, dew.rH)
            .put(dew.rq, dew.rG)
            .put(dew.rp, dew.rF)
            .put(dew.ro, dew.rE)
            .put(dew.rj, dew.rn)
            .put(dew.ri, dew.rm)
            .put(dew.rh, dew.rl)
            .put(dew.rg, dew.rk)
            .put(dew.rM, dew.rQ)
            .put(dew.rN, dew.rR)
            .put(dew.rP, dew.rT)
            .put(dew.rO, dew.rS)
            .put(dew.rU, dew.rY)
            .put(dew.rV, dew.rZ)
            .put(dew.rX, dew.sb)
            .put(dew.rW, dew.sa)
            .put(dew.sc, dew.sg)
            .put(dew.sd, dew.sh)
            .put(dew.se, dew.si)
            .put(dew.sf, dew.sj)
            .put(dew.sk, dew.so)
            .put(dew.sl, dew.sp)
            .put(dew.sm, dew.sq)
            .put(dew.sn, dew.sr)
            .build()
   );
   public static final Supplier<BiMap<deu, deu>> b = Suppliers.memoize(() -> a.get().inverse());

   public cua(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cms $$4 = $$0.o();
         cuk $$5 = $$0.n();
         if ($$4 instanceof arc) {
            am.N.a((arc)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dwq.c, $$2, dwq.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqp.a($$1.B);
      }).orElse(bqp.e);
   }

   public static Optional<drx> a(drx $$0) {
      return Optional.ofNullable((deu)a.get().get($$0.b())).map($$1 -> ((deu)$$1).l($$0));
   }

   @Override
   public boolean a(dbt $$0, dqm $$1, boolean $$2, cms $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqn $$0, cms $$1) {
      return true;
   }
}
