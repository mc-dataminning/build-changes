import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cus extends cvj {
   protected static final Map<djn, djn> a = new Builder()
      .put(djp.at, djp.aB)
      .put(djp.X, djp.aq)
      .put(djp.az, djp.aH)
      .put(djp.ad, djp.ao)
      .put(djp.u, djp.aI)
      .put(djp.ae, djp.ap)
      .put(djp.ax, djp.aF)
      .put(djp.ab, djp.am)
      .put(djp.ay, djp.aG)
      .put(djp.ac, djp.an)
      .put(djp.av, djp.aD)
      .put(djp.Z, djp.ak)
      .put(djp.aw, djp.aE)
      .put(djp.aa, djp.al)
      .put(djp.au, djp.aC)
      .put(djp.Y, djp.aj)
      .put(djp.oL, djp.oM)
      .put(djp.oN, djp.oO)
      .put(djp.oU, djp.oV)
      .put(djp.oW, djp.oX)
      .put(djp.aA, djp.aJ)
      .put(djp.af, djp.ar)
      .put(djp.ai, djp.as)
      .build();

   public cus(cyh $$0, float $$1, float $$2, cwm.a $$3) {
      super($$0, awp.bC, $$1, $$2, $$3);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      coy $$3 = $$0.o();
      if (b($$0)) {
         return bsl.e;
      } else {
         Optional<dwy> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsl.e;
         } else {
            cwq $$5 = $$0.n();
            if ($$3 instanceof are) {
               ap.N.a((are)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ebu.c, $$2, ebu.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvi.d($$0.p()));
            }

            return bsl.a;
         }
      }
   }

   private static boolean b(daj $$0) {
      coy $$1 = $$0.o();
      return $$0.p().equals(bsk.a) && $$1.fa().a(cwu.ws) && !$$1.fY();
   }

   private Optional<dwy> a(dgj $$0, ji $$1, @Nullable coy $$2, dwy $$3) {
      Optional<dwy> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dwy> $$5 = dsx.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dwy> $$6 = Optional.ofNullable((djn)cwh.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awa.aJ, awb.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dwy> a(dwy $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqe.i, $$0.c(dqe.i)));
   }
}
