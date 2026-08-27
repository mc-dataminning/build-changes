public class cmq extends cmh implements dob {
   private boolean d = true;

   public cmq(bqr<? extends cmq> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cmq(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cmg.a v() {
      return cmg.a.f;
   }

   @Override
   public dpy x() {
      return dcx.hc.n();
   }

   @Override
   public int z() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.G()) {
         this.b($$4);
      }
   }

   public boolean G() {
      return this.d;
   }

   public void b(boolean $$0) {
      this.d = $$0;
   }

   @Override
   public double H() {
      return this.ds();
   }

   @Override
   public double I() {
      return this.du() + 0.5;
   }

   @Override
   public double J() {
      return this.dy();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B && this.bB() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (doc.a(this.dN(), this)) {
         return true;
      } else {
         for (cgv $$1 : this.dN().a(cgv.class, this.cI().c(0.25, 0.0, 0.25), bqq.a)) {
            if (doc.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cry ag_() {
      return csg.nQ;
   }

   @Override
   protected void b(ty $$0) {
      super.b($$0);
      $$0.a("Enabled", this.d);
   }

   @Override
   protected void a(ty $$0) {
      super.a($$0);
      this.d = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cnh a(int $$0, ckk $$1) {
      return new cog($$0, $$1, this);
   }
}
