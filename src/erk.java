import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class erk extends esi {
   public static final MapCodec<erk> a = MapCodec.unit(() -> erk.b);
   public static final erk b = new erk();
   private final Map<dkl, dkl> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkn.m, dkn.pM);
      $$0.put(dkn.cu, dkn.pM);
      $$0.put(dkn.b, dkn.pQ);
      $$0.put(dkn.eV, dkn.pR);
      $$0.put(dkn.eW, dkn.pR);
      $$0.put(dkn.cZ, dkn.pN);
      $$0.put(dkn.nD, dkn.pN);
      $$0.put(dkn.nF, dkn.pY);
      $$0.put(dkn.fx, dkn.pV);
      $$0.put(dkn.nB, dkn.pV);
      $$0.put(dkn.ka, dkn.pP);
      $$0.put(dkn.nR, dkn.pP);
      $$0.put(dkn.jW, dkn.pZ);
      $$0.put(dkn.jV, dkn.pZ);
      $$0.put(dkn.kc, dkn.pU);
      $$0.put(dkn.nP, dkn.pU);
      $$0.put(dkn.of, dkn.pW);
      $$0.put(dkn.od, dkn.pW);
      $$0.put(dkn.gd, dkn.pO);
      $$0.put(dkn.ge, dkn.pO);
      $$0.put(dkn.eY, dkn.pT);
      $$0.put(dkn.eX, dkn.pS);
      $$0.put(dkn.fk, dkn.fl);
   });

   private erk() {
   }

   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      dkl $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dxu $$7 = $$4.b();
         dxu $$8 = $$6.m();
         if ($$7.b(dsi.b)) {
            $$8 = $$8.b(dsi.b, $$7.c(dsi.b));
         }

         if ($$7.b(dsi.c)) {
            $$8 = $$8.b(dsi.c, $$7.c(dsi.c));
         }

         if ($$7.b(drr.b)) {
            $$8 = $$8.b(drr.b, $$7.c(drr.b));
         }

         return new esl.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected esk<?> a() {
      return esk.l;
   }
}
