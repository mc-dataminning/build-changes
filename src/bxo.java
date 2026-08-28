import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxo extends bwz<coh> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cok, aku<evv>> g = ImmutableMap.builder()
      .put(cok.c, evm.ar)
      .put(cok.d, evm.as)
      .put(cok.e, evm.at)
      .put(cok.f, evm.au)
      .put(cok.g, evm.av)
      .put(cok.h, evm.aw)
      .put(cok.i, evm.ax)
      .put(cok.j, evm.ay)
      .put(cok.k, evm.az)
      .put(cok.l, evm.aA)
      .put(cok.n, evm.aB)
      .put(cok.o, evm.aC)
      .put(cok.p, evm.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxo(int $$0) {
      super(ImmutableMap.of(cek.m, cel.c, cek.n, cel.c, cek.q, cel.c, cek.k, cel.a), $$0);
   }

   protected boolean a(ard $$0, coh $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ard $$0, coh $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cow $$3 = this.c($$1).get();
      $$1.eb().a(cek.q, $$3);
      bxb.a($$1, $$3);
   }

   protected boolean b(ard $$0, coh $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      cow $$3 = this.c($$1).get();
      bxb.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxb.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ard $$0, coh $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cek.q);
      $$1.eb().b(cek.m);
      $$1.eb().b(cek.n);
   }

   private void a(ard $$0, coh $$1, bvg $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxb.a($$1, $$3, $$2.dt()));
   }

   private static aku<evv> a(coh $$0) {
      if ($$0.e_()) {
         return evm.aF;
      } else {
         cok $$1 = $$0.gC().b();
         return g.getOrDefault($$1, evm.aE);
      }
   }

   private boolean b(coh $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cow> c(coh $$0) {
      return $$0.eb().c(cek.k).filter(this::a);
   }

   private boolean a(cow $$0) {
      return $$0.b(btr.F);
   }

   private boolean a(coh $$0, cow $$1) {
      ji $$2 = $$1.dv();
      ji $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(ard $$0) {
      return 600 + $$0.A.a(6001);
   }
}
