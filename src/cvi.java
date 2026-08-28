import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvi extends cvz {
   protected static final Map<dkd, dkd> a = new Builder()
      .put(dkf.at, dkf.aB)
      .put(dkf.X, dkf.aq)
      .put(dkf.az, dkf.aH)
      .put(dkf.ad, dkf.ao)
      .put(dkf.u, dkf.aI)
      .put(dkf.ae, dkf.ap)
      .put(dkf.ax, dkf.aF)
      .put(dkf.ab, dkf.am)
      .put(dkf.ay, dkf.aG)
      .put(dkf.ac, dkf.an)
      .put(dkf.av, dkf.aD)
      .put(dkf.Z, dkf.ak)
      .put(dkf.aw, dkf.aE)
      .put(dkf.aa, dkf.al)
      .put(dkf.au, dkf.aC)
      .put(dkf.Y, dkf.aj)
      .put(dkf.oL, dkf.oM)
      .put(dkf.oN, dkf.oO)
      .put(dkf.oU, dkf.oV)
      .put(dkf.oW, dkf.oX)
      .put(dkf.aA, dkf.aJ)
      .put(dkf.af, dkf.ar)
      .put(dkf.ai, dkf.as)
      .build();

   public cvi(cyx $$0, float $$1, float $$2, cxc.a $$3) {
      super($$0, axk.bC, $$1, $$2, $$3);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      cpo $$3 = $$0.o();
      if (b($$0)) {
         return bta.e;
      } else {
         Optional<dxo> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bta.e;
         } else {
            cxg $$5 = $$0.n();
            if ($$3 instanceof ary) {
               ao.N.a((ary)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eck.c, $$2, eck.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvx.d($$0.p()));
            }

            return bta.a;
         }
      }
   }

   private static boolean b(daz $$0) {
      cpo $$1 = $$0.o();
      return $$0.p().equals(bsz.a) && $$1.fa().a(cxk.ws) && !$$1.fY();
   }

   private Optional<dxo> a(dgz $$0, jh $$1, @Nullable cpo $$2, dxo $$3) {
      Optional<dxo> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awv.aH, aww.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dxo> $$5 = dtn.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awv.aI, aww.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dxo> $$6 = Optional.ofNullable((dkd)cwx.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awv.aJ, aww.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dxo> a(dxo $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqu.i, $$0.c(dqu.i)));
   }
}
