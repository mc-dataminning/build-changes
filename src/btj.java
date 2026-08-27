public abstract class btj extends btk {
   private static final aby<Boolean> bU = acb.a(btj.class, aca.k);
   public static final int bT = 15;

   protected btj(bfn<? extends btj> $$0, cmm $$1) {
      super($$0, $$1);
      this.cs = false;
   }

   @Override
   protected void a(apf $$0) {
      this.a(bhg.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bU, false);
   }

   public static bhf.a q() {
      return gy().a(bhg.d, 0.175F).a(bhg.m, 0.5);
   }

   public boolean r() {
      return this.am.b(bU);
   }

   public void w(boolean $$0) {
      this.am.b(bU, $$0);
   }

   @Override
   protected int V_() {
      return this.r() ? 17 : super.V_();
   }

   @Override
   public double bx() {
      return super.bx() - 0.25;
   }

   @Override
   protected void eu() {
      super.eu();
      if (this.r()) {
         if (!this.dI().B) {
            this.a(cpo.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.r());
      if (this.r()) {
         qx $$1 = new qx();

         for (int $$2 = 2; $$2 < this.co.b(); $$2++) {
            cfz $$3 = this.co.a($$2);
            if (!$$3.b()) {
               qr $$4 = new qr();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gu();
      if (this.r()) {
         qx $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qr $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.co.b()) {
               this.co.a($$4, cfz.a($$3));
            }
         }
      }

      this.gv();
   }

   @Override
   public bgs a_(int $$0) {
      return $$0 == 499 ? new bgs() {
         @Override
         public cfz a() {
            return btj.this.r() ? new cfz(cgc.er) : cfz.b;
         }

         @Override
         public boolean a(cfz $$0) {
            if ($$0.b()) {
               if (btj.this.r()) {
                  btj.this.w(false);
                  btj.this.gu();
               }

               return true;
            } else if ($$0.a(cgc.er)) {
               if (!btj.this.r()) {
                  btj.this.w(true);
                  btj.this.gu();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      boolean $$2 = !this.h_() && this.gn() && $$0.fD();
      if (!this.bN() && !$$2) {
         cfz $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gn()) {
               this.gE();
               return bdx.a(this.dI().B);
            }

            if (!this.r() && $$3.a(cgc.er)) {
               this.d($$0, $$3);
               return bdx.a(this.dI().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(byo $$0, cfz $$1) {
      this.w(true);
      this.fY();
      if (!$$0.fO().d) {
         $$1.h(1);
      }

      this.gu();
   }

   @Override
   protected void fY() {
      this.a(amh.gb, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   public int gg() {
      return 5;
   }
}
