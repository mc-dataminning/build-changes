public class cio extends cho {
   private static final aie<Boolean> e = aih.a(cio.class, aig.k);

   public cio(bnu<? extends cio> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cio(cvn $$0, bog $$1, double $$2, double $$3, double $$4) {
      super(bnu.bp, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float x() {
      return this.z() ? 0.73F : super.x();
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public float a(cvf $$0, cut $$1, hz $$2, dlf $$3, egp $$4, float $$5) {
      return this.z() && cdg.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bno $$1 = $$0.a();
         boolean $$4;
         if (this.w() instanceof bog $$3) {
            $$4 = $$1.a(this.dN().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bx()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dN().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bog $$6) {
            int $$7 = 0;
            if (this.dM().ak() == blr.c) {
               $$7 = 10;
            } else if (this.dM().ak() == blr.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bnb(bnd.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(enq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, this.dr(), this.dt(), this.dx(), 1.0F, false, cvn.a.c);
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      return false;
   }

   @Override
   protected void c_() {
      this.am.a(e, false);
   }

   public boolean z() {
      return this.am.b(e);
   }

   public void a(boolean $$0) {
      this.am.b(e, $$0);
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
