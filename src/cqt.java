import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqt extends cro {
   protected static final Map<dde, dde> a = new Builder()
      .put(ddg.ao, ddg.aw)
      .put(ddg.U, ddg.al)
      .put(ddg.au, ddg.aC)
      .put(ddg.aa, ddg.ak)
      .put(ddg.as, ddg.aA)
      .put(ddg.Y, ddg.ai)
      .put(ddg.at, ddg.aB)
      .put(ddg.Z, ddg.aj)
      .put(ddg.aq, ddg.ay)
      .put(ddg.W, ddg.ag)
      .put(ddg.ar, ddg.az)
      .put(ddg.X, ddg.ah)
      .put(ddg.ap, ddg.ax)
      .put(ddg.V, ddg.af)
      .put(ddg.oj, ddg.ok)
      .put(ddg.ol, ddg.om)
      .put(ddg.os, ddg.ot)
      .put(ddg.ou, ddg.ov)
      .put(ddg.av, ddg.aD)
      .put(ddg.ab, ddg.am)
      .put(ddg.ae, ddg.an)
      .build();

   public cqt(cum $$0, csu.a $$1) {
      super($$0, avr.bA, $$1);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      clh $$3 = $$0.o();
      Optional<dqh> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bpm.d;
      } else {
         csz $$5 = $$0.n();
         if ($$3 instanceof aqi) {
            am.N.a((aqi)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dva.c, $$2, dva.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bsa.d($$0.p()));
         }

         return bpm.a($$1.B);
      }
   }

   private Optional<dqh> a(dad $$0, in $$1, @Nullable clh $$2, dqh $$3) {
      Optional<dqh> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avc.aH, avd.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dqh> $$5 = dmj.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avc.aI, avd.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dqh> $$6 = Optional.ofNullable((dde)csp.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avc.aJ, avd.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dqh> a(dqh $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(djq.i, $$0.c(djq.i)));
   }
}
