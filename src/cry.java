import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cry extends csu {
   protected static final Map<dfc, dfc> a = new Builder()
      .put(dfe.aW, dfe.be)
      .put(dfe.aC, dfe.aT)
      .put(dfe.bc, dfe.bk)
      .put(dfe.aI, dfe.aS)
      .put(dfe.ba, dfe.bi)
      .put(dfe.aG, dfe.aQ)
      .put(dfe.bb, dfe.bj)
      .put(dfe.aH, dfe.aR)
      .put(dfe.aY, dfe.bg)
      .put(dfe.aE, dfe.aO)
      .put(dfe.aZ, dfe.bh)
      .put(dfe.aF, dfe.aP)
      .put(dfe.aX, dfe.bf)
      .put(dfe.aD, dfe.aN)
      .put(dfe.pj, dfe.pk)
      .put(dfe.pl, dfe.pm)
      .put(dfe.ps, dfe.pt)
      .put(dfe.pu, dfe.pv)
      .put(dfe.bd, dfe.bl)
      .put(dfe.aJ, dfe.aU)
      .put(dfe.aM, dfe.aV)
      .build();

   public cry(cwe $$0, cuc.a $$1) {
      super($$0, awe.bC, $$1);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      cly $$3 = $$0.o();
      Optional<dtc> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqa.d;
      } else {
         cuh $$5 = $$0.n();
         if ($$3 instanceof aqu) {
            an.N.a((aqu)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dxv.c, $$2, dxv.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bso.d($$0.p()));
         }

         return bqa.a($$1.C);
      }
   }

   private Optional<dtc> a(dca $$0, ir $$1, @Nullable cly $$2, dtc $$3) {
      Optional<dtc> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avo.aM, avq.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dtc> $$5 = doy.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avo.aN, avq.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dtc> $$6 = Optional.ofNullable((dfc)ctw.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avo.aO, avq.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dtc> a(dtc $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(dmc.i, $$0.c(dmc.i)));
   }
}
