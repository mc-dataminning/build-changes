import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvm extends cwd {
   protected static final Map<dke, dke> a = new Builder()
      .put(dkg.at, dkg.aB)
      .put(dkg.X, dkg.aq)
      .put(dkg.az, dkg.aH)
      .put(dkg.ad, dkg.ao)
      .put(dkg.u, dkg.aI)
      .put(dkg.ae, dkg.ap)
      .put(dkg.ax, dkg.aF)
      .put(dkg.ab, dkg.am)
      .put(dkg.ay, dkg.aG)
      .put(dkg.ac, dkg.an)
      .put(dkg.av, dkg.aD)
      .put(dkg.Z, dkg.ak)
      .put(dkg.aw, dkg.aE)
      .put(dkg.aa, dkg.al)
      .put(dkg.au, dkg.aC)
      .put(dkg.Y, dkg.aj)
      .put(dkg.oE, dkg.oF)
      .put(dkg.oG, dkg.oH)
      .put(dkg.oN, dkg.oO)
      .put(dkg.oP, dkg.oQ)
      .put(dkg.aA, dkg.aJ)
      .put(dkg.af, dkg.ar)
      .put(dkg.ai, dkg.as)
      .build();

   public cvm(czb $$0, float $$1, float $$2, cxg.a $$3) {
      super($$0, axu.bC, $$1, $$2, $$3);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      cps $$3 = $$0.o();
      if (b($$0)) {
         return bte.e;
      } else {
         Optional<dxn> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bte.e;
         } else {
            cxk $$5 = $$0.n();
            if ($$3 instanceof asi) {
               ao.N.a((asi)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ecj.c, $$2, ecj.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bwb.d($$0.p()));
            }

            return bte.a;
         }
      }
   }

   private static boolean b(dbd $$0) {
      cps $$1 = $$0.o();
      return $$0.p().equals(btd.a) && $$1.eY().a(cxo.wi) && !$$1.fW();
   }

   private Optional<dxn> a(dha $$0, jh $$1, @Nullable cps $$2, dxn $$3) {
      Optional<dxn> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, axf.aH, axg.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dxn> $$5 = dtm.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, axf.aI, axg.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dxn> $$6 = Optional.ofNullable((dke)cxb.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
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

   private Optional<dxn> a(dxn $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dqt.i, $$0.c(dqt.i)));
   }
}
