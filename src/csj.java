import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csj extends cte {
   protected static final Map<dez, dez> a = new Builder()
      .put(dfb.ao, dfb.aw)
      .put(dfb.U, dfb.al)
      .put(dfb.au, dfb.aC)
      .put(dfb.aa, dfb.ak)
      .put(dfb.as, dfb.aA)
      .put(dfb.Y, dfb.ai)
      .put(dfb.at, dfb.aB)
      .put(dfb.Z, dfb.aj)
      .put(dfb.aq, dfb.ay)
      .put(dfb.W, dfb.ag)
      .put(dfb.ar, dfb.az)
      .put(dfb.X, dfb.ah)
      .put(dfb.ap, dfb.ax)
      .put(dfb.V, dfb.af)
      .put(dfb.oj, dfb.ok)
      .put(dfb.ol, dfb.om)
      .put(dfb.os, dfb.ot)
      .put(dfb.ou, dfb.ov)
      .put(dfb.av, dfb.aD)
      .put(dfb.ab, dfb.am)
      .put(dfb.ae, dfb.an)
      .build();

   public csj(cwe $$0, cuk.a $$1) {
      super($$0, awp.bA, $$1);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmx $$3 = $$0.o();
      Optional<dsc> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqu.e;
      } else {
         cup $$5 = $$0.n();
         if ($$3 instanceof arg) {
            am.N.a((arg)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dwv.c, $$2, dwv.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, btp.d($$0.p()));
         }

         return bqu.a($$1.B);
      }
   }

   private Optional<dsc> a(dby $$0, iz $$1, @Nullable cmx $$2, dsc $$3) {
      Optional<dsc> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awa.aH, awb.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsc> $$5 = doe.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awa.aI, awb.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsc> $$6 = Optional.ofNullable((dez)cuf.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awa.aJ, awb.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dsc> a(dsc $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dll.i, $$0.c(dll.i)));
   }
}
