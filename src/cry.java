import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cry extends css {
   protected static final Map<dfi, dfi> a = new Builder()
      .put(dfk.ao, dfk.aw)
      .put(dfk.U, dfk.al)
      .put(dfk.au, dfk.aC)
      .put(dfk.aa, dfk.ak)
      .put(dfk.as, dfk.aA)
      .put(dfk.Y, dfk.ai)
      .put(dfk.at, dfk.aB)
      .put(dfk.Z, dfk.aj)
      .put(dfk.aq, dfk.ay)
      .put(dfk.W, dfk.ag)
      .put(dfk.ar, dfk.az)
      .put(dfk.X, dfk.ah)
      .put(dfk.ap, dfk.ax)
      .put(dfk.V, dfk.af)
      .put(dfk.oj, dfk.ok)
      .put(dfk.ol, dfk.om)
      .put(dfk.os, dfk.ot)
      .put(dfk.ou, dfk.ov)
      .put(dfk.av, dfk.aD)
      .put(dfk.ab, dfk.am)
      .put(dfk.ae, dfk.an)
      .build();

   public cry(cvs $$0, cty.a $$1) {
      super($$0, avw.bA, $$1);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      cml $$3 = $$0.o();
      if (b($$0)) {
         return bqh.e;
      } else {
         Optional<dsl> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bqh.e;
         } else {
            cud $$5 = $$0.n();
            if ($$3 instanceof aqn) {
               am.N.a((aqn)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dxh.c, $$2, dxh.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, btc.d($$0.p()));
            }

            return bqh.a($$1.B);
         }
      }
   }

   private static boolean b(cxp $$0) {
      cml $$1 = $$0.o();
      return $$0.p().equals(bqg.a) && $$1.eW().a(cug.vs) && !$$1.fP();
   }

   private Optional<dsl> a(dcg $$0, ja $$1, @Nullable cml $$2, dsl $$3) {
      Optional<dsl> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avh.aH, avi.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsl> $$5 = don.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avh.aI, avi.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsl> $$6 = Optional.ofNullable((dfi)ctt.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avh.aJ, avi.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dsl> a(dsl $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dlu.i, $$0.c(dlu.i)));
   }
}
