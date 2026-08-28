import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csi extends ctc {
   protected static final Map<dfw, dfw> a = new Builder()
      .put(dfy.ao, dfy.aw)
      .put(dfy.U, dfy.al)
      .put(dfy.au, dfy.aC)
      .put(dfy.aa, dfy.ak)
      .put(dfy.as, dfy.aA)
      .put(dfy.Y, dfy.ai)
      .put(dfy.at, dfy.aB)
      .put(dfy.Z, dfy.aj)
      .put(dfy.aq, dfy.ay)
      .put(dfy.W, dfy.ag)
      .put(dfy.ar, dfy.az)
      .put(dfy.X, dfy.ah)
      .put(dfy.ap, dfy.ax)
      .put(dfy.V, dfy.af)
      .put(dfy.oj, dfy.ok)
      .put(dfy.ol, dfy.om)
      .put(dfy.os, dfy.ot)
      .put(dfy.ou, dfy.ov)
      .put(dfy.av, dfy.aD)
      .put(dfy.ab, dfy.am)
      .put(dfy.ae, dfy.an)
      .build();

   public csi(cwg $$0, cuj.a $$1) {
      super($$0, awd.bA, $$1);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      cmv $$3 = $$0.o();
      if (b($$0)) {
         return bqq.e;
      } else {
         Optional<dta> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bqq.e;
         } else {
            cuo $$5 = $$0.n();
            if ($$3 instanceof aqu) {
               an.N.a((aqu)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dxw.c, $$2, dxw.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, btl.d($$0.p()));
            }

            return bqq.a($$1.B);
         }
      }
   }

   private static boolean b(cyd $$0) {
      cmv $$1 = $$0.o();
      return $$0.p().equals(bqp.a) && $$1.eV().a(cur.vs) && !$$1.fO();
   }

   private Optional<dta> a(dcu $$0, jd $$1, @Nullable cmv $$2, dta $$3) {
      Optional<dta> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avo.aH, avp.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dta> $$5 = dpc.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avo.aI, avp.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dta> $$6 = Optional.ofNullable((dfw)cue.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avo.aJ, avp.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dta> a(dta $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dmj.i, $$0.c(dmj.i)));
   }
}
