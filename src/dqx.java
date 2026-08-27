import com.mojang.serialization.Codec;

public class dqx extends drt<duh> {
   private static final djg a = cwr.mZ.o().a(cvt.h, Integer.valueOf(1)).a(cvt.i, djs.a).a(cvt.j, Integer.valueOf(0));
   private static final djg b = a.a(cvt.i, djs.c).a(cvt.j, Integer.valueOf(1));
   private static final djg c = a.a(cvt.i, djs.c);
   private static final djg d = a.a(cvt.i, djs.b);

   public dqx(Codec<duh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<duh> $$0) {
      int $$1 = 0;
      hx $$2 = $$0.e();
      cuj $$3 = $$0.b();
      auu $$4 = $$0.d();
      duh $$5 = $$0.f();
      hx.a $$6 = $$2.j();
      hx.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (cwr.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dop.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cwr.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ic.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ic.a, 1), c, 2);
               $$3.a($$6.c(ic.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
