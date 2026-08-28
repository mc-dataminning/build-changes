public class coc extends cnd {
   private static final akj<Boolean> g = akn.a(coc.class, akl.k);

   public coc(bsz<? extends coc> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public coc(dbx $$0, bto $$1, double $$2, double $$3, double $$4) {
      super(bsz.br, $$1, $$2, $$3, $$4, $$0);
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
   public float a(dbp $$0, dbd $$1, iz $$2, dsb $$3, enu $$4, float $$5) {
      return this.y() && ciu.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bst $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof bto $$3) {
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

         if ($$4 && $$1 instanceof bto $$6) {
            int $$7 = 0;
            if (this.dP().al() == bqq.c) {
               $$7 = 10;
            } else if (this.dP().al() == bqq.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bsb(bsd.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dbx.a.c);
         this.ao();
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
