import java.util.List;
import javax.annotation.Nullable;

public class cyh extends czu {
   private final bxc<? extends cui> a;

   public cyh(bxc<? extends cui> $$0, czu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      ffo $$4 = a($$0, $$1, dje.b.c);
      if ($$4.d() == ffo.a.a) {
         return bur.e;
      } else {
         ffq $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwt> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bxa.h);
         if (!$$7.isEmpty()) {
            ffq $$8 = $$1.bD();

            for (bwt $$9 : $$7) {
               ffl $$10 = $$9.cR().g((double)$$9.bR());
               if ($$10.d($$8)) {
                  return bur.e;
               }
            }
         }

         if ($$4.d() == ffo.a.b) {
            cui $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bur.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bur.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ege.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awz.c.b(this));
                  return bur.a;
               }
            }
         } else {
            return bur.e;
         }
      }
   }

   @Nullable
   private cui a(djx $$0, ffo $$1, czy $$2, crx $$3) {
      cui $$4 = this.a.a($$0, bxb.m);
      if ($$4 != null) {
         ffq $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ars $$6) {
            bxc.<cui>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
