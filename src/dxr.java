import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dxr extends dyo {
   public static final Codec<dxr> a = Codec.unit(() -> dxr.b);
   public static final dxr b = new dxr();
   private final Map<csl, csl> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csm.m, csm.pr);
      $$0.put(csm.cn, csm.pr);
      $$0.put(csm.b, csm.pv);
      $$0.put(csm.eI, csm.pw);
      $$0.put(csm.eJ, csm.pw);
      $$0.put(csm.cQ, csm.ps);
      $$0.put(csm.ni, csm.ps);
      $$0.put(csm.nk, csm.pD);
      $$0.put(csm.fj, csm.pA);
      $$0.put(csm.ng, csm.pA);
      $$0.put(csm.jI, csm.pu);
      $$0.put(csm.nw, csm.pu);
      $$0.put(csm.jE, csm.pE);
      $$0.put(csm.jD, csm.pE);
      $$0.put(csm.jK, csm.pz);
      $$0.put(csm.nu, csm.pz);
      $$0.put(csm.nK, csm.pB);
      $$0.put(csm.nI, csm.pB);
      $$0.put(csm.fP, csm.pt);
      $$0.put(csm.fQ, csm.pt);
      $$0.put(csm.eL, csm.py);
      $$0.put(csm.eK, csm.px);
      $$0.put(csm.eX, csm.eY);
   });

   private dxr() {
   }

   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      csl $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dez $$7 = $$4.b();
         dez $$8 = $$6.n();
         if ($$7.b(daf.a)) {
            $$8 = $$8.a(daf.a, $$7.c(daf.a));
         }

         if ($$7.b(daf.b)) {
            $$8 = $$8.a(daf.b, $$7.c(daf.b));
         }

         if ($$7.b(czo.a)) {
            $$8 = $$8.a(czo.a, $$7.c(czo.a));
         }

         return new dyr.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dyq<?> a() {
      return dyq.l;
   }
}
