import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class erk extends esi {
   public static final MapCodec<erk> a = MapCodec.unit(() -> erk.b);
   public static final erk b = new erk();
   private final Map<dke, dke> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkg.m, dkg.pT);
      $$0.put(dkg.cu, dkg.pT);
      $$0.put(dkg.b, dkg.pX);
      $$0.put(dkg.eV, dkg.pY);
      $$0.put(dkg.eW, dkg.pY);
      $$0.put(dkg.cZ, dkg.pU);
      $$0.put(dkg.nK, dkg.pU);
      $$0.put(dkg.nM, dkg.qf);
      $$0.put(dkg.fy, dkg.qc);
      $$0.put(dkg.nI, dkg.qc);
      $$0.put(dkg.kh, dkg.pW);
      $$0.put(dkg.nY, dkg.pW);
      $$0.put(dkg.kd, dkg.qg);
      $$0.put(dkg.kc, dkg.qg);
      $$0.put(dkg.kj, dkg.qb);
      $$0.put(dkg.nW, dkg.qb);
      $$0.put(dkg.om, dkg.qd);
      $$0.put(dkg.ok, dkg.qd);
      $$0.put(dkg.gk, dkg.pV);
      $$0.put(dkg.gl, dkg.pV);
      $$0.put(dkg.eY, dkg.qa);
      $$0.put(dkg.eX, dkg.pZ);
      $$0.put(dkg.fk, dkg.fl);
   });

   private erk() {
   }

   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      dke $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dxq $$7 = $$4.b();
         dxq $$8 = $$6.m();
         if ($$7.b(dse.b)) {
            $$8 = $$8.b(dse.b, $$7.c(dse.b));
         }

         if ($$7.b(dse.c)) {
            $$8 = $$8.b(dse.c, $$7.c(dse.c));
         }

         if ($$7.b(drn.b)) {
            $$8 = $$8.b(drn.b, $$7.c(drn.b));
         }

         return new esl.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected esk<?> a() {
      return esk.l;
   }
}
