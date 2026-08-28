import javax.annotation.Nullable;

public interface ctr {
   btb m();

   default ji<avz> n() {
      return awa.as;
   }

   default bqv<cup> a(cuk $$0, dby $$1, cmx $$2, bqt $$3) {
      cup $$4 = $$2.b($$3);
      btb $$5 = btr.h($$4);
      if (!$$2.d($$5)) {
         return bqv.c($$4);
      } else {
         cup $$6 = $$2.a($$5);
         if ((!dab.f($$6) || $$2.f()) && !cup.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awk.c.b($$0));
            }

            cup $$7 = $$6.e() ? $$4 : $$6.f();
            cup $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqv.a($$7, $$1.x_());
         } else {
            return bqv.d($$4);
         }
      }
   }

   @Nullable
   static ctr c_(cup $$0) {
      cuk $$3 = $$0.g();
      if ($$3 instanceof ctr) {
         return (ctr)$$3;
      } else {
         if ($$0.g() instanceof csn $$2) {
            dez var6 = $$2.d();
            if (var6 instanceof ctr) {
               return (ctr)var6;
            }
         }

         return null;
      }
   }
}
