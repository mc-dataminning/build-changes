import javax.annotation.Nullable;

public interface cim extends clf {
   bjb g();

   default apf ao_() {
      return apg.af;
   }

   default bhf<cjl> a(cjg $$0, cqb $$1, cca $$2, bhd $$3) {
      cjl $$4 = $$2.b($$3);
      bjb $$5 = bjo.h($$4);
      cjl $$6 = $$2.c($$5);
      if ((!cnw.d($$6) || $$2.f()) && !cjl.a($$4, $$6)) {
         if (!$$1.w_()) {
            $$2.b(apq.c.b($$0));
         }

         cjl $$7 = $$6.b() ? $$4 : $$6.c();
         cjl $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bhf.a($$7, $$1.w_());
      } else {
         return bhf.d($$4);
      }
   }

   @Nullable
   static cim c_(cjl $$0) {
      cjg $$3 = $$0.d();
      if ($$3 instanceof cim) {
         return (cim)$$3;
      } else {
         if ($$0.d() instanceof che $$2) {
            ctc var6 = $$2.e();
            if (var6 instanceof cim) {
               return (cim)var6;
            }
         }

         return null;
      }
   }
}
