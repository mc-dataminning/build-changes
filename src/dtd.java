import com.mojang.serialization.Codec;

public class dtd extends dtz<dwn> {
   private static final dlj a = cyu.mZ.o().a(cxw.h, Integer.valueOf(1)).a(cxw.i, dlv.a).a(cxw.j, Integer.valueOf(0));
   private static final dlj b = a.a(cxw.i, dlv.c).a(cxw.j, Integer.valueOf(1));
   private static final dlj c = a.a(cxw.i, dlv.c);
   private static final dlj d = a.a(cxw.i, dlv.b);

   public dtd(Codec<dwn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwn> $$0) {
      int $$1 = 0;
      hz $$2 = $$0.e();
      cwm $$3 = $$0.b();
      awp $$4 = $$0.d();
      dwn $$5 = $$0.f();
      hz.a $$6 = $$2.j();
      hz.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (cyu.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dqv.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cyu.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ie.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ie.a, 1), c, 2);
               $$3.a($$6.c(ie.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
