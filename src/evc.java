import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class evc extends ewa {
   public static final MapCodec<evc> a = MapCodec.unit(() -> evc.b);
   public static final evc b = new evc();
   private final Map<dnc, dnc> c = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dne.m, dne.pZ);
      $$0.put(dne.cx, dne.pZ);
      $$0.put(dne.b, dne.qd);
      $$0.put(dne.eZ, dne.qe);
      $$0.put(dne.fa, dne.qe);
      $$0.put(dne.dc, dne.qa);
      $$0.put(dne.nO, dne.qa);
      $$0.put(dne.nQ, dne.ql);
      $$0.put(dne.fC, dne.qi);
      $$0.put(dne.nM, dne.qi);
      $$0.put(dne.kl, dne.qc);
      $$0.put(dne.oc, dne.qc);
      $$0.put(dne.kh, dne.qm);
      $$0.put(dne.kg, dne.qm);
      $$0.put(dne.kn, dne.qh);
      $$0.put(dne.oa, dne.qh);
      $$0.put(dne.oq, dne.qj);
      $$0.put(dne.oo, dne.qj);
      $$0.put(dne.go, dne.qb);
      $$0.put(dne.gp, dne.qb);
      $$0.put(dne.fc, dne.qg);
      $$0.put(dne.fb, dne.qf);
      $$0.put(dne.fo, dne.fp);
   });

   private evc() {
   }

   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      dnc $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         ebe $$7 = $$4.b();
         ebe $$8 = $$6.m();
         if ($$7.b(dvg.b)) {
            $$8 = $$8.b(dvg.b, $$7.c(dvg.b));
         }

         if ($$7.b(dvg.c)) {
            $$8 = $$8.b(dvg.c, $$7.c(dvg.c));
         }

         if ($$7.b(dup.b)) {
            $$8 = $$8.b(dup.b, $$7.c(dup.b));
         }

         return new ewd.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ewc<?> a() {
      return ewc.l;
   }
}
