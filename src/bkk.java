import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkk extends bkq<buk> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bim<? extends buk> f;
   private final float g;
   private long h;

   public bkk(bim<? extends buk> $$0, float $$1) {
      super(ImmutableMap.of(bsa.h, bsb.a, bsa.r, bsb.b, bsa.m, bsb.c, bsa.n, bsb.c), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(akk $$0, buk $$1) {
      return $$1.gd() && this.c($$1).isPresent();
   }

   protected void a(akk $$0, buk $$1, long $$2) {
      buk $$3 = this.c($$1).get();
      $$1.dM().a(bsa.r, $$3);
      $$3.dM().a(bsa.r, $$1);
      bks.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ee().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(akk $$0, buk $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         buk $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bks.a($$1.dM(), $$3) && $$2 <= this.h;
      }
   }

   protected void c(akk $$0, buk $$1, long $$2) {
      buk $$3 = this.a($$1);
      bks.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dM().b(bsa.r);
            $$3.dM().b(bsa.r);
         }
      }
   }

   protected void d(akk $$0, buk $$1, long $$2) {
      $$1.dM().b(bsa.r);
      $$1.dM().b(bsa.m);
      $$1.dM().b(bsa.n);
      this.h = 0L;
   }

   private buk a(buk $$0) {
      return (buk)$$0.dM().c(bsa.r).get();
   }

   private boolean b(buk $$0) {
      bjz<?> $$1 = $$0.dM();
      return $$1.a(bsa.r) && $$1.c(bsa.r).get().ag() == this.f;
   }

   private Optional<? extends buk> c(buk $$0) {
      return $$0.dM().c(bsa.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof buk $$2 && $$0.a($$2)) {
            return true;
         }

         return false;
      }).map(buk.class::cast);
   }
}
