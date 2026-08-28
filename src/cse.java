import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cse extends csz {
   protected static final Map<deu, deu> a = new Builder()
      .put(dew.ao, dew.aw)
      .put(dew.U, dew.al)
      .put(dew.au, dew.aC)
      .put(dew.aa, dew.ak)
      .put(dew.as, dew.aA)
      .put(dew.Y, dew.ai)
      .put(dew.at, dew.aB)
      .put(dew.Z, dew.aj)
      .put(dew.aq, dew.ay)
      .put(dew.W, dew.ag)
      .put(dew.ar, dew.az)
      .put(dew.X, dew.ah)
      .put(dew.ap, dew.ax)
      .put(dew.V, dew.af)
      .put(dew.oj, dew.ok)
      .put(dew.ol, dew.om)
      .put(dew.os, dew.ot)
      .put(dew.ou, dew.ov)
      .put(dew.av, dew.aD)
      .put(dew.ab, dew.am)
      .put(dew.ae, dew.an)
      .build();

   public cse(cvz $$0, cuf.a $$1) {
      super($$0, awl.bA, $$1);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      cms $$3 = $$0.o();
      Optional<drx> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqp.e;
      } else {
         cuk $$5 = $$0.n();
         if ($$3 instanceof arc) {
            am.N.a((arc)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dwq.c, $$2, dwq.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, btk.d($$0.p()));
         }

         return bqp.a($$1.B);
      }
   }

   private Optional<drx> a(dbt $$0, iz $$1, @Nullable cms $$2, drx $$3) {
      Optional<drx> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avw.aH, avx.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<drx> $$5 = dnz.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avw.aI, avx.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<drx> $$6 = Optional.ofNullable((deu)cua.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avw.aJ, avx.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<drx> a(drx $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(dlg.i, $$0.c(dlg.i)));
   }
}
