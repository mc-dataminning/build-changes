import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class buz extends bvf<cfc> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsw<? extends cfc> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public buz(bsw<? extends cfc> $$0) {
      this($$0, 1.0F, 2);
   }

   public buz(bsw<? extends cfc> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccq.h, ccr.a, ccq.r, ccr.b, ccq.m, ccr.c, ccq.n, ccr.c, ccq.Z, ccr.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqt $$0, cfc $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(aqt $$0, cfc $$1, long $$2) {
      cfc $$3 = this.c($$1).get();
      $$1.dU().a(ccq.r, $$3);
      $$3.dU().a(ccq.r, $$1);
      bvh.a($$1, (btl)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dT().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqt $$0, cfc $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfc $$3 = this.a($$1);
         return $$3.bE() && $$1.a($$3) && bvh.a($$1.dU(), $$3) && $$2 <= this.j && !$$1.gj() && !$$3.gj();
      }
   }

   protected void c(aqt $$0, cfc $$1, long $$2) {
      cfc $$3 = this.a($$1);
      bvh.a($$1, (btl)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dU().b(ccq.r);
            $$3.dU().b(ccq.r);
         }
      }
   }

   protected void d(aqt $$0, cfc $$1, long $$2) {
      $$1.dU().b(ccq.r);
      $$1.dU().b(ccq.m);
      $$1.dU().b(ccq.n);
      this.j = 0L;
   }

   private cfc a(cfc $$0) {
      return (cfc)$$0.dU().c(ccq.r).get();
   }

   private boolean b(cfc $$0) {
      buo<?> $$1 = $$0.dU();
      return $$1.a(ccq.r) && $$1.c(ccq.r).get().am() == this.f;
   }

   private Optional<? extends cfc> c(cfc $$0) {
      return $$0.dU().c(ccq.h).get().a($$1 -> {
         if ($$1.am() == this.f && $$1 instanceof cfc $$2 && $$0.a($$2) && !$$2.gj()) {
            return true;
         }

         return false;
      }).map(cfc.class::cast);
   }
}
