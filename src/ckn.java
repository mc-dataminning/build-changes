import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckn extends cli {
   protected static final Map<cwq, cwq> a = new Builder()
      .put(cws.ao, cws.aw)
      .put(cws.U, cws.al)
      .put(cws.au, cws.aC)
      .put(cws.aa, cws.ak)
      .put(cws.as, cws.aA)
      .put(cws.Y, cws.ai)
      .put(cws.at, cws.aB)
      .put(cws.Z, cws.aj)
      .put(cws.aq, cws.ay)
      .put(cws.W, cws.ag)
      .put(cws.ar, cws.az)
      .put(cws.X, cws.ah)
      .put(cws.ap, cws.ax)
      .put(cws.V, cws.af)
      .put(cws.oj, cws.ok)
      .put(cws.ol, cws.om)
      .put(cws.os, cws.ot)
      .put(cws.ou, cws.ov)
      .put(cws.av, cws.aD)
      .put(cws.ab, cws.am)
      .put(cws.ae, cws.an)
      .build();

   protected ckn(col $$0, float $$1, float $$2, cmt.a $$3) {
      super($$1, $$2, $$0, ash.bz, $$3);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfi $$3 = $$0.o();
      Optional<djh> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bkb.d;
      } else {
         cmy $$5 = $$0.n();
         if ($$3 instanceof ane) {
            am.N.a((ane)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dnr.c, $$2, dnr.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bkb.a($$1.B);
      }
   }

   private Optional<djh> a(ctp $$0, hx $$1, @Nullable cfi $$2, djh $$3) {
      Optional<djh> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, ars.as, art.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<djh> $$5 = dft.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, ars.at, art.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<djh> $$6 = Optional.ofNullable((cwq)cmn.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, ars.au, art.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<djh> b(djh $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(ddb.i, $$0.c(ddb.i)));
   }
}
