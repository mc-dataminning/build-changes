import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class caa extends bzl<crj> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alh<crm>, alh<fam>> g = ImmutableMap.builder()
      .put(crm.c, fad.ar)
      .put(crm.d, fad.as)
      .put(crm.e, fad.at)
      .put(crm.f, fad.au)
      .put(crm.g, fad.av)
      .put(crm.h, fad.aw)
      .put(crm.i, fad.ax)
      .put(crm.j, fad.ay)
      .put(crm.k, fad.az)
      .put(crm.l, fad.aA)
      .put(crm.n, fad.aB)
      .put(crm.o, fad.aC)
      .put(crm.p, fad.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public caa(int $$0) {
      super(ImmutableMap.of(cgw.n, cgx.c, cgw.o, cgx.c, cgw.r, cgx.c, cgw.k, cgx.a), $$0);
   }

   protected boolean a(ars $$0, crj $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ars $$0, crj $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      crx $$3 = this.c($$1).get();
      $$1.ec().a(cgw.r, $$3);
      bzn.a($$1, $$3);
   }

   protected boolean b(ars $$0, crj $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      crx $$3 = this.c($$1).get();
      bzn.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bzn.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ars $$0, crj $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cgw.r);
      $$1.ec().b(cgw.n);
      $$1.ec().b(cgw.o);
   }

   private void a(ars $$0, crj $$1, bxu $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bzn.a($$1, $$3, $$2.dt()));
   }

   private static alh<fam> a(crj $$0) {
      if ($$0.n_()) {
         return fad.aF;
      } else {
         Optional<alh<crm>> $$1 = $$0.gC().b().e();
         return $$1.isEmpty() ? fad.aE : g.getOrDefault($$1.get(), fad.aE);
      }
   }

   private boolean b(crj $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<crx> c(crj $$0) {
      return $$0.ec().c(cgw.k).filter(this::a);
   }

   private boolean a(crx $$0) {
      return $$0.b(bvz.F);
   }

   private boolean a(crj $$0, crx $$1) {
      iv $$2 = $$1.dv();
      iv $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(ars $$0) {
      return 600 + $$0.A.a(6001);
   }
}
