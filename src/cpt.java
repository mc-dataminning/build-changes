public class cpt extends cpr {
   private static final bul b = bul.c(0.0F, 0.0F);

   public cpt(bup<? extends cpt> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpt(dff $$0, bve $$1, cwf $$2) {
      super(bup.C, $$1, $$0, $$2);
   }

   public cpt(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      super(bup.C, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dY()
               .a(
                  new lo(ls.S, this.m()),
                  this.dD(),
                  this.dF(),
                  this.dJ(),
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      $$0.a().a(this.dZ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         if (this.af.a(8) == 0) {
            int $$1 = 1;
            if (this.af.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cha $$3 = bup.t.a(this.dY(), buo.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dD(), this.dF(), this.dJ(), this.dO(), 0.0F);
                  if (!$$3.a(b)) {
                     break;
                  }

                  this.dY().b($$3);
               }
            }
         }

         this.dY().a(this, (byte)3);
         this.av();
      }
   }

   @Override
   protected cwb o() {
      return cwj.qS;
   }
}
