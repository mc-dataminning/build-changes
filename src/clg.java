public abstract class clg extends clh {
   private static final akj<Boolean> bG = akn.a(clg.class, akl.k);
   private final bwi bH;

   protected clg(bwo<? extends clg> $$0, dja $$1) {
      super($$0, $$1);
      this.cc = false;
      this.bH = $$0.n().a(bwh.a().a(bwg.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byk.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   public static byj.a q() {
      return gS().a(byk.v, 0.175F).a(byk.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bG);
   }

   public void w(boolean $$0) {
      this.al.a(bG, $$0);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? this.bH : super.e($$0);
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dmh.cG);
         this.w(false);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uf $$1 = new uf();

         for (int $$2 = 0; $$2 < this.bY.b(); $$2++) {
            czd $$3 = this.bY.a($$2);
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
      this.gQ();
      if (this.t()) {
         uf $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tz $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.bY.b()) {
               this.bY.a($$4, czd.a(this.dX(), (uw)$$3).orElse(czd.k));
            }
         }
      }
   }

   @Override
   public bxv a_(int $$0) {
      return $$0 == 499 ? new bxv() {
         @Override
         public czd a() {
            return clg.this.t() ? new czd(czh.fh) : czd.k;
         }

         @Override
         public boolean a(czd $$0) {
            if ($$0.f()) {
               if (clg.this.t()) {
                  clg.this.w(false);
                  clg.this.gQ();
               }

               return true;
            } else if ($$0.a(czh.fh)) {
               if (!clg.this.t()) {
                  clg.this.w(true);
                  clg.this.gQ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      boolean $$2 = !this.n_() && this.gI() && $$0.fY();
      if (!this.ca() && !$$2) {
         czd $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gI()) {
               this.gX();
               return bud.a;
            }

            if (!this.t() && $$3.a(czh.fh)) {
               this.d($$0, $$3);
               return bud.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(crc $$0, czd $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gQ();
   }

   @Override
   protected void x() {
      this.a(awn.hF, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ab_() {
      return this.t() ? 5 : 0;
   }
}
