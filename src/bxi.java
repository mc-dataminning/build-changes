import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxi extends bug<cll> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ir> g = Optional.empty();

   public bxi() {
      super(ImmutableMap.of(cbr.n, cbs.b, cbr.m, cbs.b));
   }

   protected boolean a(aqt $$0, cll $$1) {
      if ($$1.am % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.am)) {
         if ($$1.x().a_(cuk.sV) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ir> b(aqt $$0, cll $$1) {
      ir.a $$2 = new ir.a();
      Optional<ir> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.du(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.A.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.i());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(ir $$0, aqt $$1) {
      dtc $$2 = $$1.a_($$0);
      dfc $$3 = $$2.b();
      return $$3 instanceof dgy && !((dgy)$$3).h($$2);
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      this.a($$1);
      $$1.a(bsc.a, new cuh(cuk.sV));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cll $$0) {
      this.g.ifPresent($$1 -> {
         buj $$2 = new buj($$1);
         $$0.dZ().a(cbr.n, $$2);
         $$0.dZ().a(cbr.m, new cbu($$2, 0.5F, 1));
      });
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      $$1.a(bsc.a, cuh.i);
      this.e = (long)$$1.am;
   }

   protected void d(aqt $$0, cll $$1, long $$2) {
      ir $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.ds(), 1.0)) {
         cuh $$4 = cuh.i;
         bqj $$5 = $$1.x();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cuh $$8 = $$5.a($$7);
            if ($$8.a(cuk.sV)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.d() && cse.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
