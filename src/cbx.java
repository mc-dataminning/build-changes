import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbx extends byv<cqo> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iu> g = Optional.empty();

   public cbx() {
      super(ImmutableMap.of(cgg.o, cgh.b, cgg.n, cgh.b));
   }

   protected boolean a(arq $$0, cqo $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(czh.sG) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iu> b(arq $$0, cqo $$1) {
      iu.a $$2 = new iu.a();
      Optional<iu> $$3 = Optional.empty();
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

   private boolean a(iu $$0, arq $$1) {
      eah $$2 = $$1.a_($$0);
      dmf $$3 = $$2.b();
      return $$3 instanceof doc && !((doc)$$3).i($$2);
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      this.a($$1);
      $$1.a(bwp.a, new czd(czh.sG));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cqo $$0) {
      this.g.ifPresent($$1 -> {
         byy $$2 = new byy($$1);
         $$0.ec().a(cgg.o, $$2);
         $$0.ec().a(cgg.n, new cgj($$2, 0.5F, 1));
      });
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      $$1.a(bwp.a, czd.k);
      this.e = (long)$$1.af;
   }

   protected void d(arq $$0, cqo $$1, long $$2) {
      iu $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         czd $$4 = czd.k;
         buk $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            czd $$8 = $$5.a($$7);
            if ($$8.a(czh.sG)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cxn.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
