import com.mojang.serialization.Codec;

public class edi extends eef<egt> {
   private static final dvd a = dia.mZ.m().b(dhc.h, Integer.valueOf(1)).b(dhc.i, dvp.a).b(dhc.j, Integer.valueOf(0));
   private static final dvd b = a.b(dhc.i, dvp.c).b(dhc.j, Integer.valueOf(1));
   private static final dvd c = a.b(dhc.i, dvp.c);
   private static final dvd d = a.b(dhc.i, dvp.b);

   public edi(Codec<egt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egt> $$0) {
      int $$1 = 0;
      jg $$2 = $$0.e();
      dfs $$3 = $$0.b();
      azr $$4 = $$0.d();
      egt $$5 = $$0.f();
      jg.a $$6 = $$2.k();
      jg.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dia.mZ.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(eaz.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dia.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jl.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jl.a, 1), c, 2);
               $$3.a($$6.c(jl.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
