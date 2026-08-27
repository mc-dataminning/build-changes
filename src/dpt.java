import com.mojang.serialization.Codec;

public class dpt extends doo<dqn> {
   public dpt(Codec<dqn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqn> $$0) {
      int $$1 = 0;
      ate $$2 = $$0.d();
      crt $$3 = $$0.b();
      ht $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dlk.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ht $$10 = new ht($$4.u() + $$7, $$9, $$4.w() + $$8);
         dgb $$11 = cuc.mV.o().a(dav.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cuc.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
