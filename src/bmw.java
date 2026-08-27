import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bmw extends bnc<bww> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bkz<? extends bww> f;
   private final float g;
   private long h;

   public bmw(bkz<? extends bww> $$0, float $$1) {
      super(ImmutableMap.of(bum.h, bun.a, bum.r, bun.b, bum.m, bun.c, bum.n, bun.c, bum.Y, bun.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(ami $$0, bww $$1) {
      return $$1.gj() && this.c($$1).isPresent();
   }

   protected void a(ami $$0, bww $$1, long $$2) {
      bww $$3 = this.c($$1).get();
      $$1.dP().a(bum.r, $$3);
      $$3.dP().a(bum.r, $$1);
      bne.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eh().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(ami $$0, bww $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bww $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bne.a($$1.dP(), $$3) && $$2 <= this.h && !$$1.gc() && !$$3.gc();
      }
   }

   protected void c(ami $$0, bww $$1, long $$2) {
      bww $$3 = this.a($$1);
      bne.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dP().b(bum.r);
            $$3.dP().b(bum.r);
         }
      }
   }

   protected void d(ami $$0, bww $$1, long $$2) {
      $$1.dP().b(bum.r);
      $$1.dP().b(bum.m);
      $$1.dP().b(bum.n);
      this.h = 0L;
   }

   private bww a(bww $$0) {
      return (bww)$$0.dP().c(bum.r).get();
   }

   private boolean b(bww $$0) {
      bml<?> $$1 = $$0.dP();
      return $$1.a(bum.r) && $$1.c(bum.r).get().ai() == this.f;
   }

   private Optional<? extends bww> c(bww $$0) {
      return $$0.dP().c(bum.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bww $$2 && $$0.a($$2) && !$$2.gc()) {
            return true;
         }

         return false;
      }).map(bww.class::cast);
   }
}
