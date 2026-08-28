import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bux extends bvd<cfa> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsv<? extends cfa> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bux(bsv<? extends cfa> $$0) {
      this($$0, 1.0F, 2);
   }

   public bux(bsv<? extends cfa> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cco.h, ccp.a, cco.r, ccp.b, cco.m, ccp.c, cco.n, ccp.c, cco.Z, ccp.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arb $$0, cfa $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(arb $$0, cfa $$1, long $$2) {
      cfa $$3 = this.c($$1).get();
      $$1.dS().a(cco.r, $$3);
      $$3.dS().a(cco.r, $$1);
      bvf.a($$1, (btk)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arb $$0, cfa $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfa $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bvf.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(arb $$0, cfa $$1, long $$2) {
      cfa $$3 = this.a($$1);
      bvf.a($$1, (btk)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(cco.r);
            $$3.dS().b(cco.r);
         }
      }
   }

   protected void d(arb $$0, cfa $$1, long $$2) {
      $$1.dS().b(cco.r);
      $$1.dS().b(cco.m);
      $$1.dS().b(cco.n);
      this.j = 0L;
   }

   private cfa a(cfa $$0) {
      return (cfa)$$0.dS().c(cco.r).get();
   }

   private boolean b(cfa $$0) {
      bum<?> $$1 = $$0.dS();
      return $$1.a(cco.r) && $$1.c(cco.r).get().ak() == this.f;
   }

   private Optional<? extends cfa> c(cfa $$0) {
      return $$0.dS().c(cco.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cfa $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cfa.class::cast);
   }
}
