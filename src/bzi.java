import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bzi extends byt<cqk> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alf<cqn>, alf<eze>> g = ImmutableMap.builder()
      .put(cqn.c, eyv.ar)
      .put(cqn.d, eyv.as)
      .put(cqn.e, eyv.at)
      .put(cqn.f, eyv.au)
      .put(cqn.g, eyv.av)
      .put(cqn.h, eyv.aw)
      .put(cqn.i, eyv.ax)
      .put(cqn.j, eyv.ay)
      .put(cqn.k, eyv.az)
      .put(cqn.l, eyv.aA)
      .put(cqn.n, eyv.aB)
      .put(cqn.o, eyv.aC)
      .put(cqn.p, eyv.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bzi(int $$0) {
      super(ImmutableMap.of(cge.n, cgf.c, cge.o, cgf.c, cge.r, cgf.c, cge.k, cgf.a), $$0);
   }

   protected boolean a(arq $$0, cqk $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arq $$0, cqk $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cqy $$3 = this.c($$1).get();
      $$1.eb().a(cge.r, $$3);
      byv.a($$1, $$3);
   }

   protected boolean b(arq $$0, cqk $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      cqy $$3 = this.c($$1).get();
      byv.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         byv.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arq $$0, cqk $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cge.r);
      $$1.eb().b(cge.n);
      $$1.eb().b(cge.o);
   }

   private void a(arq $$0, cqk $$1, bxc $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> byv.a($$1, $$3, $$2.dt()));
   }

   private static alf<eze> a(cqk $$0) {
      if ($$0.n_()) {
         return eyv.aF;
      } else {
         Optional<alf<cqn>> $$1 = $$0.gy().b().e();
         return $$1.isEmpty() ? eyv.aE : g.getOrDefault($$1.get(), eyv.aE);
      }
   }

   private boolean b(cqk $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cqy> c(cqk $$0) {
      return $$0.eb().c(cge.k).filter(this::a);
   }

   private boolean a(cqy $$0) {
      return $$0.b(bvj.F);
   }

   private boolean a(cqk $$0, cqy $$1) {
      iu $$2 = $$1.dv();
      iu $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(arq $$0) {
      return 600 + $$0.A.a(6001);
   }
}
