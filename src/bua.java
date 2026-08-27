import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bua extends bug<cee> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsb<? extends cee> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bua(bsb<? extends cee> $$0) {
      this($$0, 1.0F, 2);
   }

   public bua(bsb<? extends cee> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cbr.h, cbs.a, cbr.r, cbs.b, cbr.m, cbs.c, cbr.n, cbs.c, cbr.Z, cbs.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqt $$0, cee $$1) {
      return $$1.gC() && this.c($$1).isPresent();
   }

   protected void a(aqt $$0, cee $$1, long $$2) {
      cee $$3 = this.c($$1).get();
      $$1.dZ().a(cbr.r, $$3);
      $$3.dZ().a(cbr.r, $$1);
      bui.a($$1, (bso)$$3, this.g, this.h);
      int $$4 = 60 + $$1.et().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqt $$0, cee $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cee $$3 = this.a($$1);
         return $$3.bI() && $$1.a($$3) && bui.a($$1.dZ(), $$3) && $$2 <= this.j && !$$1.gv() && !$$3.gv();
      }
   }

   protected void c(aqt $$0, cee $$1, long $$2) {
      cee $$3 = this.a($$1);
      bui.a($$1, (bso)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dZ().b(cbr.r);
            $$3.dZ().b(cbr.r);
         }
      }
   }

   protected void d(aqt $$0, cee $$1, long $$2) {
      $$1.dZ().b(cbr.r);
      $$1.dZ().b(cbr.m);
      $$1.dZ().b(cbr.n);
      this.j = 0L;
   }

   private cee a(cee $$0) {
      return (cee)$$0.dZ().c(cbr.r).get();
   }

   private boolean b(cee $$0) {
      btp<?> $$1 = $$0.dZ();
      return $$1.a(cbr.r) && $$1.c(cbr.r).get().ak() == this.f;
   }

   private Optional<? extends cee> c(cee $$0) {
      return $$0.dZ().c(cbr.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cee $$2 && $$0.a($$2) && !$$2.gv()) {
            return true;
         }

         return false;
      }).map(cee.class::cast);
   }
}
