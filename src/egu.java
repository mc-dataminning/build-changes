import com.mojang.serialization.Codec;

public class egu extends ehr<ekf> {
   private static final dym a = dkw.nB.m().b(djy.b, Integer.valueOf(1)).b(djy.c, dyy.a).b(djy.d, Integer.valueOf(0));
   private static final dym b = a.b(djy.c, dyy.c).b(djy.d, Integer.valueOf(1));
   private static final dym c = a.b(djy.c, dyy.c);
   private static final dym d = a.b(djy.c, dyy.b);

   public egu(Codec<ekf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekf> $$0) {
      int $$1 = 0;
      jj $$2 = $$0.e();
      dio $$3 = $$0.b();
      azs $$4 = $$0.d();
      ekf $$5 = $$0.f();
      jj.a $$6 = $$2.k();
      jj.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dkw.nB.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(eel.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dkw.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jo.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jo.a, 1), c, 2);
               $$3.a($$6.c(jo.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
