import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cvb extends cvg implements cwq {
   public static final Supplier<BiMap<dgv, dgv>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dgx.qW, dgx.rw)
            .put(dgx.qX, dgx.ry)
            .put(dgx.qY, dgx.rx)
            .put(dgx.qZ, dgx.rz)
            .put(dgx.rf, dgx.rD)
            .put(dgx.re, dgx.rC)
            .put(dgx.rd, dgx.rB)
            .put(dgx.rc, dgx.rA)
            .put(dgx.rv, dgx.rL)
            .put(dgx.ru, dgx.rK)
            .put(dgx.rt, dgx.rJ)
            .put(dgx.rs, dgx.rI)
            .put(dgx.rr, dgx.rH)
            .put(dgx.rq, dgx.rG)
            .put(dgx.rp, dgx.rF)
            .put(dgx.ro, dgx.rE)
            .put(dgx.rj, dgx.rn)
            .put(dgx.ri, dgx.rm)
            .put(dgx.rh, dgx.rl)
            .put(dgx.rg, dgx.rk)
            .put(dgx.rM, dgx.rQ)
            .put(dgx.rN, dgx.rR)
            .put(dgx.rP, dgx.rT)
            .put(dgx.rO, dgx.rS)
            .put(dgx.rU, dgx.rY)
            .put(dgx.rV, dgx.rZ)
            .put(dgx.rX, dgx.sb)
            .put(dgx.rW, dgx.sa)
            .put(dgx.sc, dgx.sg)
            .put(dgx.sd, dgx.sh)
            .put(dgx.se, dgx.si)
            .put(dgx.sf, dgx.sj)
            .put(dgx.sk, dgx.so)
            .put(dgx.sl, dgx.sp)
            .put(dgx.sm, dgx.sq)
            .put(dgx.sn, dgx.sr)
            .build()
   );
   public static final Supplier<BiMap<dgv, dgv>> b = Suppliers.memoize(() -> a.get().inverse());

   public cvb(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cnp $$4 = $$0.o();
         cvl $$5 = $$0.n();
         if ($$4 instanceof arh $$6) {
            an.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(dyx.c, $$2, dyx.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return brk.a;
      }).orElse(brk.e);
   }

   public static Optional<dua> a(dua $$0) {
      return Optional.ofNullable((dgv)a.get().get($$0.b())).map($$1 -> ((dgv)$$1).m($$0));
   }

   @Override
   public boolean a(dds $$0, dsq $$1, boolean $$2, cnp $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aD_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dsr $$0, cnp $$1) {
      return true;
   }
}
