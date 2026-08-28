import com.mojang.serialization.Codec;

public class eao extends ebk<edy> {
   private static final dsk a = dfj.mZ.o().a(del.h, Integer.valueOf(1)).a(del.i, dsw.a).a(del.j, Integer.valueOf(0));
   private static final dsk b = a.a(del.i, dsw.c).a(del.j, Integer.valueOf(1));
   private static final dsk c = a.a(del.i, dsw.c);
   private static final dsk d = a.a(del.i, dsw.b);

   public eao(Codec<edy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edy> $$0) {
      int $$1 = 0;
      ja $$2 = $$0.e();
      ddb $$3 = $$0.b();
      ayo $$4 = $$0.d();
      edy $$5 = $$0.f();
      ja.a $$6 = $$2.j();
      ja.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dfj.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dyf.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dfj.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jf.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jf.a, 1), c, 2);
               $$3.a($$6.c(jf.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
