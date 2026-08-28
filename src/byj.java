import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class byj extends bxu<cpe> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cph, aly<ewm>> g = ImmutableMap.builder()
      .put(cph.c, ewd.ar)
      .put(cph.d, ewd.as)
      .put(cph.e, ewd.at)
      .put(cph.f, ewd.au)
      .put(cph.g, ewd.av)
      .put(cph.h, ewd.aw)
      .put(cph.i, ewd.ax)
      .put(cph.j, ewd.ay)
      .put(cph.k, ewd.az)
      .put(cph.l, ewd.aA)
      .put(cph.n, ewd.aB)
      .put(cph.o, ewd.aC)
      .put(cph.p, ewd.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public byj(int $$0) {
      super(ImmutableMap.of(cff.m, cfg.c, cff.n, cfg.c, cff.q, cfg.c, cff.k, cfg.a), $$0);
   }

   protected boolean a(ash $$0, cpe $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ash $$0, cpe $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cps $$3 = this.c($$1).get();
      $$1.eb().a(cff.q, $$3);
      bxw.a($$1, $$3);
   }

   protected boolean b(ash $$0, cpe $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      cps $$3 = this.c($$1).get();
      bxw.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxw.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ash $$0, cpe $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cff.q);
      $$1.eb().b(cff.m);
      $$1.eb().b(cff.n);
   }

   private void a(ash $$0, cpe $$1, bwb $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxw.a($$1, $$3, $$2.dt()));
   }

   private static aly<ewm> a(cpe $$0) {
      if ($$0.e_()) {
         return ewd.aF;
      } else {
         cph $$1 = $$0.gw().b();
         return g.getOrDefault($$1, ewd.aE);
      }
   }

   private boolean b(cpe $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cps> c(cpe $$0) {
      return $$0.eb().c(cff.k).filter(this::a);
   }

   private boolean a(cps $$0) {
      return $$0.b(bum.F);
   }

   private boolean a(cpe $$0, cps $$1) {
      jh $$2 = $$1.dv();
      jh $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(ash $$0) {
      return 600 + $$0.A.a(6001);
   }
}
