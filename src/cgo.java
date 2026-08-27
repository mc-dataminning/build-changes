public class cgo extends cfp {
   private static final agm<Boolean> e = agp.a(cgo.class, ago.k);

   public cgo(blz<? extends cgo> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cgo(ctp $$0, bml $$1, double $$2, double $$3, double $$4) {
      super(blz.bo, $$1, $$2, $$3, $$4, $$0);
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
   public float a(cth $$0, csv $$1, hx $$2, djh $$3, eer $$4, float $$5) {
      return this.z() && cbi.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blv $$1 = $$0.a();
         boolean $$4;
         if (this.w() instanceof bml $$3) {
            $$4 = $$1.a(this.dN().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bx()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dN().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bml $$6) {
            int $$7 = 0;
            if (this.dM().ak() == bjy.c) {
               $$7 = 10;
            } else if (this.dM().ak() == bjy.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bli(blk.t, 20 * $$7, 1), this.J());
            }
         }
      }
   }

   @Override
   protected void a(elr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, this.dr(), this.dt(), this.dx(), 1.0F, false, ctp.a.c);
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      return false;
   }

   @Override
   protected void c_() {
      this.an.a(e, false);
   }

   public boolean z() {
      return this.an.b(e);
   }

   public void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
