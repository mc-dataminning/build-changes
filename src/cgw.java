import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cgw extends chr {
   protected static final Map<csx, csx> a = new Builder()
      .put(csy.ao, csy.aw)
      .put(csy.U, csy.al)
      .put(csy.au, csy.aC)
      .put(csy.aa, csy.ak)
      .put(csy.as, csy.aA)
      .put(csy.Y, csy.ai)
      .put(csy.at, csy.aB)
      .put(csy.Z, csy.aj)
      .put(csy.aq, csy.ay)
      .put(csy.W, csy.ag)
      .put(csy.ar, csy.az)
      .put(csy.X, csy.ah)
      .put(csy.ap, csy.ax)
      .put(csy.V, csy.af)
      .put(csy.oj, csy.ok)
      .put(csy.ol, csy.om)
      .put(csy.os, csy.ot)
      .put(csy.ou, csy.ov)
      .put(csy.av, csy.aD)
      .put(csy.ab, csy.am)
      .put(csy.ae, csy.an)
      .build();

   protected cgw(cku $$0, float $$1, float $$2, cjc.a $$3) {
      super($$1, $$2, $$0, apu.bz, $$3);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      cbw $$3 = $$0.o();
      dfl $$4 = $$1.a_($$2);
      Optional<dfl> $$5 = this.b($$4);
      Optional<dfl> $$6 = dbz.b($$4);
      Optional<dfl> $$7 = Optional.ofNullable((csx)ciw.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      cjh $$8 = $$0.n();
      Optional<dfl> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, apf.as, apg.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, apf.at, apg.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, apf.au, apg.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof akt) {
            al.M.a((akt)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(djv.c, $$2, djv.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   private Optional<dfl> b(dfl $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(czi.g, $$0.c(czi.g)));
   }
}
