import java.util.List;
import javax.annotation.Nullable;

public class cuu extends cwj {
   private final buq<? extends cqs> a;

   public cuu(buq<? extends cqs> $$0, cwj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      faw $$4 = a($$0, $$1, dfo.b.c);
      if ($$4.d() == faw.a.a) {
         return bsi.e;
      } else {
         fay $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<buj> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), buo.h);
         if (!$$7.isEmpty()) {
            fay $$8 = $$1.bF();

            for (buj $$9 : $$7) {
               fat $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bsi.e;
               }
            }
         }

         if ($$4.d() == faw.a.b) {
            cqs $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bsi.d;
            } else {
               $$11.v($$1.dM());
               if (!$$0.a($$11, $$11.cR())) {
                  return bsi.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ebr.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awj.c.b(this));
                  return bsi.a;
               }
            }
         } else {
            return bsi.e;
         }
      }
   }

   @Nullable
   private cqs a(dgg $$0, faw $$1, cwn $$2, cov $$3) {
      cqs $$4 = this.a.a($$0, bup.m);
      if ($$4 != null) {
         fay $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arc $$6) {
            buq.<cqs>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
