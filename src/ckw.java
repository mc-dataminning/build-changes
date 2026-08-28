public abstract class ckw extends ckx {
   private static final akh<Boolean> bF = akl.a(ckw.class, akj.k);
   private final bwd bG;

   protected ckw(bwj<? extends ckw> $$0, dip $$1) {
      super($$0, $$1);
      this.cb = false;
      this.bG = $$0.n().a(bwc.a().a(bwb.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azt $$0) {
      this.g(byf.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   public static bye.a q() {
      return gR().a(byf.v, 0.175F).a(byf.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bF);
   }

   public void w(boolean $$0) {
      this.al.a(bF, $$0);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? this.bG : super.e($$0);
   }

   @Override
   protected void f(aro $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dlw.cD);
         this.w(false);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         ud $$1 = new ud();

         for (int $$2 = 0; $$2 < this.bX.b(); $$2++) {
            cys $$3 = this.bX.a($$2);
            if (!$$3.f()) {
               tx $$4 = new tx();
               $$4.a("Slot", (byte)$$2);
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gP();
      if (this.t()) {
         ud $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.bX.b()) {
               this.bX.a($$4, cys.a(this.dX(), (uu)$$3).orElse(cys.k));
            }
         }
      }
   }

   @Override
   public bxq a_(int $$0) {
      return $$0 == 499 ? new bxq() {
         @Override
         public cys a() {
            return ckw.this.t() ? new cys(cyw.fd) : cys.k;
         }

         @Override
         public boolean a(cys $$0) {
            if ($$0.f()) {
               if (ckw.this.t()) {
                  ckw.this.w(false);
                  ckw.this.gP();
               }

               return true;
            } else if ($$0.a(cyw.fd)) {
               if (!ckw.this.t()) {
                  ckw.this.w(true);
                  ckw.this.gP();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      boolean $$2 = !this.n_() && this.gH() && $$0.fX();
      if (!this.ca() && !$$2) {
         cys $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.k($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gH()) {
               this.gW();
               return bty.a;
            }

            if (!this.t() && $$3.a(cyw.fd)) {
               this.d($$0, $$3);
               return bty.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cqs $$0, cys $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gP();
   }

   @Override
   protected void x() {
      this.a(awl.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int aa_() {
      return this.t() ? 5 : 0;
   }
}
