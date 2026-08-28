import com.mojang.serialization.Codec;

public class eem extends eef<egq> {
   public eem(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      azr $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dvd $$4 = $$1.a_($$2.d());
         if (!$$4.a(dia.dV) && !$$4.a(dia.dY) && !$$4.a(dia.pr)) {
            return false;
         } else {
            $$1.a($$2, dia.ec.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jg $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jl $$8 : jl.values()) {
                     if ($$1.a_($$6.a($$8)).a(dia.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dia.ec.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
