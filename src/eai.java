import com.mojang.serialization.Codec;

public class eai extends ebe<eds> {
   private static final dsh a = dfh.mZ.o().a(dej.h, Integer.valueOf(1)).a(dej.i, dst.a).a(dej.j, Integer.valueOf(0));
   private static final dsh b = a.a(dej.i, dst.c).a(dej.j, Integer.valueOf(1));
   private static final dsh c = a.a(dej.i, dst.c);
   private static final dsh d = a.a(dej.i, dst.b);

   public eai(Codec<eds> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<eds> $$0) {
      int $$1 = 0;
      ja $$2 = $$0.e();
      dcz $$3 = $$0.b();
      aym $$4 = $$0.d();
      eds $$5 = $$0.f();
      ja.a $$6 = $$2.j();
      ja.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dfh.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dxz.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dfh.l.o(), 2);
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
