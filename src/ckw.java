import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckw extends clr {
   protected static final Map<cwy, cwy> a = new Builder()
      .put(cxa.ao, cxa.aw)
      .put(cxa.U, cxa.al)
      .put(cxa.au, cxa.aC)
      .put(cxa.aa, cxa.ak)
      .put(cxa.as, cxa.aA)
      .put(cxa.Y, cxa.ai)
      .put(cxa.at, cxa.aB)
      .put(cxa.Z, cxa.aj)
      .put(cxa.aq, cxa.ay)
      .put(cxa.W, cxa.ag)
      .put(cxa.ar, cxa.az)
      .put(cxa.X, cxa.ah)
      .put(cxa.ap, cxa.ax)
      .put(cxa.V, cxa.af)
      .put(cxa.oj, cxa.ok)
      .put(cxa.ol, cxa.om)
      .put(cxa.os, cxa.ot)
      .put(cxa.ou, cxa.ov)
      .put(cxa.av, cxa.aD)
      .put(cxa.ab, cxa.am)
      .put(cxa.ae, cxa.an)
      .build();

   protected ckw(cou $$0, float $$1, float $$2, cnb.a $$3) {
      super($$1, $$2, $$0, asi.bz, $$3);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfq $$3 = $$0.o();
      Optional<djp> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bkc.d;
      } else {
         cng $$5 = $$0.n();
         if ($$3 instanceof anf) {
            am.N.a((anf)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dnz.c, $$2, dnz.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bkc.a($$1.B);
      }
   }

   private Optional<djp> a(ctx $$0, hx $$1, @Nullable cfq $$2, djp $$3) {
      Optional<djp> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, art.aE, aru.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<djp> $$5 = dgb.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, art.aF, aru.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<djp> $$6 = Optional.ofNullable((cwy)cmw.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, art.aG, aru.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<djp> b(djp $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(ddj.i, $$0.c(ddj.i)));
   }
}
