import javax.annotation.Nullable;

public interface cig extends ckz {
   biv g();

   default apd ao_() {
      return ape.af;
   }

   default bgz<cjf> a(cja $$0, cpv $$1, cbu $$2, bgx $$3) {
      cjf $$4 = $$2.b($$3);
      biv $$5 = bji.h($$4);
      cjf $$6 = $$2.c($$5);
      if ((!cnq.d($$6) || $$2.f()) && !cjf.a($$4, $$6)) {
         if (!$$1.w_()) {
            $$2.b(apo.c.b($$0));
         }

         cjf $$7 = $$6.b() ? $$4 : $$6.c();
         cjf $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bgz.a($$7, $$1.w_());
      } else {
         return bgz.d($$4);
      }
   }

   @Nullable
   static cig c_(cjf $$0) {
      cja $$3 = $$0.d();
      if ($$3 instanceof cig) {
         return (cig)$$3;
      } else {
         if ($$0.d() instanceof cgy $$2) {
            csv var6 = $$2.e();
            if (var6 instanceof cig) {
               return (cig)var6;
            }
         }

         return null;
      }
   }
}
