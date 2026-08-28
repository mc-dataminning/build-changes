import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvb extends bvh<cfe> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsz<? extends cfe> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bvb(bsz<? extends cfe> $$0) {
      this($$0, 1.0F, 2);
   }

   public bvb(bsz<? extends cfe> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccs.h, cct.a, ccs.r, cct.b, ccs.m, cct.c, ccs.n, cct.c, ccs.Z, cct.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(are $$0, cfe $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(are $$0, cfe $$1, long $$2) {
      cfe $$3 = this.c($$1).get();
      $$1.dS().a(ccs.r, $$3);
      $$3.dS().a(ccs.r, $$1);
      bvj.a($$1, (bto)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(are $$0, cfe $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfe $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bvj.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(are $$0, cfe $$1, long $$2) {
      cfe $$3 = this.a($$1);
      bvj.a($$1, (bto)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(ccs.r);
            $$3.dS().b(ccs.r);
         }
      }
   }

   protected void d(are $$0, cfe $$1, long $$2) {
      $$1.dS().b(ccs.r);
      $$1.dS().b(ccs.m);
      $$1.dS().b(ccs.n);
      this.j = 0L;
   }

   private cfe a(cfe $$0) {
      return (cfe)$$0.dS().c(ccs.r).get();
   }

   private boolean b(cfe $$0) {
      buq<?> $$1 = $$0.dS();
      return $$1.a(ccs.r) && $$1.c(ccs.r).get().ak() == this.f;
   }

   private Optional<? extends cfe> c(cfe $$0) {
      return $$0.dS().c(ccs.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cfe $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cfe.class::cast);
   }
}
