import java.util.function.Consumer;

public class csi extends cul {
   public csi(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      je $$1 = $$0.k();
      if ($$1 == je.a) {
         return bqv.f;
      } else {
         dbz $$2 = $$0.q();
         cyb $$3 = new cyb($$0);
         iz $$4 = $$3.a();
         cuq $$5 = $$0.n();
         evs $$6 = evs.c($$4);
         evn $$7 = btb.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arf $$8) {
               Consumer<ciy> $$9 = btb.a($$8, $$5, $$0.o());
               ciy $$10 = btb.d.b($$8, $$9, $$4, btu.m, true, true);
               if ($$10 == null) {
                  return bqv.f;
               }

               float $$11 = (float)ayz.d((ayz.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(dww.t, $$0.o());
            }

            $$5.h(1);
            return bqv.a($$2.B);
         } else {
            return bqv.f;
         }
      }
   }
}
