import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzh extends bzn<cjm> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bxe<? extends cjm> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bzh(bxe<? extends cjm> $$0) {
      this($$0, 1.0F, 2);
   }

   public bzh(bxe<? extends cjm> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cgy.h, cgz.a, cgy.s, cgz.b, cgy.n, cgz.c, cgy.o, cgz.c, cgy.aa, cgz.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aru $$0, cjm $$1) {
      return $$1.gE() && this.c($$1).isPresent();
   }

   protected void a(aru $$0, cjm $$1, long $$2) {
      cjm $$3 = this.c($$1).get();
      $$1.ec().a(cgy.s, $$3);
      $$3.ec().a(cgy.s, $$1);
      bzp.a($$1, (bxw)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aru $$0, cjm $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cjm $$3 = this.a($$1);
         return $$3.bJ() && $$1.a($$3) && bzp.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gr() && !$$3.gr();
      }
   }

   protected void c(aru $$0, cjm $$1, long $$2) {
      cjm $$3 = this.a($$1);
      bzp.a($$1, (bxw)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cgy.s);
            $$3.ec().b(cgy.s);
         }
      }
   }

   protected void d(aru $$0, cjm $$1, long $$2) {
      $$1.ec().b(cgy.s);
      $$1.ec().b(cgy.n);
      $$1.ec().b(cgy.o);
      this.j = 0L;
   }

   private cjm a(cjm $$0) {
      return (cjm)$$0.ec().c(cgy.s).get();
   }

   private boolean b(cjm $$0) {
      byw<?> $$1 = $$0.ec();
      return $$1.a(cgy.s) && $$1.c(cgy.s).get().an() == this.f;
   }

   private Optional<? extends cjm> c(cjm $$0) {
      return $$0.ec().c(cgy.h).get().a($$1 -> {
         if ($$1.an() == this.f && $$1 instanceof cjm $$2 && $$0.a($$2) && !$$2.gr()) {
            return true;
         }

         return false;
      }).map(cjm.class::cast);
   }
}
