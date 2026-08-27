import javax.annotation.Nullable;

public interface cls extends col {
   blu g();

   default arl as_() {
      return arm.af;
   }

   default bjw<cmr> a(cmm $$0, cti $$1, cfb $$2, bju $$3) {
      cmr $$4 = $$2.b($$3);
      blu $$5 = bmh.h($$4);
      cmr $$6 = $$2.c($$5);
      if ((!cre.d($$6) || $$2.f()) && !cmr.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(arw.c.b($$0));
         }

         cmr $$7 = $$6.b() ? $$4 : $$6.c();
         cmr $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bjw.a($$7, $$1.y_());
      } else {
         return bjw.d($$4);
      }
   }

   @Nullable
   static cls c_(cmr $$0) {
      cmm $$3 = $$0.d();
      if ($$3 instanceof cls) {
         return (cls)$$3;
      } else {
         if ($$0.d() instanceof ckk $$2) {
            cwj var6 = $$2.e();
            if (var6 instanceof cls) {
               return (cls)var6;
            }
         }

         return null;
      }
   }
}
