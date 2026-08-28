import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzh extends bwf<cnk> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jf> g = Optional.empty();

   public bzh() {
      super(ImmutableMap.of(cdq.n, cdr.b, cdq.m, cdr.b));
   }

   protected boolean a(arj $$0, cnk $$1) {
      if ($$1.ag % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ag)) {
         if ($$1.y().a_(cvw.rz) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jf> b(arj $$0, cnk $$1) {
      jf.a $$2 = new jf.a();
      Optional<jf> $$3 = Optional.empty();
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

   private boolean a(jf $$0, arj $$1) {
      dus $$2 = $$1.a_($$0);
      dhm $$3 = $$2.b();
      return $$3 instanceof djh && !((djh)$$3).i($$2);
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      this.a($$1);
      $$1.a(btz.a, new cvs(cvw.rz));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cnk $$0) {
      this.g.ifPresent($$1 -> {
         bwi $$2 = new bwi($$1);
         $$0.dY().a(cdq.n, $$2);
         $$0.dY().a(cdq.m, new cdt($$2, 0.5F, 1));
      });
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      $$1.a(btz.a, cvs.k);
      this.e = (long)$$1.ag;
   }

   protected void d(arj $$0, cnk $$1, long $$2) {
      jf $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dq(), 1.0)) {
         cvs $$4 = cvs.k;
         brz $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cvs $$8 = $$5.a($$7);
            if ($$8.a(cvw.rz)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && ctw.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
