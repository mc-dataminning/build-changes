import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cat extends bxr<cpd> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ji> g = Optional.empty();

   public cat() {
      super(ImmutableMap.of(cfc.n, cfd.b, cfc.m, cfd.b));
   }

   protected boolean a(ard $$0, cpd $$1) {
      if ($$1.af % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.af)) {
         if ($$1.n().a_(cxl.sx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ji> b(ard $$0, cpd $$1) {
      ji.a $$2 = new ji.a();
      Optional<ji> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.du(), $$5, $$6, $$7);
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

   private boolean a(ji $$0, ard $$1) {
      dxq $$2 = $$1.a_($$0);
      dke $$3 = $$2.b();
      return $$3 instanceof dma && !((dma)$$3).i($$2);
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      this.a($$1);
      $$1.a(bvj.a, new cxh(cxl.sx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cpd $$0) {
      this.g.ifPresent($$1 -> {
         bxu $$2 = new bxu($$1);
         $$0.ea().a(cfc.n, $$2);
         $$0.ea().a(cfc.m, new cff($$2, 0.5F, 1));
      });
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      $$1.a(bvj.a, cxh.k);
      this.e = (long)$$1.af;
   }

   protected void d(ard $$0, cpd $$1, long $$2) {
      ji $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.ds(), 1.0)) {
         cxh $$4 = cxh.k;
         btf $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cxh $$8 = $$5.a($$7);
            if ($$8.a(cxl.sx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && cvq.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
