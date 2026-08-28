import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwb extends cxu {
   protected static final Map<dku, dku> a = new Builder()
      .put(dkw.at, dkw.aB)
      .put(dkw.X, dkw.aq)
      .put(dkw.az, dkw.aH)
      .put(dkw.ad, dkw.ao)
      .put(dkw.u, dkw.aI)
      .put(dkw.ae, dkw.ap)
      .put(dkw.ax, dkw.aF)
      .put(dkw.ab, dkw.am)
      .put(dkw.ay, dkw.aG)
      .put(dkw.ac, dkw.an)
      .put(dkw.av, dkw.aD)
      .put(dkw.Z, dkw.ak)
      .put(dkw.aw, dkw.aE)
      .put(dkw.aa, dkw.al)
      .put(dkw.au, dkw.aC)
      .put(dkw.Y, dkw.aj)
      .put(dkw.oL, dkw.oM)
      .put(dkw.oN, dkw.oO)
      .put(dkw.oU, dkw.oV)
      .put(dkw.oW, dkw.oX)
      .put(dkw.aA, dkw.aJ)
      .put(dkw.af, dkw.ar)
      .put(dkw.ai, dkw.as)
      .build();

   public cwb(czm $$0, float $$1, float $$2, cxu.a $$3) {
      super($$3.a($$0, awz.bC, $$1, $$2, true));
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      cqi $$3 = $$0.o();
      if (b($$0)) {
         return btq.e;
      } else {
         Optional<dym> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return btq.e;
         } else {
            cxy $$5 = $$0.n();
            if ($$3 instanceof aro) {
               ap.N.a((aro)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(edm.c, $$2, edm.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bwr.d($$0.p()));
            }

            return btq.a;
         }
      }
   }

   private static boolean b(dbp $$0) {
      cqi $$1 = $$0.o();
      return $$0.p().equals(btp.a) && $$1.fb().a(cyc.ww) && !$$1.fX();
   }

   private Optional<dym> a(dhp $$0, jj $$1, @Nullable cqi $$2, dym $$3) {
      Optional<dym> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awk.aH, awl.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dym> $$5 = duh.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awk.aI, awl.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dym> $$6 = Optional.ofNullable((dku)cxp.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awk.aJ, awl.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dym> a(dym $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(drl.d, $$0.c(drl.d)));
   }
}
