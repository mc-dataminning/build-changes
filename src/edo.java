import com.mojang.serialization.Codec;

public class edo extends eel<egz> {
   private static final dvj a = dig.mZ.m().b(dhi.h, Integer.valueOf(1)).b(dhi.i, dvv.a).b(dhi.j, Integer.valueOf(0));
   private static final dvj b = a.b(dhi.i, dvv.c).b(dhi.j, Integer.valueOf(1));
   private static final dvj c = a.b(dhi.i, dvv.c);
   private static final dvj d = a.b(dhi.i, dvv.b);

   public edo(Codec<egz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egz> $$0) {
      int $$1 = 0;
      jh $$2 = $$0.e();
      dfy $$3 = $$0.b();
      azs $$4 = $$0.d();
      egz $$5 = $$0.f();
      jh.a $$6 = $$2.k();
      jh.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dig.mZ.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(ebf.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dig.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jm.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jm.a, 1), c, 2);
               $$3.a($$6.c(jm.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
