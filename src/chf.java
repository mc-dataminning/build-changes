public abstract class chf extends chg {
   private static final ajv<Boolean> cb = ajz.a(chf.class, ajx.k);
   public static final int ca = 15;
   private final bst cc;

   protected chf(bsw<? extends chf> $$0, dcu $$1) {
      super($$0, $$1);
      this.cy = false;
      this.cc = $$0.n().a(bss.a().a(bsr.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayv $$0) {
      this.f(buu.s).a((double)a($$0::a));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   public static but.a s() {
      return gL().a(buu.v, 0.175F).a(buu.o, 0.5);
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
   public bst e(bty $$0) {
      return this.o_() ? this.cc : super.e($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.t()) {
         if (!this.dQ().B) {
            this.a(dfy.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         ug $$1 = new ug();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cuo $$3 = this.cu.a($$2);
            if (!$$3.e()) {
               ua $$4 = new ua();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dS(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gI();
      if (this.t()) {
         ug $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cuo.a(this.dS(), (ux)$$3).orElse(cuo.l));
            }
         }
      }

      this.gJ();
   }

   @Override
   public bue a_(int $$0) {
      return $$0 == 499 ? new bue() {
         @Override
         public cuo a() {
            return chf.this.t() ? new cuo(cur.eN) : cuo.l;
         }

         @Override
         public boolean a(cuo $$0) {
            if ($$0.e()) {
               if (chf.this.t()) {
                  chf.this.w(false);
                  chf.this.gI();
               }

               return true;
            } else if ($$0.a(cur.eN)) {
               if (!chf.this.t()) {
                  chf.this.w(true);
                  chf.this.gI();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      boolean $$2 = !this.o_() && this.gB() && $$0.fO();
      if (!this.bT() && !$$2) {
         cuo $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gB()) {
               this.gR();
               return bqq.a(this.dQ().B);
            }

            if (!this.t() && $$3.a(cur.eN)) {
               this.d($$0, $$3);
               return bqq.a(this.dQ().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmv $$0, cuo $$1) {
      this.w(true);
      this.gm();
      $$1.a(1, $$0);
      this.gI();
   }

   @Override
   protected void gm() {
      this.a(avo.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gp() {
      return 5;
   }
}
