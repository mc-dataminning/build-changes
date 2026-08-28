public abstract class clc extends cld {
   private static final akj<Boolean> bF = akn.a(clc.class, akl.k);
   private final bwg bG;

   protected clc(bwm<? extends clc> $$0, div $$1) {
      super($$0, $$1);
      this.cb = false;
      this.bG = $$0.n().a(bwf.a().a(bwe.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byi.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   public static byh.a q() {
      return gR().a(byi.v, 0.175F).a(byi.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bF);
   }

   public void w(boolean $$0) {
      this.al.a(bF, $$0);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? this.bG : super.e($$0);
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dmc.cE);
         this.w(false);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uf $$1 = new uf();

         for (int $$2 = 0; $$2 < this.bX.b(); $$2++) {
            cyy $$3 = this.bX.a($$2);
            if (!$$3.f()) {
               tz $$4 = new tz();
               $$4.a("Slot", (byte)$$2);
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gP();
      if (this.t()) {
         uf $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tz $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.bX.b()) {
               this.bX.a($$4, cyy.a(this.dX(), (uw)$$3).orElse(cyy.k));
            }
         }
      }
   }

   @Override
   public bxt a_(int $$0) {
      return $$0 == 499 ? new bxt() {
         @Override
         public cyy a() {
            return clc.this.t() ? new cyy(czc.ff) : cyy.k;
         }

         @Override
         public boolean a(cyy $$0) {
            if ($$0.f()) {
               if (clc.this.t()) {
                  clc.this.w(false);
                  clc.this.gP();
               }

               return true;
            } else if ($$0.a(czc.ff)) {
               if (!clc.this.t()) {
                  clc.this.w(true);
                  clc.this.gP();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      boolean $$2 = !this.n_() && this.gH() && $$0.fX();
      if (!this.ca() && !$$2) {
         cyy $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gH()) {
               this.gW();
               return bub.a;
            }

            if (!this.t() && $$3.a(czc.ff)) {
               this.d($$0, $$3);
               return bub.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cqy $$0, cyy $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gP();
   }

   @Override
   protected void x() {
      this.a(awn.hD, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int aa_() {
      return this.t() ? 5 : 0;
   }
}
