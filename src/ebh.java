import com.mojang.serialization.Codec;

public class ebh extends ecd<eer> {
   private static final dtc a = dga.mZ.o().a(dfc.h, Integer.valueOf(1)).a(dfc.i, dto.a).a(dfc.j, Integer.valueOf(0));
   private static final dtc b = a.a(dfc.i, dto.c).a(dfc.j, Integer.valueOf(1));
   private static final dtc c = a.a(dfc.i, dto.c);
   private static final dtc d = a.a(dfc.i, dto.b);

   public ebh(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eer> $$0) {
      int $$1 = 0;
      jd $$2 = $$0.e();
      dds $$3 = $$0.b();
      ayw $$4 = $$0.d();
      eer $$5 = $$0.f();
      jd.a $$6 = $$2.k();
      jd.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dga.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dyy.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dga.l.o(), 2);
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
