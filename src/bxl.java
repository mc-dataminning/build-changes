import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxl extends bxr<chp> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bvi<? extends chp> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bxl(bvi<? extends chp> $$0) {
      this($$0, 1.0F, 2);
   }

   public bxl(bvi<? extends chp> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cfc.h, cfd.a, cfc.r, cfd.b, cfc.m, cfd.c, cfc.n, cfd.c, cfc.Z, cfd.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(ard $$0, chp $$1) {
      return $$1.gC() && this.c($$1).isPresent();
   }

   protected void a(ard $$0, chp $$1, long $$2) {
      chp $$3 = this.c($$1).get();
      $$1.ea().a(cfc.r, $$3);
      $$3.ea().a(cfc.r, $$1);
      bxt.a($$1, (bvy)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dX().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(ard $$0, chp $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         chp $$3 = this.a($$1);
         return $$3.bJ() && $$1.a($$3) && bxt.a($$1.ea(), $$3) && $$2 <= this.j && !$$1.gp() && !$$3.gp();
      }
   }

   protected void c(ard $$0, chp $$1, long $$2) {
      chp $$3 = this.a($$1);
      bxt.a($$1, (bvy)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ea().b(cfc.r);
            $$3.ea().b(cfc.r);
         }
      }
   }

   protected void d(ard $$0, chp $$1, long $$2) {
      $$1.ea().b(cfc.r);
      $$1.ea().b(cfc.m);
      $$1.ea().b(cfc.n);
      this.j = 0L;
   }

   private chp a(chp $$0) {
      return (chp)$$0.ea().c(cfc.r).get();
   }

   private boolean b(chp $$0) {
      bxa<?> $$1 = $$0.ea();
      return $$1.a(cfc.r) && $$1.c(cfc.r).get().aq() == this.f;
   }

   private Optional<? extends chp> c(chp $$0) {
      return $$0.ea().c(cfc.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof chp $$2 && $$0.a($$2) && !$$2.gp()) {
            return true;
         }

         return false;
      }).map(chp.class::cast);
   }
}
