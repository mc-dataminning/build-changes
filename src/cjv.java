public abstract class cjv extends cjw {
   private static final ajx<Boolean> bF = akb.a(cjv.class, ajz.k);
   private final bvd bG;

   protected cjv(bvi<? extends cjv> $$0, dgz $$1) {
      super($$0, $$1);
      this.ce = false;
      this.bG = $$0.n().a(bvc.a().a(bvb.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bxg.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   public static bxf.a q() {
      return gU().a(bxg.v, 0.175F).a(bxg.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bF);
   }

   public void w(boolean $$0) {
      this.al.a(bF, $$0);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? this.bG : super.e($$0);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dkg.cD);
         this.w(false);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         tw $$1 = new tw();

         for (int $$2 = 1; $$2 < this.ca.b(); $$2++) {
            cxh $$3 = this.ca.a($$2);
            if (!$$3.f()) {
               tq $$4 = new tq();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dW(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gR();
      if (this.t()) {
         tw $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ca.b() - 1) {
               this.ca.a($$4 + 1, cxh.a(this.dW(), (un)$$3).orElse(cxh.k));
            }
         }
      }

      this.gS();
   }

   @Override
   public bwq a_(int $$0) {
      return $$0 == 499 ? new bwq() {
         @Override
         public cxh a() {
            return cjv.this.t() ? new cxh(cxl.fd) : cxh.k;
         }

         @Override
         public boolean a(cxh $$0) {
            if ($$0.f()) {
               if (cjv.this.t()) {
                  cjv.this.w(false);
                  cjv.this.gR();
               }

               return true;
            } else if ($$0.a(cxl.fd)) {
               if (!cjv.this.t()) {
                  cjv.this.w(true);
                  cjv.this.gR();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      boolean $$2 = !this.n_() && this.gJ() && $$0.ga();
      if (!this.bZ() && !$$2) {
         cxh $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gJ()) {
               this.gZ();
               return bsy.a;
            }

            if (!this.t() && $$3.a(cxl.fd)) {
               this.d($$0, $$3);
               return bsy.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cpr $$0, cxh $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gR();
   }

   @Override
   protected void x() {
      this.a(awa.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ad_() {
      return this.t() ? 5 : 0;
   }
}
