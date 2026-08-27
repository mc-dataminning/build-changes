public abstract class cdf extends cdg {
   private static final aim<Boolean> bY = aiq.a(cdf.class, aio.k);
   public static final int bX = 15;
   private final bpa ca;

   protected cdf(bpd<? extends cdf> $$0, cxb $$1) {
      super($$0, $$1);
      this.cw = false;
      this.ca = $$0.n().a(boz.a().a(boy.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(axd $$0) {
      this.f(bqw.q).a((double)a($$0::a));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bqv.a r() {
      return gM().a(bqw.r, 0.175F).a(bqw.m, 0.5);
   }

   public boolean s() {
      return this.an.a(bY);
   }

   public void w(boolean $$0) {
      this.an.a(bY, $$0);
   }

   @Override
   protected int aa_() {
      return this.s() ? 16 : super.aa_();
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? this.ca : super.e($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.s()) {
         if (!this.dM().B) {
            this.a(dae.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.s());
      if (this.s()) {
         tg $$1 = new tg();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            cqm $$3 = this.cs.a($$2);
            if (!$$3.b()) {
               ta $$4 = new ta();
               $$4.a("Slot", (byte)($$2 - 1));
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gJ();
      if (this.s()) {
         tg $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ta $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, cqm.a($$3));
            }
         }
      }

      this.gK();
   }

   @Override
   public bqg a_(int $$0) {
      return $$0 == 499 ? new bqg() {
         @Override
         public cqm a() {
            return cdf.this.s() ? new cqm(cqp.eM) : cqm.h;
         }

         @Override
         public boolean a(cqm $$0) {
            if ($$0.b()) {
               if (cdf.this.s()) {
                  cdf.this.w(false);
                  cdf.this.gJ();
               }

               return true;
            } else if ($$0.a(cqp.eM)) {
               if (!cdf.this.s()) {
                  cdf.this.w(true);
                  cdf.this.gJ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      boolean $$2 = !this.o_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         cqm $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bnd.a(this.dM().B);
            }

            if (!this.s() && $$3.a(cqp.eM)) {
               this.d($$0, $$3);
               return bnd.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(ciu $$0, cqm $$1) {
      this.w(true);
      this.gn();
      $$1.a(1, $$0);
      this.gJ();
   }

   @Override
   protected void gn() {
      this.a(aty.hb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gv() {
      return 5;
   }
}
