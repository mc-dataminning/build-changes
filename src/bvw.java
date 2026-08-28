import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvw extends bwc<cga> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final btv<? extends cga> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bvw(btv<? extends cga> $$0) {
      this($$0, 1.0F, 2);
   }

   public bvw(btv<? extends cga> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cdn.h, cdo.a, cdn.r, cdo.b, cdn.m, cdo.c, cdn.n, cdo.c, cdn.Z, cdo.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arh $$0, cga $$1) {
      return $$1.gz() && this.c($$1).isPresent();
   }

   protected void a(arh $$0, cga $$1, long $$2) {
      cga $$3 = this.c($$1).get();
      $$1.dX().a(cdn.r, $$3);
      $$3.dX().a(cdn.r, $$1);
      bwe.a($$1, (buk)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dV().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arh $$0, cga $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cga $$3 = this.a($$1);
         return $$3.bI() && $$1.a($$3) && bwe.a($$1.dX(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(arh $$0, cga $$1, long $$2) {
      cga $$3 = this.a($$1);
      bwe.a($$1, (buk)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dX().b(cdn.r);
            $$3.dX().b(cdn.r);
         }
      }
   }

   protected void d(arh $$0, cga $$1, long $$2) {
      $$1.dX().b(cdn.r);
      $$1.dX().b(cdn.m);
      $$1.dX().b(cdn.n);
      this.j = 0L;
   }

   private cga a(cga $$0) {
      return (cga)$$0.dX().c(cdn.r).get();
   }

   private boolean b(cga $$0) {
      bvl<?> $$1 = $$0.dX();
      return $$1.a(cdn.r) && $$1.c(cdn.r).get().ao() == this.f;
   }

   private Optional<? extends cga> c(cga $$0) {
      return $$0.dX().c(cdn.h).get().a($$1 -> {
         if ($$1.ao() == this.f && $$1 instanceof cga $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(cga.class::cast);
   }
}
