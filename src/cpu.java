public class cpu extends cov {
   private static final akl<Boolean> e = akp.a(cpu.class, akn.k);

   public cpu(bul<? extends cpu> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpu(dfb $$0, bva $$1, ezn $$2) {
      super(bul.br, $$1, $$2, $$0);
   }

   @Override
   protected float t() {
      return this.w() ? 0.73F : super.t();
   }

   @Override
   public boolean bZ() {
      return false;
   }

   @Override
   public float a(det $$0, deg $$1, jh $$2, dvj $$3, erk $$4, float $$5) {
      return this.w() && cki.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      if (this.dX() instanceof arn $$1) {
         bue var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof bva $$5) {
            bsu $$6 = this.dY().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bM()) {
                  dbu.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dY().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bva $$9) {
            int $$10 = 0;
            if (this.dX().ak() == bsa.c) {
               $$10 = 10;
            } else if (this.dX().ak() == bsa.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new btj(btl.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.dX().a(this, this.dC(), this.dE(), this.dI(), 1.0F, false, dfb.a.c);
         this.av();
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akp.a $$0) {
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
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
