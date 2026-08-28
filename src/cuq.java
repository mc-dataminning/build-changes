import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuq extends cvh {
   protected static final Map<djl, djl> a = new Builder()
      .put(djn.at, djn.aB)
      .put(djn.X, djn.aq)
      .put(djn.az, djn.aH)
      .put(djn.ad, djn.ao)
      .put(djn.u, djn.aI)
      .put(djn.ae, djn.ap)
      .put(djn.ax, djn.aF)
      .put(djn.ab, djn.am)
      .put(djn.ay, djn.aG)
      .put(djn.ac, djn.an)
      .put(djn.av, djn.aD)
      .put(djn.Z, djn.ak)
      .put(djn.aw, djn.aE)
      .put(djn.aa, djn.al)
      .put(djn.au, djn.aC)
      .put(djn.Y, djn.aj)
      .put(djn.oL, djn.oM)
      .put(djn.oN, djn.oO)
      .put(djn.oU, djn.oV)
      .put(djn.oW, djn.oX)
      .put(djn.aA, djn.aJ)
      .put(djn.af, djn.ar)
      .put(djn.ai, djn.as)
      .build();

   public cuq(cyf $$0, float $$1, float $$2, cwk.a $$3) {
      super($$0, awp.bC, $$1, $$2, $$3);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      cow $$3 = $$0.o();
      if (b($$0)) {
         return bsj.e;
      } else {
         Optional<dww> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsj.e;
         } else {
            cwo $$5 = $$0.n();
            if ($$3 instanceof are) {
               ap.N.a((are)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ebs.c, $$2, ebs.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvg.d($$0.p()));
            }

            return bsj.a;
         }
      }
   }

   private static boolean b(dah $$0) {
      cow $$1 = $$0.o();
      return $$0.p().equals(bsi.a) && $$1.fa().a(cws.ws) && !$$1.fY();
   }

   private Optional<dww> a(dgh $$0, ji $$1, @Nullable cow $$2, dww $$3) {
      Optional<dww> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dww> $$5 = dsv.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dww> $$6 = Optional.ofNullable((djl)cwf.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
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

   private Optional<dww> a(dww $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqc.i, $$0.c(dqc.i)));
   }
}
