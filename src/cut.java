import java.util.List;
import javax.annotation.Nullable;

public class cut extends cwi {
   private final bus<? extends cqr> a;

   public cut(bus<? extends cqr> $$0, cwi.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      ezw $$4 = a($$0, $$1, deu.b.c);
      if ($$4.d() == ezw.a.a) {
         return bsk.e;
      } else {
         ezy $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bul> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), buq.h);
         if (!$$7.isEmpty()) {
            ezy $$8 = $$1.bF();

            for (bul $$9 : $$7) {
               ezt $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bsk.e;
               }
            }
         }

         if ($$4.d() == ezw.a.b) {
            cqr $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bsk.d;
            } else {
               $$11.v($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bsk.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ear.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awx.c.b(this));
                  return bsk.a;
               }
            }
         } else {
            return bsk.e;
         }
      }
   }

   @Nullable
   private cqr a(dfm $$0, ezw $$1, cwm $$2, cou $$3) {
      cqr $$4 = this.a.a($$0, bur.m);
      if ($$4 != null) {
         ezy $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arp $$6) {
            bus.<cqr>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
