import java.util.function.Consumer;

public class cpk extends crn {
   public cpk(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      ij $$1 = $$0.k();
      if ($$1 == ij.a) {
         return bof.e;
      } else {
         czg $$2 = $$0.q();
         cux $$3 = new cux($$0);
         id $$4 = $$3.a();
         crs $$5 = $$0.n();
         esj $$6 = esj.c($$4);
         ese $$7 = bqg.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof apu $$8) {
               Consumer<cga> $$9 = bqg.a($$8, $$5, $$0.o());
               cga $$10 = bqg.d.b($$8, $$9, $$4, bqx.m, true, true);
               if ($$10 == null) {
                  return bof.e;
               }

               float $$11 = (float)axm.d((axm.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), auo.aD, aup.e, 0.75F, 0.8F);
               $$10.a(dub.t, $$0.o());
            }

            $$5.g(1);
            return bof.a($$2.B);
         } else {
            return bof.e;
         }
      }
   }
}
