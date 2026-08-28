import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxd extends cyu {
   protected static final Map<dma, dma> a = new Builder()
      .put(dmc.at, dmc.aB)
      .put(dmc.X, dmc.aq)
      .put(dmc.az, dmc.aH)
      .put(dmc.ad, dmc.ao)
      .put(dmc.u, dmc.aI)
      .put(dmc.ae, dmc.ap)
      .put(dmc.ax, dmc.aF)
      .put(dmc.ab, dmc.am)
      .put(dmc.ay, dmc.aG)
      .put(dmc.ac, dmc.an)
      .put(dmc.av, dmc.aD)
      .put(dmc.Z, dmc.ak)
      .put(dmc.aw, dmc.aE)
      .put(dmc.aa, dmc.al)
      .put(dmc.au, dmc.aC)
      .put(dmc.Y, dmc.aj)
      .put(dmc.oM, dmc.oN)
      .put(dmc.oO, dmc.oP)
      .put(dmc.oV, dmc.oW)
      .put(dmc.oX, dmc.oY)
      .put(dmc.aA, dmc.aJ)
      .put(dmc.af, dmc.ar)
      .put(dmc.ai, dmc.as)
      .build();

   public cxd(dam $$0, float $$1, float $$2, cyu.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      cqy $$3 = $$0.o();
      if (b($$0)) {
         return bub.e;
      } else {
         Optional<dzz> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bub.e;
         } else {
            cyy $$5 = $$0.n();
            if ($$3 instanceof arr) {
               ap.N.a((arr)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eez.c, $$2, eez.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bxc.d($$0.p()));
            }

            return bub.a;
         }
      }
   }

   private static boolean b(dct $$0) {
      cqy $$1 = $$0.o();
      return $$0.p().equals(bua.a) && $$1.fb().c(kj.I) && !$$1.fX();
   }

   private Optional<dzz> a(div $$0, iu $$1, @Nullable cqy $$2, dzz $$3) {
      Optional<dzz> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awn.aH, awo.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dzz> $$5 = dvt.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awn.aI, awo.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dzz> $$6 = Optional.ofNullable((dma)cyp.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awn.aJ, awo.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dzz> a(dzz $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dss.d, $$0.c(dss.d)));
   }
}
