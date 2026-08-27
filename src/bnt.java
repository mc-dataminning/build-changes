import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnt extends bks<cbc> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gw> g = Optional.empty();

   public bnt() {
      super(ImmutableMap.of(bsc.n, bsd.b, bsc.m, bsd.b));
   }

   protected boolean a(akn $$0, cbc $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.t().a_(cjd.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gw> b(akn $$0, cbc $$1) {
      gw.a $$2 = new gw.a();
      Optional<gw> $$3 = Optional.empty();
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

   private boolean a(gw $$0, akn $$1) {
      dfe $$2 = $$1.a_($$0);
      csq $$3 = $$2.b();
      return $$3 instanceof cuh && !((cuh)$$3).h($$2);
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      this.a($$1);
      $$1.a(biq.a, new cja(cjd.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cbc $$0) {
      this.g.ifPresent($$1 -> {
         bkv $$2 = new bkv($$1);
         $$0.dM().a(bsc.n, $$2);
         $$0.dM().a(bsc.m, new bsf($$2, 0.5F, 1));
      });
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      $$1.a(biq.a, cja.b);
      this.e = (long)$$1.ah;
   }

   protected void d(akn $$0, cbc $$1, long $$2) {
      gw $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.di(), 1.0)) {
         cja $$4 = cja.b;
         bha $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cja $$8 = $$5.a($$7);
            if ($$8.a(cjd.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cgv.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
