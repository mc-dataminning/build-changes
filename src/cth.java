import javax.annotation.Nullable;

public interface cth {
   bsc k();

   default ja<avn> ap_() {
      return avo.ax;
   }

   default bqb<cuh> a(cuc $$0, dca $$1, cly $$2, bpz $$3) {
      cuh $$4 = $$2.b($$3);
      bsc $$5 = bsq.h($$4);
      if (!$$2.c($$5)) {
         return bqb.c($$4);
      } else {
         cuh $$6 = $$2.d($$5);
         if ((!dae.f($$6) || $$2.f()) && !cuh.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avz.c.b($$0));
            }

            cuh $$7 = $$6.d() ? $$4 : $$6.e();
            cuh $$8 = $$2.f() ? $$4.r() : $$4.e();
            $$2.a($$5, $$8);
            return bqb.a($$7, $$1.x_());
         } else {
            return bqb.d($$4);
         }
      }
   }

   @Nullable
   static cth c_(cuh $$0) {
      cuc $$3 = $$0.f();
      if ($$3 instanceof cth) {
         return (cth)$$3;
      } else {
         if ($$0.f() instanceof csc $$2) {
            dfc var6 = $$2.d();
            if (var6 instanceof cth) {
               return (cth)var6;
            }
         }

         return null;
      }
   }
}
