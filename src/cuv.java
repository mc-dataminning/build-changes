import java.util.List;
import javax.annotation.Nullable;

public class cuv extends cwk {
   private final bur<? extends cqt> a;

   public cuv(bur<? extends cqt> $$0, cwk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      fax $$4 = a($$0, $$1, dfp.b.c);
      if ($$4.d() == fax.a.a) {
         return bsj.e;
      } else {
         faz $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<buk> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bup.h);
         if (!$$7.isEmpty()) {
            faz $$8 = $$1.bF();

            for (buk $$9 : $$7) {
               fau $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bsj.e;
               }
            }
         }

         if ($$4.d() == fax.a.b) {
            cqt $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bsj.d;
            } else {
               $$11.v($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bsj.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ebs.t, $$4.g());
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
   private cqt a(dgh $$0, fax $$1, cwo $$2, cow $$3) {
      cqt $$4 = this.a.a($$0, buq.m);
      if ($$4 != null) {
         faz $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ard $$6) {
            bur.<cqt>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
