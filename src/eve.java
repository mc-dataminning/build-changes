import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eve extends ewc {
   public static final MapCodec<eve> a = MapCodec.unit(() -> eve.b);
   public static final eve b = new eve();
   private final Map<dne, dne> c = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dng.m, dng.pZ);
      $$0.put(dng.cx, dng.pZ);
      $$0.put(dng.b, dng.qd);
      $$0.put(dng.eZ, dng.qe);
      $$0.put(dng.fa, dng.qe);
      $$0.put(dng.dc, dng.qa);
      $$0.put(dng.nO, dng.qa);
      $$0.put(dng.nQ, dng.ql);
      $$0.put(dng.fC, dng.qi);
      $$0.put(dng.nM, dng.qi);
      $$0.put(dng.kl, dng.qc);
      $$0.put(dng.oc, dng.qc);
      $$0.put(dng.kh, dng.qm);
      $$0.put(dng.kg, dng.qm);
      $$0.put(dng.kn, dng.qh);
      $$0.put(dng.oa, dng.qh);
      $$0.put(dng.oq, dng.qj);
      $$0.put(dng.oo, dng.qj);
      $$0.put(dng.go, dng.qb);
      $$0.put(dng.gp, dng.qb);
      $$0.put(dng.fc, dng.qg);
      $$0.put(dng.fb, dng.qf);
      $$0.put(dng.fo, dng.fp);
   });

   private eve() {
   }

   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      dne $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         ebg $$7 = $$4.b();
         ebg $$8 = $$6.m();
         if ($$7.b(dvi.b)) {
            $$8 = $$8.b(dvi.b, $$7.c(dvi.b));
         }

         if ($$7.b(dvi.c)) {
            $$8 = $$8.b(dvi.c, $$7.c(dvi.c));
         }

         if ($$7.b(dur.b)) {
            $$8 = $$8.b(dur.b, $$7.c(dur.b));
         }

         return new ewf.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ewe<?> a() {
      return ewe.l;
   }
}
