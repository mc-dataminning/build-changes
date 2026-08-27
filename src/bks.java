import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bks extends bhr<byb> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gu> g = Optional.empty();

   public bks() {
      super(ImmutableMap.of(bpb.n, bpc.b, bpb.m, bpc.b));
   }

   protected boolean a(aif $$0, byb $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.w().a_(cgc.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aif $$0, byb $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gu> b(aif $$0, byb $$1) {
      gu.a $$2 = new gu.a();
      Optional<gu> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.di(), $$5, $$6, $$7);
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

   private boolean a(gu $$0, aif $$1) {
      dcb $$2 = $$1.a_($$0);
      cpn $$3 = $$2.b();
      return $$3 instanceof cre && !((cre)$$3).h($$2);
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      this.a($$1);
      $$1.a(bfo.a, new cfz(cgc.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(byb $$0) {
      this.g.ifPresent($$1 -> {
         bhu $$2 = new bhu($$1);
         $$0.dK().a(bpb.n, $$2);
         $$0.dK().a(bpb.m, new bpe($$2, 0.5F, 1));
      });
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      $$1.a(bfo.a, cfz.b);
      this.e = (long)$$1.ag;
   }

   protected void d(aif $$0, byb $$1, long $$2) {
      gu $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dg(), 1.0)) {
         cfz $$4 = cfz.b;
         bee $$5 = $$1.w();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cfz $$8 = $$5.a($$7);
            if ($$8.a(cgc.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cdu.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
