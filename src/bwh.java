public abstract class bwh extends bwi {
   private static final adz<Boolean> bU = aec.a(bwh.class, aeb.k);
   public static final int bT = 15;

   protected bwh(bim<? extends bwh> $$0, cpl $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(aru $$0) {
      this.a(bke.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bkd.a p() {
      return gA().a(bke.d, 0.175F).a(bke.n, 0.5);
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
   protected float a(bij $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.q()) {
         if (!this.dK().B) {
            this.a(csm.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.q());
      if (this.q()) {
         qx $$1 = new qx();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cix $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               qr $$4 = new qr();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gw();
      if (this.q()) {
         qx $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qr $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cix.a($$3));
            }
         }
      }

      this.gx();
   }

   @Override
   public bjq a_(int $$0) {
      return $$0 == 499 ? new bjq() {
         @Override
         public cix a() {
            return bwh.this.q() ? new cix(cja.er) : cix.b;
         }

         @Override
         public boolean a(cix $$0) {
            if ($$0.b()) {
               if (bwh.this.q()) {
                  bwh.this.w(false);
                  bwh.this.gw();
               }

               return true;
            } else if ($$0.a(cja.er)) {
               if (!bwh.this.q()) {
                  bwh.this.w(true);
                  bwh.this.gw();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      boolean $$2 = !this.i_() && this.gp() && $$0.fG();
      if (!this.bO() && !$$2) {
         cix $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gp()) {
               this.gG();
               return bgq.a(this.dK().B);
            }

            if (!this.q() && $$3.a(cja.er)) {
               this.d($$0, $$3);
               return bgq.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cbm $$0, cix $$1) {
      this.w(true);
      this.ga();
      if (!$$0.fR().d) {
         $$1.h(1);
      }

      this.gw();
   }

   @Override
   protected void ga() {
      this.a(aow.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gi() {
      return 5;
   }
}
