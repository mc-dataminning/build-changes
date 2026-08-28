import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cue extends cuj implements cvq {
   public static final Supplier<BiMap<dey, dey>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfa.qW, dfa.rw)
            .put(dfa.qX, dfa.ry)
            .put(dfa.qY, dfa.rx)
            .put(dfa.qZ, dfa.rz)
            .put(dfa.rf, dfa.rD)
            .put(dfa.re, dfa.rC)
            .put(dfa.rd, dfa.rB)
            .put(dfa.rc, dfa.rA)
            .put(dfa.rv, dfa.rL)
            .put(dfa.ru, dfa.rK)
            .put(dfa.rt, dfa.rJ)
            .put(dfa.rs, dfa.rI)
            .put(dfa.rr, dfa.rH)
            .put(dfa.rq, dfa.rG)
            .put(dfa.rp, dfa.rF)
            .put(dfa.ro, dfa.rE)
            .put(dfa.rj, dfa.rn)
            .put(dfa.ri, dfa.rm)
            .put(dfa.rh, dfa.rl)
            .put(dfa.rg, dfa.rk)
            .put(dfa.rM, dfa.rQ)
            .put(dfa.rN, dfa.rR)
            .put(dfa.rP, dfa.rT)
            .put(dfa.rO, dfa.rS)
            .put(dfa.rU, dfa.rY)
            .put(dfa.rV, dfa.rZ)
            .put(dfa.rX, dfa.sb)
            .put(dfa.rW, dfa.sa)
            .put(dfa.sc, dfa.sg)
            .put(dfa.sd, dfa.sh)
            .put(dfa.se, dfa.si)
            .put(dfa.sf, dfa.sj)
            .put(dfa.sk, dfa.so)
            .put(dfa.sl, dfa.sp)
            .put(dfa.sm, dfa.sq)
            .put(dfa.sn, dfa.sr)
            .build()
   );
   public static final Supplier<BiMap<dey, dey>> b = Suppliers.memoize(() -> a.get().inverse());

   public cue(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmw $$4 = $$0.o();
         cuo $$5 = $$0.n();
         if ($$4 instanceof arf) {
            am.N.a((arf)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dwu.c, $$2, dwu.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqt.a($$1.B);
      }).orElse(bqt.e);
   }

   public static Optional<dsb> a(dsb $$0) {
      return Optional.ofNullable((dey)a.get().get($$0.b())).map($$1 -> ((dey)$$1).l($$0));
   }

   @Override
   public boolean a(dbx $$0, dqq $$1, boolean $$2, cmw $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.ay_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqr $$0, cmw $$1) {
      return true;
   }
}
