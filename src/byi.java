import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byi extends bvg<cmi> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iz> g = Optional.empty();

   public byi() {
      super(ImmutableMap.of(ccr.n, ccs.b, ccr.m, ccs.b));
   }

   protected boolean a(are $$0, cmi $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(cuq.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iz> b(are $$0, cmi $$1) {
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
      dsa $$2 = $$1.a_($$0);
      dex $$3 = $$2.b();
      return $$3 instanceof dgs && !((dgs)$$3).h($$2);
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      this.a($$1);
      $$1.a(bsz.a, new cun(cuq.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cmi $$0) {
      this.g.ifPresent($$1 -> {
         bvj $$2 = new bvj($$1);
         $$0.dS().a(ccr.n, $$2);
         $$0.dS().a(ccr.m, new ccu($$2, 0.5F, 1));
      });
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      $$1.a(bsz.a, cun.l);
      this.e = (long)$$1.ai;
   }

   protected void d(are $$0, cmi $$1, long $$2) {
      iz $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dn(), 1.0)) {
         cun $$4 = cun.l;
         brb $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cun $$8 = $$5.a($$7);
            if ($$8.a(cuq.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && csn.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
