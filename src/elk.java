import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class elk extends emh {
   public static final MapCodec<elk> a = MapCodec.unit(() -> elk.b);
   public static final elk b = new elk();
   private final Map<dez, dez> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfb.m, dfb.pr);
      $$0.put(dfb.cn, dfb.pr);
      $$0.put(dfb.b, dfb.pv);
      $$0.put(dfb.eH, dfb.pw);
      $$0.put(dfb.eI, dfb.pw);
      $$0.put(dfb.cQ, dfb.ps);
      $$0.put(dfb.ni, dfb.ps);
      $$0.put(dfb.nk, dfb.pD);
      $$0.put(dfb.fj, dfb.pA);
      $$0.put(dfb.ng, dfb.pA);
      $$0.put(dfb.jI, dfb.pu);
      $$0.put(dfb.nw, dfb.pu);
      $$0.put(dfb.jE, dfb.pE);
      $$0.put(dfb.jD, dfb.pE);
      $$0.put(dfb.jK, dfb.pz);
      $$0.put(dfb.nu, dfb.pz);
      $$0.put(dfb.nK, dfb.pB);
      $$0.put(dfb.nI, dfb.pB);
      $$0.put(dfb.fP, dfb.pt);
      $$0.put(dfb.fQ, dfb.pt);
      $$0.put(dfb.eK, dfb.py);
      $$0.put(dfb.eJ, dfb.px);
      $$0.put(dfb.eW, dfb.eX);
   });

   private elk() {
   }

   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      dez $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsc $$7 = $$4.b();
         dsc $$8 = $$6.o();
         if ($$7.b(dmt.b)) {
            $$8 = $$8.a(dmt.b, $$7.c(dmt.b));
         }

         if ($$7.b(dmt.c)) {
            $$8 = $$8.a(dmt.c, $$7.c(dmt.c));
         }

         if ($$7.b(dmc.b)) {
            $$8 = $$8.a(dmc.b, $$7.c(dmc.b));
         }

         return new emk.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emj<?> a() {
      return emj.l;
   }
}
