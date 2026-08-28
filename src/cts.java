public class cts extends csr {
   private static final aku<Boolean> d = aky.a(cts.class, akw.k);
   private static final boolean e = false;

   public cts(bxn<? extends cts> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public cts(dkj $$0, byf $$1, fgc $$2) {
      super(bxn.bM, $$1, $$2, $$0);
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
   public float a(dkc $$0, djn $$1, iw $$2, ebq $$3, eya $$4, float $$5) {
      return this.o() && coa.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         bxe var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof byf $$5) {
            bvt $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bJ()) {
                  dgz.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof byf $$9) {
            int $$10 = 0;
            if (this.dV().an() == buz.c) {
               $$10 = 10;
            } else if (this.dV().an() == buz.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bwi(bwk.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dkj.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(aky.a $$0) {
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
