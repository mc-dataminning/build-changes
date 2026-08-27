import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bng extends bnm<bxi> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final blj<? extends bxi> f;
   private final float g;
   private long h;

   public bng(blj<? extends bxi> $$0, float $$1) {
      super(ImmutableMap.of(bux.h, buy.a, bux.r, buy.b, bux.m, buy.c, bux.n, buy.c, bux.Y, buy.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(amp $$0, bxi $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(amp $$0, bxi $$1, long $$2) {
      bxi $$3 = this.c($$1).get();
      $$1.dO().a(bux.r, $$3);
      $$3.dO().a(bux.r, $$1);
      bno.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eg().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(amp $$0, bxi $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bxi $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bno.a($$1.dO(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(amp $$0, bxi $$1, long $$2) {
      bxi $$3 = this.a($$1);
      bno.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dO().b(bux.r);
            $$3.dO().b(bux.r);
         }
      }
   }

   protected void d(amp $$0, bxi $$1, long $$2) {
      $$1.dO().b(bux.r);
      $$1.dO().b(bux.m);
      $$1.dO().b(bux.n);
      this.h = 0L;
   }

   private bxi a(bxi $$0) {
      return (bxi)$$0.dO().c(bux.r).get();
   }

   private boolean b(bxi $$0) {
      bmv<?> $$1 = $$0.dO();
      return $$1.a(bux.r) && $$1.c(bux.r).get().ai() == this.f;
   }

   private Optional<? extends bxi> c(bxi $$0) {
      return $$0.dO().c(bux.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bxi $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bxi.class::cast);
   }
}
