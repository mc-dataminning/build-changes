import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cur extends cvi {
   protected static final Map<djm, djm> a = new Builder()
      .put(djo.at, djo.aB)
      .put(djo.X, djo.aq)
      .put(djo.az, djo.aH)
      .put(djo.ad, djo.ao)
      .put(djo.u, djo.aI)
      .put(djo.ae, djo.ap)
      .put(djo.ax, djo.aF)
      .put(djo.ab, djo.am)
      .put(djo.ay, djo.aG)
      .put(djo.ac, djo.an)
      .put(djo.av, djo.aD)
      .put(djo.Z, djo.ak)
      .put(djo.aw, djo.aE)
      .put(djo.aa, djo.al)
      .put(djo.au, djo.aC)
      .put(djo.Y, djo.aj)
      .put(djo.oL, djo.oM)
      .put(djo.oN, djo.oO)
      .put(djo.oU, djo.oV)
      .put(djo.oW, djo.oX)
      .put(djo.aA, djo.aJ)
      .put(djo.af, djo.ar)
      .put(djo.ai, djo.as)
      .build();

   public cur(cyg $$0, float $$1, float $$2, cwl.a $$3) {
      super($$0, awp.bC, $$1, $$2, $$3);
   }

   @Override
   public bsk a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      cox $$3 = $$0.o();
      if (b($$0)) {
         return bsk.e;
      } else {
         Optional<dwx> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsk.e;
         } else {
            cwp $$5 = $$0.n();
            if ($$3 instanceof are) {
               ap.N.a((are)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ebt.c, $$2, ebt.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvh.d($$0.p()));
            }

            return bsk.a;
         }
      }
   }

   private static boolean b(dai $$0) {
      cox $$1 = $$0.o();
      return $$0.p().equals(bsj.a) && $$1.fa().a(cwt.ws) && !$$1.fY();
   }

   private Optional<dwx> a(dgi $$0, ji $$1, @Nullable cox $$2, dwx $$3) {
      Optional<dwx> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dwx> $$5 = dsw.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dwx> $$6 = Optional.ofNullable((djm)cwg.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
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

   private Optional<dwx> a(dwx $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqd.i, $$0.c(dqd.i)));
   }
}
