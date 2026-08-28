import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzz extends bwx<coc> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jh> g = Optional.empty();

   public bzz() {
      super(ImmutableMap.of(cei.n, cej.b, cei.m, cej.b));
   }

   protected boolean a(arq $$0, coc $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.y().a_(cwj.rP) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jh> b(arq $$0, coc $$1) {
      jh.a $$2 = new jh.a();
      Optional<jh> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dy(), $$5, $$6, $$7);
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

   private boolean a(jh $$0, arq $$1) {
      dvo $$2 = $$1.a_($$0);
      dij $$3 = $$2.b();
      return $$3 instanceof dke && !((dke)$$3).i($$2);
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      this.a($$1);
      $$1.a(buq.a, new cwf(cwj.rP));
      this.d = $$2;
      this.f = 0;
   }

   private void a(coc $$0) {
      this.g.ifPresent($$1 -> {
         bxa $$2 = new bxa($$1);
         $$0.ee().a(cei.n, $$2);
         $$0.ee().a(cei.m, new cel($$2, 0.5F, 1));
      });
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      $$1.a(buq.a, cwf.k);
      this.e = (long)$$1.ag;
   }

   protected void d(arq $$0, coc $$1, long $$2) {
      jh $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dw(), 1.0)) {
         cwf $$4 = cwf.k;
         bso $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cwf $$8 = $$5.a($$7);
            if ($$8.a(cwj.rP)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cun.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
