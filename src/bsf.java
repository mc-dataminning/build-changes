import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bsf extends bsl<cci> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bqg<? extends cci> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bsf(bqg<? extends cci> $$0) {
      this($$0, 1.0F, 2);
   }

   public bsf(bqg<? extends cci> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bzw.h, bzx.a, bzw.r, bzx.b, bzw.m, bzx.c, bzw.n, bzx.c, bzw.Z, bzx.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(apu $$0, cci $$1) {
      return $$1.gr() && this.c($$1).isPresent();
   }

   protected void a(apu $$0, cci $$1, long $$2) {
      cci $$3 = this.c($$1).get();
      $$1.dP().a(bzw.r, $$3);
      $$3.dP().a(bzw.r, $$1);
      bsn.a($$1, (bqt)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ei().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(apu $$0, cci $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cci $$3 = this.a($$1);
         return $$3.bA() && $$1.a($$3) && bsn.a($$1.dP(), $$3) && $$2 <= this.j && !$$1.gk() && !$$3.gk();
      }
   }

   protected void c(apu $$0, cci $$1, long $$2) {
      cci $$3 = this.a($$1);
      bsn.a($$1, (bqt)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dP().b(bzw.r);
            $$3.dP().b(bzw.r);
         }
      }
   }

   protected void d(apu $$0, cci $$1, long $$2) {
      $$1.dP().b(bzw.r);
      $$1.dP().b(bzw.m);
      $$1.dP().b(bzw.n);
      this.j = 0L;
   }

   private cci a(cci $$0) {
      return (cci)$$0.dP().c(bzw.r).get();
   }

   private boolean b(cci $$0) {
      bru<?> $$1 = $$0.dP();
      return $$1.a(bzw.r) && $$1.c(bzw.r).get().ai() == this.f;
   }

   private Optional<? extends cci> c(cci $$0) {
      return $$0.dP().c(bzw.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof cci $$2 && $$0.a($$2) && !$$2.gk()) {
            return true;
         }

         return false;
      }).map(cci.class::cast);
   }
}
