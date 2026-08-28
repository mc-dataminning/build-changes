import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class evo extends ewm {
   public static final MapCodec<evo> a = MapCodec.unit(() -> evo.b);
   public static final evo b = new evo();
   private final Map<dno, dno> c = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dnq.m, dnq.pZ);
      $$0.put(dnq.cx, dnq.pZ);
      $$0.put(dnq.b, dnq.qd);
      $$0.put(dnq.eZ, dnq.qe);
      $$0.put(dnq.fa, dnq.qe);
      $$0.put(dnq.dc, dnq.qa);
      $$0.put(dnq.nO, dnq.qa);
      $$0.put(dnq.nQ, dnq.ql);
      $$0.put(dnq.fC, dnq.qi);
      $$0.put(dnq.nM, dnq.qi);
      $$0.put(dnq.kl, dnq.qc);
      $$0.put(dnq.oc, dnq.qc);
      $$0.put(dnq.kh, dnq.qm);
      $$0.put(dnq.kg, dnq.qm);
      $$0.put(dnq.kn, dnq.qh);
      $$0.put(dnq.oa, dnq.qh);
      $$0.put(dnq.oq, dnq.qj);
      $$0.put(dnq.oo, dnq.qj);
      $$0.put(dnq.go, dnq.qb);
      $$0.put(dnq.gp, dnq.qb);
      $$0.put(dnq.fc, dnq.qg);
      $$0.put(dnq.fb, dnq.qf);
      $$0.put(dnq.fo, dnq.fp);
   });

   private evo() {
   }

   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      dno $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         ebq $$7 = $$4.b();
         ebq $$8 = $$6.m();
         if ($$7.b(dvs.b)) {
            $$8 = $$8.b(dvs.b, $$7.c(dvs.b));
         }

         if ($$7.b(dvs.c)) {
            $$8 = $$8.b(dvs.c, $$7.c(dvs.c));
         }

         if ($$7.b(dvb.b)) {
            $$8 = $$8.b(dvb.b, $$7.c(dvb.b));
         }

         return new ewp.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ewo<?> a() {
      return ewo.l;
   }
}
