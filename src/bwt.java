import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwt extends bwz<cgx> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bur<? extends cgx> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bwt(bur<? extends cgx> $$0) {
      this($$0, 1.0F, 2);
   }

   public bwt(bur<? extends cgx> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cek.h, cel.a, cek.r, cel.b, cek.m, cel.c, cek.n, cel.c, cek.Z, cel.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arc $$0, cgx $$1) {
      return $$1.gz() && this.c($$1).isPresent();
   }

   protected void a(arc $$0, cgx $$1, long $$2) {
      cgx $$3 = this.c($$1).get();
      $$1.ec().a(cek.r, $$3);
      $$3.ec().a(cek.r, $$1);
      bxb.a($$1, (bvg)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dZ().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arc $$0, cgx $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgx $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && bxb.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(arc $$0, cgx $$1, long $$2) {
      cgx $$3 = this.a($$1);
      bxb.a($$1, (bvg)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cek.r);
            $$3.ec().b(cek.r);
         }
      }
   }

   protected void d(arc $$0, cgx $$1, long $$2) {
      $$1.ec().b(cek.r);
      $$1.ec().b(cek.m);
      $$1.ec().b(cek.n);
      this.j = 0L;
   }

   private cgx a(cgx $$0) {
      return (cgx)$$0.ec().c(cek.r).get();
   }

   private boolean b(cgx $$0) {
      bwi<?> $$1 = $$0.ec();
      return $$1.a(cek.r) && $$1.c(cek.r).get().aq() == this.f;
   }

   private Optional<? extends cgx> c(cgx $$0) {
      return $$0.ec().c(cek.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cgx $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(cgx.class::cast);
   }
}
