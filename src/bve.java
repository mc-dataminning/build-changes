import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bve extends bvk<cfh> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final btc<? extends cfh> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bve(btc<? extends cfh> $$0) {
      this($$0, 1.0F, 2);
   }

   public bve(btc<? extends cfh> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccv.h, ccw.a, ccv.r, ccw.b, ccv.m, ccw.c, ccv.n, ccw.c, ccv.Z, ccw.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arf $$0, cfh $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(arf $$0, cfh $$1, long $$2) {
      cfh $$3 = this.c($$1).get();
      $$1.dS().a(ccv.r, $$3);
      $$3.dS().a(ccv.r, $$1);
      bvm.a($$1, (btr)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arf $$0, cfh $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfh $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bvm.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(arf $$0, cfh $$1, long $$2) {
      cfh $$3 = this.a($$1);
      bvm.a($$1, (btr)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(ccv.r);
            $$3.dS().b(ccv.r);
         }
      }
   }

   protected void d(arf $$0, cfh $$1, long $$2) {
      $$1.dS().b(ccv.r);
      $$1.dS().b(ccv.m);
      $$1.dS().b(ccv.n);
      this.j = 0L;
   }

   private cfh a(cfh $$0) {
      return (cfh)$$0.dS().c(ccv.r).get();
   }

   private boolean b(cfh $$0) {
      but<?> $$1 = $$0.dS();
      return $$1.a(ccv.r) && $$1.c(ccv.r).get().ak() == this.f;
   }

   private Optional<? extends cfh> c(cfh $$0) {
      return $$0.dS().c(ccv.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cfh $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cfh.class::cast);
   }
}
