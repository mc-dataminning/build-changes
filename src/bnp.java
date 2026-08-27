import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnp extends bko<cay> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gv> g = Optional.empty();

   public bnp() {
      super(ImmutableMap.of(bry.n, brz.b, bry.m, brz.b));
   }

   protected boolean a(aki $$0, cay $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.t().a_(ciz.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gv> b(aki $$0, cay $$1) {
      gv.a $$2 = new gv.a();
      Optional<gv> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dk(), $$5, $$6, $$7);
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

   private boolean a(gv $$0, aki $$1) {
      dey $$2 = $$1.a_($$0);
      csk $$3 = $$2.b();
      return $$3 instanceof cub && !((cub)$$3).h($$2);
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      this.a($$1);
      $$1.a(bil.a, new ciw(ciz.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cay $$0) {
      this.g.ifPresent($$1 -> {
         bkr $$2 = new bkr($$1);
         $$0.dM().a(bry.n, $$2);
         $$0.dM().a(bry.m, new bsb($$2, 0.5F, 1));
      });
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      $$1.a(bil.a, ciw.b);
      this.e = (long)$$1.ah;
   }

   protected void d(aki $$0, cay $$1, long $$2) {
      gv $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.di(), 1.0)) {
         ciw $$4 = ciw.b;
         bgv $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            ciw $$8 = $$5.a($$7);
            if ($$8.a(ciz.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cgr.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
