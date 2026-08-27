import java.util.function.Consumer;

public class cpv extends cry {
   public cpv(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      ir $$1 = $$0.k();
      if ($$1 == ir.a) {
         return boq.e;
      } else {
         czu $$2 = $$0.q();
         cvl $$3 = new cvl($$0);
         im $$4 = $$3.a();
         csd $$5 = $$0.n();
         etf $$6 = etf.c($$4);
         eta $$7 = bqr.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqe $$8) {
               Consumer<cgl> $$9 = bqr.a($$8, $$5, $$0.o());
               cgl $$10 = bqr.d.b($$8, $$9, $$4, bri.m, true, true);
               if ($$10 == null) {
                  return boq.e;
               }

               float $$11 = (float)axw.d((axw.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.ds(), $$10.du(), $$10.dy(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.ds(), $$10.du(), $$10.dy(), auz.aD, ava.e, 0.75F, 0.8F);
               $$10.a(dur.t, $$0.o());
            }

            $$5.g(1);
            return boq.a($$2.B);
         } else {
            return boq.e;
         }
      }
   }
}
