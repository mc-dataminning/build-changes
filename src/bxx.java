import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxx extends buv<cly> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ja> g = Optional.empty();

   public bxx() {
      super(ImmutableMap.of(ccg.n, cch.b, ccg.m, cch.b));
   }

   protected boolean a(aqm $$0, cly $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.x().a_(cug.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ja> b(aqm $$0, cly $$1) {
      ja.a $$2 = new ja.a();
      Optional<ja> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dr(), $$5, $$6, $$7);
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

   private boolean a(ja $$0, aqm $$1) {
      dsl $$2 = $$1.a_($$0);
      dfi $$3 = $$2.b();
      return $$3 instanceof dhd && !((dhd)$$3).h($$2);
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      this.a($$1);
      $$1.a(bso.a, new cud(cug.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cly $$0) {
      this.g.ifPresent($$1 -> {
         buy $$2 = new buy($$1);
         $$0.dV().a(ccg.n, $$2);
         $$0.dV().a(ccg.m, new ccj($$2, 0.5F, 1));
      });
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      $$1.a(bso.a, cud.l);
      this.e = (long)$$1.ai;
   }

   protected void d(aqm $$0, cly $$1, long $$2) {
      ja $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dp(), 1.0)) {
         cud $$4 = cud.l;
         bqq $$5 = $$1.x();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cud $$8 = $$5.a($$7);
            if ($$8.a(cug.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && cse.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
