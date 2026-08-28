import javax.annotation.Nullable;

public interface cte {
   bsn m();

   default jj<avg> n() {
      return avh.as;
   }

   default bqh<cuc> a(ctx $$0, dcf $$1, cmk $$2, bqf $$3) {
      cuc $$4 = $$2.b($$3);
      bsn $$5 = btd.h($$4);
      if (!$$2.d($$5)) {
         return bqh.c($$4);
      } else {
         cuc $$6 = $$2.a($$5);
         if ((!czn.a($$6, czm.E) || $$2.f()) && !cuc.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avr.c.b($$0));
            }

            cuc $$7 = $$6.e() ? $$4 : $$6.f();
            cuc $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqh.a($$7, $$1.x_());
         } else {
            return bqh.d($$4);
         }
      }
   }

   @Nullable
   static cte c_(cuc $$0) {
      ctx $$3 = $$0.g();
      if ($$3 instanceof cte) {
         return (cte)$$3;
      } else {
         if ($$0.g() instanceof csb $$2) {
            dfh var6 = $$2.d();
            if (var6 instanceof cte) {
               return (cte)var6;
            }
         }

         return null;
      }
   }
}
