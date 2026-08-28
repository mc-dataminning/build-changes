import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvq extends cwh {
   protected static final Map<dkl, dkl> a = new Builder()
      .put(dkn.at, dkn.aB)
      .put(dkn.X, dkn.aq)
      .put(dkn.az, dkn.aH)
      .put(dkn.ad, dkn.ao)
      .put(dkn.u, dkn.aI)
      .put(dkn.ae, dkn.ap)
      .put(dkn.ax, dkn.aF)
      .put(dkn.ab, dkn.am)
      .put(dkn.ay, dkn.aG)
      .put(dkn.ac, dkn.an)
      .put(dkn.av, dkn.aD)
      .put(dkn.Z, dkn.ak)
      .put(dkn.aw, dkn.aE)
      .put(dkn.aa, dkn.al)
      .put(dkn.au, dkn.aC)
      .put(dkn.Y, dkn.aj)
      .put(dkn.oE, dkn.oF)
      .put(dkn.oG, dkn.oH)
      .put(dkn.oN, dkn.oO)
      .put(dkn.oP, dkn.oQ)
      .put(dkn.aA, dkn.aJ)
      .put(dkn.af, dkn.ar)
      .put(dkn.ai, dkn.as)
      .build();

   public cvq(czf $$0, float $$1, float $$2, cxk.a $$3) {
      super($$0, axu.bC, $$1, $$2, $$3);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      cpw $$3 = $$0.o();
      if (b($$0)) {
         return bti.e;
      } else {
         Optional<dxu> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bti.e;
         } else {
            cxo $$5 = $$0.n();
            if ($$3 instanceof asi) {
               ao.N.a((asi)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ecq.c, $$2, ecq.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bwf.d($$0.p()));
            }

            return bti.a;
         }
      }
   }

   private static boolean b(dbh $$0) {
      cpw $$1 = $$0.o();
      return $$0.p().equals(bth.a) && $$1.eY().a(cxs.wi) && !$$1.fW();
   }

   private Optional<dxu> a(dhh $$0, jh $$1, @Nullable cpw $$2, dxu $$3) {
      Optional<dxu> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, axf.aH, axg.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dxu> $$5 = dtt.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, axf.aI, axg.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dxu> $$6 = Optional.ofNullable((dkl)cxf.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, axf.aJ, axg.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dxu> a(dxu $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dra.i, $$0.c(dra.i)));
   }
}
