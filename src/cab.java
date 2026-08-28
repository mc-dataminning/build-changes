import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cab extends bwz<coi> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ji> g = Optional.empty();

   public cab() {
      super(ImmutableMap.of(cek.n, cel.b, cek.m, cel.b));
   }

   protected boolean a(arc $$0, coi $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.t().a_(cwt.sv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arc $$0, coi $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ji> b(arc $$0, coi $$1) {
      ji.a $$2 = new ji.a();
      Optional<ji> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dw(), $$5, $$6, $$7);
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

   private boolean a(ji $$0, arc $$1) {
      dwx $$2 = $$1.a_($$0);
      djm $$3 = $$2.b();
      return $$3 instanceof dli && !((dli)$$3).i($$2);
   }

   protected void b(arc $$0, coi $$1, long $$2) {
      this.a($$1);
      $$1.a(bus.a, new cwp(cwt.sv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(coi $$0) {
      this.g.ifPresent($$1 -> {
         bxc $$2 = new bxc($$1);
         $$0.ec().a(cek.n, $$2);
         $$0.ec().a(cek.m, new cen($$2, 0.5F, 1));
      });
   }

   protected void c(arc $$0, coi $$1, long $$2) {
      $$1.a(bus.a, cwp.j);
      this.e = (long)$$1.af;
   }

   protected void d(arc $$0, coi $$1, long $$2) {
      ji $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.du(), 1.0)) {
         cwp $$4 = cwp.j;
         bsq $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cwp $$8 = $$5.a($$7);
            if ($$8.a(cwt.sv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cux.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
