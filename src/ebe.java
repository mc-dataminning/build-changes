import com.mojang.serialization.Codec;

public class ebe extends eca<eeo> {
   private static final dta a = dfy.mZ.o().a(dfa.h, Integer.valueOf(1)).a(dfa.i, dtm.a).a(dfa.j, Integer.valueOf(0));
   private static final dta b = a.a(dfa.i, dtm.c).a(dfa.j, Integer.valueOf(1));
   private static final dta c = a.a(dfa.i, dtm.c);
   private static final dta d = a.a(dfa.i, dtm.b);

   public ebe(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeo> $$0) {
      int $$1 = 0;
      jd $$2 = $$0.e();
      ddq $$3 = $$0.b();
      ayv $$4 = $$0.d();
      eeo $$5 = $$0.f();
      jd.a $$6 = $$2.j();
      jd.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dfy.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dyv.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dfy.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ji.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ji.a, 1), c, 2);
               $$3.a($$6.c(ji.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
