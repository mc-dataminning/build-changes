import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyp extends dag {
   protected static final Map<dno, dno> a = new Builder()
      .put(dnq.at, dnq.aB)
      .put(dnq.X, dnq.aq)
      .put(dnq.az, dnq.aH)
      .put(dnq.ad, dnq.ao)
      .put(dnq.u, dnq.aI)
      .put(dnq.ae, dnq.ap)
      .put(dnq.ax, dnq.aF)
      .put(dnq.ab, dnq.am)
      .put(dnq.ay, dnq.aG)
      .put(dnq.ac, dnq.an)
      .put(dnq.av, dnq.aD)
      .put(dnq.Z, dnq.ak)
      .put(dnq.aw, dnq.aE)
      .put(dnq.aa, dnq.al)
      .put(dnq.au, dnq.aC)
      .put(dnq.Y, dnq.aj)
      .put(dnq.oP, dnq.oQ)
      .put(dnq.oR, dnq.oS)
      .put(dnq.oY, dnq.oZ)
      .put(dnq.pa, dnq.pb)
      .put(dnq.aA, dnq.aJ)
      .put(dnq.af, dnq.ar)
      .put(dnq.ai, dnq.as)
      .build();

   public cyp(dby $$0, float $$1, float $$2, dag.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      csi $$3 = $$0.o();
      if (b($$0)) {
         return bvc.e;
      } else {
         Optional<ebq> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bvc.e;
         } else {
            dak $$5 = $$0.n();
            if ($$3 instanceof asc) {
               aq.N.a((asc)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(egq.c, $$2, egq.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, byf.d($$0.p()));
            }

            return bvc.a;
         }
      }
   }

   private static boolean b(def $$0) {
      csi $$1 = $$0.o();
      return $$0.p().equals(bvb.a) && $$1.fc().c(kl.I) && !$$1.fY();
   }

   private Optional<ebq> a(dkj $$0, iw $$1, @Nullable csi $$2, ebq $$3) {
      Optional<ebq> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awy.aH, awz.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<ebq> $$5 = dxk.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awy.aI, awz.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<ebq> $$6 = Optional.ofNullable((dno)dab.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awy.aJ, awz.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<ebq> a(ebq $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(duh.d, $$0.c(duh.d)));
   }
}
