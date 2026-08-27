public class cgw extends cfx {
   private static final agn<Boolean> e = agq.a(cgw.class, agp.k);

   public cgw(bmc<? extends cgw> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgw(ctx $$0, bmo $$1, double $$2, double $$3, double $$4) {
      super(bmc.bp, $$1, $$2, $$3, $$4, $$0);
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
   public float a(ctp $$0, ctd $$1, hx $$2, djp $$3, eez $$4, float $$5) {
      return this.z() && cbp.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (!this.dL().B) {
         blw $$1 = $$0.a();
         boolean $$4;
         if (this.w() instanceof bmo $$3) {
            $$4 = $$1.a(this.dM().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bx()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dM().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bmo $$6) {
            int $$7 = 0;
            if (this.dL().ak() == bjz.c) {
               $$7 = 10;
            } else if (this.dL().ak() == bjz.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new blj(bll.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, this.dq(), this.ds(), this.dw(), 1.0F, false, ctx.a.c);
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
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
   public void b(so $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
