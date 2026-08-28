import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byp extends byv<ciu> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bwo<? extends ciu> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public byp(bwo<? extends ciu> $$0) {
      this($$0, 1.0F, 2);
   }

   public byp(bwo<? extends ciu> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cgg.h, cgh.a, cgg.s, cgh.b, cgg.n, cgh.c, cgg.o, cgh.c, cgg.aa, cgh.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arq $$0, ciu $$1) {
      return $$1.gB() && this.c($$1).isPresent();
   }

   protected void a(arq $$0, ciu $$1, long $$2) {
      ciu $$3 = this.c($$1).get();
      $$1.ec().a(cgg.s, $$3);
      $$3.ec().a(cgg.s, $$1);
      byx.a($$1, (bxe)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arq $$0, ciu $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         ciu $$3 = this.a($$1);
         return $$3.bK() && $$1.a($$3) && byx.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.go() && !$$3.go();
      }
   }

   protected void c(arq $$0, ciu $$1, long $$2) {
      ciu $$3 = this.a($$1);
      byx.a($$1, (bxe)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cgg.s);
            $$3.ec().b(cgg.s);
         }
      }
   }

   protected void d(arq $$0, ciu $$1, long $$2) {
      $$1.ec().b(cgg.s);
      $$1.ec().b(cgg.n);
      $$1.ec().b(cgg.o);
      this.j = 0L;
   }

   private ciu a(ciu $$0) {
      return (ciu)$$0.ec().c(cgg.s).get();
   }

   private boolean b(ciu $$0) {
      bye<?> $$1 = $$0.ec();
      return $$1.a(cgg.s) && $$1.c(cgg.s).get().aq() == this.f;
   }

   private Optional<? extends ciu> c(ciu $$0) {
      return $$0.ec().c(cgg.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof ciu $$2 && $$0.a($$2) && !$$2.go()) {
            return true;
         }

         return false;
      }).map(ciu.class::cast);
   }
}
