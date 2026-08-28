import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byj extends bvh<cmk> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jd> g = Optional.empty();

   public byj() {
      super(ImmutableMap.of(ccs.n, cct.b, ccs.m, cct.b));
   }

   protected boolean a(aqu $$0, cmk $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.x().a_(cut.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jd> b(aqu $$0, cmk $$1) {
      jd.a $$2 = new jd.a();
      Optional<jd> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.do(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.z.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.j());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(jd $$0, aqu $$1) {
      dtc $$2 = $$1.a_($$0);
      dfy $$3 = $$2.b();
      return $$3 instanceof dht && !((dht)$$3).h($$2);
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      this.a($$1);
      $$1.a(bsy.a, new cuq(cut.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cmk $$0) {
      this.g.ifPresent($$1 -> {
         bvk $$2 = new bvk($$1);
         $$0.dT().a(ccs.n, $$2);
         $$0.dT().a(ccs.m, new ccv($$2, 0.5F, 1));
      });
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      $$1.a(bsy.a, cuq.l);
      this.e = (long)$$1.ai;
   }

   protected void d(aqu $$0, cmk $$1, long $$2) {
      jd $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dm(), 1.0)) {
         cuq $$4 = cuq.l;
         bra $$5 = $$1.x();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cuq $$8 = $$5.a($$7);
            if ($$8.a(cut.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && csq.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
