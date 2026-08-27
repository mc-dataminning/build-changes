import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnw extends boc<bxy> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final blz<? extends bxy> f;
   private final float g;
   private long h;

   public bnw(blz<? extends bxy> $$0, float $$1) {
      super(ImmutableMap.of(bvn.h, bvo.a, bvn.r, bvo.b, bvn.m, bvo.c, bvn.n, bvo.c, bvn.Y, bvo.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(and $$0, bxy $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(and $$0, bxy $$1, long $$2) {
      bxy $$3 = this.c($$1).get();
      $$1.dO().a(bvn.r, $$3);
      $$3.dO().a(bvn.r, $$1);
      boe.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eg().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(and $$0, bxy $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bxy $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && boe.a($$1.dO(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(and $$0, bxy $$1, long $$2) {
      bxy $$3 = this.a($$1);
      boe.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dO().b(bvn.r);
            $$3.dO().b(bvn.r);
         }
      }
   }

   protected void d(and $$0, bxy $$1, long $$2) {
      $$1.dO().b(bvn.r);
      $$1.dO().b(bvn.m);
      $$1.dO().b(bvn.n);
      this.h = 0L;
   }

   private bxy a(bxy $$0) {
      return (bxy)$$0.dO().c(bvn.r).get();
   }

   private boolean b(bxy $$0) {
      bnl<?> $$1 = $$0.dO();
      return $$1.a(bvn.r) && $$1.c(bvn.r).get().ai() == this.f;
   }

   private Optional<? extends bxy> c(bxy $$0) {
      return $$0.dO().c(bvn.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bxy $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bxy.class::cast);
   }
}
