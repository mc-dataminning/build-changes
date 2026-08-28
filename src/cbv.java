import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbv extends byt<cqk> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iu> g = Optional.empty();

   public cbv() {
      super(ImmutableMap.of(cge.o, cgf.b, cge.n, cgf.b));
   }

   protected boolean a(arq $$0, cqk $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(czc.sB) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iu> b(arq $$0, cqk $$1) {
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
      dzz $$2 = $$1.a_($$0);
      dma $$3 = $$2.b();
      return $$3 instanceof dnw && !((dnw)$$3).i($$2);
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      this.a($$1);
      $$1.a(bwn.a, new cyy(czc.sB));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cqk $$0) {
      this.g.ifPresent($$1 -> {
         byw $$2 = new byw($$1);
         $$0.eb().a(cge.o, $$2);
         $$0.eb().a(cge.n, new cgh($$2, 0.5F, 1));
      });
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      $$1.a(bwn.a, cyy.k);
      this.e = (long)$$1.af;
   }

   protected void d(arq $$0, cqk $$1, long $$2) {
      iu $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dt(), 1.0)) {
         cyy $$4 = cyy.k;
         bui $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cyy $$8 = $$5.a($$7);
            if ($$8.a(czc.sB)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cxi.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
