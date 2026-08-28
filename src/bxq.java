import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxq extends bxb<coj> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<com, aku<evx>> g = ImmutableMap.builder()
      .put(com.c, evo.ar)
      .put(com.d, evo.as)
      .put(com.e, evo.at)
      .put(com.f, evo.au)
      .put(com.g, evo.av)
      .put(com.h, evo.aw)
      .put(com.i, evo.ax)
      .put(com.j, evo.ay)
      .put(com.k, evo.az)
      .put(com.l, evo.aA)
      .put(com.n, evo.aB)
      .put(com.o, evo.aC)
      .put(com.p, evo.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxq(int $$0) {
      super(ImmutableMap.of(cem.m, cen.c, cem.n, cen.c, cem.q, cen.c, cem.k, cen.a), $$0);
   }

   protected boolean a(ard $$0, coj $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ard $$0, coj $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      coy $$3 = this.c($$1).get();
      $$1.eb().a(cem.q, $$3);
      bxd.a($$1, $$3);
   }

   protected boolean b(ard $$0, coj $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      coy $$3 = this.c($$1).get();
      bxd.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxd.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ard $$0, coj $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cem.q);
      $$1.eb().b(cem.m);
      $$1.eb().b(cem.n);
   }

   private void a(ard $$0, coj $$1, bvi $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxd.a($$1, $$3, $$2.dt()));
   }

   private static aku<evx> a(coj $$0) {
      if ($$0.e_()) {
         return evo.aF;
      } else {
         com $$1 = $$0.gC().b();
         return g.getOrDefault($$1, evo.aE);
      }
   }

   private boolean b(coj $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<coy> c(coj $$0) {
      return $$0.eb().c(cem.k).filter(this::a);
   }

   private boolean a(coy $$0) {
      return $$0.b(btt.F);
   }

   private boolean a(coj $$0, coy $$1) {
      ji $$2 = $$1.dv();
      ji $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(ard $$0) {
      return 600 + $$0.A.a(6001);
   }
}
