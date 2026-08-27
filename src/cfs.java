public abstract class cfs extends cft {
   private static final ajm<Boolean> bZ = ajq.a(cfs.class, ajo.k);
   public static final int bY = 15;
   private final brk cb;

   protected cfs(brn<? extends cfs> $$0, dad $$1) {
      super($$0, $$1);
      this.cw = false;
      this.cb = $$0.n().a(brj.a().a(bri.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayg $$0) {
      this.f(bth.q).a((double)a($$0::a));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static btg.a r() {
      return gO().a(bth.r, 0.175F).a(bth.m, 0.5);
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
   public brk e(bsl $$0) {
      return this.p_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.u()) {
         if (!this.dN().B) {
            this.a(ddg.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         ug $$1 = new ug();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            csz $$3 = this.cs.a($$2);
            if (!$$3.d()) {
               ua $$4 = new ua();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dP(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gL();
      if (this.u()) {
         ug $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, csz.a(this.dP(), (ux)$$3).orElse(csz.i));
            }
         }
      }

      this.gM();
   }

   @Override
   public bsr a_(int $$0) {
      return $$0 == 499 ? new bsr() {
         @Override
         public csz a() {
            return cfs.this.u() ? new csz(ctc.eN) : csz.i;
         }

         @Override
         public boolean a(csz $$0) {
            if ($$0.d()) {
               if (cfs.this.u()) {
                  cfs.this.w(false);
                  cfs.this.gL();
               }

               return true;
            } else if ($$0.a(ctc.eN)) {
               if (!cfs.this.u()) {
                  cfs.this.w(true);
                  cfs.this.gL();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fP();
      if (!this.bQ() && !$$2) {
         csz $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return bpm.a(this.dN().B);
            }

            if (!this.u() && $$3.a(ctc.eN)) {
               this.d($$0, $$3);
               return bpm.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(clh $$0, csz $$1) {
      this.w(true);
      this.gp();
      $$1.a(1, $$0);
      this.gL();
   }

   @Override
   protected void gp() {
      this.a(avc.hc, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gx() {
      return 5;
   }
}
