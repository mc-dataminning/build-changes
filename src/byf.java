import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class byf extends bxq<cpa> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cpd, alo<ewn>> g = ImmutableMap.builder()
      .put(cpd.c, ewe.ar)
      .put(cpd.d, ewe.as)
      .put(cpd.e, ewe.at)
      .put(cpd.f, ewe.au)
      .put(cpd.g, ewe.av)
      .put(cpd.h, ewe.aw)
      .put(cpd.i, ewe.ax)
      .put(cpd.j, ewe.ay)
      .put(cpd.k, ewe.az)
      .put(cpd.l, ewe.aA)
      .put(cpd.n, ewe.aB)
      .put(cpd.o, ewe.aC)
      .put(cpd.p, ewe.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public byf(int $$0) {
      super(ImmutableMap.of(cfb.m, cfc.c, cfb.n, cfc.c, cfb.q, cfc.c, cfb.k, cfc.a), $$0);
   }

   protected boolean a(arx $$0, cpa $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arx $$0, cpa $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cpo $$3 = this.c($$1).get();
      $$1.ec().a(cfb.q, $$3);
      bxs.a($$1, $$3);
   }

   protected boolean b(arx $$0, cpa $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      cpo $$3 = this.c($$1).get();
      bxs.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxs.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arx $$0, cpa $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cfb.q);
      $$1.ec().b(cfb.m);
      $$1.ec().b(cfb.n);
   }

   private void a(arx $$0, cpa $$1, bvx $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxs.a($$1, $$3, $$2.du()));
   }

   private static alo<ewn> a(cpa $$0) {
      if ($$0.e_()) {
         return ewe.aF;
      } else {
         cpd $$1 = $$0.gy().b();
         return g.getOrDefault($$1, ewe.aE);
      }
   }

   private boolean b(cpa $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cpo> c(cpa $$0) {
      return $$0.ec().c(cfb.k).filter(this::a);
   }

   private boolean a(cpo $$0) {
      return $$0.b(bui.F);
   }

   private boolean a(cpa $$0, cpo $$1) {
      jh $$2 = $$1.dw();
      jh $$3 = $$0.dw();
      return $$3.a($$2, 5.0);
   }

   private static int a(arx $$0) {
      return 600 + $$0.A.a(6001);
   }
}
