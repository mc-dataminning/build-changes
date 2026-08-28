public class cnr extends cms {
   private static final ajp<Boolean> e = ajt.a(cnr.class, ajr.k);

   public cnr(bsn<? extends cnr> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnr(dcg $$0, btc $$1, ewh $$2) {
      super(bsn.br, $$1, $$2, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bS() {
      return false;
   }

   @Override
   public float a(dby $$0, dbm $$1, ja $$2, dsl $$3, eoj $$4, float $$5) {
      return this.y() && cii.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (this.dR() instanceof aqm $$1) {
         bsh var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof btc $$5) {
            bra $$6 = this.dS().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bF()) {
                  czo.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dS().p(), 5.0F);
         }

         if ($$7 && var8 instanceof btc $$9) {
            int $$10 = 0;
            if (this.dR().al() == bqe.c) {
               $$10 = 10;
            } else if (this.dR().al() == bqe.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new brp(brr.t, 20 * $$10, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.dR().a(this, this.dw(), this.dy(), this.dC(), 1.0F, false, dcg.a.c);
         this.aq();
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(e, false);
   }

   @Override
   public boolean y() {
      return this.ao.a(e);
   }

   public void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
