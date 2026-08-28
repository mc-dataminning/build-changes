import java.util.List;
import javax.annotation.Nullable;

public class cuw extends cwl {
   private final bur<? extends cqu> a;

   public cuw(bur<? extends cqu> $$0, cwl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      fay $$4 = a($$0, $$1, dfq.b.c);
      if ($$4.d() == fay.a.a) {
         return bsj.e;
      } else {
         fba $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<buk> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bup.h);
         if (!$$7.isEmpty()) {
            fba $$8 = $$1.bF();

            for (buk $$9 : $$7) {
               fav $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bsj.e;
               }
            }
         }

         if ($$4.d() == fay.a.b) {
            cqu $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bsj.d;
            } else {
               $$11.v($$1.dM());
               if (!$$0.a($$11, $$11.cR())) {
                  return bsj.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ebt.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awk.c.b(this));
                  return bsj.a;
               }
            }
         } else {
            return bsj.e;
         }
      }
   }

   @Nullable
   private cqu a(dgi $$0, fay $$1, cwp $$2, cox $$3) {
      cqu $$4 = this.a.a($$0, buq.m);
      if ($$4 != null) {
         fba $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arc $$6) {
            bur.<cqu>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
