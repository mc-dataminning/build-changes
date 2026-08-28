import com.mojang.serialization.Codec;

public class ehe extends efz<ehy> {
   public ehe(Codec<ehy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<ehy> $$0) {
      int $$1 = 0;
      azh $$2 = $$0.d();
      dhh $$3 = $$0.b();
      ji $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(ect.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ji $$10 = new ji($$4.u() + $$7, $$9, $$4.w() + $$8);
         dwy $$11 = djp.nx.m().b(dqp.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(djp.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
