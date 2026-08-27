import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cod extends coz {
   protected static final Map<dac, dac> a = new Builder()
      .put(dae.ao, dae.aw)
      .put(dae.U, dae.al)
      .put(dae.au, dae.aC)
      .put(dae.aa, dae.ak)
      .put(dae.as, dae.aA)
      .put(dae.Y, dae.ai)
      .put(dae.at, dae.aB)
      .put(dae.Z, dae.aj)
      .put(dae.aq, dae.ay)
      .put(dae.W, dae.ag)
      .put(dae.ar, dae.az)
      .put(dae.X, dae.ah)
      .put(dae.ap, dae.ax)
      .put(dae.V, dae.af)
      .put(dae.oj, dae.ok)
      .put(dae.ol, dae.om)
      .put(dae.os, dae.ot)
      .put(dae.ou, dae.ov)
      .put(dae.av, dae.aD)
      .put(dae.ab, dae.am)
      .put(dae.ae, dae.an)
      .build();

   protected cod(crz $$0, float $$1, float $$2, cqh.a $$3) {
      super($$1, $$2, $$0, aun.bA, $$3);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      ciu $$3 = $$0.o();
      Optional<dnb> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bnd.d;
      } else {
         cqm $$5 = $$0.n();
         if ($$3 instanceof apg) {
            am.N.a((apg)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(drp.c, $$2, drp.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bpp.d($$0.p()));
         }

         return bnd.a($$1.B);
      }
   }

   private Optional<dnb> a(cxb $$0, ib $$1, @Nullable ciu $$2, dnb $$3) {
      Optional<dnb> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, aty.aH, atz.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dnb> $$5 = djg.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, aty.aI, atz.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dnb> $$6 = Optional.ofNullable((dac)cqc.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, aty.aJ, atz.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dnb> b(dnb $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dgn.i, $$0.c(dgn.i)));
   }
}
