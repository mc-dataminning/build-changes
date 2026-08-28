import com.mojang.serialization.Codec;

public class eet extends eef<egq> {
   public eet(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      int $$1 = 0;
      dfs $$2 = $$0.b();
      jg $$3 = $$0.e();
      azr $$4 = $$0.d();
      int $$5 = $$2.a(eaz.a.d, $$3.u(), $$3.w());
      jg $$6 = new jg($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dia.G)) {
         dvd $$7 = dia.mc.m();
         dvd $$8 = dia.md.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dia.G) && $$2.a_($$6.d()).a(dia.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dmb.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jg $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dia.mc)) {
                  $$2.a($$11, $$7.b(dmb.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.d();
         }
      }

      return $$1 > 0;
   }
}
