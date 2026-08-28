import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class etu extends eus {
   public static final MapCodec<etu> a = MapCodec.unit(() -> etu.b);
   public static final etu b = new etu();
   private final Map<dma, dma> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmc.m, dmc.pW);
      $$0.put(dmc.cv, dmc.pW);
      $$0.put(dmc.b, dmc.qa);
      $$0.put(dmc.eW, dmc.qb);
      $$0.put(dmc.eX, dmc.qb);
      $$0.put(dmc.da, dmc.pX);
      $$0.put(dmc.nL, dmc.pX);
      $$0.put(dmc.nN, dmc.qi);
      $$0.put(dmc.fz, dmc.qf);
      $$0.put(dmc.nJ, dmc.qf);
      $$0.put(dmc.ki, dmc.pZ);
      $$0.put(dmc.nZ, dmc.pZ);
      $$0.put(dmc.ke, dmc.qj);
      $$0.put(dmc.kd, dmc.qj);
      $$0.put(dmc.kk, dmc.qe);
      $$0.put(dmc.nX, dmc.qe);
      $$0.put(dmc.on, dmc.qg);
      $$0.put(dmc.ol, dmc.qg);
      $$0.put(dmc.gl, dmc.pY);
      $$0.put(dmc.gm, dmc.pY);
      $$0.put(dmc.eZ, dmc.qd);
      $$0.put(dmc.eY, dmc.qc);
      $$0.put(dmc.fl, dmc.fm);
   });

   private etu() {
   }

   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      dma $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dzz $$7 = $$4.b();
         dzz $$8 = $$6.m();
         if ($$7.b(duc.b)) {
            $$8 = $$8.b(duc.b, $$7.c(duc.b));
         }

         if ($$7.b(duc.c)) {
            $$8 = $$8.b(duc.c, $$7.c(duc.c));
         }

         if ($$7.b(dtl.b)) {
            $$8 = $$8.b(dtl.b, $$7.c(dtl.b));
         }

         return new euv.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected euu<?> a() {
      return euu.l;
   }
}
