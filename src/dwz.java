import com.mojang.serialization.Codec;

public class dwz extends dxv<eaj> {
   private static final doz a = dca.mZ.n().a(dbc.h, Integer.valueOf(1)).a(dbc.i, dpl.a).a(dbc.j, Integer.valueOf(0));
   private static final doz b = a.a(dbc.i, dpl.c).a(dbc.j, Integer.valueOf(1));
   private static final doz c = a.a(dbc.i, dpl.c);
   private static final doz d = a.a(dbc.i, dpl.b);

   public dwz(Codec<eaj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eaj> $$0) {
      int $$1 = 0;
      ib $$2 = $$0.e();
      czs $$3 = $$0.b();
      axr $$4 = $$0.d();
      eaj $$5 = $$0.f();
      ib.a $$6 = $$2.j();
      ib.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dca.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dur.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dca.l.n(), 2);
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
