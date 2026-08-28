public class cnn extends cmo {
   private static final ajp<Boolean> g = ajt.a(cnn.class, ajr.k);

   public cnn(bsj<? extends cnn> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnn(dcd $$0, bsy $$1, double $$2, double $$3, double $$4) {
      super(bsj.br, $$1, $$2, $$3, $$4, $$0);
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
   public float a(dbv $$0, dbj $$1, ja $$2, dsh $$3, eob $$4, float $$5) {
      return this.y() && cie.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      if (this.dP() instanceof aqk $$1) {
         bsd var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof bsy $$5) {
            bqw $$6 = this.dQ().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bD()) {
                  czl.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dQ().p(), 5.0F);
         }

         if ($$7 && var8 instanceof bsy $$9) {
            int $$10 = 0;
            if (this.dP().al() == bqa.c) {
               $$10 = 10;
            } else if (this.dP().al() == bqa.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new brl(brn.t, 20 * $$10, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dcd.a.c);
         this.ao();
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajt.a $$0) {
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
