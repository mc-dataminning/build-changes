import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnv extends bob<bxx> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bly<? extends bxx> f;
   private final float g;
   private long h;

   public bnv(bly<? extends bxx> $$0, float $$1) {
      super(ImmutableMap.of(bvm.h, bvn.a, bvm.r, bvn.b, bvm.m, bvn.c, bvm.n, bvn.c, bvm.Y, bvn.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(and $$0, bxx $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(and $$0, bxx $$1, long $$2) {
      bxx $$3 = this.c($$1).get();
      $$1.dO().a(bvm.r, $$3);
      $$3.dO().a(bvm.r, $$1);
      bod.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eg().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(and $$0, bxx $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bxx $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bod.a($$1.dO(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(and $$0, bxx $$1, long $$2) {
      bxx $$3 = this.a($$1);
      bod.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dO().b(bvm.r);
            $$3.dO().b(bvm.r);
         }
      }
   }

   protected void d(and $$0, bxx $$1, long $$2) {
      $$1.dO().b(bvm.r);
      $$1.dO().b(bvm.m);
      $$1.dO().b(bvm.n);
      this.h = 0L;
   }

   private bxx a(bxx $$0) {
      return (bxx)$$0.dO().c(bvm.r).get();
   }

   private boolean b(bxx $$0) {
      bnk<?> $$1 = $$0.dO();
      return $$1.a(bvm.r) && $$1.c(bvm.r).get().ai() == this.f;
   }

   private Optional<? extends bxx> c(bxx $$0) {
      return $$0.dO().c(bvm.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bxx $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bxx.class::cast);
   }
}
