import javax.annotation.Nullable;

public interface cuv {
   btz l();

   default jo<awf> m() {
      return awg.as;
   }

   default brs a(cvn $$0, dej $$1, cnx $$2, brr $$3) {
      cvs $$4 = $$2.b($$3);
      btz $$5 = $$2.g($$4);
      if (!$$2.e($$5)) {
         return brs.e;
      } else {
         cvs $$6 = $$2.a($$5);
         if ((!dbp.a($$6, dbo.E) || $$2.f()) && !cvs.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awq.c.b($$0));
            }

            cvs $$7 = $$6.f() ? $$4 : $$6.g();
            cvs $$8 = $$2.f() ? $$4.u() : $$4.g();
            $$2.a($$5, $$8);
            return brs.a.a($$7);
         } else {
            return brs.d;
         }
      }
   }

   @Nullable
   static cuv c_(cvs $$0) {
      cvn $$3 = $$0.h();
      if ($$3 instanceof cuv) {
         return (cuv)$$3;
      } else {
         if ($$0.h() instanceof ctu $$2) {
            dhm var6 = $$2.d();
            if (var6 instanceof cuv) {
               return (cuv)var6;
            }
         }

         return null;
      }
   }
}
