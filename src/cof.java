public class cof extends cng {
   private static final akk<Boolean> g = ako.a(cof.class, akm.k);

   public cof(btc<? extends cof> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cof(dca $$0, btr $$1, double $$2, double $$3, double $$4) {
      super(btc.br, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   public float a(dbs $$0, dbg $$1, iz $$2, dse $$3, enx $$4, float $$5) {
      return this.y() && cix.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsw $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof btr $$3) {
            $$4 = $$1.a(this.dQ().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bD()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dQ().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof btr $$6) {
            int $$7 = 0;
            if (this.dP().al() == bqt.c) {
               $$7 = 10;
            } else if (this.dP().al() == bqt.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bse(bsg.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(evr $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dca.a.c);
         this.ao();
      }
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, false);
   }

   public boolean y() {
      return this.ao.a(g);
   }

   public void a(boolean $$0) {
      this.ao.a(g, $$0);
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
