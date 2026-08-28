import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzv extends bwt<cny> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jh> g = Optional.empty();

   public bzv() {
      super(ImmutableMap.of(cee.n, cef.b, cee.m, cef.b));
   }

   protected boolean a(arn $$0, cny $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.y().a_(cwf.rz) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jh> b(arn $$0, cny $$1) {
      jh.a $$2 = new jh.a();
      Optional<jh> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dx(), $$5, $$6, $$7);
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

   private boolean a(jh $$0, arn $$1) {
      dvj $$2 = $$1.a_($$0);
      die $$3 = $$2.b();
      return $$3 instanceof djz && !((djz)$$3).i($$2);
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      this.a($$1);
      $$1.a(bum.a, new cwb(cwf.rz));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cny $$0) {
      this.g.ifPresent($$1 -> {
         bww $$2 = new bww($$1);
         $$0.ed().a(cee.n, $$2);
         $$0.ed().a(cee.m, new ceh($$2, 0.5F, 1));
      });
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      $$1.a(bum.a, cwb.k);
      this.e = (long)$$1.ag;
   }

   protected void d(arn $$0, cny $$1, long $$2) {
      jh $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dv(), 1.0)) {
         cwb $$4 = cwb.k;
         bsk $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cwb $$8 = $$5.a($$7);
            if ($$8.a(cwf.rz)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cuj.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
