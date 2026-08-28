import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class byx extends byi<cpu> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alc<cpx>, alc<exq>> g = ImmutableMap.builder()
      .put(cpx.c, exh.ar)
      .put(cpx.d, exh.as)
      .put(cpx.e, exh.at)
      .put(cpx.f, exh.au)
      .put(cpx.g, exh.av)
      .put(cpx.h, exh.aw)
      .put(cpx.i, exh.ax)
      .put(cpx.j, exh.ay)
      .put(cpx.k, exh.az)
      .put(cpx.l, exh.aA)
      .put(cpx.n, exh.aB)
      .put(cpx.o, exh.aC)
      .put(cpx.p, exh.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public byx(int $$0) {
      super(ImmutableMap.of(cft.n, cfu.c, cft.o, cfu.c, cft.r, cfu.c, cft.k, cfu.a), $$0);
   }

   protected boolean a(arn $$0, cpu $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arn $$0, cpu $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cqi $$3 = this.c($$1).get();
      $$1.eb().a(cft.r, $$3);
      byk.a($$1, $$3);
   }

   protected boolean b(arn $$0, cpu $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      cqi $$3 = this.c($$1).get();
      byk.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         byk.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arn $$0, cpu $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cft.r);
      $$1.eb().b(cft.n);
      $$1.eb().b(cft.o);
   }

   private void a(arn $$0, cpu $$1, bwr $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> byk.a($$1, $$3, $$2.dt()));
   }

   private static alc<exq> a(cpu $$0) {
      if ($$0.n_()) {
         return exh.aF;
      } else {
         Optional<alc<cpx>> $$1 = $$0.gy().b().e();
         return $$1.isEmpty() ? exh.aE : g.getOrDefault($$1.get(), exh.aE);
      }
   }

   private boolean b(cpu $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cqi> c(cpu $$0) {
      return $$0.eb().c(cft.k).filter(this::a);
   }

   private boolean a(cqi $$0) {
      return $$0.b(buy.F);
   }

   private boolean a(cpu $$0, cqi $$1) {
      jj $$2 = $$1.dv();
      jj $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(arn $$0) {
      return 600 + $$0.A.a(6001);
   }
}
