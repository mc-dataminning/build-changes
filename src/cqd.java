public class cqd extends cpe {
   private static final ajy<Boolean> d = akc.a(cqd.class, aka.k);

   public cqd(bur<? extends cqd> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cqd(dgh $$0, bvg $$1, faz $$2) {
      super(bur.bK, $$1, $$2, $$0);
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
   public float a(dfz $$0, dfm $$1, ji $$2, dww $$3, esy $$4, float $$5) {
      return this.v() && cko.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         buk var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bvg $$5) {
            bta $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  dda.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bvg $$9) {
            int $$10 = 0;
            if (this.dV().am() == bsg.c) {
               $$10 = 10;
            } else if (this.dV().am() == bsg.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new btp(btr.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dgh.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akc.a $$0) {
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
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("dangerous", this.v());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
