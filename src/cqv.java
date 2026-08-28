public class cqv extends cpw {
   private static final aks<Boolean> d = akw.a(cqv.class, aku.k);

   public cqv(bvi<? extends cqv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqv(dgz $$0, bvx $$1, fbr $$2) {
      super(bvi.bL, $$1, $$2, $$0);
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
   public float a(dgr $$0, dge $$1, jh $$2, dxo $$3, etq $$4, float $$5) {
      return this.v() && clf.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         bvb var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bvx $$5) {
            btr $$6 = this.dX().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  dds.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dX().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bvx $$9) {
            int $$10 = 0;
            if (this.dW().am() == bsx.c) {
               $$10 = 10;
            } else if (this.dW().am() == bsx.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bug(bui.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, this.dB(), this.dD(), this.dH(), 1.0F, false, dgz.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akw.a $$0) {
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
   public void b(um $$0) {
      super.b($$0);
      $$0.a("dangerous", this.v());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
