import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class erl extends esj {
   public static final MapCodec<erl> a = MapCodec.unit(() -> erl.b);
   public static final erl b = new erl();
   private final Map<dkm, dkm> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dko.m, dko.pM);
      $$0.put(dko.cu, dko.pM);
      $$0.put(dko.b, dko.pQ);
      $$0.put(dko.eV, dko.pR);
      $$0.put(dko.eW, dko.pR);
      $$0.put(dko.cZ, dko.pN);
      $$0.put(dko.nD, dko.pN);
      $$0.put(dko.nF, dko.pY);
      $$0.put(dko.fx, dko.pV);
      $$0.put(dko.nB, dko.pV);
      $$0.put(dko.ka, dko.pP);
      $$0.put(dko.nR, dko.pP);
      $$0.put(dko.jW, dko.pZ);
      $$0.put(dko.jV, dko.pZ);
      $$0.put(dko.kc, dko.pU);
      $$0.put(dko.nP, dko.pU);
      $$0.put(dko.of, dko.pW);
      $$0.put(dko.od, dko.pW);
      $$0.put(dko.gd, dko.pO);
      $$0.put(dko.ge, dko.pO);
      $$0.put(dko.eY, dko.pT);
      $$0.put(dko.eX, dko.pS);
      $$0.put(dko.fk, dko.fl);
   });

   private erl() {
   }

   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      dkm $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dxv $$7 = $$4.b();
         dxv $$8 = $$6.m();
         if ($$7.b(dsj.b)) {
            $$8 = $$8.b(dsj.b, $$7.c(dsj.b));
         }

         if ($$7.b(dsj.c)) {
            $$8 = $$8.b(dsj.c, $$7.c(dsj.c));
         }

         if ($$7.b(drs.b)) {
            $$8 = $$8.b(drs.b, $$7.c(drs.b));
         }

         return new esm.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected esl<?> a() {
      return esl.l;
   }
}
