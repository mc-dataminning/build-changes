import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxi extends cyz {
   protected static final Map<dmf, dmf> a = new Builder()
      .put(dmh.at, dmh.aB)
      .put(dmh.X, dmh.aq)
      .put(dmh.az, dmh.aH)
      .put(dmh.ad, dmh.ao)
      .put(dmh.u, dmh.aI)
      .put(dmh.ae, dmh.ap)
      .put(dmh.ax, dmh.aF)
      .put(dmh.ab, dmh.am)
      .put(dmh.ay, dmh.aG)
      .put(dmh.ac, dmh.an)
      .put(dmh.av, dmh.aD)
      .put(dmh.Z, dmh.ak)
      .put(dmh.aw, dmh.aE)
      .put(dmh.aa, dmh.al)
      .put(dmh.au, dmh.aC)
      .put(dmh.Y, dmh.aj)
      .put(dmh.oP, dmh.oQ)
      .put(dmh.oR, dmh.oS)
      .put(dmh.oY, dmh.oZ)
      .put(dmh.pa, dmh.pb)
      .put(dmh.aA, dmh.aJ)
      .put(dmh.af, dmh.ar)
      .put(dmh.ai, dmh.as)
      .build();

   public cxi(dar $$0, float $$1, float $$2, cyz.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      crc $$3 = $$0.o();
      if (b($$0)) {
         return bud.e;
      } else {
         Optional<eah> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bud.e;
         } else {
            czd $$5 = $$0.n();
            if ($$3 instanceof arr) {
               ap.N.a((arr)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(efh.c, $$2, efh.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bxe.d($$0.p()));
            }

            return bud.a;
         }
      }
   }

   private static boolean b(dcy $$0) {
      crc $$1 = $$0.o();
      return $$0.p().equals(buc.a) && $$1.fc().c(kj.I) && !$$1.fY();
   }

   private Optional<eah> a(dja $$0, iu $$1, @Nullable crc $$2, eah $$3) {
      Optional<eah> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awn.aH, awo.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<eah> $$5 = dwb.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awn.aI, awo.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<eah> $$6 = Optional.ofNullable((dmf)cyu.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
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

   private Optional<eah> a(eah $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dsy.d, $$0.c(dsy.d)));
   }
}
