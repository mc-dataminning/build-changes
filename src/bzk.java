import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bzk extends byv<cqo> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alf<cqr>, alf<ezm>> g = ImmutableMap.builder()
      .put(cqr.c, ezd.ar)
      .put(cqr.d, ezd.as)
      .put(cqr.e, ezd.at)
      .put(cqr.f, ezd.au)
      .put(cqr.g, ezd.av)
      .put(cqr.h, ezd.aw)
      .put(cqr.i, ezd.ax)
      .put(cqr.j, ezd.ay)
      .put(cqr.k, ezd.az)
      .put(cqr.l, ezd.aA)
      .put(cqr.n, ezd.aB)
      .put(cqr.o, ezd.aC)
      .put(cqr.p, ezd.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bzk(int $$0) {
      super(ImmutableMap.of(cgg.n, cgh.c, cgg.o, cgh.c, cgg.r, cgh.c, cgg.k, cgh.a), $$0);
   }

   protected boolean a(arq $$0, cqo $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arq $$0, cqo $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      crc $$3 = this.c($$1).get();
      $$1.ec().a(cgg.r, $$3);
      byx.a($$1, $$3);
   }

   protected boolean b(arq $$0, cqo $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      crc $$3 = this.c($$1).get();
      byx.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         byx.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arq $$0, cqo $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cgg.r);
      $$1.ec().b(cgg.n);
      $$1.ec().b(cgg.o);
   }

   private void a(arq $$0, cqo $$1, bxe $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> byx.a($$1, $$3, $$2.dt()));
   }

   private static alf<ezm> a(cqo $$0) {
      if ($$0.n_()) {
         return ezd.aF;
      } else {
         Optional<alf<cqr>> $$1 = $$0.gz().b().e();
         return $$1.isEmpty() ? ezd.aE : g.getOrDefault($$1.get(), ezd.aE);
      }
   }

   private boolean b(cqo $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<crc> c(cqo $$0) {
      return $$0.ec().c(cgg.k).filter(this::a);
   }

   private boolean a(crc $$0) {
      return $$0.b(bvl.F);
   }

   private boolean a(cqo $$0, crc $$1) {
      iu $$2 = $$1.dv();
      iu $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(arq $$0) {
      return 600 + $$0.A.a(6001);
   }
}
