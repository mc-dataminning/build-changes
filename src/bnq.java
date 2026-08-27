import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnq extends bkp<caz> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gu> g = Optional.empty();

   public bnq() {
      super(ImmutableMap.of(brz.n, bsa.b, brz.m, bsa.b));
   }

   protected boolean a(akk $$0, caz $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.t().a_(cja.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(akk $$0, caz $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gu> b(akk $$0, caz $$1) {
      gu.a $$2 = new gu.a();
      Optional<gu> $$3 = Optional.empty();
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

   private boolean a(gu $$0, akk $$1) {
      dez $$2 = $$1.a_($$0);
      csl $$3 = $$2.b();
      return $$3 instanceof cuc && !((cuc)$$3).h($$2);
   }

   protected void b(akk $$0, caz $$1, long $$2) {
      this.a($$1);
      $$1.a(bin.a, new cix(cja.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(caz $$0) {
      this.g.ifPresent($$1 -> {
         bks $$2 = new bks($$1);
         $$0.dM().a(brz.n, $$2);
         $$0.dM().a(brz.m, new bsc($$2, 0.5F, 1));
      });
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      $$1.a(bin.a, cix.b);
      this.e = (long)$$1.ah;
   }

   protected void d(akk $$0, caz $$1, long $$2) {
      gu $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.di(), 1.0)) {
         cix $$4 = cix.b;
         bgx $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cix $$8 = $$5.a($$7);
            if ($$8.a(cja.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cgs.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
