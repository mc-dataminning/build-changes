import java.util.function.Consumer;

public class ctf extends cvg {
   public ctf(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      jj $$1 = $$0.k();
      if ($$1 == jj.a) {
         return brk.d;
      } else {
         dds $$2 = $$0.q();
         cyw $$3 = new cyw($$0);
         je $$4 = $$3.a();
         cvl $$5 = $$0.n();
         eye $$6 = eye.c($$4);
         exz $$7 = btq.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arg $$8) {
               Consumer<cjo> $$9 = btq.a($$8, $$5, $$0.o());
               cjo $$10 = btq.d.b($$8, $$9, $$4, btp.m, true, true);
               if ($$10 == null) {
                  return brk.d;
               }

               float $$11 = (float)azc.d((azc.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dx(), $$10.dz(), $$10.dD(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dx(), $$10.dz(), $$10.dD(), awd.aD, awe.e, 0.75F, 0.8F);
               $$10.a(dyx.t, $$0.o());
            }

            $$5.h(1);
            return brk.a;
         } else {
            return brk.d;
         }
      }
   }
}
