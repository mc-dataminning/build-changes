import com.mojang.serialization.Codec;

public class dys extends dye<eap> {
   public dys(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      int $$1 = 0;
      dab $$2 = $$0.b();
      id $$3 = $$0.e();
      axt $$4 = $$0.d();
      int $$5 = $$2.a(dva.a.d, $$3.u(), $$3.w());
      id $$6 = new id($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dcj.G)) {
         dpi $$7 = dcj.mc.n();
         dpi $$8 = dcj.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dcj.G) && $$2.a_($$6.c()).a(dcj.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dgk.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               id $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(dcj.mc)) {
                  $$2.a($$11, $$7.a(dgk.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
