import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bra extends brg<cbd> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bpc<? extends cbd> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bra(bpc<? extends cbd> $$0) {
      this($$0, 1.0F, 2);
   }

   public bra(bpc<? extends cbd> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(byr.h, bys.a, byr.r, bys.b, byr.m, bys.c, byr.n, bys.c, byr.Z, bys.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(apf $$0, cbd $$1) {
      return $$1.gr() && this.c($$1).isPresent();
   }

   protected void a(apf $$0, cbd $$1, long $$2) {
      cbd $$3 = this.c($$1).get();
      $$1.dP().a(byr.r, $$3);
      $$3.dP().a(byr.r, $$1);
      bri.a($$1, (bpo)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ei().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(apf $$0, cbd $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cbd $$3 = this.a($$1);
         return $$3.bA() && $$1.a($$3) && bri.a($$1.dP(), $$3) && $$2 <= this.j && !$$1.gk() && !$$3.gk();
      }
   }

   protected void c(apf $$0, cbd $$1, long $$2) {
      cbd $$3 = this.a($$1);
      bri.a($$1, (bpo)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dP().b(byr.r);
            $$3.dP().b(byr.r);
         }
      }
   }

   protected void d(apf $$0, cbd $$1, long $$2) {
      $$1.dP().b(byr.r);
      $$1.dP().b(byr.m);
      $$1.dP().b(byr.n);
      this.j = 0L;
   }

   private cbd a(cbd $$0) {
      return (cbd)$$0.dP().c(byr.r).get();
   }

   private boolean b(cbd $$0) {
      bqp<?> $$1 = $$0.dP();
      return $$1.a(byr.r) && $$1.c(byr.r).get().ai() == this.f;
   }

   private Optional<? extends cbd> c(cbd $$0) {
      return $$0.dP().c(byr.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof cbd $$2 && $$0.a($$2) && !$$2.gk()) {
            return true;
         }

         return false;
      }).map(cbd.class::cast);
   }
}
