import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwu extends bxa<cgy> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bus<? extends cgy> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bwu(bus<? extends cgy> $$0) {
      this($$0, 1.0F, 2);
   }

   public bwu(bus<? extends cgy> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cel.h, cem.a, cel.r, cem.b, cel.m, cem.c, cel.n, cem.c, cel.Z, cem.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(ard $$0, cgy $$1) {
      return $$1.gC() && this.c($$1).isPresent();
   }

   protected void a(ard $$0, cgy $$1, long $$2) {
      cgy $$3 = this.c($$1).get();
      $$1.eb().a(cel.r, $$3);
      $$3.eb().a(cel.r, $$1);
      bxc.a($$1, (bvh)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(ard $$0, cgy $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgy $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && bxc.a($$1.eb(), $$3) && $$2 <= this.j && !$$1.gp() && !$$3.gp();
      }
   }

   protected void c(ard $$0, cgy $$1, long $$2) {
      cgy $$3 = this.a($$1);
      bxc.a($$1, (bvh)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eb().b(cel.r);
            $$3.eb().b(cel.r);
         }
      }
   }

   protected void d(ard $$0, cgy $$1, long $$2) {
      $$1.eb().b(cel.r);
      $$1.eb().b(cel.m);
      $$1.eb().b(cel.n);
      this.j = 0L;
   }

   private cgy a(cgy $$0) {
      return (cgy)$$0.eb().c(cel.r).get();
   }

   private boolean b(cgy $$0) {
      bwj<?> $$1 = $$0.eb();
      return $$1.a(cel.r) && $$1.c(cel.r).get().aq() == this.f;
   }

   private Optional<? extends cgy> c(cgy $$0) {
      return $$0.eb().c(cel.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cgy $$2 && $$0.a($$2) && !$$2.gp()) {
            return true;
         }

         return false;
      }).map(cgy.class::cast);
   }
}
