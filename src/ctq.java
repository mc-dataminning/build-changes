import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctq extends cui {
   protected static final Map<dhm, dhm> a = new Builder()
      .put(dho.ao, dho.aw)
      .put(dho.U, dho.al)
      .put(dho.au, dho.aC)
      .put(dho.aa, dho.ak)
      .put(dho.as, dho.aA)
      .put(dho.Y, dho.ai)
      .put(dho.at, dho.aB)
      .put(dho.Z, dho.aj)
      .put(dho.aq, dho.ay)
      .put(dho.W, dho.ag)
      .put(dho.ar, dho.az)
      .put(dho.X, dho.ah)
      .put(dho.ap, dho.ax)
      .put(dho.V, dho.af)
      .put(dho.oj, dho.ok)
      .put(dho.ol, dho.om)
      .put(dho.os, dho.ot)
      .put(dho.ou, dho.ov)
      .put(dho.av, dho.aD)
      .put(dho.ab, dho.am)
      .put(dho.ae, dho.an)
      .build();

   public ctq(cxj $$0, float $$1, float $$2, cvn.a $$3) {
      super($$0, awv.bB, $$1, $$2, $$3);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      cnx $$3 = $$0.o();
      if (b($$0)) {
         return brs.e;
      } else {
         Optional<dus> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return brs.e;
         } else {
            cvs $$5 = $$0.n();
            if ($$3 instanceof ark) {
               an.N.a((ark)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dzp.c, $$2, dzp.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bun.d($$0.p()));
            }

            return brs.a;
         }
      }
   }

   private static boolean b(czp $$0) {
      cnx $$1 = $$0.o();
      return $$0.p().equals(brr.a) && $$1.eX().a(cvw.vu) && !$$1.fT();
   }

   private Optional<dus> a(dej $$0, jf $$1, @Nullable cnx $$2, dus $$3) {
      Optional<dus> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awg.aH, awh.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dus> $$5 = dqs.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awg.aI, awh.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dus> $$6 = Optional.ofNullable((dhm)cvi.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awg.aJ, awh.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dus> a(dus $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().b(dnz.i, $$0.c(dnz.i)));
   }
}
