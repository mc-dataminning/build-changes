import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwu extends bts<cku> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<in> g = Optional.empty();

   public bwu() {
      super(ImmutableMap.of(cbd.n, cbe.b, cbd.m, cbe.b));
   }

   protected boolean a(aqh $$0, cku $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(ctc.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<in> b(aqh $$0, cku $$1) {
      in.a $$2 = new in.a();
      Optional<in> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dn(), $$5, $$6, $$7);
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

   private boolean a(in $$0, aqh $$1) {
      dqh $$2 = $$1.a_($$0);
      dde $$3 = $$2.b();
      return $$3 instanceof dez && !((dez)$$3).h($$2);
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      this.a($$1);
      $$1.a(bro.a, new csz(ctc.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cku $$0) {
      this.g.ifPresent($$1 -> {
         btv $$2 = new btv($$1);
         $$0.dQ().a(cbd.n, $$2);
         $$0.dQ().a(cbd.m, new cbg($$2, 0.5F, 1));
      });
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      $$1.a(bro.a, csz.i);
      this.e = (long)$$1.ai;
   }

   protected void d(aqh $$0, cku $$1, long $$2) {
      in $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dl(), 1.0)) {
         csz $$4 = csz.i;
         bpv $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            csz $$8 = $$5.a($$7);
            if ($$8.a(ctc.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.d() && cqz.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
