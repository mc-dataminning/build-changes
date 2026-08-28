import java.util.List;
import javax.annotation.Nullable;

public class cxh extends cyu {
   private final bwm<? extends cti> a;

   public cxh(bwm<? extends cti> $$0, cyu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      feg $$4 = a($$0, $$1, die.b.c);
      if ($$4.d() == feg.a.a) {
         return bub.e;
      } else {
         fei $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwd> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bwk.h);
         if (!$$7.isEmpty()) {
            fei $$8 = $$1.bE();

            for (bwd $$9 : $$7) {
               fed $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bub.e;
               }
            }
         }

         if ($$4.d() == feg.a.b) {
            cti $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bub.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bub.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, eez.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awx.c.b(this));
                  return bub.a;
               }
            }
         } else {
            return bub.e;
         }
      }
   }

   @Nullable
   private cti a(div $$0, feg $$1, cyy $$2, cqy $$3) {
      cti $$4 = this.a.a($$0, bwl.m);
      if ($$4 != null) {
         fei $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arq $$6) {
            bwm.<cti>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
