import java.util.function.Consumer;

public class csg extends cuj {
   public csg(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      ji $$1 = $$0.k();
      if ($$1 == ji.a) {
         return bqq.f;
      } else {
         dcu $$2 = $$0.q();
         cyb $$3 = new cyb($$0);
         jd $$4 = $$3.a();
         cuo $$5 = $$0.n();
         eww $$6 = eww.c($$4);
         ewr $$7 = bsw.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqt $$8) {
               Consumer<ciu> $$9 = bsw.a($$8, $$5, $$0.o());
               ciu $$10 = bsw.d.b($$8, $$9, $$4, btp.m, true, true);
               if ($$10 == null) {
                  return bqq.f;
               }

               float $$11 = (float)ayn.d((ayn.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dv(), $$10.dx(), $$10.dB(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dv(), $$10.dx(), $$10.dB(), avo.aD, avp.e, 0.75F, 0.8F);
               $$10.a(dxw.t, $$0.o());
            }

            $$5.h(1);
            return bqq.a($$2.B);
         } else {
            return bqq.f;
         }
      }
   }
}
