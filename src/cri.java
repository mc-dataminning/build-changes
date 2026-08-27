import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cri extends csd {
   protected static final Map<ddy, ddy> a = new Builder()
      .put(dea.ao, dea.aw)
      .put(dea.U, dea.al)
      .put(dea.au, dea.aC)
      .put(dea.aa, dea.ak)
      .put(dea.as, dea.aA)
      .put(dea.Y, dea.ai)
      .put(dea.at, dea.aB)
      .put(dea.Z, dea.aj)
      .put(dea.aq, dea.ay)
      .put(dea.W, dea.ag)
      .put(dea.ar, dea.az)
      .put(dea.X, dea.ah)
      .put(dea.ap, dea.ax)
      .put(dea.V, dea.af)
      .put(dea.oj, dea.ok)
      .put(dea.ol, dea.om)
      .put(dea.os, dea.ot)
      .put(dea.ou, dea.ov)
      .put(dea.av, dea.aD)
      .put(dea.ab, dea.am)
      .put(dea.ae, dea.an)
      .build();

   public cri(cvd $$0, ctj.a $$1) {
      super($$0, avw.bA, $$1);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      clw $$3 = $$0.o();
      Optional<drb> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bpu.d;
      } else {
         cto $$5 = $$0.n();
         if ($$3 instanceof aqn) {
            am.N.a((aqn)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dvu.c, $$2, dvu.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bso.d($$0.p()));
         }

         return bpu.a($$1.B);
      }
   }

   private Optional<drb> a(dax $$0, io $$1, @Nullable clw $$2, drb $$3) {
      Optional<drb> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avh.aH, avi.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<drb> $$5 = dnd.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avh.aI, avi.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<drb> $$6 = Optional.ofNullable((ddy)cte.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avh.aJ, avi.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<drb> a(drb $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(dkk.i, $$0.c(dkk.i)));
   }
}
