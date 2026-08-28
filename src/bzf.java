import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzf extends bzl<cjk> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bxc<? extends cjk> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bzf(bxc<? extends cjk> $$0) {
      this($$0, 1.0F, 2);
   }

   public bzf(bxc<? extends cjk> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cgw.h, cgx.a, cgw.s, cgx.b, cgw.n, cgx.c, cgw.o, cgx.c, cgw.aa, cgx.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(ars $$0, cjk $$1) {
      return $$1.gE() && this.c($$1).isPresent();
   }

   protected void a(ars $$0, cjk $$1, long $$2) {
      cjk $$3 = this.c($$1).get();
      $$1.ec().a(cgw.s, $$3);
      $$3.ec().a(cgw.s, $$1);
      bzn.a($$1, (bxu)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(ars $$0, cjk $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cjk $$3 = this.a($$1);
         return $$3.bJ() && $$1.a($$3) && bzn.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gr() && !$$3.gr();
      }
   }

   protected void c(ars $$0, cjk $$1, long $$2) {
      cjk $$3 = this.a($$1);
      bzn.a($$1, (bxu)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cgw.s);
            $$3.ec().b(cgw.s);
         }
      }
   }

   protected void d(ars $$0, cjk $$1, long $$2) {
      $$1.ec().b(cgw.s);
      $$1.ec().b(cgw.n);
      $$1.ec().b(cgw.o);
      this.j = 0L;
   }

   private cjk a(cjk $$0) {
      return (cjk)$$0.ec().c(cgw.s).get();
   }

   private boolean b(cjk $$0) {
      byu<?> $$1 = $$0.ec();
      return $$1.a(cgw.s) && $$1.c(cgw.s).get().an() == this.f;
   }

   private Optional<? extends cjk> c(cjk $$0) {
      return $$0.ec().c(cgw.h).get().a($$1 -> {
         if ($$1.an() == this.f && $$1 instanceof cjk $$2 && $$0.a($$2) && !$$2.gr()) {
            return true;
         }

         return false;
      }).map(cjk.class::cast);
   }
}
