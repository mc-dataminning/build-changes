import com.mojang.serialization.Codec;

public class ecp extends eca<eer> {
   public ecp(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      int $$1 = 0;
      dcv $$2 = $$0.b();
      ir $$3 = $$0.e();
      ayt $$4 = $$0.d();
      int $$5 = $$2.a(dyu.a.d, $$3.u(), $$3.w());
      ir $$6 = new ir($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dfe.al)) {
         dtc $$7 = dfe.na.n();
         dtc $$8 = dfe.nb.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dfe.al) && $$2.a_($$6.c()).a(dfe.al) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(djk.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               ir $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dfe.na)) {
                  $$2.a($$11, $$7.a(djk.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.c();
         }
      }

      return $$1 > 0;
   }
}
