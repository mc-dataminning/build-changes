import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxs extends czj {
   protected static final Map<dmr, dmr> a = new Builder()
      .put(dmt.at, dmt.aB)
      .put(dmt.X, dmt.aq)
      .put(dmt.az, dmt.aH)
      .put(dmt.ad, dmt.ao)
      .put(dmt.u, dmt.aI)
      .put(dmt.ae, dmt.ap)
      .put(dmt.ax, dmt.aF)
      .put(dmt.ab, dmt.am)
      .put(dmt.ay, dmt.aG)
      .put(dmt.ac, dmt.an)
      .put(dmt.av, dmt.aD)
      .put(dmt.Z, dmt.ak)
      .put(dmt.aw, dmt.aE)
      .put(dmt.aa, dmt.al)
      .put(dmt.au, dmt.aC)
      .put(dmt.Y, dmt.aj)
      .put(dmt.oP, dmt.oQ)
      .put(dmt.oR, dmt.oS)
      .put(dmt.oY, dmt.oZ)
      .put(dmt.pa, dmt.pb)
      .put(dmt.aA, dmt.aJ)
      .put(dmt.af, dmt.ar)
      .put(dmt.ai, dmt.as)
      .build();

   public cxs(dbb $$0, float $$1, float $$2, czj.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      crm $$3 = $$0.o();
      if (b($$0)) {
         return bug.e;
      } else {
         Optional<eat> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bug.e;
         } else {
            czn $$5 = $$0.n();
            if ($$3 instanceof arr) {
               aq.N.a((arr)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eft.c, $$2, eft.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bxj.d($$0.p()));
            }

            return bug.a;
         }
      }
   }

   private static boolean b(ddi $$0) {
      crm $$1 = $$0.o();
      return $$0.p().equals(buf.a) && $$1.fb().c(kk.I) && !$$1.fX();
   }

   private Optional<eat> a(djm $$0, iv $$1, @Nullable crm $$2, eat $$3) {
      Optional<eat> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awn.aH, awo.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<eat> $$5 = dwn.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awn.aI, awo.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<eat> $$6 = Optional.ofNullable((dmr)cze.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
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

   private Optional<eat> a(eat $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dtk.d, $$0.c(dtk.d)));
   }
}
