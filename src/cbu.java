public abstract class cbu extends cbv {
   private static final aie<Boolean> bU = aih.a(cbu.class, aig.k);
   public static final int bT = 15;
   private final bnr bW;

   protected cbu(bnu<? extends cbu> $$0, cvn $$1) {
      super($$0, $$1);
      this.ct = false;
      this.bW = $$0.n().a(bnq.a().a(bnp.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(awo $$0) {
      this.f(bpl.n).a((double)a($$0::a));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, false);
   }

   public static bpk.a u() {
      return gG().a(bpl.o, 0.175F).a(bpl.j, 0.5);
   }

   public boolean w() {
      return this.am.b(bU);
   }

   public void w(boolean $$0) {
      this.am.b(bU, $$0);
   }

   @Override
   protected int ac_() {
      return this.w() ? 17 : super.ac_();
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? this.bW : super.e($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.w()) {
         if (!this.dM().B) {
            this.a(cyq.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         tc $$1 = new tc();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            coz $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               sw $$4 = new sw();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gC();
      if (this.w()) {
         tc $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sw $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, coz.a($$3));
            }
         }
      }

      this.gD();
   }

   @Override
   public box a_(int $$0) {
      return $$0 == 499 ? new box() {
         @Override
         public coz a() {
            return cbu.this.w() ? new coz(cpc.eM) : coz.h;
         }

         @Override
         public boolean a(coz $$0) {
            if ($$0.b()) {
               if (cbu.this.w()) {
                  cbu.this.w(false);
                  cbu.this.gC();
               }

               return true;
            } else if ($$0.a(cpc.eM)) {
               if (!cbu.this.w()) {
                  cbu.this.w(true);
                  cbu.this.gC();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      boolean $$2 = !this.o_() && this.gv() && $$0.fI();
      if (!this.bP() && !$$2) {
         coz $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gv()) {
               this.gM();
               return blu.a(this.dM().B);
            }

            if (!this.w() && $$3.a(cpc.eM)) {
               this.d($$0, $$3);
               return blu.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(chh $$0, coz $$1) {
      this.w(true);
      this.gg();
      if (!$$0.fU().d) {
         $$1.h(1);
      }

      this.gC();
   }

   @Override
   protected void gg() {
      this.a(atk.gT, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   public int go() {
      return 5;
   }
}
