import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cal extends bzw<cru> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alq<crx>, alq<fay>> g = ImmutableMap.builder()
      .put(crx.c, fap.ar)
      .put(crx.d, fap.as)
      .put(crx.e, fap.at)
      .put(crx.f, fap.au)
      .put(crx.g, fap.av)
      .put(crx.h, fap.aw)
      .put(crx.i, fap.ax)
      .put(crx.j, fap.ay)
      .put(crx.k, fap.az)
      .put(crx.l, fap.aA)
      .put(crx.n, fap.aB)
      .put(crx.o, fap.aC)
      .put(crx.p, fap.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public cal(int $$0) {
      super(ImmutableMap.of(chh.n, chi.c, chh.o, chi.c, chh.r, chi.c, chh.k, chi.a), $$0);
   }

   protected boolean a(asb $$0, cru $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(asb $$0, cru $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      csi $$3 = this.c($$1).get();
      $$1.ec().a(chh.r, $$3);
      bzy.a($$1, $$3);
   }

   protected boolean b(asb $$0, cru $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      csi $$3 = this.c($$1).get();
      bzy.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bzy.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(asb $$0, cru $$1, long $$2) {
      this.i = a($$0);
      $$1.ec().b(chh.r);
      $$1.ec().b(chh.n);
      $$1.ec().b(chh.o);
   }

   private void a(asb $$0, cru $$1, byf $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bzy.a($$1, $$3, $$2.dt()));
   }

   private static alq<fay> a(cru $$0) {
      if ($$0.n_()) {
         return fap.aF;
      } else {
         Optional<alq<crx>> $$1 = $$0.gC().b().e();
         return $$1.isEmpty() ? fap.aE : g.getOrDefault($$1.get(), fap.aE);
      }
   }

   private boolean b(cru $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<csi> c(cru $$0) {
      return $$0.ec().c(chh.k).filter(this::a);
   }

   private boolean a(csi $$0) {
      return $$0.b(bwk.F);
   }

   private boolean a(cru $$0, csi $$1) {
      iw $$2 = $$1.dv();
      iw $$3 = $$0.dv();
      return $$3.a($$2, 5.0);
   }

   private static int a(asb $$0) {
      return 600 + $$0.A.a(6001);
   }
}
