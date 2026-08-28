import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbk extends byi<cpu> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jj> g = Optional.empty();

   public cbk() {
      super(ImmutableMap.of(cft.o, cfu.b, cft.n, cfu.b));
   }

   protected boolean a(arn $$0, cpu $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(cyc.sz) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jj> b(arn $$0, cpu $$1) {
      jj.a $$2 = new jj.a();
      Optional<jj> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dv(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.A.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.j());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(jj $$0, arn $$1) {
      dym $$2 = $$1.a_($$0);
      dku $$3 = $$2.b();
      return $$3 instanceof dmq && !((dmq)$$3).i($$2);
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      this.a($$1);
      $$1.a(bwc.a, new cxy(cyc.sz));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cpu $$0) {
      this.g.ifPresent($$1 -> {
         byl $$2 = new byl($$1);
         $$0.eb().a(cft.o, $$2);
         $$0.eb().a(cft.n, new cfw($$2, 0.5F, 1));
      });
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      $$1.a(bwc.a, cxy.k);
      this.e = (long)$$1.af;
   }

   protected void d(arn $$0, cpu $$1, long $$2) {
      jj $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         cxy $$4 = cxy.k;
         btx $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cxy $$8 = $$5.a($$7);
            if ($$8.a(cyc.sz)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cwh.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
