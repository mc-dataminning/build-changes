import java.util.List;
import java.util.function.Predicate;

public class cdt extends cfu {
   private static final Predicate<bfj> a = bfm.f.and(bfj::bo);
   private final cah.b b;
   private final boolean c;

   public cdt(boolean $$0, cah.b $$1, cfu.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      eeg $$4 = a($$0, $$1, clv.b.c);
      if ($$4.c() == eeg.a.a) {
         return bdy.c($$3);
      } else {
         eei $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bfj> $$7 = $$0.a($$1, $$1.cE().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eei $$8 = $$1.bm();

            for (bfj $$9 : $$7) {
               eed $$10 = $$9.cE().g((double)$$9.bC());
               if ($$10.d($$8)) {
                  return bdy.c($$3);
               }
            }
         }

         if ($$4.c() == eeg.a.b) {
            cah $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.a_($$1.dy());
            if (!$$0.a($$11, $$11.cE())) {
               return bdy.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dgl.t, $$4.e());
                  if (!$$1.fO().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(amr.c.b(this));
               return bdy.a($$3, $$0.r_());
            }
         } else {
            return bdy.c($$3);
         }
      }
   }

   private cah a(cmm $$0, eeg $$1) {
      return (cah)(this.c ? new cai($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cah($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
