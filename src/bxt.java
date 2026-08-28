import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxt extends bxz<chx> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bvr<? extends chx> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bxt(bvr<? extends chx> $$0) {
      this($$0, 1.0F, 2);
   }

   public bxt(bvr<? extends chx> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cfk.h, cfl.a, cfk.r, cfl.b, cfk.m, cfl.c, cfk.n, cfl.c, cfk.Z, cfl.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(ash $$0, chx $$1) {
      return $$1.gy() && this.c($$1).isPresent();
   }

   protected void a(ash $$0, chx $$1, long $$2) {
      chx $$3 = this.c($$1).get();
      $$1.ec().a(cfk.r, $$3);
      $$3.ec().a(cfk.r, $$1);
      byb.a($$1, (bwg)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dZ().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(ash $$0, chx $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         chx $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && byb.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gl() && !$$3.gl();
      }
   }

   protected void c(ash $$0, chx $$1, long $$2) {
      chx $$3 = this.a($$1);
      byb.a($$1, (bwg)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cfk.r);
            $$3.ec().b(cfk.r);
         }
      }
   }

   protected void d(ash $$0, chx $$1, long $$2) {
      $$1.ec().b(cfk.r);
      $$1.ec().b(cfk.m);
      $$1.ec().b(cfk.n);
      this.j = 0L;
   }

   private chx a(chx $$0) {
      return (chx)$$0.ec().c(cfk.r).get();
   }

   private boolean b(chx $$0) {
      bxi<?> $$1 = $$0.ec();
      return $$1.a(cfk.r) && $$1.c(cfk.r).get().aq() == this.f;
   }

   private Optional<? extends chx> c(chx $$0) {
      return $$0.ec().c(cfk.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof chx $$2 && $$0.a($$2) && !$$2.gl()) {
            return true;
         }

         return false;
      }).map(chx.class::cast);
   }
}
