import java.util.function.Consumer;

public class crw extends cuc {
   public crw(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      iw $$1 = $$0.k();
      if ($$1 == iw.a) {
         return bqa.e;
      } else {
         dca $$2 = $$0.q();
         cyd $$3 = new cyd($$0);
         ir $$4 = $$3.a();
         cuh $$5 = $$0.n();
         ewu $$6 = ewu.c($$4);
         ewp $$7 = bsb.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.b(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqt $$8) {
               Consumer<chw> $$9 = bsb.a($$8, $$5, $$0.o());
               chw $$10 = bsb.d.b($$8, $$9, $$4, bss.m, true, true);
               if ($$10 == null) {
                  return bqa.e;
               }

               float $$11 = (float)aym.d((aym.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dz(), $$10.dB(), $$10.dF(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dz(), $$10.dB(), $$10.dF(), avo.aI, avq.e, 0.75F, 0.8F);
               $$10.a(dxv.t, $$0.o());
            }

            $$5.h(1);
            return bqa.a($$2.C);
         } else {
            return bqa.e;
         }
      }
   }
}
