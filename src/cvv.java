import java.util.List;
import javax.annotation.Nullable;

public class cvv extends cxk {
   private final bvq<? extends crt> a;

   public cvv(bvq<? extends crt> $$0, cxk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      fbv $$4 = a($$0, $$1, dgp.b.c);
      if ($$4.d() == fbv.a.a) {
         return bti.e;
      } else {
         fbx $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bvj> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bvo.h);
         if (!$$7.isEmpty()) {
            fbx $$8 = $$1.bF();

            for (bvj $$9 : $$7) {
               fbs $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bti.e;
               }
            }
         }

         if ($$4.d() == fbv.a.b) {
            crt $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bti.d;
            } else {
               $$11.v($$1.dM());
               if (!$$0.a($$11, $$11.cR())) {
                  return bti.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ecq.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(axp.c.b(this));
                  return bti.a;
               }
            }
         } else {
            return bti.e;
         }
      }
   }

   @Nullable
   private crt a(dhh $$0, fbv $$1, cxo $$2, cpw $$3) {
      crt $$4 = this.a.a($$0, bvp.m);
      if ($$4 != null) {
         fbx $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ash $$6) {
            bvq.<crt>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
