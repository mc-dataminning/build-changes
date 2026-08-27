import javax.annotation.Nullable;

public interface coa {
   bnv g();

   default atj au_() {
      return atk.ap;
   }

   default blv<coz> a(cou $$0, cvn $$1, chh $$2, blt $$3) {
      coz $$4 = $$2.b($$3);
      bnv $$5 = boi.h($$4);
      coz $$6 = $$2.c($$5);
      if ((!ctj.d($$6) || $$2.f()) && !coz.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(atu.c.b($$0));
         }

         coz $$7 = $$6.b() ? $$4 : $$6.c();
         coz $$8 = $$2.f() ? $$4.q() : $$4.c();
         $$2.a($$5, $$8);
         return blv.a($$7, $$1.y_());
      } else {
         return blv.d($$4);
      }
   }

   @Nullable
   static coa c_(coz $$0) {
      cou $$3 = $$0.d();
      if ($$3 instanceof coa) {
         return (coa)$$3;
      } else {
         if ($$0.d() instanceof cms $$2) {
            cyo var6 = $$2.e();
            if (var6 instanceof coa) {
               return (coa)var6;
            }
         }

         return null;
      }
   }
}
