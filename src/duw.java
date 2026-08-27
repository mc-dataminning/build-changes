import com.mojang.serialization.Codec;

public class duw extends dvs<dyg> {
   private static final dnb a = dae.mZ.o().a(czg.h, Integer.valueOf(1)).a(czg.i, dnn.a).a(czg.j, Integer.valueOf(0));
   private static final dnb b = a.a(czg.i, dnn.c).a(czg.j, Integer.valueOf(1));
   private static final dnb c = a.a(czg.i, dnn.c);
   private static final dnb d = a.a(czg.i, dnn.b);

   public duw(Codec<dyg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyg> $$0) {
      int $$1 = 0;
      ib $$2 = $$0.e();
      cxw $$3 = $$0.b();
      axd $$4 = $$0.d();
      dyg $$5 = $$0.f();
      ib.a $$6 = $$2.j();
      ib.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dae.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dso.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dae.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ih.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ih.a, 1), c, 2);
               $$3.a($$6.c(ih.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
