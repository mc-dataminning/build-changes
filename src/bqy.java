import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqy extends bnw<ceo> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hx> g = Optional.empty();

   public bqy() {
      super(ImmutableMap.of(bvh.n, bvi.b, bvh.m, bvi.b));
   }

   protected boolean a(amz $$0, ceo $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.A().a_(cmu.rv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(amz $$0, ceo $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hx> b(amz $$0, ceo $$1) {
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

   private boolean a(hx $$0, amz $$1) {
      dja $$2 = $$1.a_($$0);
      cwj $$3 = $$2.b();
      return $$3 instanceof cye && !((cye)$$3).h($$2);
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      this.a($$1);
      $$1.a(blu.a, new cmr(cmu.rv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(ceo $$0) {
      this.g.ifPresent($$1 -> {
         bnz $$2 = new bnz($$1);
         $$0.dO().a(bvh.n, $$2);
         $$0.dO().a(bvh.m, new bvk($$2, 0.5F, 1));
      });
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      $$1.a(blu.a, cmr.f);
      this.e = (long)$$1.ah;
   }

   protected void d(amz $$0, ceo $$1, long $$2) {
      hx $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         cmr $$4 = cmr.f;
         bkd $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cmr $$8 = $$5.a($$7);
            if ($$8.a(cmu.rv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && ckm.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
