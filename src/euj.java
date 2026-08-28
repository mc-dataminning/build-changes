import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class euj extends evh {
   public static final MapCodec<euj> a = MapCodec.unit(() -> euj.b);
   public static final euj b = new euj();
   private final Map<dmm, dmm> c = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmo.m, dmo.pZ);
      $$0.put(dmo.cx, dmo.pZ);
      $$0.put(dmo.b, dmo.qd);
      $$0.put(dmo.eZ, dmo.qe);
      $$0.put(dmo.fa, dmo.qe);
      $$0.put(dmo.dc, dmo.qa);
      $$0.put(dmo.nO, dmo.qa);
      $$0.put(dmo.nQ, dmo.ql);
      $$0.put(dmo.fC, dmo.qi);
      $$0.put(dmo.nM, dmo.qi);
      $$0.put(dmo.kl, dmo.qc);
      $$0.put(dmo.oc, dmo.qc);
      $$0.put(dmo.kh, dmo.qm);
      $$0.put(dmo.kg, dmo.qm);
      $$0.put(dmo.kn, dmo.qh);
      $$0.put(dmo.oa, dmo.qh);
      $$0.put(dmo.oq, dmo.qj);
      $$0.put(dmo.oo, dmo.qj);
      $$0.put(dmo.go, dmo.qb);
      $$0.put(dmo.gp, dmo.qb);
      $$0.put(dmo.fc, dmo.qg);
      $$0.put(dmo.fb, dmo.qf);
      $$0.put(dmo.fo, dmo.fp);
   });

   private euj() {
   }

   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      dmm $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         eao $$7 = $$4.b();
         eao $$8 = $$6.m();
         if ($$7.b(duq.b)) {
            $$8 = $$8.b(duq.b, $$7.c(duq.b));
         }

         if ($$7.b(duq.c)) {
            $$8 = $$8.b(duq.c, $$7.c(duq.c));
         }

         if ($$7.b(dtz.b)) {
            $$8 = $$8.b(dtz.b, $$7.c(dtz.b));
         }

         return new evk.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected evj<?> a() {
      return evj.l;
   }
}
