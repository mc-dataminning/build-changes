import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class ciq extends cjl {
   protected static final Map<cut, cut> a = new Builder()
      .put(cuv.ao, cuv.aw)
      .put(cuv.U, cuv.al)
      .put(cuv.au, cuv.aC)
      .put(cuv.aa, cuv.ak)
      .put(cuv.as, cuv.aA)
      .put(cuv.Y, cuv.ai)
      .put(cuv.at, cuv.aB)
      .put(cuv.Z, cuv.aj)
      .put(cuv.aq, cuv.ay)
      .put(cuv.W, cuv.ag)
      .put(cuv.ar, cuv.az)
      .put(cuv.X, cuv.ah)
      .put(cuv.ap, cuv.ax)
      .put(cuv.V, cuv.af)
      .put(cuv.oj, cuv.ok)
      .put(cuv.ol, cuv.om)
      .put(cuv.os, cuv.ot)
      .put(cuv.ou, cuv.ov)
      .put(cuv.av, cuv.aD)
      .put(cuv.ab, cuv.am)
      .put(cuv.ae, cuv.an)
      .build();

   protected ciq(cmo $$0, float $$1, float $$2, ckw.a $$3) {
      super($$1, $$2, $$0, arc.bz, $$3);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      cdm $$3 = $$0.o();
      dgw $$4 = $$1.a_($$2);
      Optional<dgw> $$5 = this.b($$4);
      Optional<dgw> $$6 = ddt.b($$4);
      Optional<dgw> $$7 = Optional.ofNullable((cut)ckq.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      clb $$8 = $$0.n();
      Optional<dgw> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, aqn.as, aqo.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, aqn.at, aqo.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, aqn.au, aqo.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof amb) {
            al.M.a((amb)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(dlg.c, $$2, dlg.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   private Optional<dgw> b(dgw $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dbe.i, $$0.c(dbe.i)));
   }
}
