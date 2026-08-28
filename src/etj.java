import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class etj extends euh {
   public static final MapCodec<etj> a = MapCodec.unit(() -> etj.b);
   public static final etj b = new etj();
   private final Map<dlu, dlu> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlw.m, dlw.pV);
      $$0.put(dlw.cu, dlw.pV);
      $$0.put(dlw.b, dlw.pZ);
      $$0.put(dlw.eV, dlw.qa);
      $$0.put(dlw.eW, dlw.qa);
      $$0.put(dlw.cZ, dlw.pW);
      $$0.put(dlw.nK, dlw.pW);
      $$0.put(dlw.nM, dlw.qh);
      $$0.put(dlw.fy, dlw.qe);
      $$0.put(dlw.nI, dlw.qe);
      $$0.put(dlw.kh, dlw.pY);
      $$0.put(dlw.nY, dlw.pY);
      $$0.put(dlw.kd, dlw.qi);
      $$0.put(dlw.kc, dlw.qi);
      $$0.put(dlw.kj, dlw.qd);
      $$0.put(dlw.nW, dlw.qd);
      $$0.put(dlw.om, dlw.qf);
      $$0.put(dlw.ok, dlw.qf);
      $$0.put(dlw.gk, dlw.pX);
      $$0.put(dlw.gl, dlw.pX);
      $$0.put(dlw.eY, dlw.qc);
      $$0.put(dlw.eX, dlw.qb);
      $$0.put(dlw.fk, dlw.fl);
   });

   private etj() {
   }

   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      dlu $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dzo $$7 = $$4.b();
         dzo $$8 = $$6.m();
         if ($$7.b(dtu.b)) {
            $$8 = $$8.b(dtu.b, $$7.c(dtu.b));
         }

         if ($$7.b(dtu.c)) {
            $$8 = $$8.b(dtu.c, $$7.c(dtu.c));
         }

         if ($$7.b(dtd.b)) {
            $$8 = $$8.b(dtd.b, $$7.c(dtd.b));
         }

         return new euk.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected euj<?> a() {
      return euj.l;
   }
}
