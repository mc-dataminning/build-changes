import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyd extends czu {
   protected static final Map<dnc, dnc> a = new Builder()
      .put(dne.at, dne.aB)
      .put(dne.X, dne.aq)
      .put(dne.az, dne.aH)
      .put(dne.ad, dne.ao)
      .put(dne.u, dne.aI)
      .put(dne.ae, dne.ap)
      .put(dne.ax, dne.aF)
      .put(dne.ab, dne.am)
      .put(dne.ay, dne.aG)
      .put(dne.ac, dne.an)
      .put(dne.av, dne.aD)
      .put(dne.Z, dne.ak)
      .put(dne.aw, dne.aE)
      .put(dne.aa, dne.al)
      .put(dne.au, dne.aC)
      .put(dne.Y, dne.aj)
      .put(dne.oP, dne.oQ)
      .put(dne.oR, dne.oS)
      .put(dne.oY, dne.oZ)
      .put(dne.pa, dne.pb)
      .put(dne.aA, dne.aJ)
      .put(dne.af, dne.ar)
      .put(dne.ai, dne.as)
      .build();

   public cyd(dbm $$0, float $$1, float $$2, czu.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      crx $$3 = $$0.o();
      if (b($$0)) {
         return bur.e;
      } else {
         Optional<ebe> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bur.e;
         } else {
            czy $$5 = $$0.n();
            if ($$3 instanceof art) {
               aq.N.a((art)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ege.c, $$2, ege.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bxu.d($$0.p()));
            }

            return bur.a;
         }
      }
   }

   private static boolean b(ddt $$0) {
      crx $$1 = $$0.o();
      return $$0.p().equals(buq.a) && $$1.fc().c(kk.I) && !$$1.fY();
   }

   private Optional<ebe> a(djx $$0, iv $$1, @Nullable crx $$2, ebe $$3) {
      Optional<ebe> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awp.aH, awq.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<ebe> $$5 = dwy.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awp.aI, awq.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<ebe> $$6 = Optional.ofNullable((dnc)czp.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awp.aJ, awq.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<ebe> a(ebe $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dtv.d, $$0.c(dtv.d)));
   }
}
