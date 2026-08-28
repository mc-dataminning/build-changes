public class ctj extends csi {
   private static final akn<Boolean> d = akr.a(ctj.class, akp.k);
   private static final boolean e = false;

   public ctj(bxe<? extends ctj> $$0, djz $$1) {
      super($$0, $$1);
   }

   public ctj(djz $$0, bxw $$1, ffs $$2) {
      super(bxe.bM, $$1, $$2, $$0);
   }

   @Override
   protected float m() {
      return this.o() ? 0.73F : super.m();
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   public float a(djs $$0, djd $$1, iw $$2, ebg $$3, exq $$4, float $$5) {
      return this.o() && cnr.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         bwv var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bxw $$5) {
            bvk $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bJ()) {
                  dgp.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bxw $$9) {
            int $$10 = 0;
            if (this.dV().an() == buq.c) {
               $$10 = 10;
            } else if (this.dV().an() == buq.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bvz(bwb.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, djz.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(akr.a $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("dangerous", this.o());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.b("dangerous", false));
   }
}
