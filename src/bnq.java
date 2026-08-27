import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnq extends bnw<bxs> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final blt<? extends bxs> f;
   private final float g;
   private long h;

   public bnq(blt<? extends bxs> $$0, float $$1) {
      super(ImmutableMap.of(bvh.h, bvi.a, bvh.r, bvi.b, bvh.m, bvi.c, bvh.n, bvi.c, bvh.Y, bvi.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(amz $$0, bxs $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(amz $$0, bxs $$1, long $$2) {
      bxs $$3 = this.c($$1).get();
      $$1.dO().a(bvh.r, $$3);
      $$3.dO().a(bvh.r, $$1);
      bny.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eg().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(amz $$0, bxs $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bxs $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bny.a($$1.dO(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(amz $$0, bxs $$1, long $$2) {
      bxs $$3 = this.a($$1);
      bny.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dO().b(bvh.r);
            $$3.dO().b(bvh.r);
         }
      }
   }

   protected void d(amz $$0, bxs $$1, long $$2) {
      $$1.dO().b(bvh.r);
      $$1.dO().b(bvh.m);
      $$1.dO().b(bvh.n);
      this.h = 0L;
   }

   private bxs a(bxs $$0) {
      return (bxs)$$0.dO().c(bvh.r).get();
   }

   private boolean b(bxs $$0) {
      bnf<?> $$1 = $$0.dO();
      return $$1.a(bvh.r) && $$1.c(bvh.r).get().ai() == this.f;
   }

   private Optional<? extends bxs> c(bxs $$0) {
      return $$0.dO().c(bvh.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bxs $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bxs.class::cast);
   }
}
