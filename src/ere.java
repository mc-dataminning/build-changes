import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ere extends esc {
   public static final MapCodec<ere> a = MapCodec.unit(() -> ere.b);
   public static final ere b = new ere();
   private final Map<dkd, dkd> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkf.m, dkf.pT);
      $$0.put(dkf.cu, dkf.pT);
      $$0.put(dkf.b, dkf.pX);
      $$0.put(dkf.eV, dkf.pY);
      $$0.put(dkf.eW, dkf.pY);
      $$0.put(dkf.cZ, dkf.pU);
      $$0.put(dkf.nK, dkf.pU);
      $$0.put(dkf.nM, dkf.qf);
      $$0.put(dkf.fy, dkf.qc);
      $$0.put(dkf.nI, dkf.qc);
      $$0.put(dkf.kh, dkf.pW);
      $$0.put(dkf.nY, dkf.pW);
      $$0.put(dkf.kd, dkf.qg);
      $$0.put(dkf.kc, dkf.qg);
      $$0.put(dkf.kj, dkf.qb);
      $$0.put(dkf.nW, dkf.qb);
      $$0.put(dkf.om, dkf.qd);
      $$0.put(dkf.ok, dkf.qd);
      $$0.put(dkf.gk, dkf.pV);
      $$0.put(dkf.gl, dkf.pV);
      $$0.put(dkf.eY, dkf.qa);
      $$0.put(dkf.eX, dkf.pZ);
      $$0.put(dkf.fk, dkf.fl);
   });

   private ere() {
   }

   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      dkd $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dxo $$7 = $$4.b();
         dxo $$8 = $$6.m();
         if ($$7.b(dsc.b)) {
            $$8 = $$8.b(dsc.b, $$7.c(dsc.b));
         }

         if ($$7.b(dsc.c)) {
            $$8 = $$8.b(dsc.c, $$7.c(dsc.c));
         }

         if ($$7.b(drl.b)) {
            $$8 = $$8.b(drl.b, $$7.c(drl.b));
         }

         return new esf.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ese<?> a() {
      return ese.l;
   }
}
