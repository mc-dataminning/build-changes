import javax.annotation.Nullable;

public interface ckk extends cnd {
   bkv g();

   default aqq ar_() {
      return aqr.af;
   }

   default biy<clj> a(cle $$0, csa $$1, cdu $$2, biw $$3) {
      clj $$4 = $$2.b($$3);
      bkv $$5 = bli.h($$4);
      clj $$6 = $$2.c($$5);
      if ((!cpw.d($$6) || $$2.f()) && !clj.a($$4, $$6)) {
         if (!$$1.x_()) {
            $$2.b(arb.c.b($$0));
         }

         clj $$7 = $$6.b() ? $$4 : $$6.c();
         clj $$8 = $$4.c();
         $$2.a($$5, $$8);
         return biy.a($$7, $$1.x_());
      } else {
         return biy.d($$4);
      }
   }

   @Nullable
   static ckk c_(clj $$0) {
      cle $$3 = $$0.d();
      if ($$3 instanceof ckk) {
         return (ckk)$$3;
      } else {
         if ($$0.d() instanceof cjc $$2) {
            cva var6 = $$2.e();
            if (var6 instanceof ckk) {
               return (ckk)var6;
            }
         }

         return null;
      }
   }
}
