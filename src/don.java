import com.mojang.serialization.Codec;

public class don extends dpj<drx> {
   private static final dgw a = cuv.mZ.o().a(ctx.h, Integer.valueOf(1)).a(ctx.i, dhi.a).a(ctx.j, Integer.valueOf(0));
   private static final dgw b = a.a(ctx.i, dhi.c).a(ctx.j, Integer.valueOf(1));
   private static final dgw c = a.a(ctx.i, dhi.c);
   private static final dgw d = a.a(ctx.i, dhi.b);

   public don(Codec<drx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<drx> $$0) {
      int $$1 = 0;
      ht $$2 = $$0.e();
      csm $$3 = $$0.b();
      ato $$4 = $$0.d();
      drx $$5 = $$0.f();
      ht.a $$6 = $$2.j();
      ht.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (cuv.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dmf.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cuv.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(hx.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(hx.a, 1), c, 2);
               $$3.a($$6.c(hx.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
