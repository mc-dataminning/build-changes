import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btc extends bqa<cgy> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hz> g = Optional.empty();

   public btc() {
      super(ImmutableMap.of(bxl.n, bxm.b, bxl.m, bxm.b));
   }

   protected boolean a(aow $$0, cgy $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.A().a_(cpg.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hz> b(aow $$0, cgy $$1) {
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

   private boolean a(hz $$0, aow $$1) {
      dlj $$2 = $$1.a_($$0);
      cys $$3 = $$2.b();
      return $$3 instanceof dan && !((dan)$$3).h($$2);
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      this.a($$1);
      $$1.a(bnx.a, new cpd(cpg.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cgy $$0) {
      this.g.ifPresent($$1 -> {
         bqd $$2 = new bqd($$1);
         $$0.dO().a(bxl.n, $$2);
         $$0.dO().a(bxl.m, new bxo($$2, 0.5F, 1));
      });
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      $$1.a(bnx.a, cpd.h);
      this.e = (long)$$1.ag;
   }

   protected void d(aow $$0, cgy $$1, long $$2) {
      hz $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         cpd $$4 = cpd.h;
         bmf $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cpd $$8 = $$5.a($$7);
            if ($$8.a(cpg.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cmy.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
