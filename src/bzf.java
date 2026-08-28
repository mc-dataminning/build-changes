import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bzf extends byq<cqe> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<ald<cqh>, ald<eys>> g = ImmutableMap.builder()
      .put(cqh.c, eyj.ar)
      .put(cqh.d, eyj.as)
      .put(cqh.e, eyj.at)
      .put(cqh.f, eyj.au)
      .put(cqh.g, eyj.av)
      .put(cqh.h, eyj.aw)
      .put(cqh.i, eyj.ax)
      .put(cqh.j, eyj.ay)
      .put(cqh.k, eyj.az)
      .put(cqh.l, eyj.aA)
      .put(cqh.n, eyj.aB)
      .put(cqh.o, eyj.aC)
      .put(cqh.p, eyj.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bzf(int $$0) {
      super(ImmutableMap.of(cgb.n, cgc.c, cgb.o, cgc.c, cgb.r, cgc.c, cgb.k, cgc.a), $$0);
   }

   protected boolean a(aro $$0, cqe $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aro $$0, cqe $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cqs $$3 = this.c($$1).get();
      $$1.eb().a(cgb.r, $$3);
      bys.a($$1, $$3);
   }

   protected boolean b(aro $$0, cqe $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      cqs $$3 = this.c($$1).get();
      bys.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bys.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aro $$0, cqe $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cgb.r);
      $$1.eb().b(cgb.n);
      $$1.eb().b(cgb.o);
   }

   private void a(aro $$0, cqe $$1, bwz $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bys.a($$1, $$3, $$2.dt()));
   }

   private static ald<eys> a(cqe $$0) {
      if ($$0.n_()) {
         return eyj.aF;
      } else {
         Optional<ald<cqh>> $$1 = $$0.gy().b().e();
         return $$1.isEmpty() ? eyj.aE : g.getOrDefault($$1.get(), eyj.aE);
      }
   }

   private boolean b(cqe $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cqs> c(cqe $$0) {
      return $$0.eb().c(cgb.k).filter(this::a);
   }

   private boolean a(cqs $$0) {
      return $$0.b(bvg.F);
   }

   private boolean a(cqe $$0, cqs $$1) {
      iu $$2 = $$1.dv();
      iu $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(aro $$0) {
      return 600 + $$0.A.a(6001);
   }
}
