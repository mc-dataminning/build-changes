import com.mojang.serialization.Codec;

public class dsl extends drc<dtn> {
   public dsl(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      hv.a $$3 = new hv.a();
      hv.a $$4 = new hv.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dny.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ia.a, 1);
            ctx $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, cwb.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, cwb.dN.o(), 2);
               dip $$11 = $$1.a_($$4);
               if ($$11.b(ddi.c)) {
                  $$1.a($$4, $$11.a(ddi.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
