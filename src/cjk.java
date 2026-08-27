import javax.annotation.Nullable;

public interface cjk extends cmd {
   bjy g();

   default aqc ar_() {
      return aqd.af;
   }

   default bic<ckj> a(cke $$0, cqz $$1, ccx $$2, bia $$3) {
      ckj $$4 = $$2.b($$3);
      bjy $$5 = bkl.h($$4);
      ckj $$6 = $$2.c($$5);
      if ((!cov.d($$6) || $$2.f()) && !ckj.a($$4, $$6)) {
         if (!$$1.x_()) {
            $$2.b(aqn.c.b($$0));
         }

         ckj $$7 = $$6.b() ? $$4 : $$6.c();
         ckj $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bic.a($$7, $$1.x_());
      } else {
         return bic.d($$4);
      }
   }

   @Nullable
   static cjk c_(ckj $$0) {
      cke $$3 = $$0.d();
      if ($$3 instanceof cjk) {
         return (cjk)$$3;
      } else {
         if ($$0.d() instanceof cic $$2) {
            cua var6 = $$2.e();
            if (var6 instanceof cjk) {
               return (cjk)var6;
            }
         }

         return null;
      }
   }
}
