import com.mojang.serialization.Codec;

public class dsw extends drn<dty> {
   public dsw(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dty> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      hx.a $$3 = new hx.a();
      hx.a $$4 = new hx.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(doj.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ic.a, 1);
            cuh $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, cwl.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, cwl.dN.o(), 2);
               dja $$11 = $$1.a_($$4);
               if ($$11.b(dds.c)) {
                  $$1.a($$4, $$11.a(dds.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
