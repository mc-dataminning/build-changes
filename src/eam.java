import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eam extends ebj {
   public static final Codec<eam> a = Codec.unit(() -> eam.b);
   public static final eam b = new eam();
   private final Map<cvf, cvf> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cvh.m, cvh.pr);
      $$0.put(cvh.cn, cvh.pr);
      $$0.put(cvh.b, cvh.pv);
      $$0.put(cvh.eH, cvh.pw);
      $$0.put(cvh.eI, cvh.pw);
      $$0.put(cvh.cQ, cvh.ps);
      $$0.put(cvh.ni, cvh.ps);
      $$0.put(cvh.nk, cvh.pD);
      $$0.put(cvh.fj, cvh.pA);
      $$0.put(cvh.ng, cvh.pA);
      $$0.put(cvh.jI, cvh.pu);
      $$0.put(cvh.nw, cvh.pu);
      $$0.put(cvh.jE, cvh.pE);
      $$0.put(cvh.jD, cvh.pE);
      $$0.put(cvh.jK, cvh.pz);
      $$0.put(cvh.nu, cvh.pz);
      $$0.put(cvh.nK, cvh.pB);
      $$0.put(cvh.nI, cvh.pB);
      $$0.put(cvh.fP, cvh.pt);
      $$0.put(cvh.fQ, cvh.pt);
      $$0.put(cvh.eK, cvh.py);
      $$0.put(cvh.eJ, cvh.px);
      $$0.put(cvh.eW, cvh.eX);
   });

   private eam() {
   }

   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      cvf $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dhn $$7 = $$4.b();
         dhn $$8 = $$6.o();
         if ($$7.b(dcy.b)) {
            $$8 = $$8.a(dcy.b, $$7.c(dcy.b));
         }

         if ($$7.b(dcy.c)) {
            $$8 = $$8.a(dcy.c, $$7.c(dcy.c));
         }

         if ($$7.b(dch.b)) {
            $$8 = $$8.a(dch.b, $$7.c(dch.b));
         }

         return new ebm.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ebl<?> a() {
      return ebl.l;
   }
}
