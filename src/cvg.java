public class cvg extends cuc {
   public cvg(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      cly $$1 = $$0.o();
      if ($$1 instanceof aqu $$2) {
         if ($$2.f.d()) {
            alg $$3 = $$2.cT().aE();
            akt $$4 = new akt("potato/enter_the_potato");
            ag $$5 = $$3.a($$4);
            if ($$5 != null) {
               ai $$6 = $$2.S().b($$5);
               if (!$$6.a()) {
                  dca $$7 = $$1.dU();
                  $$2.a(xe.a("item.minecraft.potato_staff.unworthy", $$1.P_()));
                  $$7.a(null, $$7.aj().o(), null, $$1.ds(), 5.0F, true, dca.a.d);
                  return bqa.e;
               }
            }
         }

         return this.a(new cyd($$0));
      } else {
         return bqa.e;
      }
   }

   public bqa a(cyd $$0) {
      if (!$$0.b()) {
         return bqa.e;
      } else {
         dtc $$1 = dfe.eS.n();
         cly $$2 = $$0.o();
         ewz $$3 = $$2 == null ? ewz.a() : ewz.a($$2);
         if (!$$1.a((dcd)$$0.q(), $$0.a())) {
            return bqa.e;
         } else if (!$$0.q().a($$1, $$0.a(), $$3)) {
            return bqa.e;
         } else if (!$$0.q().a($$0.a(), $$1, 11)) {
            return bqa.e;
         } else {
            ir $$4 = $$0.a();
            dca $$5 = $$0.q();
            cly $$6 = $$0.o();
            $$5.a(null, $$4, avo.oX, avq.e, 1.0F, 1.0F);
            $$5.a(dxv.i, $$4, dxv.a.a($$6, $$5.a_($$4)));
            return bqa.a($$5.C);
         }
      }
   }
}
