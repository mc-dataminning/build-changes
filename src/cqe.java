public class cqe extends cpf {
   private static final ajx<Boolean> d = akb.a(cqe.class, ajz.k);

   public cqe(bur<? extends cqe> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cqe(dgi $$0, bvg $$1, fba $$2) {
      super(bur.bL, $$1, $$2, $$0);
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
   public float a(dga $$0, dfn $$1, ji $$2, dwx $$3, esz $$4, float $$5) {
      return this.v() && cko.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buk var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bvg $$5) {
            bta $$6 = this.dX().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  ddb.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dX().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bvg $$9) {
            int $$10 = 0;
            if (this.dW().am() == bsg.c) {
               $$10 = 10;
            } else if (this.dW().am() == bsg.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new btp(btr.t, 20 * $$10, 1), this.E());
            }
         }
      }
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, this.dB(), this.dD(), this.dH(), 1.0F, false, dgi.a.c);
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
