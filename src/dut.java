import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dut extends dvq {
   public static final Codec<dut> a = Codec.unit(() -> dut.b);
   public static final dut b = new dut();
   private final Map<cpn, cpn> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cpo.m, cpo.pr);
      $$0.put(cpo.cn, cpo.pr);
      $$0.put(cpo.b, cpo.pv);
      $$0.put(cpo.eI, cpo.pw);
      $$0.put(cpo.eJ, cpo.pw);
      $$0.put(cpo.cQ, cpo.ps);
      $$0.put(cpo.ni, cpo.ps);
      $$0.put(cpo.nk, cpo.pD);
      $$0.put(cpo.fj, cpo.pA);
      $$0.put(cpo.ng, cpo.pA);
      $$0.put(cpo.jI, cpo.pu);
      $$0.put(cpo.nw, cpo.pu);
      $$0.put(cpo.jE, cpo.pE);
      $$0.put(cpo.jD, cpo.pE);
      $$0.put(cpo.jK, cpo.pz);
      $$0.put(cpo.nu, cpo.pz);
      $$0.put(cpo.nK, cpo.pB);
      $$0.put(cpo.nI, cpo.pB);
      $$0.put(cpo.fP, cpo.pt);
      $$0.put(cpo.fQ, cpo.pt);
      $$0.put(cpo.eL, cpo.py);
      $$0.put(cpo.eK, cpo.px);
      $$0.put(cpo.eX, cpo.eY);
   });

   private dut() {
   }

   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      cpn $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dcb $$7 = $$4.b();
         dcb $$8 = $$6.n();
         if ($$7.b(cxh.a)) {
            $$8 = $$8.a(cxh.a, $$7.c(cxh.a));
         }

         if ($$7.b(cxh.b)) {
            $$8 = $$8.a(cxh.b, $$7.c(cxh.b));
         }

         if ($$7.b(cwq.a)) {
            $$8 = $$8.a(cwq.a, $$7.c(cwq.a));
         }

         return new dvt.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dvs<?> a() {
      return dvs.l;
   }
}
