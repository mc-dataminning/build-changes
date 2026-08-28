import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxk extends bxq<cho> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bvi<? extends cho> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bxk(bvi<? extends cho> $$0) {
      this($$0, 1.0F, 2);
   }

   public bxk(bvi<? extends cho> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cfb.h, cfc.a, cfb.r, cfc.b, cfb.m, cfc.c, cfb.n, cfc.c, cfb.Z, cfc.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arx $$0, cho $$1) {
      return $$1.gy() && this.c($$1).isPresent();
   }

   protected void a(arx $$0, cho $$1, long $$2) {
      cho $$3 = this.c($$1).get();
      $$1.ec().a(cfb.r, $$3);
      $$3.ec().a(cfb.r, $$1);
      bxs.a($$1, (bvx)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dZ().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arx $$0, cho $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cho $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && bxs.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gl() && !$$3.gl();
      }
   }

   protected void c(arx $$0, cho $$1, long $$2) {
      cho $$3 = this.a($$1);
      bxs.a($$1, (bvx)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cfb.r);
            $$3.ec().b(cfb.r);
         }
      }
   }

   protected void d(arx $$0, cho $$1, long $$2) {
      $$1.ec().b(cfb.r);
      $$1.ec().b(cfb.m);
      $$1.ec().b(cfb.n);
      this.j = 0L;
   }

   private cho a(cho $$0) {
      return (cho)$$0.ec().c(cfb.r).get();
   }

   private boolean b(cho $$0) {
      bwz<?> $$1 = $$0.ec();
      return $$1.a(cfb.r) && $$1.c(cfb.r).get().aq() == this.f;
   }

   private Optional<? extends cho> c(cho $$0) {
      return $$0.ec().c(cfb.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cho $$2 && $$0.a($$2) && !$$2.gl()) {
            return true;
         }

         return false;
      }).map(cho.class::cast);
   }
}
