public abstract class chi extends chj {
   private static final akk<Boolean> bZ = ako.a(chi.class, akm.k);
   public static final int bY = 15;
   private final bsx cb;

   protected chi(bta<? extends chi> $$0, dby $$1) {
      super($$0, $$1);
      this.cw = false;
      this.cb = $$0.n().a(bsw.a().a(bsv.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azh $$0) {
      this.f(bux.q).a((double)a($$0::a));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static buw.a s() {
      return gP().a(bux.r, 0.175F).a(bux.m, 0.5);
   }

   public boolean u() {
      return this.ao.a(bZ);
   }

   public void w(boolean $$0) {
      this.ao.a(bZ, $$0);
   }

   @Override
   protected int ab_() {
      return this.u() ? 16 : super.ab_();
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.u()) {
         if (!this.dP().B) {
            this.a(dfb.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         uy $$1 = new uy();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            cup $$3 = this.cs.a($$2);
            if (!$$3.e()) {
               us $$4 = new us();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dR(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gM();
      if (this.u()) {
         uy $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            us $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, cup.a(this.dR(), (vp)$$3).orElse(cup.l));
            }
         }
      }

      this.gN();
   }

   @Override
   public buh a_(int $$0) {
      return $$0 == 499 ? new buh() {
         @Override
         public cup a() {
            return chi.this.u() ? new cup(cus.eN) : cup.l;
         }

         @Override
         public boolean a(cup $$0) {
            if ($$0.e()) {
               if (chi.this.u()) {
                  chi.this.w(false);
                  chi.this.gM();
               }

               return true;
            } else if ($$0.a(cus.eN)) {
               if (!chi.this.u()) {
                  chi.this.w(true);
                  chi.this.gM();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cup $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqu.a(this.dP().B);
            }

            if (!this.u() && $$3.a(cus.eN)) {
               this.d($$0, $$3);
               return bqu.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmx $$0, cup $$1) {
      this.w(true);
      this.gq();
      $$1.a(1, $$0);
      this.gM();
   }

   @Override
   protected void gq() {
      this.a(awa.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gy() {
      return 5;
   }
}
