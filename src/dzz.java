import com.mojang.serialization.Codec;

public class dzz extends dyu<eat> {
   public dzz(Codec<eat> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<eat> $$0) {
      int $$1 = 0;
      ayd $$2 = $$0.d();
      dap $$3 = $$0.b();
      im $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dvq.a.d, $$4.u() + $$7, $$4.w() + $$8);
         im $$10 = new im($$4.u() + $$7, $$9, $$4.w() + $$8);
         dpy $$11 = dcx.mV.n().a(djs.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dcx.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
