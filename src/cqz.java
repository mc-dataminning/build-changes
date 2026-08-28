public class cqz extends cqa {
   private static final alc<Boolean> d = alg.a(cqz.class, ale.k);

   public cqz(bvm<? extends cqz> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqz(dha $$0, bwb $$1, fbs $$2) {
      super(bvm.bL, $$1, $$2, $$0);
   }

   @Override
   protected float t() {
      return this.v() ? 0.73F : super.t();
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   public float a(dgs $$0, dgf $$1, jh $$2, dxn $$3, etp $$4, float $$5) {
      return this.v() && clj.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvf var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bwb $$5) {
            btv $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  ddt.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bwb $$9) {
            int $$10 = 0;
            if (this.dV().al() == btb.c) {
               $$10 = 10;
            } else if (this.dV().al() == btb.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new buk(bum.t, 20 * $$10, 1), this.D());
            }
         }
      }
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dha.a.c);
         this.at();
      }
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(d, false);
   }

   public boolean v() {
      return this.al.a(d);
   }

   public void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected boolean m() {
      return false;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("dangerous", this.v());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
