import com.mojang.serialization.Codec;

public class dyh extends dye<eam> {
   public dyh(Codec<eam> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eam> $$0) {
      id $$1 = $$0.e();
      eam $$2 = $$0.f();
      dab $$3 = $$0.b();
      id.a $$4 = new id.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.I_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).i()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
