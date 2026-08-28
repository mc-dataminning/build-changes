public class crd extends cqe {
   private static final alc<Boolean> d = alg.a(crd.class, ale.k);

   public crd(bvq<? extends crd> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public crd(dhh $$0, bwf $$1, fbx $$2) {
      super(bvq.bL, $$1, $$2, $$0);
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
   public float a(dgz $$0, dgm $$1, jh $$2, dxu $$3, etw $$4, float $$5) {
      return this.v() && cln.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvj var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bwf $$5) {
            btz $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  dea.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bwf $$9) {
            int $$10 = 0;
            if (this.dV().al() == btf.c) {
               $$10 = 10;
            } else if (this.dV().al() == btf.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new buo(buq.t, 20 * $$10, 1), this.D());
            }
         }
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dhh.a.c);
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
