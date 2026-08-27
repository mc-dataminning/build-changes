import java.util.List;
import java.util.function.Predicate;

public class cpr extends crn {
   private static final Predicate<bqa> a = bqf.f.and(bqa::bw);
   private final clx.b b;
   private final boolean c;

   public cpr(boolean $$0, clx.b $$1, crn.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      esh $$4 = a($$0, $$1, cyp.b.c);
      if ($$4.c() == esh.a.a) {
         return bog.c($$3);
      } else {
         esj $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bqa> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            esj $$8 = $$1.bu();

            for (bqa $$9 : $$7) {
               ese $$10 = $$9.cH().g((double)$$9.bH());
               if ($$10.d($$8)) {
                  return bog.c($$3);
               }
            }
         }

         if ($$4.c() == esh.a.b) {
            clx $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bog.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dub.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(auz.c.b(this));
               return bog.a($$3, $$0.x_());
            }
         } else {
            return bog.c($$3);
         }
      }
   }

   private clx a(czg $$0, esh $$1, crs $$2, cka $$3) {
      esj $$4 = $$1.e();
      clx $$5 = (clx)(this.c ? new cly($$0, $$4.c, $$4.d, $$4.e) : new clx($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof apu $$6) {
         bqg.<clx>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
