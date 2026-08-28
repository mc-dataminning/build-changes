import com.mojang.serialization.Codec;

public class ekv extends ejm<elx> {
   public ekv(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      iu.a $$3 = new iu.a();
      iu.a $$4 = new iu.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(egg.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ja.a, 1);
            dkd $$10 = $$1.u($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dmh.ee.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dmh.ed.m(), 2);
               eah $$11 = $$1.a_($$4);
               if ($$11.b(dtz.c)) {
                  $$1.a($$4, $$11.b(dtz.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
