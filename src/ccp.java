import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccp extends bzn<crl> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iw> g = Optional.empty();

   public ccp() {
      super(ImmutableMap.of(cgy.o, cgz.b, cgy.n, cgz.b));
   }

   protected boolean a(aru $$0, crl $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(dae.sG) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iw> b(aru $$0, crl $$1) {
      iw.a $$2 = new iw.a();
      Optional<iw> $$3 = Optional.empty();
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

   private boolean a(iw $$0, aru $$1) {
      ebg $$2 = $$1.a_($$0);
      dne $$3 = $$2.b();
      return $$3 instanceof dpb && !((dpb)$$3).i($$2);
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      this.a($$1);
      $$1.a(bxf.a, new daa(dae.sG));
      this.d = $$2;
      this.f = 0;
   }

   private void a(crl $$0) {
      this.g.ifPresent($$1 -> {
         bzq $$2 = new bzq($$1);
         $$0.ec().a(cgy.o, $$2);
         $$0.ec().a(cgy.n, new chb($$2, 0.5F, 1));
      });
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      $$1.a(bxf.a, daa.k);
      this.e = (long)$$1.af;
   }

   protected void d(aru $$0, crl $$1, long $$2) {
      iw $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         daa $$4 = daa.k;
         bva $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            daa $$8 = $$5.a($$7);
            if ($$8.a(dae.sG)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cyk.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
