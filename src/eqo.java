import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eqo extends erm {
   public static final MapCodec<eqo> a = MapCodec.unit(() -> eqo.b);
   public static final eqo b = new eqo();
   private final Map<djn, djn> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(djp.m, djp.pT);
      $$0.put(djp.cu, djp.pT);
      $$0.put(djp.b, djp.pX);
      $$0.put(djp.eV, djp.pY);
      $$0.put(djp.eW, djp.pY);
      $$0.put(djp.cZ, djp.pU);
      $$0.put(djp.nK, djp.pU);
      $$0.put(djp.nM, djp.qf);
      $$0.put(djp.fy, djp.qc);
      $$0.put(djp.nI, djp.qc);
      $$0.put(djp.kh, djp.pW);
      $$0.put(djp.nY, djp.pW);
      $$0.put(djp.kd, djp.qg);
      $$0.put(djp.kc, djp.qg);
      $$0.put(djp.kj, djp.qb);
      $$0.put(djp.nW, djp.qb);
      $$0.put(djp.om, djp.qd);
      $$0.put(djp.ok, djp.qd);
      $$0.put(djp.gk, djp.pV);
      $$0.put(djp.gl, djp.pV);
      $$0.put(djp.eY, djp.qa);
      $$0.put(djp.eX, djp.pZ);
      $$0.put(djp.fk, djp.fl);
   });

   private eqo() {
   }

   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      djn $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dwy $$7 = $$4.b();
         dwy $$8 = $$6.m();
         if ($$7.b(drm.b)) {
            $$8 = $$8.b(drm.b, $$7.c(drm.b));
         }

         if ($$7.b(drm.c)) {
            $$8 = $$8.b(drm.c, $$7.c(drm.c));
         }

         if ($$7.b(dqv.b)) {
            $$8 = $$8.b(dqv.b, $$7.c(dqv.b));
         }

         return new erp.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ero<?> a() {
      return ero.l;
   }
}
