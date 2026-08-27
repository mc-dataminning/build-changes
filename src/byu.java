public abstract class byu extends byv {
   private static final afs<Boolean> bU = afv.a(byu.class, afu.k);
   public static final int bT = 15;

   protected byu(bkz<? extends byu> $$0, csf $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(atw $$0) {
      this.a(bmr.l).a((double)a($$0::a));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, false);
   }

   public static bmq.a u() {
      return gF().a(bmr.m, 0.175F).a(bmr.h, 0.5);
   }

   public boolean w() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int ac_() {
      return this.w() ? 17 : super.ac_();
   }

   @Override
   protected float a(bkw $$0, float $$1) {
      return $$0.b - (this.o_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.w()) {
         if (!this.dN().B) {
            this.a(cvh.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         sj $$1 = new sj();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            clo $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               sd $$4 = new sd();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gB();
      if (this.w()) {
         sj $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sd $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, clo.a($$3));
            }
         }
      }

      this.gC();
   }

   @Override
   public bmd a_(int $$0) {
      return $$0 == 499 ? new bmd() {
         @Override
         public clo a() {
            return byu.this.w() ? new clo(clr.eM) : clo.b;
         }

         @Override
         public boolean a(clo $$0) {
            if ($$0.b()) {
               if (byu.this.w()) {
                  byu.this.w(false);
                  byu.this.gB();
               }

               return true;
            } else if ($$0.a(clr.eM)) {
               if (!byu.this.w()) {
                  byu.this.w(true);
                  byu.this.gB();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      boolean $$2 = !this.o_() && this.gu() && $$0.fJ();
      if (!this.bP() && !$$2) {
         clo $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gu()) {
               this.gL();
               return bjb.a(this.dN().B);
            }

            if (!this.w() && $$3.a(clr.eM)) {
               this.d($$0, $$3);
               return bjb.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cdz $$0, clo $$1) {
      this.w(true);
      this.gf();
      if (!$$0.fU().d) {
         $$1.h(1);
      }

      this.gB();
   }

   @Override
   protected void gf() {
      this.a(aqv.gv, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gn() {
      return 5;
   }
}
