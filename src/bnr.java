import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnr extends bkq<cba> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gu> g = Optional.empty();

   public bnr() {
      super(ImmutableMap.of(bsa.n, bsb.b, bsa.m, bsb.b));
   }

   protected boolean a(akk $$0, cba $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.t().a_(cjb.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(akk $$0, cba $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gu> b(akk $$0, cba $$1) {
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
      dfa $$2 = $$1.a_($$0);
      csm $$3 = $$2.b();
      return $$3 instanceof cud && !((cud)$$3).h($$2);
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      this.a($$1);
      $$1.a(bin.a, new ciy(cjb.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cba $$0) {
      this.g.ifPresent($$1 -> {
         bkt $$2 = new bkt($$1);
         $$0.dM().a(bsa.n, $$2);
         $$0.dM().a(bsa.m, new bsd($$2, 0.5F, 1));
      });
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      $$1.a(bin.a, ciy.b);
      this.e = (long)$$1.ah;
   }

   protected void d(akk $$0, cba $$1, long $$2) {
      gu $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.di(), 1.0)) {
         ciy $$4 = ciy.b;
         bgx $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            ciy $$8 = $$5.a($$7);
            if ($$8.a(cjb.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cgt.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
