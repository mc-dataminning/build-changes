import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cac extends bzn<crl> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alj<cro>, alj<fao>> g = ImmutableMap.builder()
      .put(cro.c, faf.ar)
      .put(cro.d, faf.as)
      .put(cro.e, faf.at)
      .put(cro.f, faf.au)
      .put(cro.g, faf.av)
      .put(cro.h, faf.aw)
      .put(cro.i, faf.ax)
      .put(cro.j, faf.ay)
      .put(cro.k, faf.az)
      .put(cro.l, faf.aA)
      .put(cro.n, faf.aB)
      .put(cro.o, faf.aC)
      .put(cro.p, faf.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public cac(int $$0) {
      super(ImmutableMap.of(cgy.n, cgz.c, cgy.o, cgz.c, cgy.r, cgz.c, cgy.k, cgz.a), $$0);
   }

   protected boolean a(aru $$0, crl $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aru $$0, crl $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      crz $$3 = this.c($$1).get();
      $$1.ec().a(cgy.r, $$3);
      bzp.a($$1, $$3);
   }

   protected boolean b(aru $$0, crl $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      crz $$3 = this.c($$1).get();
      bzp.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bzp.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aru $$0, crl $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(cgy.r);
      $$1.ec().b(cgy.n);
      $$1.ec().b(cgy.o);
   }

   private void a(aru $$0, crl $$1, bxw $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bzp.a($$1, $$3, $$2.dt()));
   }

   private static alj<fao> a(crl $$0) {
      if ($$0.n_()) {
         return faf.aF;
      } else {
         Optional<alj<cro>> $$1 = $$0.gC().b().e();
         return $$1.isEmpty() ? faf.aE : g.getOrDefault($$1.get(), faf.aE);
      }
   }

   private boolean b(crl $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<crz> c(crl $$0) {
      return $$0.ec().c(cgy.k).filter(this::a);
   }

   private boolean a(crz $$0) {
      return $$0.b(bwb.F);
   }

   private boolean a(crl $$0, crz $$1) {
      iw $$2 = $$1.dv();
      iw $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(aru $$0) {
      return 600 + $$0.A.a(6001);
   }
}
