import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzq extends bzw<cjv> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bxn<? extends cjv> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bzq(bxn<? extends cjv> $$0) {
      this($$0, 1.0F, 2);
   }

   public bzq(bxn<? extends cjv> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(chh.h, chi.a, chh.s, chi.b, chh.n, chi.c, chh.o, chi.c, chh.aa, chi.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(asb $$0, cjv $$1) {
      return $$1.gE() && this.c($$1).isPresent();
   }

   protected void a(asb $$0, cjv $$1, long $$2) {
      cjv $$3 = this.c($$1).get();
      $$1.ec().a(chh.s, $$3);
      $$3.ec().a(chh.s, $$1);
      bzy.a($$1, (byf)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(asb $$0, cjv $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cjv $$3 = this.a($$1);
         return $$3.bJ() && $$1.a($$3) && bzy.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gr() && !$$3.gr();
      }
   }

   protected void c(asb $$0, cjv $$1, long $$2) {
      cjv $$3 = this.a($$1);
      bzy.a($$1, (byf)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(chh.s);
            $$3.ec().b(chh.s);
         }
      }
   }

   protected void d(asb $$0, cjv $$1, long $$2) {
      $$1.ec().b(chh.s);
      $$1.ec().b(chh.n);
      $$1.ec().b(chh.o);
      this.j = 0L;
   }

   private cjv a(cjv $$0) {
      return (cjv)$$0.ec().c(chh.s).get();
   }

   private boolean b(cjv $$0) {
      bzf<?> $$1 = $$0.ec();
      return $$1.a(chh.s) && $$1.c(chh.s).get().an() == this.f;
   }

   private Optional<? extends cjv> c(cjv $$0) {
      return $$0.ec().c(chh.h).get().a($$1 -> {
         if ($$1.an() == this.f && $$1 instanceof cjv $$2 && $$0.a($$2) && !$$2.gr()) {
            return true;
         }

         return false;
      }).map(cjv.class::cast);
   }
}
