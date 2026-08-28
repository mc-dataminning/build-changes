public class cth extends csg {
   private static final akl<Boolean> d = akp.a(cth.class, akn.k);
   private static final boolean e = false;

   public cth(bxc<? extends cth> $$0, djx $$1) {
      super($$0, $$1);
   }

   public cth(djx $$0, bxu $$1, ffq $$2) {
      super(bxc.bM, $$1, $$2, $$0);
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
   public float a(djq $$0, djb $$1, iv $$2, ebe $$3, exo $$4, float $$5) {
      return this.o() && cnp.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ffn $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         bwt var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bxu $$5) {
            bvi $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bJ()) {
                  dgn.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bxu $$9) {
            int $$10 = 0;
            if (this.dV().an() == buo.c) {
               $$10 = 10;
            } else if (this.dV().an() == buo.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bvx(bvz.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, djx.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(akp.a $$0) {
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
      this.a($$0.b("dangerous", false));
   }
}
