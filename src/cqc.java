public class cqc extends cpd {
   private static final ajx<Boolean> d = akb.a(cqc.class, ajz.k);

   public cqc(buq<? extends cqc> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cqc(dgg $$0, bvf $$1, fay $$2) {
      super(buq.bK, $$1, $$2, $$0);
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
   public float a(dfy $$0, dfl $$1, ji $$2, dwv $$3, esx $$4, float $$5) {
      return this.v() && ckn.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buj var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bvf $$5) {
            bsz $$6 = this.dX().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  dcz.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dX().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bvf $$9) {
            int $$10 = 0;
            if (this.dW().am() == bsf.c) {
               $$10 = 10;
            } else if (this.dW().am() == bsf.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bto(btq.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, this.dB(), this.dD(), this.dH(), 1.0F, false, dgg.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akb.a $$0) {
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
