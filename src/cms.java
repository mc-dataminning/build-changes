import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cms extends cnn {
   protected static final Map<cys, cys> a = new Builder()
      .put(cyu.ao, cyu.aw)
      .put(cyu.U, cyu.al)
      .put(cyu.au, cyu.aC)
      .put(cyu.aa, cyu.ak)
      .put(cyu.as, cyu.aA)
      .put(cyu.Y, cyu.ai)
      .put(cyu.at, cyu.aB)
      .put(cyu.Z, cyu.aj)
      .put(cyu.aq, cyu.ay)
      .put(cyu.W, cyu.ag)
      .put(cyu.ar, cyu.az)
      .put(cyu.X, cyu.ah)
      .put(cyu.ap, cyu.ax)
      .put(cyu.V, cyu.af)
      .put(cyu.oj, cyu.ok)
      .put(cyu.ol, cyu.om)
      .put(cyu.os, cyu.ot)
      .put(cyu.ou, cyu.ov)
      .put(cyu.av, cyu.aD)
      .put(cyu.ab, cyu.am)
      .put(cyu.ae, cyu.an)
      .build();

   protected cms(cqq $$0, float $$1, float $$2, coy.a $$3) {
      super($$1, $$2, $$0, aua.bz, $$3);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      chl $$3 = $$0.o();
      Optional<dlj> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return blw.d;
      } else {
         cpd $$5 = $$0.n();
         if ($$3 instanceof aox) {
            am.N.a((aox)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dpw.c, $$2, dpw.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, boi.d($$0.p()));
         }

         return blw.a($$1.B);
      }
   }

   private Optional<dlj> a(cvr $$0, hz $$1, @Nullable chl $$2, dlj $$3) {
      Optional<dlj> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, atl.aF, atm.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dlj> $$5 = dhv.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, atl.aG, atm.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dlj> $$6 = Optional.ofNullable((cys)cot.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, atl.aH, atm.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dlj> b(dlj $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dfd.i, $$0.c(dfd.i)));
   }
}
