public class csm extends crl {
   private static final akj<Boolean> d = akn.a(csm.class, akl.k);

   public csm(bwo<? extends csm> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csm(dja $$0, bxe $$1, feq $$2) {
      super(bwo.bL, $$1, $$2, $$0);
   }

   @Override
   protected float m() {
      return this.o() ? 0.73F : super.m();
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   public float a(dit $$0, dig $$1, iu $$2, eah $$3, ewo $$4, float $$5) {
      return this.o() && cmu.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fen $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwf var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bxe $$5) {
            buu $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bK()) {
                  dfs.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bxe $$9) {
            int $$10 = 0;
            if (this.dV().an() == bua.c) {
               $$10 = 10;
            } else if (this.dV().an() == bua.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bvj(bvl.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(feo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dja.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(d, false);
   }

   public boolean o() {
      return this.al.a(d);
   }

   public void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("dangerous", this.o());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
