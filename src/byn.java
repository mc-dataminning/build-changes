import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class byn extends bxy<cpi> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cpl, aly<ewt>> g = ImmutableMap.builder()
      .put(cpl.c, ewk.ar)
      .put(cpl.d, ewk.as)
      .put(cpl.e, ewk.at)
      .put(cpl.f, ewk.au)
      .put(cpl.g, ewk.av)
      .put(cpl.h, ewk.aw)
      .put(cpl.i, ewk.ax)
      .put(cpl.j, ewk.ay)
      .put(cpl.k, ewk.az)
      .put(cpl.l, ewk.aA)
      .put(cpl.n, ewk.aB)
      .put(cpl.o, ewk.aC)
      .put(cpl.p, ewk.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public byn(int $$0) {
      super(ImmutableMap.of(cfj.m, cfk.c, cfj.n, cfk.c, cfj.q, cfk.c, cfj.k, cfk.a), $$0);
   }

   protected boolean a(ash $$0, cpi $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ash $$0, cpi $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cpw $$3 = this.c($$1).get();
      $$1.eb().a(cfj.q, $$3);
      bya.a($$1, $$3);
   }

   protected boolean b(ash $$0, cpi $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      cpw $$3 = this.c($$1).get();
      bya.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bya.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ash $$0, cpi $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cfj.q);
      $$1.eb().b(cfj.m);
      $$1.eb().b(cfj.n);
   }

   private void a(ash $$0, cpi $$1, bwf $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bya.a($$1, $$3, $$2.dt()));
   }

   private static aly<ewt> a(cpi $$0) {
      if ($$0.e_()) {
         return ewk.aF;
      } else {
         cpl $$1 = $$0.gw().b();
         return g.getOrDefault($$1, ewk.aE);
      }
   }

   private boolean b(cpi $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cpw> c(cpi $$0) {
      return $$0.eb().c(cfj.k).filter(this::a);
   }

   private boolean a(cpw $$0) {
      return $$0.b(buq.F);
   }

   private boolean a(cpi $$0, cpw $$1) {
      jh $$2 = $$1.dv();
      jh $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(ash $$0) {
      return 600 + $$0.A.a(6001);
   }
}
