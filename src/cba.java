import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cba extends bxy<cpi> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jh> g = Optional.empty();

   public cba() {
      super(ImmutableMap.of(cfj.n, cfk.b, cfj.m, cfk.b));
   }

   protected boolean a(ash $$0, cpi $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.t().a_(cxs.sm) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jh> b(ash $$0, cpi $$1) {
      jh.a $$2 = new jh.a();
      Optional<jh> $$3 = Optional.empty();
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

   private boolean a(jh $$0, ash $$1) {
      dxu $$2 = $$1.a_($$0);
      dkl $$3 = $$2.b();
      return $$3 instanceof dmi && !((dmi)$$3).i($$2);
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      this.a($$1);
      $$1.a(bvr.a, new cxo(cxs.sm));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cpi $$0) {
      this.g.ifPresent($$1 -> {
         byb $$2 = new byb($$1);
         $$0.eb().a(cfj.n, $$2);
         $$0.eb().a(cfj.m, new cfm($$2, 0.5F, 1));
      });
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      $$1.a(bvr.a, cxo.k);
      this.e = (long)$$1.af;
   }

   protected void d(ash $$0, cpi $$1, long $$2) {
      jh $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         cxo $$4 = cxo.k;
         btp $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cxo $$8 = $$5.a($$7);
            if ($$8.a(cxs.sm)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cvw.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
