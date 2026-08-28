import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byj extends bvh<cmj> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iz> g = Optional.empty();

   public byj() {
      super(ImmutableMap.of(ccs.n, cct.b, ccs.m, cct.b));
   }

   protected boolean a(are $$0, cmj $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(cur.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(are $$0, cmj $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iz> b(are $$0, cmj $$1) {
      iz.a $$2 = new iz.a();
      Optional<iz> $$3 = Optional.empty();
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

   private boolean a(iz $$0, are $$1) {
      dsb $$2 = $$1.a_($$0);
      dey $$3 = $$2.b();
      return $$3 instanceof dgt && !((dgt)$$3).h($$2);
   }

   protected void b(are $$0, cmj $$1, long $$2) {
      this.a($$1);
      $$1.a(bta.a, new cuo(cur.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cmj $$0) {
      this.g.ifPresent($$1 -> {
         bvk $$2 = new bvk($$1);
         $$0.dS().a(ccs.n, $$2);
         $$0.dS().a(ccs.m, new ccv($$2, 0.5F, 1));
      });
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      $$1.a(bta.a, cuo.l);
      this.e = (long)$$1.ai;
   }

   protected void d(are $$0, cmj $$1, long $$2) {
      iz $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dn(), 1.0)) {
         cuo $$4 = cuo.l;
         brc $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cuo $$8 = $$5.a($$7);
            if ($$8.a(cur.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && cso.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
