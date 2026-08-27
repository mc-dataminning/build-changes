import com.mojang.serialization.Codec;

public class dxi extends dye<eas> {
   private static final dpi a = dcj.mZ.n().a(dbl.h, Integer.valueOf(1)).a(dbl.i, dpu.a).a(dbl.j, Integer.valueOf(0));
   private static final dpi b = a.a(dbl.i, dpu.c).a(dbl.j, Integer.valueOf(1));
   private static final dpi c = a.a(dbl.i, dpu.c);
   private static final dpi d = a.a(dbl.i, dpu.b);

   public dxi(Codec<eas> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eas> $$0) {
      int $$1 = 0;
      id $$2 = $$0.e();
      dab $$3 = $$0.b();
      axt $$4 = $$0.d();
      eas $$5 = $$0.f();
      id.a $$6 = $$2.j();
      id.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dcj.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dva.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dcj.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ij.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ij.a, 1), c, 2);
               $$3.a($$6.c(ij.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
