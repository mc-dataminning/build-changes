import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cup extends cvg {
   protected static final Map<djk, djk> a = new Builder()
      .put(djm.at, djm.aB)
      .put(djm.X, djm.aq)
      .put(djm.az, djm.aH)
      .put(djm.ad, djm.ao)
      .put(djm.u, djm.aI)
      .put(djm.ae, djm.ap)
      .put(djm.ax, djm.aF)
      .put(djm.ab, djm.am)
      .put(djm.ay, djm.aG)
      .put(djm.ac, djm.an)
      .put(djm.av, djm.aD)
      .put(djm.Z, djm.ak)
      .put(djm.aw, djm.aE)
      .put(djm.aa, djm.al)
      .put(djm.au, djm.aC)
      .put(djm.Y, djm.aj)
      .put(djm.oL, djm.oM)
      .put(djm.oN, djm.oO)
      .put(djm.oU, djm.oV)
      .put(djm.oW, djm.oX)
      .put(djm.aA, djm.aJ)
      .put(djm.af, djm.ar)
      .put(djm.ai, djm.as)
      .build();

   public cup(cye $$0, float $$1, float $$2, cwj.a $$3) {
      super($$0, awo.bC, $$1, $$2, $$3);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      cov $$3 = $$0.o();
      if (b($$0)) {
         return bsi.e;
      } else {
         Optional<dwv> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsi.e;
         } else {
            cwn $$5 = $$0.n();
            if ($$3 instanceof ard) {
               ap.N.a((ard)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ebr.c, $$2, ebr.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvf.d($$0.p()));
            }

            return bsi.a;
         }
      }
   }

   private static boolean b(dag $$0) {
      cov $$1 = $$0.o();
      return $$0.p().equals(bsh.a) && $$1.fa().a(cwr.ws) && !$$1.fY();
   }

   private Optional<dwv> a(dgg $$0, ji $$1, @Nullable cov $$2, dwv $$3) {
      Optional<dwv> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avz.aH, awa.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dwv> $$5 = dsu.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avz.aI, awa.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dwv> $$6 = Optional.ofNullable((djk)cwe.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avz.aJ, awa.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dwv> a(dwv $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqb.i, $$0.c(dqb.i)));
   }
}
