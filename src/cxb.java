import java.util.List;
import javax.annotation.Nullable;

public class cxb extends cyo {
   private final bwj<? extends ctc> a;

   public cxb(bwj<? extends ctc> $$0, cyo.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      fdu $$4 = a($$0, $$1, dhy.b.c);
      if ($$4.d() == fdu.a.a) {
         return bty.e;
      } else {
         fdw $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwa> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bwh.h);
         if (!$$7.isEmpty()) {
            fdw $$8 = $$1.bE();

            for (bwa $$9 : $$7) {
               fdr $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bty.e;
               }
            }
         }

         if ($$4.d() == fdu.a.b) {
            ctc $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bty.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bty.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, eeo.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awv.c.b(this));
                  return bty.a;
               }
            }
         } else {
            return bty.e;
         }
      }
   }

   @Nullable
   private ctc a(dip $$0, fdu $$1, cys $$2, cqs $$3) {
      ctc $$4 = this.a.a($$0, bwi.m);
      if ($$4 != null) {
         fdw $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof aro $$6) {
            bwj.<ctc>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
