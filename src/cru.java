import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cru extends csp {
   protected static final Map<dff, dff> a = new Builder()
      .put(dfh.ao, dfh.aw)
      .put(dfh.U, dfh.al)
      .put(dfh.au, dfh.aC)
      .put(dfh.aa, dfh.ak)
      .put(dfh.as, dfh.aA)
      .put(dfh.Y, dfh.ai)
      .put(dfh.at, dfh.aB)
      .put(dfh.Z, dfh.aj)
      .put(dfh.aq, dfh.ay)
      .put(dfh.W, dfh.ag)
      .put(dfh.ar, dfh.az)
      .put(dfh.X, dfh.ah)
      .put(dfh.ap, dfh.ax)
      .put(dfh.V, dfh.af)
      .put(dfh.oj, dfh.ok)
      .put(dfh.ol, dfh.om)
      .put(dfh.os, dfh.ot)
      .put(dfh.ou, dfh.ov)
      .put(dfh.av, dfh.aD)
      .put(dfh.ab, dfh.am)
      .put(dfh.ae, dfh.an)
      .build();

   public cru(cvp $$0, ctv.a $$1) {
      super($$0, avu.bA, $$1);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      cmh $$3 = $$0.o();
      if (b($$0)) {
         return bqd.e;
      } else {
         Optional<dsh> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bqd.e;
         } else {
            cua $$5 = $$0.n();
            if ($$3 instanceof aql) {
               am.N.a((aql)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dxa.c, $$2, dxa.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bsy.d($$0.p()));
            }

            return bqd.a($$1.B);
         }
      }
   }

   private static boolean b(cxm $$0) {
      cmh $$1 = $$0.o();
      return $$0.p().equals(bqc.a) && $$1.eU().a(cud.vs) && !$$1.fN();
   }

   private Optional<dsh> a(dcd $$0, ja $$1, @Nullable cmh $$2, dsh $$3) {
      Optional<dsh> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avf.aH, avg.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsh> $$5 = dok.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avf.aI, avg.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsh> $$6 = Optional.ofNullable((dff)ctq.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avf.aJ, avg.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dsh> a(dsh $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dlr.i, $$0.c(dlr.i)));
   }
}
