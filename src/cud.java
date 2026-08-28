import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cud extends cui implements cvp {
   public static final Supplier<BiMap<dex, dex>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dez.qW, dez.rw)
            .put(dez.qX, dez.ry)
            .put(dez.qY, dez.rx)
            .put(dez.qZ, dez.rz)
            .put(dez.rf, dez.rD)
            .put(dez.re, dez.rC)
            .put(dez.rd, dez.rB)
            .put(dez.rc, dez.rA)
            .put(dez.rv, dez.rL)
            .put(dez.ru, dez.rK)
            .put(dez.rt, dez.rJ)
            .put(dez.rs, dez.rI)
            .put(dez.rr, dez.rH)
            .put(dez.rq, dez.rG)
            .put(dez.rp, dez.rF)
            .put(dez.ro, dez.rE)
            .put(dez.rj, dez.rn)
            .put(dez.ri, dez.rm)
            .put(dez.rh, dez.rl)
            .put(dez.rg, dez.rk)
            .put(dez.rM, dez.rQ)
            .put(dez.rN, dez.rR)
            .put(dez.rP, dez.rT)
            .put(dez.rO, dez.rS)
            .put(dez.rU, dez.rY)
            .put(dez.rV, dez.rZ)
            .put(dez.rX, dez.sb)
            .put(dez.rW, dez.sa)
            .put(dez.sc, dez.sg)
            .put(dez.sd, dez.sh)
            .put(dez.se, dez.si)
            .put(dez.sf, dez.sj)
            .put(dez.sk, dez.so)
            .put(dez.sl, dez.sp)
            .put(dez.sm, dez.sq)
            .put(dez.sn, dez.sr)
            .build()
   );
   public static final Supplier<BiMap<dex, dex>> b = Suppliers.memoize(() -> a.get().inverse());

   public cud(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cmv $$4 = $$0.o();
         cun $$5 = $$0.n();
         if ($$4 instanceof arf) {
            am.N.a((arf)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dwt.c, $$2, dwt.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bqs.a($$1.B);
      }).orElse(bqs.e);
   }

   public static Optional<dsa> a(dsa $$0) {
      return Optional.ofNullable((dex)a.get().get($$0.b())).map($$1 -> ((dex)$$1).l($$0));
   }

   @Override
   public boolean a(dbw $$0, dqp $$1, boolean $$2, cmv $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.az_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dqq $$0, cmv $$1) {
      return true;
   }
}
