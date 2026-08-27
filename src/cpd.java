import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpd extends cpy {
   protected static final Map<dby, dby> a = new Builder()
      .put(dca.ao, dca.aw)
      .put(dca.U, dca.al)
      .put(dca.au, dca.aC)
      .put(dca.aa, dca.ak)
      .put(dca.as, dca.aA)
      .put(dca.Y, dca.ai)
      .put(dca.at, dca.aB)
      .put(dca.Z, dca.aj)
      .put(dca.aq, dca.ay)
      .put(dca.W, dca.ag)
      .put(dca.ar, dca.az)
      .put(dca.X, dca.ah)
      .put(dca.ap, dca.ax)
      .put(dca.V, dca.af)
      .put(dca.oj, dca.ok)
      .put(dca.ol, dca.om)
      .put(dca.os, dca.ot)
      .put(dca.ou, dca.ov)
      .put(dca.av, dca.aD)
      .put(dca.ab, dca.am)
      .put(dca.ae, dca.an)
      .build();

   public cpd(csv $$0, cre.a $$1) {
      super($$0, avc.bA, $$1);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      cjt $$3 = $$0.o();
      Optional<doz> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return boa.d;
      } else {
         crj $$5 = $$0.n();
         if ($$3 instanceof apt) {
            am.N.a((apt)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dts.c, $$2, dts.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bqo.d($$0.p()));
         }

         return boa.a($$1.B);
      }
   }

   private Optional<doz> a(cyx $$0, ib $$1, @Nullable cjt $$2, doz $$3) {
      Optional<doz> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, aum.aH, aun.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<doz> $$5 = dlc.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, aum.aI, aun.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<doz> $$6 = Optional.ofNullable((dby)cqz.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, aum.aJ, aun.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<doz> b(doz $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(dij.i, $$0.c(dij.i)));
   }
}
