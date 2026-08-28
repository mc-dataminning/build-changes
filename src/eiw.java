import com.mojang.serialization.Codec;

public class eiw extends ehr<ejq> {
   public eiw(Codec<ejq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ejq> $$0) {
      int $$1 = 0;
      azs $$2 = $$0.d();
      dio $$3 = $$0.b();
      jj $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(eel.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jj $$10 = new jj($$4.u() + $$7, $$9, $$4.w() + $$8);
         dym $$11 = dkw.nx.m().b(drw.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dkw.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
