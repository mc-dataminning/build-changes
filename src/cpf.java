public class cpf extends cof {
   private static final akh<Boolean> e = akl.a(cpf.class, akj.k);

   public cpf(bty<? extends cpf> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpf(dej $$0, bun $$1, eyw $$2) {
      super(bty.br, $$1, $$2, $$0);
   }

   @Override
   protected float t() {
      return this.w() ? 0.73F : super.t();
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   public float a(deb $$0, ddo $$1, jf $$2, dus $$3, eqt $$4, float $$5) {
      return this.w() && cju.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      if (this.dS() instanceof arj $$1) {
         btr var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof bun $$5) {
            bsj $$6 = this.dT().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bI()) {
                  dbp.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dT().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bun $$9) {
            int $$10 = 0;
            if (this.dS().am() == brp.c) {
               $$10 = 10;
            } else if (this.dS().am() == brp.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bsy(bta.t, 20 * $$10, 1), this.F());
            }
         }
      }
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.dS().a(this, this.dx(), this.dz(), this.dD(), 1.0F, false, dej.a.c);
         this.as();
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akl.a $$0) {
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
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
