import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmo extends cnj {
   protected static final Map<cyo, cyo> a = new Builder()
      .put(cyq.ao, cyq.aw)
      .put(cyq.U, cyq.al)
      .put(cyq.au, cyq.aC)
      .put(cyq.aa, cyq.ak)
      .put(cyq.as, cyq.aA)
      .put(cyq.Y, cyq.ai)
      .put(cyq.at, cyq.aB)
      .put(cyq.Z, cyq.aj)
      .put(cyq.aq, cyq.ay)
      .put(cyq.W, cyq.ag)
      .put(cyq.ar, cyq.az)
      .put(cyq.X, cyq.ah)
      .put(cyq.ap, cyq.ax)
      .put(cyq.V, cyq.af)
      .put(cyq.oj, cyq.ok)
      .put(cyq.ol, cyq.om)
      .put(cyq.os, cyq.ot)
      .put(cyq.ou, cyq.ov)
      .put(cyq.av, cyq.aD)
      .put(cyq.ab, cyq.am)
      .put(cyq.ae, cyq.an)
      .build();

   protected cmo(cqm $$0, float $$1, float $$2, cou.a $$3) {
      super($$1, $$2, $$0, atz.bz, $$3);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      chh $$3 = $$0.o();
      Optional<dlf> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return blu.d;
      } else {
         coz $$5 = $$0.n();
         if ($$3 instanceof aow) {
            am.N.a((aow)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dpp.c, $$2, dpp.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bog.d($$0.p()));
         }

         return blu.a($$1.B);
      }
   }

   private Optional<dlf> a(cvn $$0, hz $$1, @Nullable chh $$2, dlf $$3) {
      Optional<dlf> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, atk.aE, atl.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dlf> $$5 = dhr.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, atk.aF, atl.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dlf> $$6 = Optional.ofNullable((cyo)cop.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, atk.aG, atl.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dlf> b(dlf $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dez.i, $$0.c(dez.i)));
   }
}
