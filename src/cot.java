import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cot extends coy implements cqc {
   public static final Supplier<BiMap<cys, cys>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cyu.qW, cyu.rw)
            .put(cyu.qX, cyu.ry)
            .put(cyu.qY, cyu.rx)
            .put(cyu.qZ, cyu.rz)
            .put(cyu.rf, cyu.rD)
            .put(cyu.re, cyu.rC)
            .put(cyu.rd, cyu.rB)
            .put(cyu.rc, cyu.rA)
            .put(cyu.rv, cyu.rL)
            .put(cyu.ru, cyu.rK)
            .put(cyu.rt, cyu.rJ)
            .put(cyu.rs, cyu.rI)
            .put(cyu.rr, cyu.rH)
            .put(cyu.rq, cyu.rG)
            .put(cyu.rp, cyu.rF)
            .put(cyu.ro, cyu.rE)
            .put(cyu.rj, cyu.rn)
            .put(cyu.ri, cyu.rm)
            .put(cyu.rh, cyu.rl)
            .put(cyu.rg, cyu.rk)
            .put(cyu.rM, cyu.rQ)
            .put(cyu.rN, cyu.rR)
            .put(cyu.rP, cyu.rT)
            .put(cyu.rO, cyu.rS)
            .put(cyu.rU, cyu.rY)
            .put(cyu.rV, cyu.rZ)
            .put(cyu.rX, cyu.sb)
            .put(cyu.rW, cyu.sa)
            .put(cyu.sc, cyu.sg)
            .put(cyu.sd, cyu.sh)
            .put(cyu.se, cyu.si)
            .put(cyu.sf, cyu.sj)
            .put(cyu.sk, cyu.so)
            .put(cyu.sl, cyu.sp)
            .put(cyu.sm, cyu.sq)
            .put(cyu.sn, cyu.sr)
            .build()
   );
   public static final Supplier<BiMap<cys, cys>> b = Suppliers.memoize(() -> a.get().inverse());

   public cot(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      return b($$3).map($$3x -> {
         chl $$4 = $$0.o();
         cpd $$5 = $$0.n();
         if ($$4 instanceof aox) {
            am.N.a((aox)$$4, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dpw.c, $$2, dpw.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return blw.a($$1.B);
      }).orElse(blw.d);
   }

   public static Optional<dlj> b(dlj $$0) {
      return Optional.ofNullable((cys)a.get().get($$0.b())).map($$1 -> ((cys)$$1).l($$0));
   }

   @Override
   public boolean a(cvr $$0, dkg $$1, boolean $$2, chl $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aE_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dkh $$0, chl $$1) {
      return true;
   }
}
