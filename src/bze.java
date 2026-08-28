import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bze extends bwc<cnh> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<je> g = Optional.empty();

   public bze() {
      super(ImmutableMap.of(cdn.n, cdo.b, cdn.m, cdo.b));
   }

   protected boolean a(arh $$0, cnh $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.y().a_(cvt.rz) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<je> b(arh $$0, cnh $$1) {
      je.a $$2 = new je.a();
      Optional<je> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.ds(), $$5, $$6, $$7);
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

   private boolean a(je $$0, arh $$1) {
      duo $$2 = $$1.a_($$0);
      dhj $$3 = $$2.b();
      return $$3 instanceof dje && !((dje)$$3).i($$2);
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      this.a($$1);
      $$1.a(btw.a, new cvp(cvt.rz));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cnh $$0) {
      this.g.ifPresent($$1 -> {
         bwf $$2 = new bwf($$1);
         $$0.dX().a(cdn.n, $$2);
         $$0.dX().a(cdn.m, new cdq($$2, 0.5F, 1));
      });
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      $$1.a(btw.a, cvp.k);
      this.e = (long)$$1.ag;
   }

   protected void d(arh $$0, cnh $$1, long $$2) {
      je $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dq(), 1.0)) {
         cvp $$4 = cvp.k;
         brw $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cvp $$8 = $$5.a($$7);
            if ($$8.a(cvt.rz)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && ctt.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
