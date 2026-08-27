import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciy extends cjt {
   protected static final Map<cva, cva> a = new Builder()
      .put(cvc.ao, cvc.aw)
      .put(cvc.U, cvc.al)
      .put(cvc.au, cvc.aC)
      .put(cvc.aa, cvc.ak)
      .put(cvc.as, cvc.aA)
      .put(cvc.Y, cvc.ai)
      .put(cvc.at, cvc.aB)
      .put(cvc.Z, cvc.aj)
      .put(cvc.aq, cvc.ay)
      .put(cvc.W, cvc.ag)
      .put(cvc.ar, cvc.az)
      .put(cvc.X, cvc.ah)
      .put(cvc.ap, cvc.ax)
      .put(cvc.V, cvc.af)
      .put(cvc.oj, cvc.ok)
      .put(cvc.ol, cvc.om)
      .put(cvc.os, cvc.ot)
      .put(cvc.ou, cvc.ov)
      .put(cvc.av, cvc.aD)
      .put(cvc.ab, cvc.am)
      .put(cvc.ae, cvc.an)
      .build();

   protected ciy(cmw $$0, float $$1, float $$2, cle.a $$3) {
      super($$1, $$2, $$0, arg.bz, $$3);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      cdu $$3 = $$0.o();
      Optional<dhi> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bix.d;
      } else {
         clj $$5 = $$0.n();
         if ($$3 instanceof amf) {
            al.M.a((amf)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dls.c, $$2, dls.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bix.a($$1.B);
      }
   }

   private Optional<dhi> a(csa $$0, ht $$1, @Nullable cdu $$2, dhi $$3) {
      Optional<dhi> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, aqr.as, aqs.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dhi> $$5 = deb.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, aqr.at, aqs.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dhi> $$6 = Optional.ofNullable((cva)cky.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, aqr.au, aqs.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dhi> b(dhi $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dbl.i, $$0.c(dbl.i)));
   }
}
