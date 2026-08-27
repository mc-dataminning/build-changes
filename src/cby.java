public abstract class cby extends cbz {
   private static final aie<Boolean> bU = aih.a(cby.class, aig.k);
   public static final int bT = 15;
   private final bnt bW;

   protected cby(bnw<? extends cby> $$0, cvr $$1) {
      super($$0, $$1);
      this.ct = false;
      this.bW = $$0.n().a(bns.a().a(bnr.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(awp $$0) {
      this.f(bpp.n).a((double)a($$0::a));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, false);
   }

   public static bpo.a u() {
      return gG().a(bpp.o, 0.175F).a(bpp.j, 0.5);
   }

   public boolean w() {
      return this.am.b(bU);
   }

   public void w(boolean $$0) {
      this.am.b(bU, $$0);
   }

   @Override
   protected int ac_() {
      return this.w() ? 17 : super.ac_();
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? this.bW : super.e($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.w()) {
         if (!this.dM().B) {
            this.a(cyu.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         tc $$1 = new tc();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cpd $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               sw $$4 = new sw();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gC();
      if (this.w()) {
         tc $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sw $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cpd.a($$3));
            }
         }
      }

      this.gD();
   }

   @Override
   public boz a_(int $$0) {
      return $$0 == 499 ? new boz() {
         @Override
         public cpd a() {
            return cby.this.w() ? new cpd(cpg.eM) : cpd.h;
         }

         @Override
         public boolean a(cpd $$0) {
            if ($$0.b()) {
               if (cby.this.w()) {
                  cby.this.w(false);
                  cby.this.gC();
               }

               return true;
            } else if ($$0.a(cpg.eM)) {
               if (!cby.this.w()) {
                  cby.this.w(true);
                  cby.this.gC();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      boolean $$2 = !this.o_() && this.gv() && $$0.fI();
      if (!this.bP() && !$$2) {
         cpd $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gv()) {
               this.gM();
               return blw.a(this.dM().B);
            }

            if (!this.w() && $$3.a(cpg.eM)) {
               this.d($$0, $$3);
               return blw.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(chl $$0, cpd $$1) {
      this.w(true);
      this.gg();
      if (!$$0.fU().d) {
         $$1.h(1);
      }

      this.gC();
   }

   @Override
   protected void gg() {
      this.a(atl.gU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   public int go() {
      return 5;
   }
}
