public abstract class cee extends cef {
   private static final aiy<Boolean> bY = ajc.a(cee.class, aja.k);
   public static final int bX = 15;
   private final bpy ca;

   protected cee(bqb<? extends cee> $$0, cyx $$1) {
      super($$0, $$1);
      this.cw = false;
      this.ca = $$0.n().a(bpx.a().a(bpw.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(axr $$0) {
      this.f(brv.q).a((double)a($$0::a));
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bru.a r() {
      return gM().a(brv.r, 0.175F).a(brv.m, 0.5);
   }

   public boolean u() {
      return this.an.a(bY);
   }

   public void w(boolean $$0) {
      this.an.a(bY, $$0);
   }

   @Override
   protected int aa_() {
      return this.u() ? 16 : super.aa_();
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? this.ca : super.e($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.u()) {
         if (!this.dM().B) {
            this.a(dca.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         ts $$1 = new ts();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            crj $$3 = this.cs.a($$2);
            if (!$$3.d()) {
               tm $$4 = new tm();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dO(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gJ();
      if (this.u()) {
         ts $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tm $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, crj.a(this.dO(), (uj)$$3).orElse(crj.i));
            }
         }
      }

      this.gK();
   }

   @Override
   public brf a_(int $$0) {
      return $$0 == 499 ? new brf() {
         @Override
         public crj a() {
            return cee.this.u() ? new crj(crm.eM) : crj.i;
         }

         @Override
         public boolean a(crj $$0) {
            if ($$0.d()) {
               if (cee.this.u()) {
                  cee.this.w(false);
                  cee.this.gJ();
               }

               return true;
            } else if ($$0.a(crm.eM)) {
               if (!cee.this.u()) {
                  cee.this.w(true);
                  cee.this.gJ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      boolean $$2 = !this.p_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         crj $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return boa.a(this.dM().B);
            }

            if (!this.u() && $$3.a(crm.eM)) {
               this.d($$0, $$3);
               return boa.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cjt $$0, crj $$1) {
      this.w(true);
      this.gn();
      $$1.a(1, $$0);
      this.gJ();
   }

   @Override
   protected void gn() {
      this.a(aum.hc, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gv() {
      return 5;
   }
}
