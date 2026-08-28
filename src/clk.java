public abstract class clk extends cll {
   private static final akj<Boolean> bG = akn.a(clk.class, akl.k);
   private final bwl bH;

   protected clk(bwr<? extends clk> $$0, djh $$1) {
      super($$0, $$1);
      this.cc = false;
      this.bH = $$0.n().a(bwk.a().a(bwj.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byp.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   public static byo.a q() {
      return gU().a(byp.v, 0.175F).a(byp.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bG);
   }

   public void w(boolean $$0) {
      this.al.a(bG, $$0);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? this.bH : super.e($$0);
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dmo.cG);
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
            czk $$3 = this.bY.a($$2);
            if (!$$3.f()) {
               tz $$4 = new tz();
               $$4.a("Slot", (byte)$$2);
               $$1.add($$3.b(this.dW(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("ChestedHorse"));
      this.gS();
      if (this.t()) {
         uf $$1 = $$0.d("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tz $$3 = $$1.a($$2);
            int $$4 = $$3.d("Slot") & 255;
            if ($$4 < this.bY.b()) {
               this.bY.a($$4, czk.a(this.dW(), $$3).orElse(czk.k));
            }
         }
      }
   }

   @Override
   public bya a_(int $$0) {
      return $$0 == 499 ? new bya() {
         @Override
         public czk a() {
            return clk.this.t() ? new czk(czo.fh) : czk.k;
         }

         @Override
         public boolean a(czk $$0) {
            if ($$0.f()) {
               if (clk.this.t()) {
                  clk.this.w(false);
                  clk.this.gS();
               }

               return true;
            } else if ($$0.a(czo.fh)) {
               if (!clk.this.t()) {
                  clk.this.w(true);
                  clk.this.gS();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      boolean $$2 = !this.n_() && this.gK() && $$0.fX();
      if (!this.bY() && !$$2) {
         czk $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gK()) {
               this.gZ();
               return bug.a;
            }

            if (!this.t() && $$3.a(czo.fh)) {
               this.d($$0, $$3);
               return bug.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(crj $$0, czk $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gS();
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
