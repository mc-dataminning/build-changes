import javax.annotation.Nullable;

public interface cib extends cku {
   biq g();

   default aoy aj_() {
      return aoz.af;
   }

   default bgu<cja> a(civ $$0, cpq $$1, cbp $$2, bgs $$3) {
      cja $$4 = $$2.b($$3);
      biq $$5 = bjd.h($$4);
      cja $$6 = $$2.c($$5);
      if ((!cnl.d($$6) || $$2.f()) && !cja.a($$4, $$6)) {
         if (!$$1.r_()) {
            $$2.b(apj.c.b($$0));
         }

         cja $$7 = $$6.b() ? $$4 : $$6.c();
         cja $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bgu.a($$7, $$1.r_());
      } else {
         return bgu.d($$4);
      }
   }

   @Nullable
   static cib c_(cja $$0) {
      civ $$3 = $$0.d();
      if ($$3 instanceof cib) {
         return (cib)$$3;
      } else {
         if ($$0.d() instanceof cgt $$2) {
            csq var6 = $$2.e();
            if (var6 instanceof cib) {
               return (cib)var6;
            }
         }

         return null;
      }
   }
}
