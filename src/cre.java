public class cre extends cqf {
   private static final alc<Boolean> d = alg.a(cre.class, ale.k);

   public cre(bvr<? extends cre> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cre(dhi $$0, bwg $$1, fby $$2) {
      super(bvr.bL, $$1, $$2, $$0);
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
   public float a(dha $$0, dgn $$1, jh $$2, dxv $$3, etx $$4, float $$5) {
      return this.v() && clo.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         bvk var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bwg $$5) {
            bua $$6 = this.dX().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  deb.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dX().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bwg $$9) {
            int $$10 = 0;
            if (this.dW().al() == btg.c) {
               $$10 = 10;
            } else if (this.dW().al() == btg.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bup(bur.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, this.dB(), this.dD(), this.dH(), 1.0F, false, dhi.a.c);
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
