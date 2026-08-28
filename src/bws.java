import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bws extends bwy<cgw> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final buq<? extends cgw> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bws(buq<? extends cgw> $$0) {
      this($$0, 1.0F, 2);
   }

   public bws(buq<? extends cgw> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cej.h, cek.a, cej.r, cek.b, cej.m, cek.c, cej.n, cek.c, cej.Z, cek.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arc $$0, cgw $$1) {
      return $$1.gz() && this.c($$1).isPresent();
   }

   protected void a(arc $$0, cgw $$1, long $$2) {
      cgw $$3 = this.c($$1).get();
      $$1.ec().a(cej.r, $$3);
      $$3.ec().a(cej.r, $$1);
      bxa.a($$1, (bvf)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dZ().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arc $$0, cgw $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgw $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && bxa.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(arc $$0, cgw $$1, long $$2) {
      cgw $$3 = this.a($$1);
      bxa.a($$1, (bvf)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cej.r);
            $$3.ec().b(cej.r);
         }
      }
   }

   protected void d(arc $$0, cgw $$1, long $$2) {
      $$1.ec().b(cej.r);
      $$1.ec().b(cej.m);
      $$1.ec().b(cej.n);
      this.j = 0L;
   }

   private cgw a(cgw $$0) {
      return (cgw)$$0.ec().c(cej.r).get();
   }

   private boolean b(cgw $$0) {
      bwh<?> $$1 = $$0.ec();
      return $$1.a(cej.r) && $$1.c(cej.r).get().aq() == this.f;
   }

   private Optional<? extends cgw> c(cgw $$0) {
      return $$0.ec().c(cej.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cgw $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(cgw.class::cast);
   }
}
