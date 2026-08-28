import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvk extends cxd {
   protected static final Map<dke, dke> a = new Builder()
      .put(dkg.at, dkg.aB)
      .put(dkg.X, dkg.aq)
      .put(dkg.az, dkg.aH)
      .put(dkg.ad, dkg.ao)
      .put(dkg.u, dkg.aI)
      .put(dkg.ae, dkg.ap)
      .put(dkg.ax, dkg.aF)
      .put(dkg.ab, dkg.am)
      .put(dkg.ay, dkg.aG)
      .put(dkg.ac, dkg.an)
      .put(dkg.av, dkg.aD)
      .put(dkg.Z, dkg.ak)
      .put(dkg.aw, dkg.aE)
      .put(dkg.aa, dkg.al)
      .put(dkg.au, dkg.aC)
      .put(dkg.Y, dkg.aj)
      .put(dkg.oL, dkg.oM)
      .put(dkg.oN, dkg.oO)
      .put(dkg.oU, dkg.oV)
      .put(dkg.oW, dkg.oX)
      .put(dkg.aA, dkg.aJ)
      .put(dkg.af, dkg.ar)
      .put(dkg.ai, dkg.as)
      .build();

   public cvk(cyw $$0, float $$1, float $$2, cxd.a $$3) {
      super($$3.a($$0, awp.bC, $$1, $$2, true));
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      cpr $$3 = $$0.o();
      if (b($$0)) {
         return bsy.e;
      } else {
         Optional<dxq> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsy.e;
         } else {
            cxh $$5 = $$0.n();
            if ($$3 instanceof are) {
               ap.N.a((are)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ecp.c, $$2, ecp.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvy.d($$0.p()));
            }

            return bsy.a;
         }
      }
   }

   private static boolean b(daz $$0) {
      cpr $$1 = $$0.o();
      return $$0.p().equals(bsx.a) && $$1.fa().a(cxl.wu) && !$$1.ga();
   }

   private Optional<dxq> a(dgz $$0, ji $$1, @Nullable cpr $$2, dxq $$3) {
      Optional<dxq> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dxq> $$5 = dtp.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dxq> $$6 = Optional.ofNullable((dke)cwy.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
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

   private Optional<dxq> a(dxq $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqv.d, $$0.c(dqv.d)));
   }
}
