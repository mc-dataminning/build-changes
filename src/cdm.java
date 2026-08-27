import java.util.function.Consumer;

public class cdm extends cfu {
   public cdm(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      ha $$1 = $$0.k();
      if ($$1 == ha.a) {
         return bdx.e;
      } else {
         cmm $$2 = $$0.q();
         cih $$3 = new cih($$0);
         gu $$4 = $$3.a();
         cfz $$5 = $$0.n();
         eei $$6 = eei.c($$4);
         eed $$7 = bfn.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aif $$8) {
               Consumer<bux> $$9 = bfn.a($$8, $$5, $$0.o());
               bux $$10 = bfn.d.b($$8, $$5.v(), $$9, $$4, bgd.m, true, true);
               if ($$10 == null) {
                  return bdx.e;
               }

               float $$11 = (float)apa.d((apa.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dn(), $$10.dp(), $$10.dt(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dn(), $$10.dp(), $$10.dt(), amh.ao, ami.e, 0.75F, 0.8F);
               $$10.a(dgl.t, $$0.o());
            }

            $$5.h(1);
            return bdx.a($$2.B);
         } else {
            return bdx.e;
         }
      }
   }
}
