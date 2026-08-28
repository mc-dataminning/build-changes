public abstract class cls extends clt {
   private static final akl<Boolean> bI = akp.a(cls.class, akn.k);
   private static final boolean bJ = false;
   private final bww bK;

   protected cls(bxc<? extends cls> $$0, djx $$1) {
      super($$0, $$1);
      this.ce = false;
      this.bK = $$0.n().a(bwv.a().a(bwu.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azx $$0) {
      this.g(bza.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   public static byz.a q() {
      return gV().a(bza.v, 0.175F).a(bza.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bI);
   }

   public void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? this.bK : super.e($$0);
   }

   @Override
   protected void f(ars $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dne.cG);
         this.w(false);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uf $$1 = new uf();

         for (int $$2 = 0; $$2 < this.ca.b(); $$2++) {
            czy $$3 = this.ca.a($$2);
            if (!$$3.f()) {
               tz $$4 = new tz();
               $$4.a("Slot", (byte)$$2);
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("ChestedHorse", false));
      this.gT();
      if (this.t()) {
         uf $$1 = $$0.p("Items");

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tz $$3 = $$1.b($$2);
            int $$4 = $$3.b("Slot", (byte)0) & 255;
            if ($$4 < this.ca.b()) {
               this.ca.a($$4, czy.a(this.dX(), $$3).orElse(czy.k));
            }
         }
      }
   }

   @Override
   public byl a_(int $$0) {
      return $$0 == 499 ? new byl() {
         @Override
         public czy a() {
            return cls.this.t() ? new czy(dac.fh) : czy.k;
         }

         @Override
         public boolean a(czy $$0) {
            if ($$0.f()) {
               if (cls.this.t()) {
                  cls.this.w(false);
                  cls.this.gT();
               }

               return true;
            } else if ($$0.a(dac.fh)) {
               if (!cls.this.t()) {
                  cls.this.w(true);
                  cls.this.gT();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      boolean $$2 = !this.n_() && this.gL() && $$0.fY();
      if (!this.bZ() && !$$2) {
         czy $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.ha();
               return bur.a;
            }

            if (!this.t() && $$3.a(dac.fh)) {
               this.d($$0, $$3);
               return bur.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(crx $$0, czy $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gT();
   }

   @Override
   protected void x() {
      this.a(awp.hF, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ad_() {
      return this.t() ? 5 : 0;
   }
}
