import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csk extends cte {
   protected static final Map<dfy, dfy> a = new Builder()
      .put(dga.ao, dga.aw)
      .put(dga.U, dga.al)
      .put(dga.au, dga.aC)
      .put(dga.aa, dga.ak)
      .put(dga.as, dga.aA)
      .put(dga.Y, dga.ai)
      .put(dga.at, dga.aB)
      .put(dga.Z, dga.aj)
      .put(dga.aq, dga.ay)
      .put(dga.W, dga.ag)
      .put(dga.ar, dga.az)
      .put(dga.X, dga.ah)
      .put(dga.ap, dga.ax)
      .put(dga.V, dga.af)
      .put(dga.oj, dga.ok)
      .put(dga.ol, dga.om)
      .put(dga.os, dga.ot)
      .put(dga.ou, dga.ov)
      .put(dga.av, dga.aD)
      .put(dga.ab, dga.am)
      .put(dga.ae, dga.an)
      .build();

   public csk(cwi $$0, cul.a $$1) {
      super($$0, awe.bB, $$1);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      cmx $$3 = $$0.o();
      if (b($$0)) {
         return bqr.e;
      } else {
         Optional<dtc> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bqr.e;
         } else {
            cuq $$5 = $$0.n();
            if ($$3 instanceof aqv) {
               an.N.a((aqv)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dxz.c, $$2, dxz.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, btn.d($$0.p()));
            }

            return bqr.a($$1.B);
         }
      }
   }

   private static boolean b(cyf $$0) {
      cmx $$1 = $$0.o();
      return $$0.p().equals(bqq.a) && $$1.eU().a(cut.vs) && !$$1.fN();
   }

   private Optional<dtc> a(dcw $$0, jd $$1, @Nullable cmx $$2, dtc $$3) {
      Optional<dtc> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avp.aH, avq.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dtc> $$5 = dpe.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avp.aI, avq.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dtc> $$6 = Optional.ofNullable((dfy)cug.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avp.aJ, avq.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dtc> a(dtc $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dml.i, $$0.c(dml.i)));
   }
}
