public class cne extends cmf {
   private static final ajs<Boolean> f = ajw.a(cne.class, aju.k);

   public cne(bsc<? extends cne> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cne(daz $$0, bsq $$1, double $$2, double $$3, double $$4) {
      super(bsc.br, $$1, $$2, $$3, $$4, $$0);
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
   public float a(dar $$0, daf $$1, io $$2, drd $$3, emw $$4, float $$5) {
      return this.z() && chw.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(euj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         brw $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof bsq $$3) {
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

         if ($$4 && $$1 instanceof bsq $$6) {
            int $$7 = 0;
            if (this.dP().ak() == bpt.c) {
               $$7 = 10;
            } else if (this.dP().ak() == bpt.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bre(brg.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(euk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, daz.a.c);
         this.ao();
      }
   }

   @Override
   public boolean bz() {
      return false;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajw.a $$0) {
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
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
