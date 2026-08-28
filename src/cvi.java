import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cvi extends cvn implements cww {
   public static final Supplier<BiMap<dhm, dhm>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dho.qW, dho.rw)
            .put(dho.qX, dho.ry)
            .put(dho.qY, dho.rx)
            .put(dho.qZ, dho.rz)
            .put(dho.rf, dho.rD)
            .put(dho.re, dho.rC)
            .put(dho.rd, dho.rB)
            .put(dho.rc, dho.rA)
            .put(dho.rv, dho.rL)
            .put(dho.ru, dho.rK)
            .put(dho.rt, dho.rJ)
            .put(dho.rs, dho.rI)
            .put(dho.rr, dho.rH)
            .put(dho.rq, dho.rG)
            .put(dho.rp, dho.rF)
            .put(dho.ro, dho.rE)
            .put(dho.rj, dho.rn)
            .put(dho.ri, dho.rm)
            .put(dho.rh, dho.rl)
            .put(dho.rg, dho.rk)
            .put(dho.rM, dho.rQ)
            .put(dho.rN, dho.rR)
            .put(dho.rP, dho.rT)
            .put(dho.rO, dho.rS)
            .put(dho.rU, dho.rY)
            .put(dho.rV, dho.rZ)
            .put(dho.rX, dho.sb)
            .put(dho.rW, dho.sa)
            .put(dho.sc, dho.sg)
            .put(dho.sd, dho.sh)
            .put(dho.se, dho.si)
            .put(dho.sf, dho.sj)
            .put(dho.sk, dho.so)
            .put(dho.sl, dho.sp)
            .put(dho.sm, dho.sq)
            .put(dho.sn, dho.sr)
            .build()
   );
   public static final Supplier<BiMap<dhm, dhm>> b = Suppliers.memoize(() -> a.get().inverse());

   public cvi(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cnx $$4 = $$0.o();
         cvs $$5 = $$0.n();
         if ($$4 instanceof ark $$6) {
            an.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dzp.c, $$2, dzp.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return brs.a;
      }).orElse(brs.e);
   }

   public static Optional<dus> a(dus $$0) {
      return Optional.ofNullable((dhm)a.get().get($$0.b())).map($$1 -> ((dhm)$$1).m($$0));
   }

   @Override
   public boolean a(dej $$0, dth $$1, boolean $$2, cnx $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aC_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dti $$0, cnx $$1) {
      return true;
   }
}
