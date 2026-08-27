import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bsy extends bpw<cgu> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hz> g = Optional.empty();

   public bsy() {
      super(ImmutableMap.of(bxh.n, bxi.b, bxh.m, bxi.b));
   }

   protected boolean a(aov $$0, cgu $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.A().a_(cpc.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aov $$0, cgu $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hz> b(aov $$0, cgu $$1) {
      hz.a $$2 = new hz.a();
      Optional<hz> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dm(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.z.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.i());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(hz $$0, aov $$1) {
      dlf $$2 = $$1.a_($$0);
      cyo $$3 = $$2.b();
      return $$3 instanceof daj && !((daj)$$3).h($$2);
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      this.a($$1);
      $$1.a(bnv.a, new coz(cpc.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cgu $$0) {
      this.g.ifPresent($$1 -> {
         bpz $$2 = new bpz($$1);
         $$0.dO().a(bxh.n, $$2);
         $$0.dO().a(bxh.m, new bxk($$2, 0.5F, 1));
      });
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      $$1.a(bnv.a, coz.h);
      this.e = (long)$$1.ag;
   }

   protected void d(aov $$0, cgu $$1, long $$2) {
      hz $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         coz $$4 = coz.h;
         bmd $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            coz $$8 = $$5.a($$7);
            if ($$8.a(cpc.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cmu.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
