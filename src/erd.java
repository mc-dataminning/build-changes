import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class erd extends esb {
   public static final MapCodec<erd> a = MapCodec.unit(() -> erd.b);
   public static final erd b = new erd();
   private final Map<dke, dke> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkg.m, dkg.pM);
      $$0.put(dkg.cu, dkg.pM);
      $$0.put(dkg.b, dkg.pQ);
      $$0.put(dkg.eV, dkg.pR);
      $$0.put(dkg.eW, dkg.pR);
      $$0.put(dkg.cZ, dkg.pN);
      $$0.put(dkg.nD, dkg.pN);
      $$0.put(dkg.nF, dkg.pY);
      $$0.put(dkg.fx, dkg.pV);
      $$0.put(dkg.nB, dkg.pV);
      $$0.put(dkg.ka, dkg.pP);
      $$0.put(dkg.nR, dkg.pP);
      $$0.put(dkg.jW, dkg.pZ);
      $$0.put(dkg.jV, dkg.pZ);
      $$0.put(dkg.kc, dkg.pU);
      $$0.put(dkg.nP, dkg.pU);
      $$0.put(dkg.of, dkg.pW);
      $$0.put(dkg.od, dkg.pW);
      $$0.put(dkg.gd, dkg.pO);
      $$0.put(dkg.ge, dkg.pO);
      $$0.put(dkg.eY, dkg.pT);
      $$0.put(dkg.eX, dkg.pS);
      $$0.put(dkg.fk, dkg.fl);
   });

   private erd() {
   }

   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      dke $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dxn $$7 = $$4.b();
         dxn $$8 = $$6.m();
         if ($$7.b(dsb.b)) {
            $$8 = $$8.b(dsb.b, $$7.c(dsb.b));
         }

         if ($$7.b(dsb.c)) {
            $$8 = $$8.b(dsb.c, $$7.c(dsb.c));
         }

         if ($$7.b(drk.b)) {
            $$8 = $$8.b(drk.b, $$7.c(drk.b));
         }

         return new ese.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected esd<?> a() {
      return esd.l;
   }
}
