public abstract class cad extends cae {
   private static final agn<Boolean> bV = agq.a(cad.class, agp.k);
   public static final int bU = 15;
   private final blz bX;

   protected cad(bmc<? extends cad> $$0, ctx $$1) {
      super($$0, $$1);
      this.cu = false;
      this.bX = $$0.n().a(bly.a().a(blx.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(auw $$0) {
      this.f(bnu.n).a((double)a($$0::a));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, false);
   }

   public static bnt.a u() {
      return gF().a(bnu.o, 0.175F).a(bnu.j, 0.5);
   }

   public boolean w() {
      return this.an.b(bV);
   }

   public void w(boolean $$0) {
      this.an.b(bV, $$0);
   }

   @Override
   protected int ac_() {
      return this.w() ? 17 : super.ac_();
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? this.bX : super.e($$0);
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.w()) {
         if (!this.dL().B) {
            this.a(cxa.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         su $$1 = new su();

         for (int $$2 = 2; $$2 < this.cq.b(); $$2++) {
            cng $$3 = this.cq.a($$2);
            if (!$$3.b()) {
               so $$4 = new so();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gB();
      if (this.w()) {
         su $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            so $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cq.b()) {
               this.cq.a($$4, cng.a($$3));
            }
         }
      }

      this.gC();
   }

   @Override
   public bng a_(int $$0) {
      return $$0 == 499 ? new bng() {
         @Override
         public cng a() {
            return cad.this.w() ? new cng(cnj.eM) : cng.f;
         }

         @Override
         public boolean a(cng $$0) {
            if ($$0.b()) {
               if (cad.this.w()) {
                  cad.this.w(false);
                  cad.this.gB();
               }

               return true;
            } else if ($$0.a(cnj.eM)) {
               if (!cad.this.w()) {
                  cad.this.w(true);
                  cad.this.gB();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      boolean $$2 = !this.o_() && this.gu() && $$0.fI();
      if (!this.bP() && !$$2) {
         cng $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gu()) {
               this.gL();
               return bkc.a(this.dL().B);
            }

            if (!this.w() && $$3.a(cnj.eM)) {
               this.d($$0, $$3);
               return bkc.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cfq $$0, cng $$1) {
      this.w(true);
      this.gf();
      if (!$$0.fT().d) {
         $$1.h(1);
      }

      this.gB();
   }

   @Override
   protected void gf() {
      this.a(art.gT, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gn() {
      return 5;
   }
}
