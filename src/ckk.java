import java.util.function.Consumer;

public class ckk extends cms {
   public ckk(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      ic $$1 = $$0.k();
      if ($$1 == ic.a) {
         return bka.e;
      } else {
         cto $$2 = $$0.q();
         cpg $$3 = new cpg($$0);
         hx $$4 = $$3.a();
         cmx $$5 = $$0.n();
         els $$6 = els.c($$4);
         eln $$7 = bly.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof and $$8) {
               Consumer<cbj> $$9 = bly.a($$8, $$5, $$0.o());
               cbj $$10 = bly.d.b($$8, $$5.v(), $$9, $$4, bmo.m, true, true);
               if ($$10 == null) {
                  return bka.e;
               }

               float $$11 = (float)aun.d((aun.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), arr.ao, ars.e, 0.75F, 0.8F);
               $$10.a(dnq.t, $$0.o());
            }

            $$5.h(1);
            return bka.a($$2.B);
         } else {
            return bka.e;
         }
      }
   }
}
