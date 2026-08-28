public class cny extends cmz {
   private static final akg<Boolean> f = akk.a(cny.class, aki.k);

   public cny(bsv<? extends cny> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cny(dbt $$0, btk $$1, double $$2, double $$3, double $$4) {
      super(bsv.br, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.z() ? 0.73F : super.w();
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   public float a(dbl $$0, daz $$1, iz $$2, drx $$3, enq $$4, float $$5) {
      return this.z() && ciq.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(evj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsp $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof btk $$3) {
            $$4 = $$1.a(this.dQ().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bD()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dQ().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof btk $$6) {
            int $$7 = 0;
            if (this.dP().al() == bqm.c) {
               $$7 = 10;
            } else if (this.dP().al() == bqm.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new brx(brz.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dbt.a.c);
         this.ao();
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, false);
   }

   public boolean z() {
      return this.ao.a(f);
   }

   public void a(boolean $$0) {
      this.ao.a(f, $$0);
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
