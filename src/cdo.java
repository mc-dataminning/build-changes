import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cdo extends cej {
   protected static final Map<cpn, cpn> a = new Builder()
      .put(cpo.ao, cpo.aw)
      .put(cpo.U, cpo.al)
      .put(cpo.au, cpo.aC)
      .put(cpo.aa, cpo.ak)
      .put(cpo.as, cpo.aA)
      .put(cpo.Y, cpo.ai)
      .put(cpo.at, cpo.aB)
      .put(cpo.Z, cpo.aj)
      .put(cpo.aq, cpo.ay)
      .put(cpo.W, cpo.ag)
      .put(cpo.ar, cpo.az)
      .put(cpo.X, cpo.ah)
      .put(cpo.ap, cpo.ax)
      .put(cpo.V, cpo.af)
      .put(cpo.oj, cpo.ok)
      .put(cpo.ol, cpo.om)
      .put(cpo.os, cpo.ot)
      .put(cpo.ou, cpo.ov)
      .put(cpo.av, cpo.aD)
      .put(cpo.ab, cpo.am)
      .put(cpo.ae, cpo.an)
      .build();

   protected cdo(chm $$0, float $$1, float $$2, cfu.a $$3) {
      super($$1, $$2, $$0, amw.bx, $$3);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      byo $$3 = $$0.o();
      dcb $$4 = $$1.a_($$2);
      Optional<dcb> $$5 = this.b($$4);
      Optional<dcb> $$6 = cyp.b($$4);
      Optional<dcb> $$7 = Optional.ofNullable((cpn)cfo.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      cfz $$8 = $$0.n();
      Optional<dcb> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, amh.as, ami.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, amh.at, ami.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, amh.au, ami.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof aig) {
            ai.M.a((aig)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(dgl.c, $$2, dgl.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   private Optional<dcb> b(dcb $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(cvy.g, $$0.c(cvy.g)));
   }
}
