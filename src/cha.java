import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cha extends chv {
   protected static final Map<ctc, ctc> a = new Builder()
      .put(cte.ao, cte.aw)
      .put(cte.U, cte.al)
      .put(cte.au, cte.aC)
      .put(cte.aa, cte.ak)
      .put(cte.as, cte.aA)
      .put(cte.Y, cte.ai)
      .put(cte.at, cte.aB)
      .put(cte.Z, cte.aj)
      .put(cte.aq, cte.ay)
      .put(cte.W, cte.ag)
      .put(cte.ar, cte.az)
      .put(cte.X, cte.ah)
      .put(cte.ap, cte.ax)
      .put(cte.V, cte.af)
      .put(cte.oj, cte.ok)
      .put(cte.ol, cte.om)
      .put(cte.os, cte.ot)
      .put(cte.ou, cte.ov)
      .put(cte.av, cte.aD)
      .put(cte.ab, cte.am)
      .put(cte.ae, cte.an)
      .build();

   protected cha(cky $$0, float $$1, float $$2, cjg.a $$3) {
      super($$1, $$2, $$0, apv.bz, $$3);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      cca $$3 = $$0.o();
      dfd $$4 = $$1.a_($$2);
      Optional<dfd> $$5 = this.b($$4);
      Optional<dfd> $$6 = dcb.b($$4);
      Optional<dfd> $$7 = Optional.ofNullable((ctc)cja.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      cjl $$8 = $$0.n();
      Optional<dfd> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, apg.as, aph.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, apg.at, aph.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, apg.au, aph.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof aku) {
            al.M.a((aku)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(djn.c, $$2, djn.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   private Optional<dfd> b(dfd $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(czm.i, $$0.c(czm.i)));
   }
}
