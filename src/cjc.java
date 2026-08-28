public abstract class cjc extends cjd {
   private static final ajy<Boolean> bY = akc.a(cjc.class, aka.k);
   private final bup bZ;

   protected cjc(but<? extends cjc> $$0, dgj $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(buo.a().a(bun.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwq.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwp.a p() {
      return gU().a(bwq.v, 0.175F).a(bwq.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bY);
   }

   public void x(boolean $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, djp.cD);
         this.x(false);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         tw $$1 = new tw();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cwq $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               tq $$4 = new tq();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gR();
      if (this.t()) {
         tw $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cwq.a(this.dX(), (un)$$3).orElse(cwq.j));
            }
         }
      }

      this.gS();
   }

   @Override
   public bwa a_(int $$0) {
      return $$0 == 499 ? new bwa() {
         @Override
         public cwq a() {
            return cjc.this.t() ? new cwq(cwu.fb) : cwq.j;
         }

         @Override
         public boolean a(cwq $$0) {
            if ($$0.f()) {
               if (cjc.this.t()) {
                  cjc.this.x(false);
                  cjc.this.gR();
               }

               return true;
            } else if ($$0.a(cwu.fb)) {
               if (!cjc.this.t()) {
                  cjc.this.x(true);
                  cjc.this.gR();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      boolean $$2 = !this.e_() && this.gJ() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwq $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gJ()) {
               this.gZ();
               return bsl.a;
            }

            if (!this.t() && $$3.a(cwu.fb)) {
               this.d($$0, $$3);
               return bsl.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(coy $$0, cwq $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gR();
   }

   @Override
   protected void x() {
      this.a(awa.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? 5 : 0;
   }
}
