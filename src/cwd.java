import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cwd extends cwi implements cxq {
   public static final Supplier<BiMap<diq, diq>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dis.qW, dis.rw)
            .put(dis.qX, dis.ry)
            .put(dis.qY, dis.rx)
            .put(dis.qZ, dis.rz)
            .put(dis.rf, dis.rD)
            .put(dis.re, dis.rC)
            .put(dis.rd, dis.rB)
            .put(dis.rc, dis.rA)
            .put(dis.rv, dis.rL)
            .put(dis.ru, dis.rK)
            .put(dis.rt, dis.rJ)
            .put(dis.rs, dis.rI)
            .put(dis.rr, dis.rH)
            .put(dis.rq, dis.rG)
            .put(dis.rp, dis.rF)
            .put(dis.ro, dis.rE)
            .put(dis.rj, dis.rn)
            .put(dis.ri, dis.rm)
            .put(dis.rh, dis.rl)
            .put(dis.rg, dis.rk)
            .put(dis.rM, dis.rQ)
            .put(dis.rN, dis.rR)
            .put(dis.rP, dis.rT)
            .put(dis.rO, dis.rS)
            .put(dis.rU, dis.rY)
            .put(dis.rV, dis.rZ)
            .put(dis.rX, dis.sb)
            .put(dis.rW, dis.sa)
            .put(dis.sc, dis.sg)
            .put(dis.sd, dis.sh)
            .put(dis.se, dis.si)
            .put(dis.sf, dis.sj)
            .put(dis.sk, dis.so)
            .put(dis.sl, dis.sp)
            .put(dis.sm, dis.sq)
            .put(dis.sn, dis.sr)
            .build()
   );
   public static final Supplier<BiMap<diq, diq>> b = Suppliers.memoize(() -> a.get().inverse());

   public cwd(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cou $$4 = $$0.o();
         cwm $$5 = $$0.n();
         if ($$4 instanceof arq $$6) {
            ao.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ear.c, $$2, ear.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bsk.a;
      }).orElse(bsk.e);
   }

   public static Optional<dvv> a(dvv $$0) {
      return Optional.ofNullable((diq)a.get().get($$0.b())).map($$1 -> ((diq)$$1).m($$0));
   }

   @Override
   public boolean a(dfm $$0, duk $$1, boolean $$2, cou $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dul $$0, cou $$1) {
      return true;
   }
}
