import java.util.function.Consumer;

public class ctw extends cvt {
   public ctw(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      jl $$1 = $$0.k();
      if ($$1 == jl.a) {
         return bry.d;
      } else {
         dev $$2 = $$0.q();
         czm $$3 = new czm($$0);
         jg $$4 = $$3.a();
         cvx $$5 = $$0.n();
         ezh $$6 = ezh.c($$4);
         ezc $$7 = bug.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arm $$8) {
               Consumer<ckf> $$9 = bug.a($$8, $$5, $$0.o());
               ckf $$10 = bug.d.b($$8, $$9, $$4, buf.m, true, true);
               if ($$10 == null) {
                  return bry.d;
               }

               float $$11 = (float)azj.d((azj.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dC(), $$10.dE(), $$10.dI(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dC(), $$10.dE(), $$10.dI(), awk.aD, awl.e, 0.75F, 0.8F);
               $$10.a(eaa.t, $$0.o());
            }

            $$5.h(1);
            return bry.a;
         } else {
            return bry.d;
         }
      }
   }
}
