import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnz extends bof<byc> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bmc<? extends byc> f;
   private final float g;
   private long h;

   public bnz(bmc<? extends byc> $$0, float $$1) {
      super(ImmutableMap.of(bvq.h, bvr.a, bvq.r, bvr.b, bvq.m, bvr.c, bvq.n, bvr.c, bvq.Z, bvr.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(ane $$0, byc $$1) {
      return $$1.gj() && this.c($$1).isPresent();
   }

   protected void a(ane $$0, byc $$1, long $$2) {
      byc $$3 = this.c($$1).get();
      $$1.dN().a(bvq.r, $$3);
      $$3.dN().a(bvq.r, $$1);
      boh.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eg().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(ane $$0, byc $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         byc $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && boh.a($$1.dN(), $$3) && $$2 <= this.h && !$$1.gc() && !$$3.gc();
      }
   }

   protected void c(ane $$0, byc $$1, long $$2) {
      byc $$3 = this.a($$1);
      boh.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dN().b(bvq.r);
            $$3.dN().b(bvq.r);
         }
      }
   }

   protected void d(ane $$0, byc $$1, long $$2) {
      $$1.dN().b(bvq.r);
      $$1.dN().b(bvq.m);
      $$1.dN().b(bvq.n);
      this.h = 0L;
   }

   private byc a(byc $$0) {
      return (byc)$$0.dN().c(bvq.r).get();
   }

   private boolean b(byc $$0) {
      bno<?> $$1 = $$0.dN();
      return $$1.a(bvq.r) && $$1.c(bvq.r).get().ai() == this.f;
   }

   private Optional<? extends byc> c(byc $$0) {
      return $$0.dN().c(bvq.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof byc $$2 && $$0.a($$2) && !$$2.gc()) {
            return true;
         }

         return false;
      }).map(byc.class::cast);
   }
}
