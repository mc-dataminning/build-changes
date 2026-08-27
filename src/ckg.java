import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckg extends clb {
   protected static final Map<cwj, cwj> a = new Builder()
      .put(cwl.ao, cwl.aw)
      .put(cwl.U, cwl.al)
      .put(cwl.au, cwl.aC)
      .put(cwl.aa, cwl.ak)
      .put(cwl.as, cwl.aA)
      .put(cwl.Y, cwl.ai)
      .put(cwl.at, cwl.aB)
      .put(cwl.Z, cwl.aj)
      .put(cwl.aq, cwl.ay)
      .put(cwl.W, cwl.ag)
      .put(cwl.ar, cwl.az)
      .put(cwl.X, cwl.ah)
      .put(cwl.ap, cwl.ax)
      .put(cwl.V, cwl.af)
      .put(cwl.oj, cwl.ok)
      .put(cwl.ol, cwl.om)
      .put(cwl.os, cwl.ot)
      .put(cwl.ou, cwl.ov)
      .put(cwl.av, cwl.aD)
      .put(cwl.ab, cwl.am)
      .put(cwl.ae, cwl.an)
      .build();

   protected ckg(coe $$0, float $$1, float $$2, cmm.a $$3) {
      super($$1, $$2, $$0, asb.bz, $$3);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfb $$3 = $$0.o();
      Optional<dja> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bjv.d;
      } else {
         cmr $$5 = $$0.n();
         if ($$3 instanceof ana) {
            am.N.a((ana)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dnk.c, $$2, dnk.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bjv.a($$1.B);
      }
   }

   private Optional<dja> a(cti $$0, hx $$1, @Nullable cfb $$2, dja $$3) {
      Optional<dja> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, arm.as, arn.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dja> $$5 = dfm.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, arm.at, arn.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dja> $$6 = Optional.ofNullable((cwj)cmg.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, arm.au, arn.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dja> b(dja $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dcu.i, $$0.c(dcu.i)));
   }
}
