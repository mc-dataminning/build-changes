public abstract class byp extends byq {
   private static final afo<Boolean> bU = afr.a(byp.class, afq.k);
   public static final int bT = 15;

   protected byp(bku<? extends byp> $$0, csa $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(ats $$0) {
      this.a(bmm.l).a((double)a($$0::a));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, false);
   }

   public static bml.a u() {
      return gF().a(bmm.m, 0.175F).a(bmm.h, 0.5);
   }

   public boolean w() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int ab_() {
      return this.w() ? 17 : super.ab_();
   }

   @Override
   protected float a(bkr $$0, float $$1) {
      return $$0.b - (this.n_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.w()) {
         if (!this.dN().B) {
            this.a(cvc.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         sf $$1 = new sf();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            clj $$3 = this.cp.a($$2);
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
      this.gB();
      if (this.w()) {
         sf $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            rz $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, clj.a($$3));
            }
         }
      }

      this.gC();
   }

   @Override
   public bly a_(int $$0) {
      return $$0 == 499 ? new bly() {
         @Override
         public clj a() {
            return byp.this.w() ? new clj(clm.eM) : clj.b;
         }

         @Override
         public boolean a(clj $$0) {
            if ($$0.b()) {
               if (byp.this.w()) {
                  byp.this.w(false);
                  byp.this.gB();
               }

               return true;
            } else if ($$0.a(clm.eM)) {
               if (!byp.this.w()) {
                  byp.this.w(true);
                  byp.this.gB();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      boolean $$2 = !this.n_() && this.gu() && $$0.fJ();
      if (!this.bP() && !$$2) {
         clj $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gu()) {
               this.gL();
               return bix.a(this.dN().B);
            }

            if (!this.w() && $$3.a(clm.eM)) {
               this.d($$0, $$3);
               return bix.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cdu $$0, clj $$1) {
      this.w(true);
      this.gf();
      if (!$$0.fU().d) {
         $$1.h(1);
      }

      this.gB();
   }

   @Override
   protected void gf() {
      this.a(aqr.gv, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gn() {
      return 5;
   }
}
