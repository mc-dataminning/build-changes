import com.mojang.serialization.Codec;

public class ect extends edq<ege> {
   private static final duo a = dhl.mZ.o().b(dgn.h, Integer.valueOf(1)).b(dgn.i, dva.a).b(dgn.j, Integer.valueOf(0));
   private static final duo b = a.b(dgn.i, dva.c).b(dgn.j, Integer.valueOf(1));
   private static final duo c = a.b(dgn.i, dva.c);
   private static final duo d = a.b(dgn.i, dva.b);

   public ect(Codec<ege> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<ege> $$0) {
      int $$1 = 0;
      je $$2 = $$0.e();
      dfd $$3 = $$0.b();
      azl $$4 = $$0.d();
      ege $$5 = $$0.f();
      je.a $$6 = $$2.k();
      je.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dhl.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(eak.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dhl.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jj.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jj.a, 1), c, 2);
               $$3.a($$6.c(jj.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
