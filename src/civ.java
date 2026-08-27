import java.util.List;
import java.util.function.Predicate;

public class civ extends ckw {
   private static final Predicate<bki> a = bkl.f.and(bki::br);
   private final cff.b b;
   private final boolean c;

   public civ(boolean $$0, cff.b $$1, ckw.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      ejg $$4 = a($$0, $$1, crb.b.c);
      if ($$4.c() == ejg.a.a) {
         return bir.c($$3);
      } else {
         eji $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bki> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eji $$8 = $$1.bp();

            for (bki $$9 : $$7) {
               ejd $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bir.c($$3);
               }
            }
         }

         if ($$4.c() == ejg.a.b) {
            cff $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dB());
            if (!$$0.a($$11, $$11.cG())) {
               return bir.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dlg.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(aqx.c.b(this));
               return bir.a($$3, $$0.x_());
            }
         } else {
            return bir.c($$3);
         }
      }
   }

   private cff a(crs $$0, ejg $$1, clb $$2, cdm $$3) {
      eji $$4 = $$1.e();
      cff $$5 = (cff)(this.c ? new cfg($$0, $$4.c, $$4.d, $$4.e) : new cff($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof ama $$6) {
         bkm.<cff>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
