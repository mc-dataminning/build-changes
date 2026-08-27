import java.util.List;
import java.util.function.Predicate;

public class cog extends cqf {
   private static final Predicate<bow> a = bpb.f.and(bow::bw);
   private final ckp.b b;
   private final boolean c;

   public cog(boolean $$0, ckp.b $$1, cqf.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      epp $$4 = a($$0, $$1, cwi.b.c);
      if ($$4.c() == epp.a.a) {
         return bnd.c($$3);
      } else {
         epr $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bow> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            epr $$8 = $$1.bu();

            for (bow $$9 : $$7) {
               epm $$10 = $$9.cH().g((double)$$9.bH());
               if ($$10.d($$8)) {
                  return bnd.c($$3);
               }
            }
         }

         if ($$4.c() == epp.a.b) {
            ckp $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bnd.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, drn.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(aui.c.b(this));
               return bnd.a($$3, $$0.x_());
            }
         } else {
            return bnd.c($$3);
         }
      }
   }

   private ckp a(cwz $$0, epp $$1, cqk $$2, cis $$3) {
      epr $$4 = $$1.e();
      ckp $$5 = (ckp)(this.c ? new ckq($$0, $$4.c, $$4.d, $$4.e) : new ckp($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof apf $$6) {
         bpc.<ckp>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
