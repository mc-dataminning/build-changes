import java.util.function.Consumer;

public class cpb extends cre {
   public cpb(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      ih $$1 = $$0.k();
      if ($$1 == ih.a) {
         return boa.e;
      } else {
         cyx $$2 = $$0.q();
         cuo $$3 = new cuo($$0);
         ib $$4 = $$3.a();
         crj $$5 = $$0.n();
         esa $$6 = esa.c($$4);
         erv $$7 = bqb.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aps $$8) {
               Consumer<cft> $$9 = bqb.a($$8, $$5, $$0.o());
               cft $$10 = bqb.d.b($$8, $$9, $$4, bqs.m, true, true);
               if ($$10 == null) {
                  return boa.e;
               }

               float $$11 = (float)axk.d((axk.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), aum.aD, aun.e, 0.75F, 0.8F);
               $$10.a(dts.t, $$0.o());
            }

            $$5.g(1);
            return boa.a($$2.B);
         } else {
            return boa.e;
         }
      }
   }
}
