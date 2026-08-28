import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cac extends bxa<cof> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jh> g = Optional.empty();

   public cac() {
      super(ImmutableMap.of(cel.n, cem.b, cel.m, cem.b));
   }

   protected boolean a(arp $$0, cof $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.v().a_(cwq.rP) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arp $$0, cof $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jh> b(arp $$0, cof $$1) {
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

   private boolean a(jh $$0, arp $$1) {
      dvv $$2 = $$1.a_($$0);
      diq $$3 = $$2.b();
      return $$3 instanceof dkl && !((dkl)$$3).i($$2);
   }

   protected void b(arp $$0, cof $$1, long $$2) {
      this.a($$1);
      $$1.a(but.a, new cwm(cwq.rP));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cof $$0) {
      this.g.ifPresent($$1 -> {
         bxd $$2 = new bxd($$1);
         $$0.eb().a(cel.n, $$2);
         $$0.eb().a(cel.m, new ceo($$2, 0.5F, 1));
      });
   }

   protected void c(arp $$0, cof $$1, long $$2) {
      $$1.a(but.a, cwm.k);
      this.e = (long)$$1.af;
   }

   protected void d(arp $$0, cof $$1, long $$2) {
      jh $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         cwm $$4 = cwm.k;
         bsr $$5 = $$1.v();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cwm $$8 = $$5.a($$7);
            if ($$8.a(cwq.rP)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cuu.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
