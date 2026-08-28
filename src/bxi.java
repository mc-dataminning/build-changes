import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxi extends bwt<cny> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cob, alh<euh>> g = ImmutableMap.builder()
      .put(cob.c, ety.ar)
      .put(cob.d, ety.as)
      .put(cob.e, ety.at)
      .put(cob.f, ety.au)
      .put(cob.g, ety.av)
      .put(cob.h, ety.aw)
      .put(cob.i, ety.ax)
      .put(cob.j, ety.ay)
      .put(cob.k, ety.az)
      .put(cob.l, ety.aA)
      .put(cob.n, ety.aB)
      .put(cob.o, ety.aC)
      .put(cob.p, ety.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxi(int $$0) {
      super(ImmutableMap.of(cee.m, cef.c, cee.n, cef.c, cee.q, cef.c, cee.k, cef.a), $$0);
   }

   protected boolean a(arn $$0, cny $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arn $$0, cny $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      com $$3 = this.c($$1).get();
      $$1.ed().a(cee.q, $$3);
      bwv.a($$1, $$3);
   }

   protected boolean b(arn $$0, cny $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      com $$3 = this.c($$1).get();
      bwv.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bva)$$3);
            this.j = true;
         }
      } else {
         bwv.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arn $$0, cny $$1, long $$2) {
      this.i = a($$0);
      $$1.ed().b(cee.q);
      $$1.ed().b(cee.m);
      $$1.ed().b(cee.n);
   }

   private void a(cny $$0, bva $$1) {
      $$0.a(a($$0), $$2 -> bwv.a($$0, $$2, $$1.dv()));
   }

   private static alh<euh> a(cny $$0) {
      if ($$0.p_()) {
         return ety.aF;
      } else {
         cob $$1 = $$0.gE().b();
         return g.getOrDefault($$1, ety.aE);
      }
   }

   private boolean b(cny $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<com> c(cny $$0) {
      return $$0.ed().c(cee.k).filter(this::a);
   }

   private boolean a(com $$0) {
      return $$0.b(btl.F);
   }

   private boolean a(cny $$0, com $$1) {
      jh $$2 = $$1.dx();
      jh $$3 = $$0.dx();
      return $$3.a($$2, 5.0);
   }

   private static int a(arn $$0) {
      return 600 + $$0.A.a(6001);
   }
}
