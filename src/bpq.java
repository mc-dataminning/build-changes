import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bpq extends bmp<ccz> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ht> g = Optional.empty();

   public bpq() {
      super(ImmutableMap.of(btz.n, bua.b, btz.m, bua.b));
   }

   protected boolean a(ama $$0, ccz $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.y().a_(cle.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ama $$0, ccz $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ht> b(ama $$0, ccz $$1) {
      ht.a $$2 = new ht.a();
      Optional<ht> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dl(), $$5, $$6, $$7);
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

   private boolean a(ht $$0, ama $$1) {
      dgw $$2 = $$1.a_($$0);
      cut $$3 = $$2.b();
      return $$3 instanceof cwn && !((cwn)$$3).h($$2);
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      this.a($$1);
      $$1.a(bkn.a, new clb(cle.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(ccz $$0) {
      this.g.ifPresent($$1 -> {
         bms $$2 = new bms($$1);
         $$0.dN().a(btz.n, $$2);
         $$0.dN().a(btz.m, new buc($$2, 0.5F, 1));
      });
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      $$1.a(bkn.a, clb.b);
      this.e = (long)$$1.ah;
   }

   protected void d(ama $$0, ccz $$1, long $$2) {
      ht $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dj(), 1.0)) {
         clb $$4 = clb.b;
         bix $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            clb $$8 = $$5.a($$7);
            if ($$8.a(cle.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && ciw.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
