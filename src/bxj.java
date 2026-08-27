import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxj extends buh<clj> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<io> g = Optional.empty();

   public bxj() {
      super(ImmutableMap.of(cbs.n, cbt.b, cbs.m, cbt.b));
   }

   protected boolean a(aqm $$0, clj $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(ctr.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<io> b(aqm $$0, clj $$1) {
      io.a $$2 = new io.a();
      Optional<io> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dp(), $$5, $$6, $$7);
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

   private boolean a(io $$0, aqm $$1) {
      drb $$2 = $$1.a_($$0);
      ddy $$3 = $$2.b();
      return $$3 instanceof dft && !((dft)$$3).h($$2);
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      this.a($$1);
      $$1.a(bsb.a, new cto(ctr.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(clj $$0) {
      this.g.ifPresent($$1 -> {
         buk $$2 = new buk($$1);
         $$0.dS().a(cbs.n, $$2);
         $$0.dS().a(cbs.m, new cbv($$2, 0.5F, 1));
      });
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      $$1.a(bsb.a, cto.i);
      this.e = (long)$$1.ai;
   }

   protected void d(aqm $$0, clj $$1, long $$2) {
      io $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dn(), 1.0)) {
         cto $$4 = cto.i;
         bqd $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cto $$8 = $$5.a($$7);
            if ($$8.a(ctr.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && cro.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
