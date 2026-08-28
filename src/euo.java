import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class euo extends evm {
   public static final MapCodec<euo> a = MapCodec.unit(() -> euo.b);
   public static final euo b = new euo();
   private final Map<dmr, dmr> c = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmt.m, dmt.pZ);
      $$0.put(dmt.cx, dmt.pZ);
      $$0.put(dmt.b, dmt.qd);
      $$0.put(dmt.eZ, dmt.qe);
      $$0.put(dmt.fa, dmt.qe);
      $$0.put(dmt.dc, dmt.qa);
      $$0.put(dmt.nO, dmt.qa);
      $$0.put(dmt.nQ, dmt.ql);
      $$0.put(dmt.fC, dmt.qi);
      $$0.put(dmt.nM, dmt.qi);
      $$0.put(dmt.kl, dmt.qc);
      $$0.put(dmt.oc, dmt.qc);
      $$0.put(dmt.kh, dmt.qm);
      $$0.put(dmt.kg, dmt.qm);
      $$0.put(dmt.kn, dmt.qh);
      $$0.put(dmt.oa, dmt.qh);
      $$0.put(dmt.oq, dmt.qj);
      $$0.put(dmt.oo, dmt.qj);
      $$0.put(dmt.go, dmt.qb);
      $$0.put(dmt.gp, dmt.qb);
      $$0.put(dmt.fc, dmt.qg);
      $$0.put(dmt.fb, dmt.qf);
      $$0.put(dmt.fo, dmt.fp);
   });

   private euo() {
   }

   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      dmr $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         eat $$7 = $$4.b();
         eat $$8 = $$6.m();
         if ($$7.b(duv.b)) {
            $$8 = $$8.b(duv.b, $$7.c(duv.b));
         }

         if ($$7.b(duv.c)) {
            $$8 = $$8.b(duv.c, $$7.c(duv.c));
         }

         if ($$7.b(due.b)) {
            $$8 = $$8.b(due.b, $$7.c(due.b));
         }

         return new evp.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected evo<?> a() {
      return evo.l;
   }
}
