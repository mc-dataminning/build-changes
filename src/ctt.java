import javax.annotation.Nullable;

public interface ctt {
   btd m();

   default ji<avz> n() {
      return awa.as;
   }

   default bqx<cur> a(cum $$0, dca $$1, cmz $$2, bqv $$3) {
      cur $$4 = $$2.b($$3);
      btd $$5 = btt.h($$4);
      if (!$$2.d($$5)) {
         return bqx.c($$4);
      } else {
         cur $$6 = $$2.a($$5);
         if ((!dad.f($$6) || $$2.f()) && !cur.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awk.c.b($$0));
            }

            cur $$7 = $$6.e() ? $$4 : $$6.f();
            cur $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqx.a($$7, $$1.x_());
         } else {
            return bqx.d($$4);
         }
      }
   }

   @Nullable
   static ctt c_(cur $$0) {
      cum $$3 = $$0.g();
      if ($$3 instanceof ctt) {
         return (ctt)$$3;
      } else {
         if ($$0.g() instanceof csp $$2) {
            dfb var6 = $$2.d();
            if (var6 instanceof ctt) {
               return (ctt)var6;
            }
         }

         return null;
      }
   }
}
