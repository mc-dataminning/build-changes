import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class buj extends brh<cih> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ib> g = Optional.empty();

   public buj() {
      super(ImmutableMap.of(bys.n, byt.b, bys.m, byt.b));
   }

   protected boolean a(apf $$0, cih $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.y().a_(cqp.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(apf $$0, cih $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ib> b(apf $$0, cih $$1) {
      ib.a $$2 = new ib.a();
      Optional<ib> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dm(), $$5, $$6, $$7);
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

   private boolean a(ib $$0, apf $$1) {
      dnb $$2 = $$1.a_($$0);
      dac $$3 = $$2.b();
      return $$3 instanceof dbx && !((dbx)$$3).h($$2);
   }

   protected void b(apf $$0, cih $$1, long $$2) {
      this.a($$1);
      $$1.a(bpe.a, new cqm(cqp.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cih $$0) {
      this.g.ifPresent($$1 -> {
         brk $$2 = new brk($$1);
         $$0.dP().a(bys.n, $$2);
         $$0.dP().a(bys.m, new byv($$2, 0.5F, 1));
      });
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      $$1.a(bpe.a, cqm.h);
      this.e = (long)$$1.ah;
   }

   protected void d(apf $$0, cih $$1, long $$2) {
      ib $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         cqm $$4 = cqm.h;
         bnm $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cqm $$8 = $$5.a($$7);
            if ($$8.a(cqp.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && coj.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
