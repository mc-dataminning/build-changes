import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccy extends bzw<cru> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iw> g = Optional.empty();

   public ccy() {
      super(ImmutableMap.of(chh.o, chi.b, chh.n, chi.b));
   }

   protected boolean a(asb $$0, cru $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.u().a_(dao.sG) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(asb $$0, cru $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iw> b(asb $$0, cru $$1) {
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

   private boolean a(iw $$0, asb $$1) {
      ebq $$2 = $$1.a_($$0);
      dno $$3 = $$2.b();
      return $$3 instanceof dpl && !((dpl)$$3).i($$2);
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      this.a($$1);
      $$1.a(bxo.a, new dak(dao.sG));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cru $$0) {
      this.g.ifPresent($$1 -> {
         bzz $$2 = new bzz($$1);
         $$0.ec().a(chh.o, $$2);
         $$0.ec().a(chh.n, new chk($$2, 0.5F, 1));
      });
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      $$1.a(bxo.a, dak.l);
      this.e = (long)$$1.af;
   }

   protected void d(asb $$0, cru $$1, long $$2) {
      iw $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         dak $$4 = dak.l;
         bvj $$5 = $$1.u();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            dak $$8 = $$5.a($$7);
            if ($$8.a(dao.sG)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cyu.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
