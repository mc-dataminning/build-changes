import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blu extends bma<bvu> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bjx<? extends bvu> f;
   private final float g;
   private long h;

   public blu(bjx<? extends bvu> $$0, float $$1) {
      super(ImmutableMap.of(btk.h, btl.a, btk.r, btl.b, btk.m, btl.c, btk.n, btl.c, btk.Y, btl.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(alq $$0, bvu $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(alq $$0, bvu $$1, long $$2) {
      bvu $$3 = this.c($$1).get();
      $$1.dN().a(btk.r, $$3);
      $$3.dN().a(btk.r, $$1);
      bmc.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ef().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(alq $$0, bvu $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bvu $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bmc.a($$1.dN(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(alq $$0, bvu $$1, long $$2) {
      bvu $$3 = this.a($$1);
      bmc.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dN().b(btk.r);
            $$3.dN().b(btk.r);
         }
      }
   }

   protected void d(alq $$0, bvu $$1, long $$2) {
      $$1.dN().b(btk.r);
      $$1.dN().b(btk.m);
      $$1.dN().b(btk.n);
      this.h = 0L;
   }

   private bvu a(bvu $$0) {
      return (bvu)$$0.dN().c(btk.r).get();
   }

   private boolean b(bvu $$0) {
      blj<?> $$1 = $$0.dN();
      return $$1.a(btk.r) && $$1.c(btk.r).get().ag() == this.f;
   }

   private Optional<? extends bvu> c(bvu $$0) {
      return $$0.dN().c(btk.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof bvu $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bvu.class::cast);
   }
}
