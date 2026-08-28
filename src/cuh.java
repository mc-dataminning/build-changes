import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuh extends cuy {
   protected static final Map<dij, dij> a = new Builder()
      .put(dil.ao, dil.aw)
      .put(dil.U, dil.al)
      .put(dil.au, dil.aC)
      .put(dil.aa, dil.ak)
      .put(dil.as, dil.aA)
      .put(dil.Y, dil.ai)
      .put(dil.at, dil.aB)
      .put(dil.Z, dil.aj)
      .put(dil.aq, dil.ay)
      .put(dil.W, dil.ag)
      .put(dil.ar, dil.az)
      .put(dil.X, dil.ah)
      .put(dil.ap, dil.ax)
      .put(dil.V, dil.af)
      .put(dil.oj, dil.ok)
      .put(dil.ol, dil.om)
      .put(dil.os, dil.ot)
      .put(dil.ou, dil.ov)
      .put(dil.av, dil.aD)
      .put(dil.ab, dil.am)
      .put(dil.ae, dil.an)
      .build();

   public cuh(cxw $$0, float $$1, float $$2, cwb.a $$3) {
      super($$0, axd.bB, $$1, $$2, $$3);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      cor $$3 = $$0.o();
      if (b($$0)) {
         return bsh.e;
      } else {
         Optional<dvo> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsh.e;
         } else {
            cwf $$5 = $$0.n();
            if ($$3 instanceof arr) {
               ao.N.a((arr)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eak.c, $$2, eak.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bve.d($$0.p()));
            }

            return bsh.a;
         }
      }
   }

   private static boolean b(czy $$0) {
      cor $$1 = $$0.o();
      return $$0.p().equals(bsg.a) && $$1.fd().a(cwj.vK) && !$$1.gb();
   }

   private Optional<dvo> a(dff $$0, jh $$1, @Nullable cor $$2, dvo $$3) {
      Optional<dvo> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awo.aH, awp.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dvo> $$5 = dro.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awo.aI, awp.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dvo> $$6 = Optional.ofNullable((dij)cvw.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awo.aJ, awp.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dvo> a(dvo $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dov.i, $$0.c(dov.i)));
   }
}
