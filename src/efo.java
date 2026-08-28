import com.mojang.serialization.Codec;

public class efo extends eef<egq> {
   public efo(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      jg.a $$3 = new jg.a();
      jg.a $$4 = new jg.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(eaz.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jl.a, 1);
            dfw $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dia.dO.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dia.dN.m(), 2);
               dvd $$11 = $$1.a_($$4);
               if ($$11.b(dpi.c)) {
                  $$1.a($$4, $$11.b(dpi.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
