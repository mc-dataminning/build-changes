import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csl extends ctg {
   protected static final Map<dfb, dfb> a = new Builder()
      .put(dfd.ao, dfd.aw)
      .put(dfd.U, dfd.al)
      .put(dfd.au, dfd.aC)
      .put(dfd.aa, dfd.ak)
      .put(dfd.as, dfd.aA)
      .put(dfd.Y, dfd.ai)
      .put(dfd.at, dfd.aB)
      .put(dfd.Z, dfd.aj)
      .put(dfd.aq, dfd.ay)
      .put(dfd.W, dfd.ag)
      .put(dfd.ar, dfd.az)
      .put(dfd.X, dfd.ah)
      .put(dfd.ap, dfd.ax)
      .put(dfd.V, dfd.af)
      .put(dfd.oj, dfd.ok)
      .put(dfd.ol, dfd.om)
      .put(dfd.os, dfd.ot)
      .put(dfd.ou, dfd.ov)
      .put(dfd.av, dfd.aD)
      .put(dfd.ab, dfd.am)
      .put(dfd.ae, dfd.an)
      .build();

   public csl(cwg $$0, cum.a $$1) {
      super($$0, awp.bA, $$1);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmz $$3 = $$0.o();
      Optional<dse> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqw.e;
      } else {
         cur $$5 = $$0.n();
         if ($$3 instanceof arg) {
            am.N.a((arg)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dwx.c, $$2, dwx.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, btr.d($$0.p()));
         }

         return bqw.a($$1.B);
      }
   }

   private Optional<dse> a(dca $$0, iz $$1, @Nullable cmz $$2, dse $$3) {
      Optional<dse> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dse> $$5 = dog.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dse> $$6 = Optional.ofNullable((dfb)cuh.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
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

   private Optional<dse> a(dse $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dln.i, $$0.c(dln.i)));
   }
}
