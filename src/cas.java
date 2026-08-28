import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cas extends bxq<cpa> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jh> g = Optional.empty();

   public cas() {
      super(ImmutableMap.of(cfb.n, cfc.b, cfb.m, cfc.b));
   }

   protected boolean a(arx $$0, cpa $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.t().a_(cxk.sv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jh> b(arx $$0, cpa $$1) {
      jh.a $$2 = new jh.a();
      Optional<jh> $$3 = Optional.empty();
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

   private boolean a(jh $$0, arx $$1) {
      dxo $$2 = $$1.a_($$0);
      dkd $$3 = $$2.b();
      return $$3 instanceof dlz && !((dlz)$$3).i($$2);
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      this.a($$1);
      $$1.a(bvj.a, new cxg(cxk.sv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cpa $$0) {
      this.g.ifPresent($$1 -> {
         bxt $$2 = new bxt($$1);
         $$0.ec().a(cfb.n, $$2);
         $$0.ec().a(cfb.m, new cfe($$2, 0.5F, 1));
      });
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      $$1.a(bvj.a, cxg.j);
      this.e = (long)$$1.af;
   }

   protected void d(arx $$0, cpa $$1, long $$2) {
      jh $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.du(), 1.0)) {
         cxg $$4 = cxg.j;
         bth $$5 = $$1.t();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cxg $$8 = $$5.a($$7);
            if ($$8.a(cxk.sv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cvo.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
