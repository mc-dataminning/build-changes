import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxt extends bur<clu> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ja> g = Optional.empty();

   public bxt() {
      super(ImmutableMap.of(ccc.n, ccd.b, ccc.m, ccd.b));
   }

   protected boolean a(aqk $$0, clu $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.y().a_(cud.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ja> b(aqk $$0, clu $$1) {
      ja.a $$2 = new ja.a();
      Optional<ja> $$3 = Optional.empty();
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

   private boolean a(ja $$0, aqk $$1) {
      dsh $$2 = $$1.a_($$0);
      dff $$3 = $$2.b();
      return $$3 instanceof dha && !((dha)$$3).h($$2);
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      this.a($$1);
      $$1.a(bsk.a, new cua(cud.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(clu $$0) {
      this.g.ifPresent($$1 -> {
         buu $$2 = new buu($$1);
         $$0.dT().a(ccc.n, $$2);
         $$0.dT().a(ccc.m, new ccf($$2, 0.5F, 1));
      });
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      $$1.a(bsk.a, cua.l);
      this.e = (long)$$1.ai;
   }

   protected void d(aqk $$0, clu $$1, long $$2) {
      ja $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dn(), 1.0)) {
         cua $$4 = cua.l;
         bqm $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cua $$8 = $$5.a($$7);
            if ($$8.a(cud.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && csa.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
