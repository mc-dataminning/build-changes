import java.util.List;
import java.util.function.Predicate;

public class csd extends cty {
   private static final Predicate<bsh> a = bsm.f.and(bsh::bB);
   private final coi.b b;
   private final boolean c;

   public csd(boolean $$0, coi.b $$1, cty.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      ewf $$4 = a($$0, $$1, dbp.b.c);
      if ($$4.c() == ewf.a.a) {
         return bqi.c($$3);
      } else {
         ewh $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bsh> $$7 = $$0.a($$1, $$1.cM().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ewh $$8 = $$1.bz();

            for (bsh $$9 : $$7) {
               ewc $$10 = $$9.cM().g((double)$$9.bM());
               if ($$10.d($$8)) {
                  return bqi.c($$3);
               }
            }
         }

         if ($$4.c() == ewf.a.b) {
            coi $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.s($$1.dH());
            if (!$$0.a($$11, $$11.cM())) {
               return bqi.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dxh.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avr.c.b(this));
               return bqi.a($$3, $$0.x_());
            }
         } else {
            return bqi.c($$3);
         }
      }
   }

   private coi a(dcg $$0, ewf $$1, cud $$2, cml $$3) {
      ewh $$4 = $$1.e();
      coi $$5 = (coi)(this.c ? new coj($$0, $$4.c, $$4.d, $$4.e) : new coi($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqm $$6) {
         bsn.<coi>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
