import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bub extends buh<cee> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsa<? extends cee> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bub(bsa<? extends cee> $$0) {
      this($$0, 1.0F, 2);
   }

   public bub(bsa<? extends cee> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cbs.h, cbt.a, cbs.r, cbt.b, cbs.m, cbt.c, cbs.n, cbt.c, cbs.Z, cbt.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqm $$0, cee $$1) {
      return $$1.gt() && this.c($$1).isPresent();
   }

   protected void a(aqm $$0, cee $$1, long $$2) {
      cee $$3 = this.c($$1).get();
      $$1.dS().a(cbs.r, $$3);
      $$3.dS().a(cbs.r, $$1);
      buj.a($$1, (bso)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqm $$0, cee $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cee $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && buj.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(aqm $$0, cee $$1, long $$2) {
      cee $$3 = this.a($$1);
      buj.a($$1, (bso)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(cbs.r);
            $$3.dS().b(cbs.r);
         }
      }
   }

   protected void d(aqm $$0, cee $$1, long $$2) {
      $$1.dS().b(cbs.r);
      $$1.dS().b(cbs.m);
      $$1.dS().b(cbs.n);
      this.j = 0L;
   }

   private cee a(cee $$0) {
      return (cee)$$0.dS().c(cbs.r).get();
   }

   private boolean b(cee $$0) {
      btq<?> $$1 = $$0.dS();
      return $$1.a(cbs.r) && $$1.c(cbs.r).get().ak() == this.f;
   }

   private Optional<? extends cee> c(cee $$0) {
      return $$0.dS().c(cbs.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cee $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(cee.class::cast);
   }
}
