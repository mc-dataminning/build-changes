public class cqb extends cpc {
   private static final akm<Boolean> d = akq.a(cqb.class, ako.k);

   public cqb(bus<? extends cqb> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cqb(dfm $$0, bvh $$1, ezy $$2) {
      super(bus.bH, $$1, $$2, $$0);
   }

   @Override
   protected float q() {
      return this.t() ? 0.73F : super.q();
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   public float a(dfe $$0, der $$1, jh $$2, dvv $$3, erv $$4, float $$5) {
      return this.t() && ckp.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         bul var8 = $$0.a();
         boolean $$7;
         if (this.p() instanceof bvh $$5) {
            btb $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bL()) {
                  dcf.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bvh $$9) {
            int $$10 = 0;
            if (this.dV().ak() == bsh.c) {
               $$10 = 10;
            } else if (this.dV().ak() == bsh.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new btq(bts.t, 20 * $$10, 1), this.B());
            }
         }
      }
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dfm.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(d, false);
   }

   public boolean t() {
      return this.al.a(d);
   }

   public void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected boolean l() {
      return false;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("dangerous", this.t());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
