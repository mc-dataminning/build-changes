public abstract class byh extends byi {
   private static final afm<Boolean> bU = afp.a(byh.class, afo.k);
   public static final int bT = 15;

   protected byh(bkm<? extends byh> $$0, crs $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(ato $$0) {
      this.a(bme.l).a((double)a($$0::a));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, false);
   }

   public static bmd.a s() {
      return gE().a(bme.m, 0.175F).a(bme.h, 0.5);
   }

   public boolean t() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int aa_() {
      return this.t() ? 17 : super.aa_();
   }

   @Override
   protected float a(bkj $$0, float $$1) {
      return $$0.b - (this.n_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.t()) {
         if (!this.dL().B) {
            this.a(cuv.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         sf $$1 = new sf();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            clb $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               rz $$4 = new rz();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gA();
      if (this.t()) {
         sf $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            rz $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, clb.a($$3));
            }
         }
      }

      this.gB();
   }

   @Override
   public blq a_(int $$0) {
      return $$0 == 499 ? new blq() {
         @Override
         public clb a() {
            return byh.this.t() ? new clb(cle.er) : clb.b;
         }

         @Override
         public boolean a(clb $$0) {
            if ($$0.b()) {
               if (byh.this.t()) {
                  byh.this.w(false);
                  byh.this.gA();
               }

               return true;
            } else if ($$0.a(cle.er)) {
               if (!byh.this.t()) {
                  byh.this.w(true);
                  byh.this.gA();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      boolean $$2 = !this.n_() && this.gt() && $$0.fI();
      if (!this.bO() && !$$2) {
         clb $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return biq.a(this.dL().B);
            }

            if (!this.t() && $$3.a(cle.er)) {
               this.d($$0, $$3);
               return biq.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cdm $$0, clb $$1) {
      this.w(true);
      this.ge();
      if (!$$0.fT().d) {
         $$1.h(1);
      }

      this.gA();
   }

   @Override
   protected void ge() {
      this.a(aqn.gf, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gm() {
      return 5;
   }
}
