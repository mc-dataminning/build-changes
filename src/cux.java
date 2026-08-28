import java.util.List;
import javax.annotation.Nullable;

public class cux extends cwm {
   private final but<? extends cqv> a;

   public cux(but<? extends cqv> $$0, cwm.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      faz $$4 = a($$0, $$1, dfr.b.c);
      if ($$4.d() == faz.a.a) {
         return bsl.e;
      } else {
         fbb $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bum> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bur.h);
         if (!$$7.isEmpty()) {
            fbb $$8 = $$1.bF();

            for (bum $$9 : $$7) {
               faw $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bsl.e;
               }
            }
         }

         if ($$4.d() == faz.a.b) {
            cqv $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bsl.d;
            } else {
               $$11.v($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bsl.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ebu.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awk.c.b(this));
                  return bsl.a;
               }
            }
         } else {
            return bsl.e;
         }
      }
   }

   @Nullable
   private cqv a(dgj $$0, faz $$1, cwq $$2, coy $$3) {
      cqv $$4 = this.a.a($$0, bus.m);
      if ($$4 != null) {
         fbb $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ard $$6) {
            but.<cqv>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
