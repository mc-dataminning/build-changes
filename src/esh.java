import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class esh extends etf {
   public static final MapCodec<esh> a = MapCodec.unit(() -> esh.b);
   public static final esh b = new esh();
   private final Map<dku, dku> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkw.m, dkw.pV);
      $$0.put(dkw.cu, dkw.pV);
      $$0.put(dkw.b, dkw.pZ);
      $$0.put(dkw.eV, dkw.qa);
      $$0.put(dkw.eW, dkw.qa);
      $$0.put(dkw.cZ, dkw.pW);
      $$0.put(dkw.nK, dkw.pW);
      $$0.put(dkw.nM, dkw.qh);
      $$0.put(dkw.fy, dkw.qe);
      $$0.put(dkw.nI, dkw.qe);
      $$0.put(dkw.kh, dkw.pY);
      $$0.put(dkw.nY, dkw.pY);
      $$0.put(dkw.kd, dkw.qi);
      $$0.put(dkw.kc, dkw.qi);
      $$0.put(dkw.kj, dkw.qd);
      $$0.put(dkw.nW, dkw.qd);
      $$0.put(dkw.om, dkw.qf);
      $$0.put(dkw.ok, dkw.qf);
      $$0.put(dkw.gk, dkw.pX);
      $$0.put(dkw.gl, dkw.pX);
      $$0.put(dkw.eY, dkw.qc);
      $$0.put(dkw.eX, dkw.qb);
      $$0.put(dkw.fk, dkw.fl);
   });

   private esh() {
   }

   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      dku $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dym $$7 = $$4.b();
         dym $$8 = $$6.m();
         if ($$7.b(dsu.b)) {
            $$8 = $$8.b(dsu.b, $$7.c(dsu.b));
         }

         if ($$7.b(dsu.c)) {
            $$8 = $$8.b(dsu.c, $$7.c(dsu.c));
         }

         if ($$7.b(dsd.b)) {
            $$8 = $$8.b(dsd.b, $$7.c(dsd.b));
         }

         return new eti.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eth<?> a() {
      return eth.l;
   }
}
