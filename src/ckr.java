import java.util.List;
import java.util.function.Predicate;

public class ckr extends cms {
   private static final Predicate<blu> a = blx.f.and(blu::bt);
   private final chb.b b;
   private final boolean c;

   public ckr(boolean $$0, chb.b $$1, cms.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      elq $$4 = a($$0, $$1, csx.b.c);
      if ($$4.c() == elq.a.a) {
         return bkb.c($$3);
      } else {
         els $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<blu> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            els $$8 = $$1.br();

            for (blu $$9 : $$7) {
               eln $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bkb.c($$3);
               }
            }
         }

         if ($$4.c() == elq.a.b) {
            chb $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bkb.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dnq.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(asb.c.b(this));
               return bkb.a($$3, $$0.y_());
            }
         } else {
            return bkb.c($$3);
         }
      }
   }

   private chb a(cto $$0, elq $$1, cmx $$2, cfh $$3) {
      els $$4 = $$1.e();
      chb $$5 = (chb)(this.c ? new chc($$0, $$4.c, $$4.d, $$4.e) : new chb($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof and $$6) {
         bly.<chb>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
