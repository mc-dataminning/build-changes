import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cjw extends ckr {
   protected static final Map<cvz, cvz> a = new Builder()
      .put(cwb.ao, cwb.aw)
      .put(cwb.U, cwb.al)
      .put(cwb.au, cwb.aC)
      .put(cwb.aa, cwb.ak)
      .put(cwb.as, cwb.aA)
      .put(cwb.Y, cwb.ai)
      .put(cwb.at, cwb.aB)
      .put(cwb.Z, cwb.aj)
      .put(cwb.aq, cwb.ay)
      .put(cwb.W, cwb.ag)
      .put(cwb.ar, cwb.az)
      .put(cwb.X, cwb.ah)
      .put(cwb.ap, cwb.ax)
      .put(cwb.V, cwb.af)
      .put(cwb.oj, cwb.ok)
      .put(cwb.ol, cwb.om)
      .put(cwb.os, cwb.ot)
      .put(cwb.ou, cwb.ov)
      .put(cwb.av, cwb.aD)
      .put(cwb.ab, cwb.am)
      .put(cwb.ae, cwb.an)
      .build();

   protected cjw(cnu $$0, float $$1, float $$2, cmc.a $$3) {
      super($$1, $$2, $$0, arr.bz, $$3);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      cer $$3 = $$0.o();
      Optional<dip> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bjl.d;
      } else {
         cmh $$5 = $$0.n();
         if ($$3 instanceof amq) {
            am.N.a((amq)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dmz.c, $$2, dmz.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bjl.a($$1.B);
      }
   }

   private Optional<dip> a(csy $$0, hv $$1, @Nullable cer $$2, dip $$3) {
      Optional<dip> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, arc.as, ard.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dip> $$5 = dfb.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, arc.at, ard.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dip> $$6 = Optional.ofNullable((cvz)clw.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, arc.au, ard.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dip> b(dip $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dck.i, $$0.c(dck.i)));
   }
}
