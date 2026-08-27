import javax.annotation.Nullable;

public interface cmi extends cpb {
   bmd g();

   default ars au_() {
      return art.ap;
   }

   default bkd<cng> a(cnb $$0, ctx $$1, cfq $$2, bkb $$3) {
      cng $$4 = $$2.b($$3);
      bmd $$5 = bmq.h($$4);
      cng $$6 = $$2.c($$5);
      if ((!crt.d($$6) || $$2.f()) && !cng.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(asd.c.b($$0));
         }

         cng $$7 = $$6.b() ? $$4 : $$6.c();
         cng $$8 = $$2.f() ? $$4.p() : $$4.c();
         $$2.a($$5, $$8);
         return bkd.a($$7, $$1.y_());
      } else {
         return bkd.d($$4);
      }
   }

   @Nullable
   static cmi c_(cng $$0) {
      cnb $$3 = $$0.d();
      if ($$3 instanceof cmi) {
         return (cmi)$$3;
      } else {
         if ($$0.d() instanceof cla $$2) {
            cwy var6 = $$2.e();
            if (var6 instanceof cmi) {
               return (cmi)var6;
            }
         }

         return null;
      }
   }
}
