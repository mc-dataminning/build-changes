import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzq extends bwo<cnt> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jg> g = Optional.empty();

   public bzq() {
      super(ImmutableMap.of(cdz.n, cea.b, cdz.m, cea.b));
   }

   protected boolean a(arm $$0, cnt $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.y().a_(cwb.rz) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jg> b(arm $$0, cnt $$1) {
      jg.a $$2 = new jg.a();
      Optional<jg> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dx(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.A.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.j());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(jg $$0, arm $$1) {
      dvd $$2 = $$1.a_($$0);
      dhy $$3 = $$2.b();
      return $$3 instanceof djt && !((djt)$$3).i($$2);
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      this.a($$1);
      $$1.a(buh.a, new cvx(cwb.rz));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cnt $$0) {
      this.g.ifPresent($$1 -> {
         bwr $$2 = new bwr($$1);
         $$0.ed().a(cdz.n, $$2);
         $$0.ed().a(cdz.m, new cec($$2, 0.5F, 1));
      });
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      $$1.a(buh.a, cvx.k);
      this.e = (long)$$1.ag;
   }

   protected void d(arm $$0, cnt $$1, long $$2) {
      jg $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dv(), 1.0)) {
         cvx $$4 = cvx.k;
         bsf $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cvx $$8 = $$5.a($$7);
            if ($$8.a(cwb.rz)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cue.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
