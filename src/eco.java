import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eco extends edl {
   public static final Codec<eco> a = Codec.unit(() -> eco.b);
   public static final eco b = new eco();
   private final Map<cwy, cwy> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cxa.m, cxa.pr);
      $$0.put(cxa.cn, cxa.pr);
      $$0.put(cxa.b, cxa.pv);
      $$0.put(cxa.eH, cxa.pw);
      $$0.put(cxa.eI, cxa.pw);
      $$0.put(cxa.cQ, cxa.ps);
      $$0.put(cxa.ni, cxa.ps);
      $$0.put(cxa.nk, cxa.pD);
      $$0.put(cxa.fj, cxa.pA);
      $$0.put(cxa.ng, cxa.pA);
      $$0.put(cxa.jI, cxa.pu);
      $$0.put(cxa.nw, cxa.pu);
      $$0.put(cxa.jE, cxa.pE);
      $$0.put(cxa.jD, cxa.pE);
      $$0.put(cxa.jK, cxa.pz);
      $$0.put(cxa.nu, cxa.pz);
      $$0.put(cxa.nK, cxa.pB);
      $$0.put(cxa.nI, cxa.pB);
      $$0.put(cxa.fP, cxa.pt);
      $$0.put(cxa.fQ, cxa.pt);
      $$0.put(cxa.eK, cxa.py);
      $$0.put(cxa.eJ, cxa.px);
      $$0.put(cxa.eW, cxa.eX);
   });

   private eco() {
   }

   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      cwy $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         djp $$7 = $$4.b();
         djp $$8 = $$6.o();
         if ($$7.b(der.b)) {
            $$8 = $$8.a(der.b, $$7.c(der.b));
         }

         if ($$7.b(der.c)) {
            $$8 = $$8.a(der.c, $$7.c(der.c));
         }

         if ($$7.b(dea.b)) {
            $$8 = $$8.a(dea.b, $$7.c(dea.b));
         }

         return new edo.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected edn<?> a() {
      return edn.l;
   }
}
