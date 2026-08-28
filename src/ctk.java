public class ctk extends csx {
   public ctk(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqt.a($$3);
      } else {
         $$3.a(1, $$1);
         $$1.b(awj.c.b(this));
         $$1.dP().a(null, $$1, avz.Ar, $$1.de(), 1.0F, 1.0F);
         cun $$4 = cuv.a($$0, $$1.dt(), $$1.dz(), (byte)0, true, false);
         if ($$3.e()) {
            return bqt.b($$4);
         } else {
            if (!$$1.gc().f($$4.s())) {
               $$1.a($$4, false);
            }

            return bqt.b($$3);
         }
      }
   }
}
