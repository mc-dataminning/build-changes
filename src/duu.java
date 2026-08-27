import com.mojang.serialization.Codec;

public class duu extends dvq<dye> {
   private static final dmz a = dac.mZ.o().a(cze.h, Integer.valueOf(1)).a(cze.i, dnl.a).a(cze.j, Integer.valueOf(0));
   private static final dmz b = a.a(cze.i, dnl.c).a(cze.j, Integer.valueOf(1));
   private static final dmz c = a.a(cze.i, dnl.c);
   private static final dmz d = a.a(cze.i, dnl.b);

   public duu(Codec<dye> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dye> $$0) {
      int $$1 = 0;
      ib $$2 = $$0.e();
      cxu $$3 = $$0.b();
      axd $$4 = $$0.d();
      dye $$5 = $$0.f();
      ib.a $$6 = $$2.j();
      ib.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dac.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dsm.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dac.l.o(), 2);
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
