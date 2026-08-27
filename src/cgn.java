import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cgn extends chi {
   protected static final Map<csm, csm> a = new Builder()
      .put(csn.ao, csn.aw)
      .put(csn.U, csn.al)
      .put(csn.au, csn.aC)
      .put(csn.aa, csn.ak)
      .put(csn.as, csn.aA)
      .put(csn.Y, csn.ai)
      .put(csn.at, csn.aB)
      .put(csn.Z, csn.aj)
      .put(csn.aq, csn.ay)
      .put(csn.W, csn.ag)
      .put(csn.ar, csn.az)
      .put(csn.X, csn.ah)
      .put(csn.ap, csn.ax)
      .put(csn.V, csn.af)
      .put(csn.oj, csn.ok)
      .put(csn.ol, csn.om)
      .put(csn.os, csn.ot)
      .put(csn.ou, csn.ov)
      .put(csn.av, csn.aD)
      .put(csn.ab, csn.am)
      .put(csn.ae, csn.an)
      .build();

   protected cgn(ckl $$0, float $$1, float $$2, cit.a $$3) {
      super($$1, $$2, $$0, apl.bz, $$3);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      cbn $$3 = $$0.o();
      dfa $$4 = $$1.a_($$2);
      Optional<dfa> $$5 = this.b($$4);
      Optional<dfa> $$6 = dbo.b($$4);
      Optional<dfa> $$7 = Optional.ofNullable((csm)cin.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      ciy $$8 = $$0.n();
      Optional<dfa> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, aow.as, aox.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, aow.at, aox.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, aow.au, aox.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof akl) {
            ai.M.a((akl)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(djk.c, $$2, djk.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   private Optional<dfa> b(dfa $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(cyx.g, $$0.c(cyx.g)));
   }
}
