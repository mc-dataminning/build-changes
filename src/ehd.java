import com.mojang.serialization.Codec;

public class ehd extends efy<ehx> {
   public ehd(Codec<ehx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<ehx> $$0) {
      int $$1 = 0;
      azh $$2 = $$0.d();
      dhg $$3 = $$0.b();
      ji $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(ecs.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ji $$10 = new ji($$4.u() + $$7, $$9, $$4.w() + $$8);
         dwx $$11 = djo.nx.m().b(dqo.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(djo.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
