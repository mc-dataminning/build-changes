import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cab extends bwz<coh> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ji> g = Optional.empty();

   public cab() {
      super(ImmutableMap.of(cek.n, cel.b, cek.m, cel.b));
   }

   protected boolean a(ard $$0, coh $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.t().a_(cws.sv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ard $$0, coh $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ji> b(ard $$0, coh $$1) {
      ji.a $$2 = new ji.a();
      Optional<ji> $$3 = Optional.empty();
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

   private boolean a(ji $$0, ard $$1) {
      dww $$2 = $$1.a_($$0);
      djl $$3 = $$2.b();
      return $$3 instanceof dlh && !((dlh)$$3).i($$2);
   }

   protected void b(ard $$0, coh $$1, long $$2) {
      this.a($$1);
      $$1.a(bus.a, new cwo(cws.sv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(coh $$0) {
      this.g.ifPresent($$1 -> {
         bxc $$2 = new bxc($$1);
         $$0.eb().a(cek.n, $$2);
         $$0.eb().a(cek.m, new cen($$2, 0.5F, 1));
      });
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      $$1.a(bus.a, cwo.j);
      this.e = (long)$$1.af;
   }

   protected void d(ard $$0, coh $$1, long $$2) {
      ji $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         cwo $$4 = cwo.j;
         bsq $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cwo $$8 = $$5.a($$7);
            if ($$8.a(cws.sv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cuw.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
