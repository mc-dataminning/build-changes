import com.mojang.serialization.Codec;

public class egf extends eew<ehh> {
   public egf(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehh> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      jh.a $$3 = new jh.a();
      jh.a $$4 = new jh.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(ebq.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jm.a, 1);
            dgo $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dis.dO.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dis.dN.m(), 2);
               dvv $$11 = $$1.a_($$4);
               if ($$11.b(dqa.c)) {
                  $$1.a($$4, $$11.b(dqa.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
