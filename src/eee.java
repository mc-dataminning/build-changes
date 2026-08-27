import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eee extends efb {
   public static final Codec<eee> a = Codec.unit(() -> eee.b);
   public static final eee b = new eee();
   private final Map<cyo, cyo> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cyq.m, cyq.pr);
      $$0.put(cyq.cn, cyq.pr);
      $$0.put(cyq.b, cyq.pv);
      $$0.put(cyq.eH, cyq.pw);
      $$0.put(cyq.eI, cyq.pw);
      $$0.put(cyq.cQ, cyq.ps);
      $$0.put(cyq.ni, cyq.ps);
      $$0.put(cyq.nk, cyq.pD);
      $$0.put(cyq.fj, cyq.pA);
      $$0.put(cyq.ng, cyq.pA);
      $$0.put(cyq.jI, cyq.pu);
      $$0.put(cyq.nw, cyq.pu);
      $$0.put(cyq.jE, cyq.pE);
      $$0.put(cyq.jD, cyq.pE);
      $$0.put(cyq.jK, cyq.pz);
      $$0.put(cyq.nu, cyq.pz);
      $$0.put(cyq.nK, cyq.pB);
      $$0.put(cyq.nI, cyq.pB);
      $$0.put(cyq.fP, cyq.pt);
      $$0.put(cyq.fQ, cyq.pt);
      $$0.put(cyq.eK, cyq.py);
      $$0.put(cyq.eJ, cyq.px);
      $$0.put(cyq.eW, cyq.eX);
   });

   private eee() {
   }

   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      cyo $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dlf $$7 = $$4.b();
         dlf $$8 = $$6.o();
         if ($$7.b(dgh.b)) {
            $$8 = $$8.a(dgh.b, $$7.c(dgh.b));
         }

         if ($$7.b(dgh.c)) {
            $$8 = $$8.a(dgh.c, $$7.c(dgh.c));
         }

         if ($$7.b(dfq.b)) {
            $$8 = $$8.a(dfq.b, $$7.c(dfq.b));
         }

         return new efe.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected efd<?> a() {
      return efd.l;
   }
}
