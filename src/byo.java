import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class byo extends bxz<cpj> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cpm, aly<ewu>> g = ImmutableMap.builder()
      .put(cpm.c, ewl.ar)
      .put(cpm.d, ewl.as)
      .put(cpm.e, ewl.at)
      .put(cpm.f, ewl.au)
      .put(cpm.g, ewl.av)
      .put(cpm.h, ewl.aw)
      .put(cpm.i, ewl.ax)
      .put(cpm.j, ewl.ay)
      .put(cpm.k, ewl.az)
      .put(cpm.l, ewl.aA)
      .put(cpm.n, ewl.aB)
      .put(cpm.o, ewl.aC)
      .put(cpm.p, ewl.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public byo(int $$0) {
      super(ImmutableMap.of(cfk.m, cfl.c, cfk.n, cfl.c, cfk.q, cfl.c, cfk.k, cfl.a), $$0);
   }

   protected boolean a(ash $$0, cpj $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ash $$0, cpj $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cpx $$3 = this.c($$1).get();
      $$1.ec().a(cfk.q, $$3);
      byb.a($$1, $$3);
   }

   protected boolean b(ash $$0, cpj $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      cpx $$3 = this.c($$1).get();
      byb.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         byb.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ash $$0, cpj $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cfk.q);
      $$1.ec().b(cfk.m);
      $$1.ec().b(cfk.n);
   }

   private void a(ash $$0, cpj $$1, bwg $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> byb.a($$1, $$3, $$2.du()));
   }

   private static aly<ewu> a(cpj $$0) {
      if ($$0.e_()) {
         return ewl.aF;
      } else {
         cpm $$1 = $$0.gy().b();
         return g.getOrDefault($$1, ewl.aE);
      }
   }

   private boolean b(cpj $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cpx> c(cpj $$0) {
      return $$0.ec().c(cfk.k).filter(this::a);
   }

   private boolean a(cpx $$0) {
      return $$0.b(bur.F);
   }

   private boolean a(cpj $$0, cpx $$1) {
      jh $$2 = $$1.dw();
      jh $$3 = $$0.dw();
      return $$3.a($$2, 5.0);
   }

   private static int a(ash $$0) {
      return 600 + $$0.A.a(6001);
   }
}
