public abstract class cel extends cem {
   private static final aja<Boolean> bY = aje.a(cel.class, ajc.k);
   public static final int bX = 15;
   private final bqd ca;

   protected cel(bqg<? extends cel> $$0, czg $$1) {
      super($$0, $$1);
      this.cw = false;
      this.ca = $$0.n().a(bqc.a().a(bqb.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(axt $$0) {
      this.f(bsa.q).a((double)a($$0::a));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static brz.a r() {
      return gM().a(bsa.r, 0.175F).a(bsa.m, 0.5);
   }

   public boolean u() {
      return this.an.a(bY);
   }

   public void w(boolean $$0) {
      this.an.a(bY, $$0);
   }

   @Override
   protected int ab_() {
      return this.u() ? 16 : super.ab_();
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? this.ca : super.e($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.u()) {
         if (!this.dM().B) {
            this.a(dcj.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         tu $$1 = new tu();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            crs $$3 = this.cs.a($$2);
            if (!$$3.d()) {
               to $$4 = new to();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dO(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gJ();
      if (this.u()) {
         tu $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            to $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, crs.a(this.dO(), (ul)$$3).orElse(crs.i));
            }
         }
      }

      this.gK();
   }

   @Override
   public brk a_(int $$0) {
      return $$0 == 499 ? new brk() {
         @Override
         public crs a() {
            return cel.this.u() ? new crs(crv.eM) : crs.i;
         }

         @Override
         public boolean a(crs $$0) {
            if ($$0.d()) {
               if (cel.this.u()) {
                  cel.this.w(false);
                  cel.this.gJ();
               }

               return true;
            } else if ($$0.a(crv.eM)) {
               if (!cel.this.u()) {
                  cel.this.w(true);
                  cel.this.gJ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      boolean $$2 = !this.p_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         crs $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bof.a(this.dM().B);
            }

            if (!this.u() && $$3.a(crv.eM)) {
               this.d($$0, $$3);
               return bof.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cka $$0, crs $$1) {
      this.w(true);
      this.gn();
      $$1.a(1, $$0);
      this.gJ();
   }

   @Override
   protected void gn() {
      this.a(auo.hc, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gv() {
      return 5;
   }
}
