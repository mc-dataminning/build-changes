import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxp extends bxa<cof> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<coi, ali<eus>> g = ImmutableMap.builder()
      .put(coi.c, euj.ar)
      .put(coi.d, euj.as)
      .put(coi.e, euj.at)
      .put(coi.f, euj.au)
      .put(coi.g, euj.av)
      .put(coi.h, euj.aw)
      .put(coi.i, euj.ax)
      .put(coi.j, euj.ay)
      .put(coi.k, euj.az)
      .put(coi.l, euj.aA)
      .put(coi.n, euj.aB)
      .put(coi.o, euj.aC)
      .put(coi.p, euj.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxp(int $$0) {
      super(ImmutableMap.of(cel.m, cem.c, cel.n, cem.c, cel.q, cem.c, cel.k, cem.a), $$0);
   }

   protected boolean a(arp $$0, cof $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arp $$0, cof $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cou $$3 = this.c($$1).get();
      $$1.eb().a(cel.q, $$3);
      bxc.a($$1, $$3);
   }

   protected boolean b(arp $$0, cof $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arp $$0, cof $$1, long $$2) {
      cou $$3 = this.c($$1).get();
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

   protected void d(arp $$0, cof $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cel.q);
      $$1.eb().b(cel.m);
      $$1.eb().b(cel.n);
   }

   private void a(arp $$0, cof $$1, bvh $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxc.a($$1, $$3, $$2.dt()));
   }

   private static ali<eus> a(cof $$0) {
      if ($$0.e_()) {
         return euj.aF;
      } else {
         coi $$1 = $$0.gx().b();
         return g.getOrDefault($$1, euj.aE);
      }
   }

   private boolean b(cof $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cou> c(cof $$0) {
      return $$0.eb().c(cel.k).filter(this::a);
   }

   private boolean a(cou $$0) {
      return $$0.b(bts.F);
   }

   private boolean a(cof $$0, cou $$1) {
      jh $$2 = $$1.dv();
      jh $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(arp $$0) {
      return 600 + $$0.A.a(6001);
   }
}
