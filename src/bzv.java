public abstract class bzv extends bzw {
   private static final agm<Boolean> bU = agp.a(bzv.class, ago.k);
   public static final int bT = 15;

   protected bzv(bly<? extends bzv> $$0, cto $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(auu $$0) {
      this.a(bnq.l).a((double)a($$0::a));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, false);
   }

   public static bnp.a u() {
      return gE().a(bnq.m, 0.175F).a(bnq.h, 0.5);
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
   protected float a(blv $$0, float $$1) {
      return $$0.b - (this.o_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.w()) {
         if (!this.dM().B) {
            this.a(cwr.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         st $$1 = new st();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cmx $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               sn $$4 = new sn();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gA();
      if (this.w()) {
         st $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sn $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cmx.a($$3));
            }
         }
      }

      this.gB();
   }

   @Override
   public bnc a_(int $$0) {
      return $$0 == 499 ? new bnc() {
         @Override
         public cmx a() {
            return bzv.this.w() ? new cmx(cna.eM) : cmx.f;
         }

         @Override
         public boolean a(cmx $$0) {
            if ($$0.b()) {
               if (bzv.this.w()) {
                  bzv.this.w(false);
                  bzv.this.gA();
               }

               return true;
            } else if ($$0.a(cna.eM)) {
               if (!bzv.this.w()) {
                  bzv.this.w(true);
                  bzv.this.gA();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      boolean $$2 = !this.o_() && this.gt() && $$0.fI();
      if (!this.bP() && !$$2) {
         cmx $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bka.a(this.dM().B);
            }

            if (!this.w() && $$3.a(cna.eM)) {
               this.d($$0, $$3);
               return bka.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cfh $$0, cmx $$1) {
      this.w(true);
      this.ge();
      if (!$$0.fT().d) {
         $$1.h(1);
      }

      this.gA();
   }

   @Override
   protected void ge() {
      this.a(arr.gE, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gm() {
      return 5;
   }
}
