import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btr extends bqp<chn> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ib> g = Optional.empty();

   public btr() {
      super(ImmutableMap.of(bya.n, byb.b, bya.m, byb.b));
   }

   protected boolean a(apa $$0, chn $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.A().a_(cpt.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ib> b(apa $$0, chn $$1) {
      ib.a $$2 = new ib.a();
      Optional<ib> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dj(), $$5, $$6, $$7);
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

   private boolean a(ib $$0, apa $$1) {
      dme $$2 = $$1.a_($$0);
      czf $$3 = $$2.b();
      return $$3 instanceof dba && !((dba)$$3).h($$2);
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      this.a($$1);
      $$1.a(bom.a, new cpq(cpt.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(chn $$0) {
      this.g.ifPresent($$1 -> {
         bqs $$2 = new bqs($$1);
         $$0.dM().a(bya.n, $$2);
         $$0.dM().a(bya.m, new byd($$2, 0.5F, 1));
      });
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      $$1.a(bom.a, cpq.h);
      this.e = (long)$$1.ag;
   }

   protected void d(apa $$0, chn $$1, long $$2) {
      ib $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dh(), 1.0)) {
         cpq $$4 = cpq.h;
         bmu $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cpq $$8 = $$5.a($$7);
            if ($$8.a(cpt.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cnn.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
