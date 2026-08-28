public class cpy extends coz {
   private static final ako<Boolean> e = aks.a(cpy.class, akq.k);

   public cpy(bup<? extends cpy> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpy(dff $$0, bve $$1, ezr $$2) {
      super(bup.br, $$1, $$2, $$0);
   }

   @Override
   protected float t() {
      return this.w() ? 0.73F : super.t();
   }

   @Override
   public boolean ca() {
      return false;
   }

   @Override
   public float a(dex $$0, dek $$1, jh $$2, dvo $$3, ero $$4, float $$5) {
      return this.w() && ckm.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (this.dY() instanceof arq $$1) {
         bui var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof bve $$5) {
            bsy $$6 = this.dZ().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bN()) {
                  dby.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dZ().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bve $$9) {
            int $$10 = 0;
            if (this.dY().ak() == bse.c) {
               $$10 = 10;
            } else if (this.dY().ak() == bse.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new btn(btp.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.dY().a(this, this.dD(), this.dF(), this.dJ(), 1.0F, false, dff.a.c);
         this.av();
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(e, false);
   }

   public boolean w() {
      return this.am.a(e);
   }

   public void a(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected boolean o() {
      return false;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
