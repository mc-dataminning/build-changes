import com.mojang.serialization.Codec;

public class edo extends eef<egq> {
   public edo(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      jg $$1 = $$0.e();
      dfs $$2 = $$0.b();
      azr $$3 = $$0.d();
      if ($$1.v() > $$2.N() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dia.G) && !$$2.a_($$1.e()).a(dia.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jl $$5 : jl.values()) {
            if ($$5 != jl.a && $$2.a_($$1.a($$5)).a(dia.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dia.mW.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jg $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dvd $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dia.G) || $$10.a(dia.iC) || $$10.a(dia.dO)) {
                     for (jl $$11 : jl.values()) {
                        dvd $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dia.mW)) {
                           $$2.a($$9, dia.mW.m(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
