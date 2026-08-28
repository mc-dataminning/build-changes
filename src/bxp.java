import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxp extends bxa<coi> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<col, aku<evw>> g = ImmutableMap.builder()
      .put(col.c, evn.ar)
      .put(col.d, evn.as)
      .put(col.e, evn.at)
      .put(col.f, evn.au)
      .put(col.g, evn.av)
      .put(col.h, evn.aw)
      .put(col.i, evn.ax)
      .put(col.j, evn.ay)
      .put(col.k, evn.az)
      .put(col.l, evn.aA)
      .put(col.n, evn.aB)
      .put(col.o, evn.aC)
      .put(col.p, evn.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxp(int $$0) {
      super(ImmutableMap.of(cel.m, cem.c, cel.n, cem.c, cel.q, cem.c, cel.k, cem.a), $$0);
   }

   protected boolean a(ard $$0, coi $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ard $$0, coi $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cox $$3 = this.c($$1).get();
      $$1.eb().a(cel.q, $$3);
      bxc.a($$1, $$3);
   }

   protected boolean b(ard $$0, coi $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ard $$0, coi $$1, long $$2) {
      cox $$3 = this.c($$1).get();
      bxc.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bxc.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ard $$0, coi $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cel.q);
      $$1.eb().b(cel.m);
      $$1.eb().b(cel.n);
   }

   private void a(ard $$0, coi $$1, bvh $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxc.a($$1, $$3, $$2.dt()));
   }

   private static aku<evw> a(coi $$0) {
      if ($$0.e_()) {
         return evn.aF;
      } else {
         col $$1 = $$0.gC().b();
         return g.getOrDefault($$1, evn.aE);
      }
   }

   private boolean b(coi $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cox> c(coi $$0) {
      return $$0.eb().c(cel.k).filter(this::a);
   }

   private boolean a(cox $$0) {
      return $$0.b(bts.F);
   }

   private boolean a(coi $$0, cox $$1) {
      ji $$2 = $$1.dv();
      ji $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(ard $$0) {
      return 600 + $$0.A.a(6001);
   }
}
