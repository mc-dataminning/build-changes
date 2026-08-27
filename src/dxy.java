import com.mojang.serialization.Codec;

public class dxy extends dyu<ebi> {
   private static final dpy a = dcx.mZ.n().a(dbz.h, Integer.valueOf(1)).a(dbz.i, dqk.a).a(dbz.j, Integer.valueOf(0));
   private static final dpy b = a.a(dbz.i, dqk.c).a(dbz.j, Integer.valueOf(1));
   private static final dpy c = a.a(dbz.i, dqk.c);
   private static final dpy d = a.a(dbz.i, dqk.b);

   public dxy(Codec<ebi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebi> $$0) {
      int $$1 = 0;
      im $$2 = $$0.e();
      dap $$3 = $$0.b();
      ayd $$4 = $$0.d();
      ebi $$5 = $$0.f();
      im.a $$6 = $$2.j();
      im.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dcx.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dvq.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dcx.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ir.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ir.a, 1), c, 2);
               $$3.a($$6.c(ir.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
