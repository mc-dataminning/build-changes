import javax.annotation.Nullable;

public interface ctf {
   bso m();

   default jj<avg> n() {
      return avh.as;
   }

   default bqi<cud> a(cty $$0, dcg $$1, cml $$2, bqg $$3) {
      cud $$4 = $$2.b($$3);
      bso $$5 = $$2.h($$4);
      if (!$$2.d($$5)) {
         return bqi.c($$4);
      } else {
         cud $$6 = $$2.a($$5);
         if ((!czo.a($$6, czn.E) || $$2.f()) && !cud.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avr.c.b($$0));
            }

            cud $$7 = $$6.e() ? $$4 : $$6.f();
            cud $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqi.a($$7, $$1.x_());
         } else {
            return bqi.d($$4);
         }
      }
   }

   @Nullable
   static ctf c_(cud $$0) {
      cty $$3 = $$0.g();
      if ($$3 instanceof ctf) {
         return (ctf)$$3;
      } else {
         if ($$0.g() instanceof csc $$2) {
            dfi var6 = $$2.d();
            if (var6 instanceof ctf) {
               return (ctf)var6;
            }
         }

         return null;
      }
   }
}
