import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byl extends bvj<cml> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<iz> g = Optional.empty();

   public byl() {
      super(ImmutableMap.of(ccu.n, ccv.b, ccu.m, ccv.b));
   }

   protected boolean a(arf $$0, cml $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(cut.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arf $$0, cml $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<iz> b(arf $$0, cml $$1) {
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

   private boolean a(iz $$0, arf $$1) {
      dsd $$2 = $$1.a_($$0);
      dfa $$3 = $$2.b();
      return $$3 instanceof dgv && !((dgv)$$3).h($$2);
   }

   protected void b(arf $$0, cml $$1, long $$2) {
      this.a($$1);
      $$1.a(btc.a, new cuq(cut.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cml $$0) {
      this.g.ifPresent($$1 -> {
         bvm $$2 = new bvm($$1);
         $$0.dS().a(ccu.n, $$2);
         $$0.dS().a(ccu.m, new ccx($$2, 0.5F, 1));
      });
   }

   protected void c(arf $$0, cml $$1, long $$2) {
      $$1.a(btc.a, cuq.l);
      this.e = (long)$$1.ai;
   }

   protected void d(arf $$0, cml $$1, long $$2) {
      iz $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dn(), 1.0)) {
         cuq $$4 = cuq.l;
         bre $$5 = $$1.y();
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
