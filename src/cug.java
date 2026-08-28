import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cug extends cul implements cvs {
   public static final Supplier<BiMap<dfa, dfa>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfc.qW, dfc.rw)
            .put(dfc.qX, dfc.ry)
            .put(dfc.qY, dfc.rx)
            .put(dfc.qZ, dfc.rz)
            .put(dfc.rf, dfc.rD)
            .put(dfc.re, dfc.rC)
            .put(dfc.rd, dfc.rB)
            .put(dfc.rc, dfc.rA)
            .put(dfc.rv, dfc.rL)
            .put(dfc.ru, dfc.rK)
            .put(dfc.rt, dfc.rJ)
            .put(dfc.rs, dfc.rI)
            .put(dfc.rr, dfc.rH)
            .put(dfc.rq, dfc.rG)
            .put(dfc.rp, dfc.rF)
            .put(dfc.ro, dfc.rE)
            .put(dfc.rj, dfc.rn)
            .put(dfc.ri, dfc.rm)
            .put(dfc.rh, dfc.rl)
            .put(dfc.rg, dfc.rk)
            .put(dfc.rM, dfc.rQ)
            .put(dfc.rN, dfc.rR)
            .put(dfc.rP, dfc.rT)
            .put(dfc.rO, dfc.rS)
            .put(dfc.rU, dfc.rY)
            .put(dfc.rV, dfc.rZ)
            .put(dfc.rX, dfc.sb)
            .put(dfc.rW, dfc.sa)
            .put(dfc.sc, dfc.sg)
            .put(dfc.sd, dfc.sh)
            .put(dfc.se, dfc.si)
            .put(dfc.sf, dfc.sj)
            .put(dfc.sk, dfc.so)
            .put(dfc.sl, dfc.sp)
            .put(dfc.sm, dfc.sq)
            .put(dfc.sn, dfc.sr)
            .build()
   );
   public static final Supplier<BiMap<dfa, dfa>> b = Suppliers.memoize(() -> a.get().inverse());

   public cug(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmy $$4 = $$0.o();
         cuq $$5 = $$0.n();
         if ($$4 instanceof arg) {
            am.N.a((arg)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dww.c, $$2, dww.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqv.a($$1.B);
      }).orElse(bqv.e);
   }

   public static Optional<dsd> a(dsd $$0) {
      return Optional.ofNullable((dfa)a.get().get($$0.b())).map($$1 -> ((dfa)$$1).l($$0));
   }

   @Override
   public boolean a(dbz $$0, dqs $$1, boolean $$2, cmy $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ay_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqt $$0, cmy $$1) {
      return true;
   }
}
