import com.mojang.serialization.Codec;

public class eei extends eef<egn> {
   public eei(Codec<egn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egn> $$0) {
      jg $$1 = $$0.e();
      egn $$2 = $$0.f();
      dfs $$3 = $$0.b();
      jg.a $$4 = new jg.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.I_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).l()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
