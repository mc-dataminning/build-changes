import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxw extends buu<clx> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ja> g = Optional.empty();

   public bxw() {
      super(ImmutableMap.of(ccf.n, ccg.b, ccf.m, ccg.b));
   }

   protected boolean a(aqm $$0, clx $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(cuf.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ja> b(aqm $$0, clx $$1) {
      ja.a $$2 = new ja.a();
      Optional<ja> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dq(), $$5, $$6, $$7);
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

   private boolean a(ja $$0, aqm $$1) {
      dsk $$2 = $$1.a_($$0);
      dfh $$3 = $$2.b();
      return $$3 instanceof dhc && !((dhc)$$3).h($$2);
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      this.a($$1);
      $$1.a(bsn.a, new cuc(cuf.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(clx $$0) {
      this.g.ifPresent($$1 -> {
         bux $$2 = new bux($$1);
         $$0.dU().a(ccf.n, $$2);
         $$0.dU().a(ccf.m, new cci($$2, 0.5F, 1));
      });
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      $$1.a(bsn.a, cuc.l);
      this.e = (long)$$1.ai;
   }

   protected void d(aqm $$0, clx $$1, long $$2) {
      ja $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.do(), 1.0)) {
         cuc $$4 = cuc.l;
         bqp $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cuc $$8 = $$5.a($$7);
            if ($$8.a(cuf.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && csd.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
