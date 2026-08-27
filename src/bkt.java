import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkt extends bkz<but> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final biw<? extends but> f;
   private final float g;
   private long h;

   public bkt(biw<? extends but> $$0, float $$1) {
      super(ImmutableMap.of(bsj.h, bsk.a, bsj.r, bsk.b, bsj.m, bsk.c, bsj.n, bsk.c, bsj.Y, bsk.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(aks $$0, but $$1) {
      return $$1.gh() && this.c($$1).isPresent();
   }

   protected void a(aks $$0, but $$1, long $$2) {
      but $$3 = this.c($$1).get();
      $$1.dN().a(bsj.r, $$3);
      $$3.dN().a(bsj.r, $$1);
      blb.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ef().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(aks $$0, but $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         but $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && blb.a($$1.dN(), $$3) && $$2 <= this.h && !$$1.ga() && !$$3.ga();
      }
   }

   protected void c(aks $$0, but $$1, long $$2) {
      but $$3 = this.a($$1);
      blb.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dN().b(bsj.r);
            $$3.dN().b(bsj.r);
         }
      }
   }

   protected void d(aks $$0, but $$1, long $$2) {
      $$1.dN().b(bsj.r);
      $$1.dN().b(bsj.m);
      $$1.dN().b(bsj.n);
      this.h = 0L;
   }

   private but a(but $$0) {
      return (but)$$0.dN().c(bsj.r).get();
   }

   private boolean b(but $$0) {
      bki<?> $$1 = $$0.dN();
      return $$1.a(bsj.r) && $$1.c(bsj.r).get().ag() == this.f;
   }

   private Optional<? extends but> c(but $$0) {
      return $$0.dN().c(bsj.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof but $$2 && $$0.a($$2) && !$$2.ga()) {
            return true;
         }

         return false;
      }).map(but.class::cast);
   }
}
