public class cnq extends cmr {
   private static final ajp<Boolean> e = ajt.a(cnq.class, ajr.k);

   public cnq(bsm<? extends cnq> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnq(dcf $$0, btb $$1, ewf $$2) {
      super(bsm.br, $$1, $$2, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   public float a(dbx $$0, dbl $$1, ja $$2, dsk $$3, eoh $$4, float $$5) {
      return this.y() && cih.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqm $$1) {
         bsg var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof btb $$5) {
            bqz $$6 = this.dR().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bE()) {
                  czn.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dR().p(), 5.0F);
         }

         if ($$7 && var8 instanceof btb $$9) {
            int $$10 = 0;
            if (this.dQ().al() == bqd.c) {
               $$10 = 10;
            } else if (this.dQ().al() == bqd.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bro(brq.t, 20 * $$10, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.dQ().a(this, this.dv(), this.dx(), this.dB(), 1.0F, false, dcf.a.c);
         this.ap();
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajt.a $$0) {
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
