public class cpp extends coq {
   private static final akk<Boolean> e = ako.a(cpp.class, akm.k);

   public cpp(bug<? extends cpp> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpp(dev $$0, buv $$1, ezh $$2) {
      super(bug.br, $$1, $$2, $$0);
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
   public float a(den $$0, dea $$1, jg $$2, dvd $$3, ere $$4, float $$5) {
      return this.w() && ckd.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (this.dX() instanceof arm $$1) {
         btz var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof buv $$5) {
            bsp $$6 = this.dY().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bM()) {
                  dbo.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dY().q(), 5.0F);
         }

         if ($$7 && var8 instanceof buv $$9) {
            int $$10 = 0;
            if (this.dX().am() == brv.c) {
               $$10 = 10;
            } else if (this.dX().am() == brv.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bte(btg.t, 20 * $$10, 1), this.F());
            }
         }
      }
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.dX().a(this, this.dC(), this.dE(), this.dI(), 1.0F, false, dev.a.c);
         this.au();
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ako.a $$0) {
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
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
