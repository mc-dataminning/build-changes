public class cst extends crs {
   private static final akj<Boolean> d = akn.a(cst.class, akl.k);

   public cst(bwr<? extends cst> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cst(djh $$0, bxj $$1, fex $$2) {
      super(bwr.bL, $$1, $$2, $$0);
   }

   @Override
   protected float m() {
      return this.o() ? 0.73F : super.m();
   }

   @Override
   public boolean bW() {
      return false;
   }

   @Override
   public float a(dja $$0, din $$1, iv $$2, eao $$3, ewv $$4, float $$5) {
      return this.o() && cnb.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(feu $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bxj $$5) {
            bux $$6 = this.dV().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bI()) {
                  dfz.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dV().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bxj $$9) {
            int $$10 = 0;
            if (this.dU().an() == bud.c) {
               $$10 = 10;
            } else if (this.dU().an() == bud.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bvm(bvo.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, this.dz(), this.dB(), this.dF(), 1.0F, false, djh.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(d, false);
   }

   public boolean o() {
      return this.al.a(d);
   }

   public void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("dangerous", this.o());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.o("dangerous"));
   }
}
