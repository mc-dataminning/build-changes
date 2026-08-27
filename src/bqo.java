import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqo extends bnm<cee> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hv> g = Optional.empty();

   public bqo() {
      super(ImmutableMap.of(bux.n, buy.b, bux.m, buy.b));
   }

   protected boolean a(amp $$0, cee $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.A().a_(cmk.rv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hv> b(amp $$0, cee $$1) {
      hv.a $$2 = new hv.a();
      Optional<hv> $$3 = Optional.empty();
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

   private boolean a(hv $$0, amp $$1) {
      dip $$2 = $$1.a_($$0);
      cvz $$3 = $$2.b();
      return $$3 instanceof cxu && !((cxu)$$3).h($$2);
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      this.a($$1);
      $$1.a(blk.a, new cmh(cmk.rv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cee $$0) {
      this.g.ifPresent($$1 -> {
         bnp $$2 = new bnp($$1);
         $$0.dO().a(bux.n, $$2);
         $$0.dO().a(bux.m, new bva($$2, 0.5F, 1));
      });
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      $$1.a(blk.a, cmh.f);
      this.e = (long)$$1.ah;
   }

   protected void d(amp $$0, cee $$1, long $$2) {
      hv $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         cmh $$4 = cmh.f;
         bjt $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cmh $$8 = $$5.a($$7);
            if ($$8.a(cmk.rv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && ckc.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
