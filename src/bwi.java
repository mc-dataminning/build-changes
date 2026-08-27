public abstract class bwi extends bwj {
   private static final adz<Boolean> bU = aec.a(bwi.class, aeb.k);
   public static final int bT = 15;

   protected bwi(bim<? extends bwi> $$0, cpm $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(aru $$0) {
      this.a(bkf.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bke.a p() {
      return gz().a(bkf.d, 0.175F).a(bkf.n, 0.5);
   }

   public boolean q() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int V_() {
      return this.q() ? 17 : super.V_();
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
            this.a(csn.cv);
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
            ciy $$3 = this.cp.a($$2);
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
      this.gv();
      if (this.q()) {
         qx $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qr $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, ciy.a($$3));
            }
         }
      }

      this.gw();
   }

   @Override
   public bjr a_(int $$0) {
      return $$0 == 499 ? new bjr() {
         @Override
         public ciy a() {
            return bwi.this.q() ? new ciy(cjb.er) : ciy.b;
         }

         @Override
         public boolean a(ciy $$0) {
            if ($$0.b()) {
               if (bwi.this.q()) {
                  bwi.this.w(false);
                  bwi.this.gv();
               }

               return true;
            } else if ($$0.a(cjb.er)) {
               if (!bwi.this.q()) {
                  bwi.this.w(true);
                  bwi.this.gv();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      boolean $$2 = !this.i_() && this.go() && $$0.fG();
      if (!this.bO() && !$$2) {
         ciy $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.go()) {
               this.gF();
               return bgq.a(this.dK().B);
            }

            if (!this.q() && $$3.a(cjb.er)) {
               this.d($$0, $$3);
               return bgq.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cbn $$0, ciy $$1) {
      this.w(true);
      this.fZ();
      if (!$$0.fR().d) {
         $$1.h(1);
      }

      this.gv();
   }

   @Override
   protected void fZ() {
      this.a(aow.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gh() {
      return 5;
   }
}
