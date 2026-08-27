import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cgu extends chp {
   protected static final Map<csv, csv> a = new Builder()
      .put(csw.ao, csw.aw)
      .put(csw.U, csw.al)
      .put(csw.au, csw.aC)
      .put(csw.aa, csw.ak)
      .put(csw.as, csw.aA)
      .put(csw.Y, csw.ai)
      .put(csw.at, csw.aB)
      .put(csw.Z, csw.aj)
      .put(csw.aq, csw.ay)
      .put(csw.W, csw.ag)
      .put(csw.ar, csw.az)
      .put(csw.X, csw.ah)
      .put(csw.ap, csw.ax)
      .put(csw.V, csw.af)
      .put(csw.oj, csw.ok)
      .put(csw.ol, csw.om)
      .put(csw.os, csw.ot)
      .put(csw.ou, csw.ov)
      .put(csw.av, csw.aD)
      .put(csw.ab, csw.am)
      .put(csw.ae, csw.an)
      .build();

   protected cgu(cks $$0, float $$1, float $$2, cja.a $$3) {
      super($$1, $$2, $$0, aps.bz, $$3);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      cbu $$3 = $$0.o();
      dfj $$4 = $$1.a_($$2);
      Optional<dfj> $$5 = this.b($$4);
      Optional<dfj> $$6 = dbx.b($$4);
      Optional<dfj> $$7 = Optional.ofNullable((csv)ciu.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      cjf $$8 = $$0.n();
      Optional<dfj> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, apd.as, ape.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, apd.at, ape.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, apd.au, ape.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof akr) {
            al.M.a((akr)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(djt.c, $$2, djt.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   private Optional<dfj> b(dfj $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(czg.g, $$0.c(czg.g)));
   }
}
