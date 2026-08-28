import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxo extends bwz<coi> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<col, akt<evw>> g = ImmutableMap.builder()
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

   public bxo(int $$0) {
      super(ImmutableMap.of(cek.m, cel.c, cek.n, cel.c, cek.q, cel.c, cek.k, cel.a), $$0);
   }

   protected boolean a(arc $$0, coi $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arc $$0, coi $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cox $$3 = this.c($$1).get();
      $$1.ec().a(cek.q, $$3);
      bxb.a($$1, $$3);
   }

   protected boolean b(arc $$0, coi $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arc $$0, coi $$1, long $$2) {
      cox $$3 = this.c($$1).get();
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

   protected void d(arc $$0, coi $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cek.q);
      $$1.ec().b(cek.m);
      $$1.ec().b(cek.n);
   }

   private void a(arc $$0, coi $$1, bvg $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bxb.a($$1, $$3, $$2.du()));
   }

   private static akt<evw> a(coi $$0) {
      if ($$0.e_()) {
         return evn.aF;
      } else {
         col $$1 = $$0.gz().b();
         return g.getOrDefault($$1, evn.aE);
      }
   }

   private boolean b(coi $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cox> c(coi $$0) {
      return $$0.ec().c(cek.k).filter(this::a);
   }

   private boolean a(cox $$0) {
      return $$0.b(btr.F);
   }

   private boolean a(coi $$0, cox $$1) {
      ji $$2 = $$1.dw();
      ji $$3 = $$0.dw();
      return $$3.a($$2, 5.0);
   }

   private static int a(arc $$0) {
      return 600 + $$0.A.a(6001);
   }
}
