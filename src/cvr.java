import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvr extends cwi {
   protected static final Map<dkm, dkm> a = new Builder()
      .put(dko.at, dko.aB)
      .put(dko.X, dko.aq)
      .put(dko.az, dko.aH)
      .put(dko.ad, dko.ao)
      .put(dko.u, dko.aI)
      .put(dko.ae, dko.ap)
      .put(dko.ax, dko.aF)
      .put(dko.ab, dko.am)
      .put(dko.ay, dko.aG)
      .put(dko.ac, dko.an)
      .put(dko.av, dko.aD)
      .put(dko.Z, dko.ak)
      .put(dko.aw, dko.aE)
      .put(dko.aa, dko.al)
      .put(dko.au, dko.aC)
      .put(dko.Y, dko.aj)
      .put(dko.oE, dko.oF)
      .put(dko.oG, dko.oH)
      .put(dko.oN, dko.oO)
      .put(dko.oP, dko.oQ)
      .put(dko.aA, dko.aJ)
      .put(dko.af, dko.ar)
      .put(dko.ai, dko.as)
      .build();

   public cvr(czg $$0, float $$1, float $$2, cxl.a $$3) {
      super($$0, axu.bC, $$1, $$2, $$3);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      cpx $$3 = $$0.o();
      if (b($$0)) {
         return btj.e;
      } else {
         Optional<dxv> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return btj.e;
         } else {
            cxp $$5 = $$0.n();
            if ($$3 instanceof asi) {
               ao.N.a((asi)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ecr.c, $$2, ecr.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bwg.d($$0.p()));
            }

            return btj.a;
         }
      }
   }

   private static boolean b(dbi $$0) {
      cpx $$1 = $$0.o();
      return $$0.p().equals(bti.a) && $$1.fa().a(cxt.wi) && !$$1.fY();
   }

   private Optional<dxv> a(dhi $$0, jh $$1, @Nullable cpx $$2, dxv $$3) {
      Optional<dxv> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, axf.aH, axg.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dxv> $$5 = dtu.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, axf.aI, axg.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dxv> $$6 = Optional.ofNullable((dkm)cxg.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, axf.aJ, axg.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dxv> a(dxv $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(drb.i, $$0.c(drb.i)));
   }
}
