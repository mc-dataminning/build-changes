public abstract class bwk extends bwl {
   private static final aec<Boolean> bU = aef.a(bwk.class, aee.k);
   public static final int bT = 15;

   protected bwk(bip<? extends bwk> $$0, cpq $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(arx $$0) {
      this.a(bkh.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bkg.a p() {
      return gA().a(bkh.d, 0.175F).a(bkh.n, 0.5);
   }

   public boolean q() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int U_() {
      return this.q() ? 17 : super.U_();
   }

   @Override
   protected float a(bim $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.q()) {
         if (!this.dK().B) {
            this.a(csr.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.q());
      if (this.q()) {
         ra $$1 = new ra();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cja $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               qu $$4 = new qu();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gw();
      if (this.q()) {
         ra $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qu $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cja.a($$3));
            }
         }
      }

      this.gx();
   }

   @Override
   public bjt a_(int $$0) {
      return $$0 == 499 ? new bjt() {
         @Override
         public cja a() {
            return bwk.this.q() ? new cja(cjd.er) : cja.b;
         }

         @Override
         public boolean a(cja $$0) {
            if ($$0.b()) {
               if (bwk.this.q()) {
                  bwk.this.w(false);
                  bwk.this.gw();
               }

               return true;
            } else if ($$0.a(cjd.er)) {
               if (!bwk.this.q()) {
                  bwk.this.w(true);
                  bwk.this.gw();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      boolean $$2 = !this.i_() && this.gp() && $$0.fG();
      if (!this.bO() && !$$2) {
         cja $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gp()) {
               this.gG();
               return bgt.a(this.dK().B);
            }

            if (!this.q() && $$3.a(cjd.er)) {
               this.d($$0, $$3);
               return bgt.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cbp $$0, cja $$1) {
      this.w(true);
      this.ga();
      if (!$$0.fR().d) {
         $$1.h(1);
      }

      this.gw();
   }

   @Override
   protected void ga() {
      this.a(aoz.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gi() {
      return 5;
   }
}
