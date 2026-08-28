public class csh extends crg {
   private static final akj<Boolean> d = akn.a(csh.class, akl.k);

   public csh(bwm<? extends csh> $$0, div $$1) {
      super($$0, $$1);
   }

   public csh(div $$0, bxc $$1, fei $$2) {
      super(bwm.bL, $$1, $$2, $$0);
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
   public float a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4, float $$5) {
      return this.o() && cmq.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwd var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bxc $$5) {
            bus $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bK()) {
                  dfn.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bxc $$9) {
            int $$10 = 0;
            if (this.dV().an() == bty.c) {
               $$10 = 10;
            } else if (this.dV().an() == bty.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bvh(bvj.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, div.a.c);
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
