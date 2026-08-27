import java.util.List;
import java.util.function.Predicate;

public class clb extends cnb {
   private static final Predicate<blw> a = bmb.f.and(blw::bt);
   private final chk.b b;
   private final boolean c;

   public clb(boolean $$0, chk.b $$1, cnb.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      ema $$4 = a($$0, $$1, ctg.b.c);
      if ($$4.c() == ema.a.a) {
         return bkd.c($$3);
      } else {
         emc $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<blw> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            emc $$8 = $$1.br();

            for (blw $$9 : $$7) {
               elx $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bkd.c($$3);
               }
            }
         }

         if ($$4.c() == ema.a.b) {
            chk $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dB());
            if (!$$0.a($$11, $$11.cH())) {
               return bkd.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dnz.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(asd.c.b(this));
               return bkd.a($$3, $$0.y_());
            }
         } else {
            return bkd.c($$3);
         }
      }
   }

   private chk a(ctx $$0, ema $$1, cng $$2, cfq $$3) {
      emc $$4 = $$1.e();
      chk $$5 = (chk)(this.c ? new chl($$0, $$4.c, $$4.d, $$4.e) : new chk($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof ane $$6) {
         bmc.<chk>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
