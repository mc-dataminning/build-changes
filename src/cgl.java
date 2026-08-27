import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cgl extends chg {
   protected static final Map<csk, csk> a = new Builder()
      .put(csl.ao, csl.aw)
      .put(csl.U, csl.al)
      .put(csl.au, csl.aC)
      .put(csl.aa, csl.ak)
      .put(csl.as, csl.aA)
      .put(csl.Y, csl.ai)
      .put(csl.at, csl.aB)
      .put(csl.Z, csl.aj)
      .put(csl.aq, csl.ay)
      .put(csl.W, csl.ag)
      .put(csl.ar, csl.az)
      .put(csl.X, csl.ah)
      .put(csl.ap, csl.ax)
      .put(csl.V, csl.af)
      .put(csl.oj, csl.ok)
      .put(csl.ol, csl.om)
      .put(csl.os, csl.ot)
      .put(csl.ou, csl.ov)
      .put(csl.av, csl.aD)
      .put(csl.ab, csl.am)
      .put(csl.ae, csl.an)
      .build();

   protected cgl(ckj $$0, float $$1, float $$2, cir.a $$3) {
      super($$1, $$2, $$0, apj.bz, $$3);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      cbl $$3 = $$0.o();
      dey $$4 = $$1.a_($$2);
      Optional<dey> $$5 = this.b($$4);
      Optional<dey> $$6 = dbm.b($$4);
      Optional<dey> $$7 = Optional.ofNullable((csk)cil.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      ciw $$8 = $$0.n();
      Optional<dey> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, aou.as, aov.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, aou.at, aov.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, aou.au, aov.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof akj) {
            ai.M.a((akj)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(dji.c, $$2, dji.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   private Optional<dey> b(dey $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(cyv.g, $$0.c(cyv.g)));
   }
}
