import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class euc extends eva {
   public static final MapCodec<euc> a = MapCodec.unit(() -> euc.b);
   public static final euc b = new euc();
   private final Map<dmf, dmf> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmh.m, dmh.pZ);
      $$0.put(dmh.cx, dmh.pZ);
      $$0.put(dmh.b, dmh.qd);
      $$0.put(dmh.eZ, dmh.qe);
      $$0.put(dmh.fa, dmh.qe);
      $$0.put(dmh.dc, dmh.qa);
      $$0.put(dmh.nO, dmh.qa);
      $$0.put(dmh.nQ, dmh.ql);
      $$0.put(dmh.fC, dmh.qi);
      $$0.put(dmh.nM, dmh.qi);
      $$0.put(dmh.kl, dmh.qc);
      $$0.put(dmh.oc, dmh.qc);
      $$0.put(dmh.kh, dmh.qm);
      $$0.put(dmh.kg, dmh.qm);
      $$0.put(dmh.kn, dmh.qh);
      $$0.put(dmh.oa, dmh.qh);
      $$0.put(dmh.oq, dmh.qj);
      $$0.put(dmh.oo, dmh.qj);
      $$0.put(dmh.go, dmh.qb);
      $$0.put(dmh.gp, dmh.qb);
      $$0.put(dmh.fc, dmh.qg);
      $$0.put(dmh.fb, dmh.qf);
      $$0.put(dmh.fo, dmh.fp);
   });

   private euc() {
   }

   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      dmf $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         eah $$7 = $$4.b();
         eah $$8 = $$6.m();
         if ($$7.b(duj.b)) {
            $$8 = $$8.b(duj.b, $$7.c(duj.b));
         }

         if ($$7.b(duj.c)) {
            $$8 = $$8.b(duj.c, $$7.c(duj.c));
         }

         if ($$7.b(dts.b)) {
            $$8 = $$8.b(dts.b, $$7.c(dts.b));
         }

         return new evd.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected evc<?> a() {
      return evc.l;
   }
}
