import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwx extends cyo {
   protected static final Map<dlu, dlu> a = new Builder()
      .put(dlw.at, dlw.aB)
      .put(dlw.X, dlw.aq)
      .put(dlw.az, dlw.aH)
      .put(dlw.ad, dlw.ao)
      .put(dlw.u, dlw.aI)
      .put(dlw.ae, dlw.ap)
      .put(dlw.ax, dlw.aF)
      .put(dlw.ab, dlw.am)
      .put(dlw.ay, dlw.aG)
      .put(dlw.ac, dlw.an)
      .put(dlw.av, dlw.aD)
      .put(dlw.Z, dlw.ak)
      .put(dlw.aw, dlw.aE)
      .put(dlw.aa, dlw.al)
      .put(dlw.au, dlw.aC)
      .put(dlw.Y, dlw.aj)
      .put(dlw.oL, dlw.oM)
      .put(dlw.oN, dlw.oO)
      .put(dlw.oU, dlw.oV)
      .put(dlw.oW, dlw.oX)
      .put(dlw.aA, dlw.aJ)
      .put(dlw.af, dlw.ar)
      .put(dlw.ai, dlw.as)
      .build();

   public cwx(dag $$0, float $$1, float $$2, cyo.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      cqs $$3 = $$0.o();
      if (b($$0)) {
         return bty.e;
      } else {
         Optional<dzo> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bty.e;
         } else {
            cys $$5 = $$0.n();
            if ($$3 instanceof arp) {
               ap.N.a((arp)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eeo.c, $$2, eeo.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bwz.d($$0.p()));
            }

            return bty.a;
         }
      }
   }

   private static boolean b(dcn $$0) {
      cqs $$1 = $$0.o();
      return $$0.p().equals(btx.a) && $$1.fb().c(kj.I) && !$$1.fX();
   }

   private Optional<dzo> a(dip $$0, iu $$1, @Nullable cqs $$2, dzo $$3) {
      Optional<dzo> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awl.aH, awm.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dzo> $$5 = dvj.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awl.aI, awm.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dzo> $$6 = Optional.ofNullable((dlu)cyj.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awl.aJ, awm.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dzo> a(dzo $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dsl.d, $$0.c(dsl.d)));
   }
}
