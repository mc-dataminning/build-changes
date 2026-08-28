import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctn extends cuf {
   protected static final Map<dhj, dhj> a = new Builder()
      .put(dhl.ao, dhl.aw)
      .put(dhl.U, dhl.al)
      .put(dhl.au, dhl.aC)
      .put(dhl.aa, dhl.ak)
      .put(dhl.as, dhl.aA)
      .put(dhl.Y, dhl.ai)
      .put(dhl.at, dhl.aB)
      .put(dhl.Z, dhl.aj)
      .put(dhl.aq, dhl.ay)
      .put(dhl.W, dhl.ag)
      .put(dhl.ar, dhl.az)
      .put(dhl.X, dhl.ah)
      .put(dhl.ap, dhl.ax)
      .put(dhl.V, dhl.af)
      .put(dhl.oj, dhl.ok)
      .put(dhl.ol, dhl.om)
      .put(dhl.os, dhl.ot)
      .put(dhl.ou, dhl.ov)
      .put(dhl.av, dhl.aD)
      .put(dhl.ab, dhl.am)
      .put(dhl.ae, dhl.an)
      .build();

   public ctn(cxg $$0, float $$1, float $$2, cvk.a $$3) {
      super($$0, awt.bB, $$1, $$2, $$3);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      cnu $$3 = $$0.o();
      if (b($$0)) {
         return brp.e;
      } else {
         Optional<duo> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return brp.e;
         } else {
            cvp $$5 = $$0.n();
            if ($$3 instanceof ari) {
               an.N.a((ari)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dzl.c, $$2, dzl.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, buk.d($$0.p()));
            }

            return brp.a;
         }
      }
   }

   private static boolean b(czm $$0) {
      cnu $$1 = $$0.o();
      return $$0.p().equals(bro.a) && $$1.eX().a(cvt.vu) && !$$1.fS();
   }

   private Optional<duo> a(deg $$0, je $$1, @Nullable cnu $$2, duo $$3) {
      Optional<duo> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awe.aH, awf.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<duo> $$5 = dqp.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awe.aI, awf.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<duo> $$6 = Optional.ofNullable((dhj)cvf.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awe.aJ, awf.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<duo> a(duo $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().b(dnw.i, $$0.c(dnw.i)));
   }
}
