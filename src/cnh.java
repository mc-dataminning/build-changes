public class cnh extends cmf {
   private static final ajy<Boolean> e = akc.a(cnh.class, aka.k);

   public cnh(bsb<? extends cnh> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnh(dca $$0, bso $$1, double $$2, double $$3, double $$4) {
      super(bsb.bv, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   public float a(dbs $$0, dbg $$1, ir $$2, dtc $$3, epe $$4, float $$5) {
      return this.y() && chu.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      if (!this.dU().C) {
         brv $$1 = $$0.a();
         boolean $$4;
         if (this.t() instanceof bso $$3) {
            $$4 = $$1.a(this.dX().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bI()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dX().p(), 5.0F);
         }

         if ($$4 && $$1 instanceof bso $$6) {
            int $$7 = 0;
            if (this.dU().al() == bpx.c) {
               $$7 = 10;
            } else if (this.dU().al() == bpx.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new brh(brj.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, this.dz(), this.dB(), this.dF(), 1.0F, false, dca.a.c);
         this.ao();
      }
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.as.a(e);
   }

   public void a(boolean $$0) {
      this.as.a(e, $$0);
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
