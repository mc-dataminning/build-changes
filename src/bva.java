import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bva extends bvg<cfd> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsy<? extends cfd> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bva(bsy<? extends cfd> $$0) {
      this($$0, 1.0F, 2);
   }

   public bva(bsy<? extends cfd> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccr.h, ccs.a, ccr.r, ccs.b, ccr.m, ccs.c, ccr.n, ccs.c, ccr.Z, ccs.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(are $$0, cfd $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(are $$0, cfd $$1, long $$2) {
      cfd $$3 = this.c($$1).get();
      $$1.dS().a(ccr.r, $$3);
      $$3.dS().a(ccr.r, $$1);
      bvi.a($$1, (btn)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(are $$0, cfd $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfd $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bvi.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(are $$0, cfd $$1, long $$2) {
      cfd $$3 = this.a($$1);
      bvi.a($$1, (btn)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(ccr.r);
            $$3.dS().b(ccr.r);
         }
      }
   }

   protected void d(are $$0, cfd $$1, long $$2) {
      $$1.dS().b(ccr.r);
      $$1.dS().b(ccr.m);
      $$1.dS().b(ccr.n);
      this.j = 0L;
   }

   private cfd a(cfd $$0) {
      return (cfd)$$0.dS().c(ccr.r).get();
   }

   private boolean b(cfd $$0) {
      bup<?> $$1 = $$0.dS();
      return $$1.a(ccr.r) && $$1.c(ccr.r).get().ak() == this.f;
   }

   private Optional<? extends cfd> c(cfd $$0) {
      return $$0.dS().c(ccr.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cfd $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cfd.class::cast);
   }
}
