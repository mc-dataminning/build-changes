public class cob extends cnc {
   private static final ajv<Boolean> e = ajz.a(cob.class, ajx.k);

   public cob(bsw<? extends cob> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cob(dcu $$0, btl $$1, eww $$2) {
      super(bsw.br, $$1, $$2, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   public float a(dcm $$0, dca $$1, jd $$2, dta $$3, eoy $$4, float $$5) {
      return this.y() && cis.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqt $$1) {
         bsq var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof btl $$5) {
            brj $$6 = this.dR().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bE()) {
                  dac.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dR().p(), 5.0F);
         }

         if ($$7 && var8 instanceof btl $$9) {
            int $$10 = 0;
            if (this.dQ().al() == bqn.c) {
               $$10 = 10;
            } else if (this.dQ().al() == bqn.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bry(bsa.t, 20 * $$10, 1), this.J());
            }
         }
      }
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.dQ().a(this, this.dv(), this.dx(), this.dB(), 1.0F, false, dcu.a.c);
         this.aq();
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(e, false);
   }

   @Override
   public boolean y() {
      return this.ao.a(e);
   }

   public void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
