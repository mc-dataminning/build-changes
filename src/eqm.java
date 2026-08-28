import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eqm extends erk {
   public static final MapCodec<eqm> a = MapCodec.unit(() -> eqm.b);
   public static final eqm b = new eqm();
   private final Map<djl, djl> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(djn.m, djn.pT);
      $$0.put(djn.cu, djn.pT);
      $$0.put(djn.b, djn.pX);
      $$0.put(djn.eV, djn.pY);
      $$0.put(djn.eW, djn.pY);
      $$0.put(djn.cZ, djn.pU);
      $$0.put(djn.nK, djn.pU);
      $$0.put(djn.nM, djn.qf);
      $$0.put(djn.fy, djn.qc);
      $$0.put(djn.nI, djn.qc);
      $$0.put(djn.kh, djn.pW);
      $$0.put(djn.nY, djn.pW);
      $$0.put(djn.kd, djn.qg);
      $$0.put(djn.kc, djn.qg);
      $$0.put(djn.kj, djn.qb);
      $$0.put(djn.nW, djn.qb);
      $$0.put(djn.om, djn.qd);
      $$0.put(djn.ok, djn.qd);
      $$0.put(djn.gk, djn.pV);
      $$0.put(djn.gl, djn.pV);
      $$0.put(djn.eY, djn.qa);
      $$0.put(djn.eX, djn.pZ);
      $$0.put(djn.fk, djn.fl);
   });

   private eqm() {
   }

   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      djl $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dww $$7 = $$4.b();
         dww $$8 = $$6.m();
         if ($$7.b(drk.b)) {
            $$8 = $$8.b(drk.b, $$7.c(drk.b));
         }

         if ($$7.b(drk.c)) {
            $$8 = $$8.b(drk.c, $$7.c(drk.c));
         }

         if ($$7.b(dqt.b)) {
            $$8 = $$8.b(dqt.b, $$7.c(dqt.b));
         }

         return new ern.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected erm<?> a() {
      return erm.l;
   }
}
