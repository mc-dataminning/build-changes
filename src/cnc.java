public class cnc extends cmd {
   private static final ajr<Boolean> e = ajv.a(cnc.class, ajt.k);

   public cnc(bsa<? extends cnc> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cnc(dax $$0, bso $$1, double $$2, double $$3, double $$4) {
      super(bsa.br, $$1, $$2, $$3, $$4, $$0);
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
   public float a(dap $$0, dad $$1, io $$2, drb $$3, emu $$4, float $$5) {
      return this.y() && chu.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bru $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof bso $$3) {
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

         if ($$4 && $$1 instanceof bso $$6) {
            int $$7 = 0;
            if (this.dP().ak() == bpr.c) {
               $$7 = 10;
            } else if (this.dP().ak() == bpr.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new brc(bre.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dax.a.c);
         this.ao();
      }
   }

   @Override
   public boolean bz() {
      return false;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.ao.a(e);
   }

   public void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
