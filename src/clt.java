public class clt extends clj {
   public clt(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if ($$3.a(ark.S)) {
         cdz $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   public static bjb a(cdz $$0, csf $$1, hx $$2) {
      cam $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bln $$10 : $$1.a(
         bln.class, new eju((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fU() == $$0) {
            if ($$3 == null) {
               $$3 = cam.b($$1, $$2);
               $$3.D();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dlx.b, $$2, dlx.a.a($$0));
      }

      return $$4 ? bjb.a : bjb.d;
   }
}
