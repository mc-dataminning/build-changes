import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxl extends buj<cll> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<io> g = Optional.empty();

   public bxl() {
      super(ImmutableMap.of(cbu.n, cbv.b, cbu.m, cbv.b));
   }

   protected boolean a(aqn $$0, cll $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(ctt.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<io> b(aqn $$0, cll $$1) {
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

   private boolean a(io $$0, aqn $$1) {
      drd $$2 = $$1.a_($$0);
      dea $$3 = $$2.b();
      return $$3 instanceof dfv && !((dfv)$$3).h($$2);
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      this.a($$1);
      $$1.a(bsd.a, new ctq(ctt.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cll $$0) {
      this.g.ifPresent($$1 -> {
         bum $$2 = new bum($$1);
         $$0.dS().a(cbu.n, $$2);
         $$0.dS().a(cbu.m, new cbx($$2, 0.5F, 1));
      });
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      $$1.a(bsd.a, ctq.i);
      this.e = (long)$$1.ai;
   }

   protected void d(aqn $$0, cll $$1, long $$2) {
      io $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dn(), 1.0)) {
         ctq $$4 = ctq.i;
         bqf $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            ctq $$8 = $$5.a($$7);
            if ($$8.a(ctt.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && crq.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
