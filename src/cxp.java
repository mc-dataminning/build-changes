import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxp extends czg {
   protected static final Map<dmm, dmm> a = new Builder()
      .put(dmo.at, dmo.aB)
      .put(dmo.X, dmo.aq)
      .put(dmo.az, dmo.aH)
      .put(dmo.ad, dmo.ao)
      .put(dmo.u, dmo.aI)
      .put(dmo.ae, dmo.ap)
      .put(dmo.ax, dmo.aF)
      .put(dmo.ab, dmo.am)
      .put(dmo.ay, dmo.aG)
      .put(dmo.ac, dmo.an)
      .put(dmo.av, dmo.aD)
      .put(dmo.Z, dmo.ak)
      .put(dmo.aw, dmo.aE)
      .put(dmo.aa, dmo.al)
      .put(dmo.au, dmo.aC)
      .put(dmo.Y, dmo.aj)
      .put(dmo.oP, dmo.oQ)
      .put(dmo.oR, dmo.oS)
      .put(dmo.oY, dmo.oZ)
      .put(dmo.pa, dmo.pb)
      .put(dmo.aA, dmo.aJ)
      .put(dmo.af, dmo.ar)
      .put(dmo.ai, dmo.as)
      .build();

   public cxp(day $$0, float $$1, float $$2, czg.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      crj $$3 = $$0.o();
      if (b($$0)) {
         return bug.e;
      } else {
         Optional<eao> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bug.e;
         } else {
            czk $$5 = $$0.n();
            if ($$3 instanceof arr) {
               aq.N.a((arr)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(efo.c, $$2, efo.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bxj.d($$0.p()));
            }

            return bug.a;
         }
      }
   }

   private static boolean b(ddf $$0) {
      crj $$1 = $$0.o();
      return $$0.p().equals(buf.a) && $$1.fb().c(kk.I) && !$$1.fX();
   }

   private Optional<eao> a(djh $$0, iv $$1, @Nullable crj $$2, eao $$3) {
      Optional<eao> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awn.aH, awo.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<eao> $$5 = dwi.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awn.aI, awo.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<eao> $$6 = Optional.ofNullable((dmm)czb.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awn.aJ, awo.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<eao> a(eao $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dtf.d, $$0.c(dtf.d)));
   }
}
