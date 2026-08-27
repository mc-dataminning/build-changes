import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvy extends bsw<cjy> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<im> g = Optional.empty();

   public bvy() {
      super(ImmutableMap.of(cah.n, cai.b, cah.m, cai.b));
   }

   protected boolean a(aqe $$0, cjy $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(csg.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<im> b(aqe $$0, cjy $$1) {
      im.a $$2 = new im.a();
      Optional<im> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dn(), $$5, $$6, $$7);
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

   private boolean a(im $$0, aqe $$1) {
      dpy $$2 = $$1.a_($$0);
      dcv $$3 = $$2.b();
      return $$3 instanceof deq && !((deq)$$3).h($$2);
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      this.a($$1);
      $$1.a(bqs.a, new csd(csg.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cjy $$0) {
      this.g.ifPresent($$1 -> {
         bsz $$2 = new bsz($$1);
         $$0.dQ().a(cah.n, $$2);
         $$0.dQ().a(cah.m, new cak($$2, 0.5F, 1));
      });
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      $$1.a(bqs.a, csd.i);
      this.e = (long)$$1.ai;
   }

   protected void d(aqe $$0, cjy $$1, long $$2) {
      im $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dl(), 1.0)) {
         csd $$4 = csd.i;
         boz $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            csd $$8 = $$5.a($$7);
            if ($$8.a(csg.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.d() && cqd.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
