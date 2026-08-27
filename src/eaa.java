import com.mojang.serialization.Codec;

public class eaa extends dyu<ebi> {
   public eaa(Codec<ebi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebi> $$0) {
      boolean $$1 = false;
      ayd $$2 = $$0.d();
      dap $$3 = $$0.b();
      im $$4 = $$0.e();
      ebi $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dvq.a.d, $$4.u() + $$6, $$4.w() + $$7);
      im $$9 = new im($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dcx.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dpy $$11 = $$10 ? dcx.bx.n() : dcx.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dpy $$12 = $$11.a(dlb.d, dqu.a);
               im $$13 = $$9.c();
               if ($$3.a_($$13).a(dcx.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
