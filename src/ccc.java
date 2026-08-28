import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccc extends bza<cqv> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iv> g = Optional.empty();

   public ccc() {
      super(ImmutableMap.of(cgl.o, cgm.b, cgl.n, cgm.b));
   }

   protected boolean a(arq $$0, cqv $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(czo.sG) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arq $$0, cqv $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iv> b(arq $$0, cqv $$1) {
      iv.a $$2 = new iv.a();
      Optional<iv> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.du(), $$5, $$6, $$7);
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

   private boolean a(iv $$0, arq $$1) {
      eao $$2 = $$1.a_($$0);
      dmm $$3 = $$2.b();
      return $$3 instanceof doj && !((doj)$$3).i($$2);
   }

   protected void b(arq $$0, cqv $$1, long $$2) {
      this.a($$1);
      $$1.a(bws.a, new czk(czo.sG));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cqv $$0) {
      this.g.ifPresent($$1 -> {
         bzd $$2 = new bzd($$1);
         $$0.eb().a(cgl.o, $$2);
         $$0.eb().a(cgl.n, new cgo($$2, 0.5F, 1));
      });
   }

   protected void c(arq $$0, cqv $$1, long $$2) {
      $$1.a(bws.a, czk.k);
      this.e = (long)$$1.af;
   }

   protected void d(arq $$0, cqv $$1, long $$2) {
      iv $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.ds(), 1.0)) {
         czk $$4 = czk.k;
         bun $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            czk $$8 = $$5.a($$7);
            if ($$8.a(czo.sG)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cxu.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
