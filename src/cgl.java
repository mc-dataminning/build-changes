import java.util.function.Consumer;

public class cgl extends cit {
   public cgl(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      ha $$1 = $$0.k();
      if ($$1 == ha.a) {
         return bgq.e;
      } else {
         cpm $$2 = $$0.q();
         clg $$3 = new clg($$0);
         gu $$4 = $$3.a();
         ciy $$5 = $$0.n();
         ehe $$6 = ehe.c($$4);
         egz $$7 = bim.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof akk $$8) {
               Consumer<bxw> $$9 = bim.a($$8, $$5, $$0.o());
               bxw $$10 = bim.d.b($$8, $$5.v(), $$9, $$4, bjc.m, true, true);
               if ($$10 == null) {
                  return bgq.e;
               }

               float $$11 = (float)arp.d((arp.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dp(), $$10.dr(), $$10.dv(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dp(), $$10.dr(), $$10.dv(), aow.ao, aox.e, 0.75F, 0.8F);
               $$10.a(djk.t, $$0.o());
            }

            $$5.h(1);
            return bgq.a($$2.B);
         } else {
            return bgq.e;
         }
      }
   }
}
