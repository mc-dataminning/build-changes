import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csk extends ctf {
   protected static final Map<dfa, dfa> a = new Builder()
      .put(dfc.ao, dfc.aw)
      .put(dfc.U, dfc.al)
      .put(dfc.au, dfc.aC)
      .put(dfc.aa, dfc.ak)
      .put(dfc.as, dfc.aA)
      .put(dfc.Y, dfc.ai)
      .put(dfc.at, dfc.aB)
      .put(dfc.Z, dfc.aj)
      .put(dfc.aq, dfc.ay)
      .put(dfc.W, dfc.ag)
      .put(dfc.ar, dfc.az)
      .put(dfc.X, dfc.ah)
      .put(dfc.ap, dfc.ax)
      .put(dfc.V, dfc.af)
      .put(dfc.oj, dfc.ok)
      .put(dfc.ol, dfc.om)
      .put(dfc.os, dfc.ot)
      .put(dfc.ou, dfc.ov)
      .put(dfc.av, dfc.aD)
      .put(dfc.ab, dfc.am)
      .put(dfc.ae, dfc.an)
      .build();

   public csk(cwf $$0, cul.a $$1) {
      super($$0, awp.bA, $$1);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmy $$3 = $$0.o();
      Optional<dsd> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqv.e;
      } else {
         cuq $$5 = $$0.n();
         if ($$3 instanceof arg) {
            am.N.a((arg)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dww.c, $$2, dww.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, btq.d($$0.p()));
         }

         return bqv.a($$1.B);
      }
   }

   private Optional<dsd> a(dbz $$0, iz $$1, @Nullable cmy $$2, dsd $$3) {
      Optional<dsd> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsd> $$5 = dof.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsd> $$6 = Optional.ofNullable((dfa)cug.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
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

   private Optional<dsd> a(dsd $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dlm.i, $$0.c(dlm.i)));
   }
}
