import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cob extends cox {
   protected static final Map<daa, daa> a = new Builder()
      .put(dac.ao, dac.aw)
      .put(dac.U, dac.al)
      .put(dac.au, dac.aC)
      .put(dac.aa, dac.ak)
      .put(dac.as, dac.aA)
      .put(dac.Y, dac.ai)
      .put(dac.at, dac.aB)
      .put(dac.Z, dac.aj)
      .put(dac.aq, dac.ay)
      .put(dac.W, dac.ag)
      .put(dac.ar, dac.az)
      .put(dac.X, dac.ah)
      .put(dac.ap, dac.ax)
      .put(dac.V, dac.af)
      .put(dac.oj, dac.ok)
      .put(dac.ol, dac.om)
      .put(dac.os, dac.ot)
      .put(dac.ou, dac.ov)
      .put(dac.av, dac.aD)
      .put(dac.ab, dac.am)
      .put(dac.ae, dac.an)
      .build();

   protected cob(crx $$0, float $$1, float $$2, cqf.a $$3) {
      super($$1, $$2, $$0, aun.bA, $$3);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      cis $$3 = $$0.o();
      Optional<dmz> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bnc.d;
      } else {
         cqk $$5 = $$0.n();
         if ($$3 instanceof apg) {
            am.N.a((apg)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(drn.c, $$2, drn.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bpo.d($$0.p()));
         }

         return bnc.a($$1.B);
      }
   }

   private Optional<dmz> a(cwz $$0, ib $$1, @Nullable cis $$2, dmz $$3) {
      Optional<dmz> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, aty.aH, atz.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dmz> $$5 = dje.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, aty.aI, atz.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dmz> $$6 = Optional.ofNullable((daa)cqa.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
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

   private Optional<dmz> b(dmz $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dgl.i, $$0.c(dgl.i)));
   }
}
