import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eqn extends erl {
   public static final MapCodec<eqn> a = MapCodec.unit(() -> eqn.b);
   public static final eqn b = new eqn();
   private final Map<djm, djm> c = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(djo.m, djo.pT);
      $$0.put(djo.cu, djo.pT);
      $$0.put(djo.b, djo.pX);
      $$0.put(djo.eV, djo.pY);
      $$0.put(djo.eW, djo.pY);
      $$0.put(djo.cZ, djo.pU);
      $$0.put(djo.nK, djo.pU);
      $$0.put(djo.nM, djo.qf);
      $$0.put(djo.fy, djo.qc);
      $$0.put(djo.nI, djo.qc);
      $$0.put(djo.kh, djo.pW);
      $$0.put(djo.nY, djo.pW);
      $$0.put(djo.kd, djo.qg);
      $$0.put(djo.kc, djo.qg);
      $$0.put(djo.kj, djo.qb);
      $$0.put(djo.nW, djo.qb);
      $$0.put(djo.om, djo.qd);
      $$0.put(djo.ok, djo.qd);
      $$0.put(djo.gk, djo.pV);
      $$0.put(djo.gl, djo.pV);
      $$0.put(djo.eY, djo.qa);
      $$0.put(djo.eX, djo.pZ);
      $$0.put(djo.fk, djo.fl);
   });

   private eqn() {
   }

   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      djm $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dwx $$7 = $$4.b();
         dwx $$8 = $$6.m();
         if ($$7.b(drl.b)) {
            $$8 = $$8.b(drl.b, $$7.c(drl.b));
         }

         if ($$7.b(drl.c)) {
            $$8 = $$8.b(drl.c, $$7.c(drl.c));
         }

         if ($$7.b(dqu.b)) {
            $$8 = $$8.b(dqu.b, $$7.c(dqu.b));
         }

         return new ero.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ern<?> a() {
      return ern.l;
   }
}
