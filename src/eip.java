import com.mojang.serialization.Codec;

public class eip extends ejm<ema> {
   private static final eah a = dmh.nF.m().b(dlj.b, Integer.valueOf(1)).b(dlj.c, eat.a).b(dlj.d, Integer.valueOf(0));
   private static final eah b = a.b(dlj.c, eat.c).b(dlj.d, Integer.valueOf(1));
   private static final eah c = a.b(dlj.c, eat.c);
   private static final eah d = a.b(dlj.c, eat.b);

   public eip(Codec<ema> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<ema> $$0) {
      int $$1 = 0;
      iu $$2 = $$0.e();
      djz $$3 = $$0.b();
      azv $$4 = $$0.d();
      ema $$5 = $$0.f();
      iu.a $$6 = $$2.k();
      iu.a $$7 = $$2.k();
      if ($$3.v($$6)) {
         if (dmh.nF.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(egg.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dmh.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.v($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ja.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ja.a, 1), c, 2);
               $$3.a($$6.c(ja.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
