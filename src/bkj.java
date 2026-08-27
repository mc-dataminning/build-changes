import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkj extends bkp<buj> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bim<? extends buj> f;
   private final float g;
   private long h;

   public bkj(bim<? extends buj> $$0, float $$1) {
      super(ImmutableMap.of(brz.h, bsa.a, brz.r, bsa.b, brz.m, bsa.c, brz.n, bsa.c), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(akk $$0, buj $$1) {
      return $$1.ge() && this.c($$1).isPresent();
   }

   protected void a(akk $$0, buj $$1, long $$2) {
      buj $$3 = this.c($$1).get();
      $$1.dM().a(brz.r, $$3);
      $$3.dM().a(brz.r, $$1);
      bkr.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ee().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(akk $$0, buj $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         buj $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bkr.a($$1.dM(), $$3) && $$2 <= this.h;
      }
   }

   protected void c(akk $$0, buj $$1, long $$2) {
      buj $$3 = this.a($$1);
      bkr.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dM().b(brz.r);
            $$3.dM().b(brz.r);
         }
      }
   }

   protected void d(akk $$0, buj $$1, long $$2) {
      $$1.dM().b(brz.r);
      $$1.dM().b(brz.m);
      $$1.dM().b(brz.n);
      this.h = 0L;
   }

   private buj a(buj $$0) {
      return (buj)$$0.dM().c(brz.r).get();
   }

   private boolean b(buj $$0) {
      bjy<?> $$1 = $$0.dM();
      return $$1.a(brz.r) && $$1.c(brz.r).get().ag() == this.f;
   }

   private Optional<? extends buj> c(buj $$0) {
      return $$0.dM().c(brz.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof buj $$2 && $$0.a($$2)) {
            return true;
         }

         return false;
      }).map(buj.class::cast);
   }
}
