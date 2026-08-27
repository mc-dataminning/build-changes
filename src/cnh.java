import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnh extends coc {
   protected static final Map<czf, czf> a = new Builder()
      .put(czh.ao, czh.aw)
      .put(czh.U, czh.al)
      .put(czh.au, czh.aC)
      .put(czh.aa, czh.ak)
      .put(czh.as, czh.aA)
      .put(czh.Y, czh.ai)
      .put(czh.at, czh.aB)
      .put(czh.Z, czh.aj)
      .put(czh.aq, czh.ay)
      .put(czh.W, czh.ag)
      .put(czh.ar, czh.az)
      .put(czh.X, czh.ah)
      .put(czh.ap, czh.ax)
      .put(czh.V, czh.af)
      .put(czh.oj, czh.ok)
      .put(czh.ol, czh.om)
      .put(czh.os, czh.ot)
      .put(czh.ou, czh.ov)
      .put(czh.av, czh.aD)
      .put(czh.ab, czh.am)
      .put(czh.ae, czh.an)
      .build();

   protected cnh(crd $$0, float $$1, float $$2, cpl.a $$3) {
      super($$1, $$2, $$0, aue.bz, $$3);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      cia $$3 = $$0.o();
      Optional<dme> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bml.d;
      } else {
         cpq $$5 = $$0.n();
         if ($$3 instanceof apb) {
            am.N.a((apb)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dqr.c, $$2, dqr.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, box.d($$0.p()));
         }

         return bml.a($$1.B);
      }
   }

   private Optional<dme> a(cwe $$0, ib $$1, @Nullable cia $$2, dme $$3) {
      Optional<dme> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, atp.aF, atq.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dme> $$5 = dij.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, atp.aG, atq.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dme> $$6 = Optional.ofNullable((czf)cpg.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, atp.aH, atq.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dme> b(dme $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dfq.i, $$0.c(dfq.i)));
   }
}
