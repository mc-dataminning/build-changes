import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccn extends bzl<crj> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iv> g = Optional.empty();

   public ccn() {
      super(ImmutableMap.of(cgw.o, cgx.b, cgw.n, cgx.b));
   }

   protected boolean a(ars $$0, crj $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(dac.sG) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iv> b(ars $$0, crj $$1) {
      iv.a $$2 = new iv.a();
      Optional<iv> $$3 = Optional.empty();
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

   private boolean a(iv $$0, ars $$1) {
      ebe $$2 = $$1.a_($$0);
      dnc $$3 = $$2.b();
      return $$3 instanceof doz && !((doz)$$3).i($$2);
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      this.a($$1);
      $$1.a(bxd.a, new czy(dac.sG));
      this.d = $$2;
      this.f = 0;
   }

   private void a(crj $$0) {
      this.g.ifPresent($$1 -> {
         bzo $$2 = new bzo($$1);
         $$0.ec().a(cgw.o, $$2);
         $$0.ec().a(cgw.n, new cgz($$2, 0.5F, 1));
      });
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      $$1.a(bxd.a, czy.k);
      this.e = (long)$$1.af;
   }

   protected void d(ars $$0, crj $$1, long $$2) {
      iv $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         czy $$4 = czy.k;
         buy $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            czy $$8 = $$5.a($$7);
            if ($$8.a(dac.sG)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cyi.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
