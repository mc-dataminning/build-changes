import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ell extends emi {
   public static final MapCodec<ell> a = MapCodec.unit(() -> ell.b);
   public static final ell b = new ell();
   private final Map<dfa, dfa> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfc.m, dfc.pr);
      $$0.put(dfc.cn, dfc.pr);
      $$0.put(dfc.b, dfc.pv);
      $$0.put(dfc.eH, dfc.pw);
      $$0.put(dfc.eI, dfc.pw);
      $$0.put(dfc.cQ, dfc.ps);
      $$0.put(dfc.ni, dfc.ps);
      $$0.put(dfc.nk, dfc.pD);
      $$0.put(dfc.fj, dfc.pA);
      $$0.put(dfc.ng, dfc.pA);
      $$0.put(dfc.jI, dfc.pu);
      $$0.put(dfc.nw, dfc.pu);
      $$0.put(dfc.jE, dfc.pE);
      $$0.put(dfc.jD, dfc.pE);
      $$0.put(dfc.jK, dfc.pz);
      $$0.put(dfc.nu, dfc.pz);
      $$0.put(dfc.nK, dfc.pB);
      $$0.put(dfc.nI, dfc.pB);
      $$0.put(dfc.fP, dfc.pt);
      $$0.put(dfc.fQ, dfc.pt);
      $$0.put(dfc.eK, dfc.py);
      $$0.put(dfc.eJ, dfc.px);
      $$0.put(dfc.eW, dfc.eX);
   });

   private ell() {
   }

   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      dfa $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsd $$7 = $$4.b();
         dsd $$8 = $$6.o();
         if ($$7.b(dmu.b)) {
            $$8 = $$8.a(dmu.b, $$7.c(dmu.b));
         }

         if ($$7.b(dmu.c)) {
            $$8 = $$8.a(dmu.c, $$7.c(dmu.c));
         }

         if ($$7.b(dmd.b)) {
            $$8 = $$8.a(dmd.b, $$7.c(dmd.b));
         }

         return new eml.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emk<?> a() {
      return emk.l;
   }
}
