public abstract class cgv extends cgw {
   private static final ajp<Boolean> cb = ajt.a(cgv.class, ajr.k);
   public static final int ca = 15;
   private final bsk cd;

   protected cgv(bsn<? extends cgv> $$0, dcg $$1) {
      super($$0, $$1);
      this.cy = false;
      this.cd = $$0.n().a(bsj.a().a(bsi.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayo $$0) {
      this.f(buk.s).a((double)a($$0::a));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   public static buj.a s() {
      return gM().a(buk.v, 0.175F).a(buk.o, 0.5);
   }

   public boolean t() {
      return this.ao.a(cb);
   }

   public void w(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   protected int ab_() {
      return this.t() ? 16 : super.ab_();
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? this.cd : super.e($$0);
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.t()) {
         if (!this.dR().B) {
            this.a(dfk.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         ud $$1 = new ud();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cud $$3 = this.cu.a($$2);
            if (!$$3.e()) {
               tx $$4 = new tx();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dT(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gJ();
      if (this.t()) {
         ud $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cud.a(this.dT(), (uu)$$3).orElse(cud.l));
            }
         }
      }

      this.gK();
   }

   @Override
   public btu a_(int $$0) {
      return $$0 == 499 ? new btu() {
         @Override
         public cud a() {
            return cgv.this.t() ? new cud(cug.eN) : cud.l;
         }

         @Override
         public boolean a(cud $$0) {
            if ($$0.e()) {
               if (cgv.this.t()) {
                  cgv.this.w(false);
                  cgv.this.gJ();
               }

               return true;
            } else if ($$0.a(cug.eN)) {
               if (!cgv.this.t()) {
                  cgv.this.w(true);
                  cgv.this.gJ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      boolean $$2 = !this.o_() && this.gC() && $$0.fP();
      if (!this.bU() && !$$2) {
         cud $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bqh.a(this.dR().B);
            }

            if (!this.t() && $$3.a(cug.eN)) {
               this.d($$0, $$3);
               return bqh.a(this.dR().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cml $$0, cud $$1) {
      this.w(true);
      this.gn();
      $$1.a(1, $$0);
      this.gJ();
   }

   @Override
   protected void gn() {
      this.a(avh.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gv() {
      return 5;
   }
}
