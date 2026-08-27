import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkm extends bks<bum> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bip<? extends bum> f;
   private final float g;
   private long h;

   public bkm(bip<? extends bum> $$0, float $$1) {
      super(ImmutableMap.of(bsc.h, bsd.a, bsc.r, bsd.b, bsc.m, bsd.c, bsc.n, bsd.c, bsc.Y, bsd.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(akn $$0, bum $$1) {
      return $$1.ge() && this.c($$1).isPresent();
   }

   protected void a(akn $$0, bum $$1, long $$2) {
      bum $$3 = this.c($$1).get();
      $$1.dM().a(bsc.r, $$3);
      $$3.dM().a(bsc.r, $$1);
      bku.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ee().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(akn $$0, bum $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bum $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bku.a($$1.dM(), $$3) && $$2 <= this.h && !$$1.fX() && !$$3.fX();
      }
   }

   protected void c(akn $$0, bum $$1, long $$2) {
      bum $$3 = this.a($$1);
      bku.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dM().b(bsc.r);
            $$3.dM().b(bsc.r);
         }
      }
   }

   protected void d(akn $$0, bum $$1, long $$2) {
      $$1.dM().b(bsc.r);
      $$1.dM().b(bsc.m);
      $$1.dM().b(bsc.n);
      this.h = 0L;
   }

   private bum a(bum $$0) {
      return (bum)$$0.dM().c(bsc.r).get();
   }

   private boolean b(bum $$0) {
      bkb<?> $$1 = $$0.dM();
      return $$1.a(bsc.r) && $$1.c(bsc.r).get().ag() == this.f;
   }

   private Optional<? extends bum> c(bum $$0) {
      return $$0.dM().c(bsc.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof bum $$2 && $$0.a($$2) && !$$2.fX()) {
            return true;
         }

         return false;
      }).map(bum.class::cast);
   }
}
