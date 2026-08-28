import java.util.function.Consumer;

public class csi extends cul {
   public csi(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      ji $$1 = $$0.k();
      if ($$1 == ji.a) {
         return bqr.f;
      } else {
         dcw $$2 = $$0.q();
         cyd $$3 = new cyd($$0);
         jd $$4 = $$3.a();
         cuq $$5 = $$0.n();
         exc $$6 = exc.c($$4);
         ewx $$7 = bsx.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqu $$8) {
               Consumer<ciw> $$9 = bsx.a($$8, $$5, $$0.o());
               ciw $$10 = bsx.d.b($$8, $$9, $$4, btr.m, true, true);
               if ($$10 == null) {
                  return bqr.f;
               }

               float $$11 = (float)ayo.d((ayo.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dt(), $$10.dv(), $$10.dz(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dt(), $$10.dv(), $$10.dz(), avp.aD, avq.e, 0.75F, 0.8F);
               $$10.a(dxz.t, $$0.o());
            }

            $$5.h(1);
            return bqr.a($$2.B);
         } else {
            return bqr.f;
         }
      }
   }
}
