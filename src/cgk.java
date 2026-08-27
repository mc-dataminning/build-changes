import java.util.function.Consumer;

public class cgk extends cis {
   public cgk(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      ha $$1 = $$0.k();
      if ($$1 == ha.a) {
         return bgq.e;
      } else {
         cpl $$2 = $$0.q();
         clf $$3 = new clf($$0);
         gu $$4 = $$3.a();
         cix $$5 = $$0.n();
         ehd $$6 = ehd.c($$4);
         egy $$7 = bim.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof akk $$8) {
               Consumer<bxv> $$9 = bim.a($$8, $$5, $$0.o());
               bxv $$10 = bim.d.b($$8, $$5.v(), $$9, $$4, bjc.m, true, true);
               if ($$10 == null) {
                  return bgq.e;
               }

               float $$11 = (float)arp.d((arp.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dp(), $$10.dr(), $$10.dv(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dp(), $$10.dr(), $$10.dv(), aow.ao, aox.e, 0.75F, 0.8F);
               $$10.a(djj.t, $$0.o());
            }

            $$5.h(1);
            return bgq.a($$2.B);
         } else {
            return bgq.e;
         }
      }
   }
}
