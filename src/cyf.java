import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyf extends czw {
   protected static final Map<dne, dne> a = new Builder()
      .put(dng.at, dng.aB)
      .put(dng.X, dng.aq)
      .put(dng.az, dng.aH)
      .put(dng.ad, dng.ao)
      .put(dng.u, dng.aI)
      .put(dng.ae, dng.ap)
      .put(dng.ax, dng.aF)
      .put(dng.ab, dng.am)
      .put(dng.ay, dng.aG)
      .put(dng.ac, dng.an)
      .put(dng.av, dng.aD)
      .put(dng.Z, dng.ak)
      .put(dng.aw, dng.aE)
      .put(dng.aa, dng.al)
      .put(dng.au, dng.aC)
      .put(dng.Y, dng.aj)
      .put(dng.oP, dng.oQ)
      .put(dng.oR, dng.oS)
      .put(dng.oY, dng.oZ)
      .put(dng.pa, dng.pb)
      .put(dng.aA, dng.aJ)
      .put(dng.af, dng.ar)
      .put(dng.ai, dng.as)
      .build();

   public cyf(dbo $$0, float $$1, float $$2, czw.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      crz $$3 = $$0.o();
      if (b($$0)) {
         return but.e;
      } else {
         Optional<ebg> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return but.e;
         } else {
            daa $$5 = $$0.n();
            if ($$3 instanceof arv) {
               aq.N.a((arv)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(egg.c, $$2, egg.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bxw.d($$0.p()));
            }

            return but.a;
         }
      }
   }

   private static boolean b(ddv $$0) {
      crz $$1 = $$0.o();
      return $$0.p().equals(bus.a) && $$1.fc().c(kl.I) && !$$1.fY();
   }

   private Optional<ebg> a(djz $$0, iw $$1, @Nullable crz $$2, ebg $$3) {
      Optional<ebg> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awr.aH, aws.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<ebg> $$5 = dxa.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awr.aI, aws.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<ebg> $$6 = Optional.ofNullable((dne)czr.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awr.aJ, aws.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<ebg> a(ebg $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dtx.d, $$0.c(dtx.d)));
   }
}
