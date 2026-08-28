import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eql extends erj {
   public static final MapCodec<eql> a = MapCodec.unit(() -> eql.b);
   public static final eql b = new eql();
   private final Map<djk, djk> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(djm.m, djm.pT);
      $$0.put(djm.cu, djm.pT);
      $$0.put(djm.b, djm.pX);
      $$0.put(djm.eV, djm.pY);
      $$0.put(djm.eW, djm.pY);
      $$0.put(djm.cZ, djm.pU);
      $$0.put(djm.nK, djm.pU);
      $$0.put(djm.nM, djm.qf);
      $$0.put(djm.fy, djm.qc);
      $$0.put(djm.nI, djm.qc);
      $$0.put(djm.kh, djm.pW);
      $$0.put(djm.nY, djm.pW);
      $$0.put(djm.kd, djm.qg);
      $$0.put(djm.kc, djm.qg);
      $$0.put(djm.kj, djm.qb);
      $$0.put(djm.nW, djm.qb);
      $$0.put(djm.om, djm.qd);
      $$0.put(djm.ok, djm.qd);
      $$0.put(djm.gk, djm.pV);
      $$0.put(djm.gl, djm.pV);
      $$0.put(djm.eY, djm.qa);
      $$0.put(djm.eX, djm.pZ);
      $$0.put(djm.fk, djm.fl);
   });

   private eql() {
   }

   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      djk $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dwv $$7 = $$4.b();
         dwv $$8 = $$6.m();
         if ($$7.b(drj.b)) {
            $$8 = $$8.b(drj.b, $$7.c(drj.b));
         }

         if ($$7.b(drj.c)) {
            $$8 = $$8.b(drj.c, $$7.c(drj.c));
         }

         if ($$7.b(dqs.b)) {
            $$8 = $$8.b(dqs.b, $$7.c(dqs.b));
         }

         return new erm.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected erl<?> a() {
      return erl.l;
   }
}
