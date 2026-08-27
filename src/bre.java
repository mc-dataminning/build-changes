import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bre extends boc<cev> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hx> g = Optional.empty();

   public bre() {
      super(ImmutableMap.of(bvn.n, bvo.b, bvn.m, bvo.b));
   }

   protected boolean a(and $$0, cev $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.A().a_(cnb.rv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hx> b(and $$0, cev $$1) {
      hx.a $$2 = new hx.a();
      Optional<hx> $$3 = Optional.empty();
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

   private boolean a(hx $$0, and $$1) {
      djh $$2 = $$1.a_($$0);
      cwq $$3 = $$2.b();
      return $$3 instanceof cyl && !((cyl)$$3).h($$2);
   }

   protected void b(and $$0, cev $$1, long $$2) {
      this.a($$1);
      $$1.a(bma.a, new cmy(cnb.rv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cev $$0) {
      this.g.ifPresent($$1 -> {
         bof $$2 = new bof($$1);
         $$0.dO().a(bvn.n, $$2);
         $$0.dO().a(bvn.m, new bvq($$2, 0.5F, 1));
      });
   }

   protected void c(and $$0, cev $$1, long $$2) {
      $$1.a(bma.a, cmy.f);
      this.e = (long)$$1.ah;
   }

   protected void d(and $$0, cev $$1, long $$2) {
      hx $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         cmy $$4 = cmy.f;
         bkj $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cmy $$8 = $$5.a($$7);
            if ($$8.a(cnb.rv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && ckt.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
