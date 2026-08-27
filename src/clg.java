public class clg extends ckh {
   private static final aja<Boolean> e = aje.a(clg.class, ajc.k);

   public clg(bqg<? extends clg> $$0, czg $$1) {
      super($$0, $$1);
   }

   public clg(czg $$0, bqt $$1, double $$2, double $$3, double $$4) {
      super(bqg.bq, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public float a(cyy $$0, cym $$1, id $$2, dpi $$3, elb $$4, float $$5) {
      return this.y() && cfy.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bqa $$1 = $$0.a();
         boolean $$4;
         if (this.u() instanceof bqt $$3) {
            $$4 = $$1.a(this.dN().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bA()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dN().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bqt $$6) {
            int $$7 = 0;
            if (this.dM().ak() == boc.c) {
               $$7 = 10;
            } else if (this.dM().ak() == boc.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bpm(bpo.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(esh $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, this.dr(), this.dt(), this.dx(), 1.0F, false, czg.a.c);
         this.am();
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.an.a(e);
   }

   public void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
