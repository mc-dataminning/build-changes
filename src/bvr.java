import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvr extends bvx<cfv> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final btq<? extends cfv> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bvr(btq<? extends cfv> $$0) {
      this($$0, 1.0F, 2);
   }

   public bvr(btq<? extends cfv> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cdi.h, cdj.a, cdi.r, cdj.b, cdi.m, cdj.c, cdi.n, cdj.c, cdi.Z, cdj.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arg $$0, cfv $$1) {
      return $$1.gy() && this.c($$1).isPresent();
   }

   protected void a(arg $$0, cfv $$1, long $$2) {
      cfv $$3 = this.c($$1).get();
      $$1.dX().a(cdi.r, $$3);
      $$3.dX().a(cdi.r, $$1);
      bvz.a($$1, (buf)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dV().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arg $$0, cfv $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfv $$3 = this.a($$1);
         return $$3.bI() && $$1.a($$3) && bvz.a($$1.dX(), $$3) && $$2 <= this.j && !$$1.gl() && !$$3.gl();
      }
   }

   protected void c(arg $$0, cfv $$1, long $$2) {
      cfv $$3 = this.a($$1);
      bvz.a($$1, (buf)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dX().b(cdi.r);
            $$3.dX().b(cdi.r);
         }
      }
   }

   protected void d(arg $$0, cfv $$1, long $$2) {
      $$1.dX().b(cdi.r);
      $$1.dX().b(cdi.m);
      $$1.dX().b(cdi.n);
      this.j = 0L;
   }

   private cfv a(cfv $$0) {
      return (cfv)$$0.dX().c(cdi.r).get();
   }

   private boolean b(cfv $$0) {
      bvg<?> $$1 = $$0.dX();
      return $$1.a(cdi.r) && $$1.c(cdi.r).get().ao() == this.f;
   }

   private Optional<? extends cfv> c(cfv $$0) {
      return $$0.dX().c(cdi.h).get().a($$1 -> {
         if ($$1.ao() == this.f && $$1 instanceof cfv $$2 && $$0.a($$2) && !$$2.gl()) {
            return true;
         }

         return false;
      }).map(cfv.class::cast);
   }
}
