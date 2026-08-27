import com.mojang.serialization.Codec;

public class eam extends dzd<ebo> {
   public eam(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      in.a $$3 = new in.a();
      in.a $$4 = new in.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dvz.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(is.a, 1);
            dbc $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, ddg.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, ddg.dN.n(), 2);
               dqh $$11 = $$1.a_($$4);
               if ($$11.b(dko.c)) {
                  $$1.a($$4, $$11.a(dko.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
