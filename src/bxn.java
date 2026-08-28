import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxn extends bwy<cog> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<coj, akt<evu>> g = ImmutableMap.builder()
      .put(coj.c, evl.ar)
      .put(coj.d, evl.as)
      .put(coj.e, evl.at)
      .put(coj.f, evl.au)
      .put(coj.g, evl.av)
      .put(coj.h, evl.aw)
      .put(coj.i, evl.ax)
      .put(coj.j, evl.ay)
      .put(coj.k, evl.az)
      .put(coj.l, evl.aA)
      .put(coj.n, evl.aB)
      .put(coj.o, evl.aC)
      .put(coj.p, evl.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxn(int $$0) {
      super(ImmutableMap.of(cej.m, cek.c, cej.n, cek.c, cej.q, cek.c, cej.k, cek.a), $$0);
   }

   protected boolean a(arc $$0, cog $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arc $$0, cog $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cov $$3 = this.c($$1).get();
      $$1.ec().a(cej.q, $$3);
      bxa.a($$1, $$3);
   }

   protected boolean b(arc $$0, cog $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      cov $$3 = this.c($$1).get();
      bxa.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxa.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arc $$0, cog $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cej.q);
      $$1.ec().b(cej.m);
      $$1.ec().b(cej.n);
   }

   private void a(arc $$0, cog $$1, bvf $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxa.a($$1, $$3, $$2.du()));
   }

   private static akt<evu> a(cog $$0) {
      if ($$0.e_()) {
         return evl.aF;
      } else {
         coj $$1 = $$0.gz().b();
         return g.getOrDefault($$1, evl.aE);
      }
   }

   private boolean b(cog $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cov> c(cog $$0) {
      return $$0.ec().c(cej.k).filter(this::a);
   }

   private boolean a(cov $$0) {
      return $$0.b(btq.F);
   }

   private boolean a(cog $$0, cov $$1) {
      ji $$2 = $$1.dw();
      ji $$3 = $$0.dw();
      return $$3.a($$2, 5.0);
   }

   private static int a(arc $$0) {
      return 600 + $$0.A.a(6001);
   }
}
