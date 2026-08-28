import com.mojang.serialization.Codec;

public class eks extends ejm<ema> {
   public eks(Codec<ema> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<ema> $$0) {
      boolean $$1 = false;
      azv $$2 = $$0.d();
      djz $$3 = $$0.b();
      iu $$4 = $$0.e();
      ema $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(egg.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iu $$9 = new iu($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dmh.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         eah $$11 = $$10 ? dmh.bH.m() : dmh.bG.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               eah $$12 = $$11.b(duw.d, ebd.a);
               iu $$13 = $$9.d();
               if ($$3.a_($$13).a(dmh.J)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
