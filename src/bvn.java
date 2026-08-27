import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvn extends bsl<cjn> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<id> g = Optional.empty();

   public bvn() {
      super(ImmutableMap.of(bzw.n, bzx.b, bzw.m, bzx.b));
   }

   protected boolean a(apu $$0, cjn $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.y().a_(crv.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<id> b(apu $$0, cjn $$1) {
      id.a $$2 = new id.a();
      Optional<id> $$3 = Optional.empty();
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

   private boolean a(id $$0, apu $$1) {
      dpi $$2 = $$1.a_($$0);
      dch $$3 = $$2.b();
      return $$3 instanceof dec && !((dec)$$3).h($$2);
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      this.a($$1);
      $$1.a(bqh.a, new crs(crv.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cjn $$0) {
      this.g.ifPresent($$1 -> {
         bso $$2 = new bso($$1);
         $$0.dP().a(bzw.n, $$2);
         $$0.dP().a(bzw.m, new bzz($$2, 0.5F, 1));
      });
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      $$1.a(bqh.a, crs.i);
      this.e = (long)$$1.ah;
   }

   protected void d(apu $$0, cjn $$1, long $$2) {
      id $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         crs $$4 = crs.i;
         boo $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            crs $$8 = $$5.a($$7);
            if ($$8.a(crv.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.d() && cps.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
