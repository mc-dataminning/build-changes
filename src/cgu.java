public abstract class cgu extends cgv {
   private static final ajp<Boolean> cb = ajt.a(cgu.class, ajr.k);
   public static final int ca = 15;
   private final bsj cd;

   protected cgu(bsm<? extends cgu> $$0, dcf $$1) {
      super($$0, $$1);
      this.cy = false;
      this.cd = $$0.n().a(bsi.a().a(bsh.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayo $$0) {
      this.f(buj.s).a((double)a($$0::a));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   public static bui.a s() {
      return gN().a(buj.v, 0.175F).a(buj.o, 0.5);
   }

   public boolean u() {
      return this.ao.a(cb);
   }

   public void w(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   protected int ab_() {
      return this.u() ? 16 : super.ab_();
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? this.cd : super.e($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.u()) {
         if (!this.dQ().B) {
            this.a(dfj.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         ud $$1 = new ud();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cuc $$3 = this.cu.a($$2);
            if (!$$3.e()) {
               tx $$4 = new tx();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dS(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gK();
      if (this.u()) {
         ud $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cuc.a(this.dS(), (uu)$$3).orElse(cuc.l));
            }
         }
      }

      this.gL();
   }

   @Override
   public btt a_(int $$0) {
      return $$0 == 499 ? new btt() {
         @Override
         public cuc a() {
            return cgu.this.u() ? new cuc(cuf.eN) : cuc.l;
         }

         @Override
         public boolean a(cuc $$0) {
            if ($$0.e()) {
               if (cgu.this.u()) {
                  cgu.this.w(false);
                  cgu.this.gK();
               }

               return true;
            } else if ($$0.a(cuf.eN)) {
               if (!cgu.this.u()) {
                  cgu.this.w(true);
                  cgu.this.gK();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      boolean $$2 = !this.p_() && this.gD() && $$0.fO();
      if (!this.bT() && !$$2) {
         cuc $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bqg.a(this.dQ().B);
            }

            if (!this.u() && $$3.a(cuf.eN)) {
               this.d($$0, $$3);
               return bqg.a(this.dQ().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmk $$0, cuc $$1) {
      this.w(true);
      this.go();
      $$1.a(1, $$0);
      this.gK();
   }

   @Override
   protected void go() {
      this.a(avh.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gw() {
      return 5;
   }
}
