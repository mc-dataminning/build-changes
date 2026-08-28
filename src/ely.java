import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ely extends emv {
   public static final MapCodec<ely> a = MapCodec.unit(() -> ely.b);
   public static final ely b = new ely();
   private final Map<dfi, dfi> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfk.m, dfk.pr);
      $$0.put(dfk.cn, dfk.pr);
      $$0.put(dfk.b, dfk.pv);
      $$0.put(dfk.eH, dfk.pw);
      $$0.put(dfk.eI, dfk.pw);
      $$0.put(dfk.cQ, dfk.ps);
      $$0.put(dfk.ni, dfk.ps);
      $$0.put(dfk.nk, dfk.pD);
      $$0.put(dfk.fj, dfk.pA);
      $$0.put(dfk.ng, dfk.pA);
      $$0.put(dfk.jI, dfk.pu);
      $$0.put(dfk.nw, dfk.pu);
      $$0.put(dfk.jE, dfk.pE);
      $$0.put(dfk.jD, dfk.pE);
      $$0.put(dfk.jK, dfk.pz);
      $$0.put(dfk.nu, dfk.pz);
      $$0.put(dfk.nK, dfk.pB);
      $$0.put(dfk.nI, dfk.pB);
      $$0.put(dfk.fP, dfk.pt);
      $$0.put(dfk.fQ, dfk.pt);
      $$0.put(dfk.eK, dfk.py);
      $$0.put(dfk.eJ, dfk.px);
      $$0.put(dfk.eW, dfk.eX);
   });

   private ely() {
   }

   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      dfi $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsl $$7 = $$4.b();
         dsl $$8 = $$6.o();
         if ($$7.b(dnc.b)) {
            $$8 = $$8.a(dnc.b, $$7.c(dnc.b));
         }

         if ($$7.b(dnc.c)) {
            $$8 = $$8.a(dnc.c, $$7.c(dnc.c));
         }

         if ($$7.b(dml.b)) {
            $$8 = $$8.a(dml.b, $$7.c(dml.b));
         }

         return new emy.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emx<?> a() {
      return emx.l;
   }
}
