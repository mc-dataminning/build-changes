import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvz extends bwf<cgd> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bty<? extends cgd> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bvz(bty<? extends cgd> $$0) {
      this($$0, 1.0F, 2);
   }

   public bvz(bty<? extends cgd> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cdq.h, cdr.a, cdq.r, cdr.b, cdq.m, cdr.c, cdq.n, cdr.c, cdq.Z, cdr.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arj $$0, cgd $$1) {
      return $$1.gy() && this.c($$1).isPresent();
   }

   protected void a(arj $$0, cgd $$1, long $$2) {
      cgd $$3 = this.c($$1).get();
      $$1.dY().a(cdq.r, $$3);
      $$3.dY().a(cdq.r, $$1);
      bwh.a($$1, (bun)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dV().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arj $$0, cgd $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgd $$3 = this.a($$1);
         return $$3.bI() && $$1.a($$3) && bwh.a($$1.dY(), $$3) && $$2 <= this.j && !$$1.gl() && !$$3.gl();
      }
   }

   protected void c(arj $$0, cgd $$1, long $$2) {
      cgd $$3 = this.a($$1);
      bwh.a($$1, (bun)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dY().b(cdq.r);
            $$3.dY().b(cdq.r);
         }
      }
   }

   protected void d(arj $$0, cgd $$1, long $$2) {
      $$1.dY().b(cdq.r);
      $$1.dY().b(cdq.m);
      $$1.dY().b(cdq.n);
      this.j = 0L;
   }

   private cgd a(cgd $$0) {
      return (cgd)$$0.dY().c(cdq.r).get();
   }

   private boolean b(cgd $$0) {
      bvo<?> $$1 = $$0.dY();
      return $$1.a(cdq.r) && $$1.c(cdq.r).get().ao() == this.f;
   }

   private Optional<? extends cgd> c(cgd $$0) {
      return $$0.dY().c(cdq.h).get().a($$1 -> {
         if ($$1.ao() == this.f && $$1 instanceof cgd $$2 && $$0.a($$2) && !$$2.gl()) {
            return true;
         }

         return false;
      }).map(cgd.class::cast);
   }
}
