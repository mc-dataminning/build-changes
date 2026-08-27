import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cjd extends cjy {
   protected static final Map<cvf, cvf> a = new Builder()
      .put(cvh.ao, cvh.aw)
      .put(cvh.U, cvh.al)
      .put(cvh.au, cvh.aC)
      .put(cvh.aa, cvh.ak)
      .put(cvh.as, cvh.aA)
      .put(cvh.Y, cvh.ai)
      .put(cvh.at, cvh.aB)
      .put(cvh.Z, cvh.aj)
      .put(cvh.aq, cvh.ay)
      .put(cvh.W, cvh.ag)
      .put(cvh.ar, cvh.az)
      .put(cvh.X, cvh.ah)
      .put(cvh.ap, cvh.ax)
      .put(cvh.V, cvh.af)
      .put(cvh.oj, cvh.ok)
      .put(cvh.ol, cvh.om)
      .put(cvh.os, cvh.ot)
      .put(cvh.ou, cvh.ov)
      .put(cvh.av, cvh.aD)
      .put(cvh.ab, cvh.am)
      .put(cvh.ae, cvh.an)
      .build();

   protected cjd(cnb $$0, float $$1, float $$2, clj.a $$3) {
      super($$1, $$2, $$0, ark.bz, $$3);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      cdz $$3 = $$0.o();
      Optional<dhn> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bjb.d;
      } else {
         clo $$5 = $$0.n();
         if ($$3 instanceof amj) {
            al.M.a((amj)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dlx.c, $$2, dlx.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bjb.a($$1.B);
      }
   }

   private Optional<dhn> a(csf $$0, hx $$1, @Nullable cdz $$2, dhn $$3) {
      Optional<dhn> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, aqv.as, aqw.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dhn> $$5 = deg.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, aqv.at, aqw.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dhn> $$6 = Optional.ofNullable((cvf)cld.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, aqv.au, aqw.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dhn> b(dhn $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dbq.i, $$0.c(dbq.i)));
   }
}
