import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bzp extends bza<cqy> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<alf<crb>, alf<ezy>> g = ImmutableMap.builder()
      .put(crb.c, ezp.ar)
      .put(crb.d, ezp.as)
      .put(crb.e, ezp.at)
      .put(crb.f, ezp.au)
      .put(crb.g, ezp.av)
      .put(crb.h, ezp.aw)
      .put(crb.i, ezp.ax)
      .put(crb.j, ezp.ay)
      .put(crb.k, ezp.az)
      .put(crb.l, ezp.aA)
      .put(crb.n, ezp.aB)
      .put(crb.o, ezp.aC)
      .put(crb.p, ezp.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bzp(int $$0) {
      super(ImmutableMap.of(cgl.n, cgm.c, cgl.o, cgm.c, cgl.r, cgm.c, cgl.k, cgm.a), $$0);
   }

   protected boolean a(arq $$0, cqy $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arq $$0, cqy $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      crm $$3 = this.c($$1).get();
      $$1.eb().a(cgl.r, $$3);
      bzc.a($$1, $$3);
   }

   protected boolean b(arq $$0, cqy $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arq $$0, cqy $$1, long $$2) {
      crm $$3 = this.c($$1).get();
      bzc.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         bzc.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arq $$0, cqy $$1, long $$2) {
      this.i = a($$0);
      $$1.eb().b(cgl.r);
      $$1.eb().b(cgl.n);
      $$1.eb().b(cgl.o);
   }

   private void a(arq $$0, cqy $$1, bxj $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> bzc.a($$1, $$3, $$2.ds()));
   }

   private static alf<ezy> a(cqy $$0) {
      if ($$0.n_()) {
         return ezp.aF;
      } else {
         Optional<alf<crb>> $$1 = $$0.gB().b().e();
         return $$1.isEmpty() ? ezp.aE : g.getOrDefault($$1.get(), ezp.aE);
      }
   }

   private boolean b(cqy $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<crm> c(cqy $$0) {
      return $$0.eb().c(cgl.k).filter(this::a);
   }

   private boolean a(crm $$0) {
      return $$0.b(bvo.F);
   }

   private boolean a(cqy $$0, crm $$1) {
      iv $$2 = $$1.du();
      iv $$3 = $$0.du();
      return $$3.a($$2, 5.0);
   }

   private static int a(arq $$0) {
      return 600 + $$0.A.a(6001);
   }
}
