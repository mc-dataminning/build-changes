import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class byg extends bxr<cpd> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cpg, akt<ewt>> g = ImmutableMap.builder()
      .put(cpg.c, ewk.ar)
      .put(cpg.d, ewk.as)
      .put(cpg.e, ewk.at)
      .put(cpg.f, ewk.au)
      .put(cpg.g, ewk.av)
      .put(cpg.h, ewk.aw)
      .put(cpg.i, ewk.ax)
      .put(cpg.j, ewk.ay)
      .put(cpg.k, ewk.az)
      .put(cpg.l, ewk.aA)
      .put(cpg.n, ewk.aB)
      .put(cpg.o, ewk.aC)
      .put(cpg.p, ewk.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public byg(int $$0) {
      super(ImmutableMap.of(cfc.m, cfd.c, cfc.n, cfd.c, cfc.q, cfd.c, cfc.k, cfd.a), $$0);
   }

   protected boolean a(ard $$0, cpd $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ard $$0, cpd $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cpr $$3 = this.c($$1).get();
      $$1.ea().a(cfc.q, $$3);
      bxt.a($$1, $$3);
   }

   protected boolean b(ard $$0, cpd $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      cpr $$3 = this.c($$1).get();
      bxt.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxt.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ard $$0, cpd $$1, long $$2) {
      this.i = a($$0);
      $$1.ea().b(cfc.q);
      $$1.ea().b(cfc.m);
      $$1.ea().b(cfc.n);
   }

   private void a(ard $$0, cpd $$1, bvy $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxt.a($$1, $$3, $$2.ds()));
   }

   private static akt<ewt> a(cpd $$0) {
      if ($$0.n_()) {
         return ewk.aF;
      } else {
         cpg $$1 = $$0.gA().b();
         return g.getOrDefault($$1, ewk.aE);
      }
   }

   private boolean b(cpd $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cpr> c(cpd $$0) {
      return $$0.ea().c(cfc.k).filter(this::a);
   }

   private boolean a(cpr $$0) {
      return $$0.b(bug.F);
   }

   private boolean a(cpd $$0, cpr $$1) {
      ji $$2 = $$1.du();
      ji $$3 = $$0.du();
      return $$3.a($$2, 5.0);
   }

   private static int a(ard $$0) {
      return 600 + $$0.A.a(6001);
   }
}
