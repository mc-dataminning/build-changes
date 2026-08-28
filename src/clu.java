public abstract class clu extends clv {
   private static final akn<Boolean> bI = akr.a(clu.class, akp.k);
   private static final boolean bJ = false;
   private final bwy bK;

   protected clu(bxe<? extends clu> $$0, djz $$1) {
      super($$0, $$1);
      this.ce = false;
      this.bK = $$0.n().a(bwx.a().a(bww.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azz $$0) {
      this.g(bzc.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   public static bzb.a q() {
      return gV().a(bzc.v, 0.175F).a(bzc.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bI);
   }

   public void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? this.bK : super.e($$0);
   }

   @Override
   protected void f(aru $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dng.cG);
         this.w(false);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         ug $$1 = new ug();

         for (int $$2 = 0; $$2 < this.ca.b(); $$2++) {
            daa $$3 = this.ca.a($$2);
            if (!$$3.f()) {
               ua $$4 = new ua();
               $$4.a("Slot", (byte)$$2);
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("ChestedHorse", false));
      this.gT();
      if (this.t()) {
         ug $$1 = $$0.p("Items");

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ua $$3 = $$1.b($$2);
            int $$4 = $$3.b("Slot", (byte)0) & 255;
            if ($$4 < this.ca.b()) {
               this.ca.a($$4, daa.a(this.dX(), $$3).orElse(daa.k));
            }
         }
      }
   }

   @Override
   public byn a_(int $$0) {
      return $$0 == 499 ? new byn() {
         @Override
         public daa a() {
            return clu.this.t() ? new daa(dae.fh) : daa.k;
         }

         @Override
         public boolean a(daa $$0) {
            if ($$0.f()) {
               if (clu.this.t()) {
                  clu.this.w(false);
                  clu.this.gT();
               }

               return true;
            } else if ($$0.a(dae.fh)) {
               if (!clu.this.t()) {
                  clu.this.w(true);
                  clu.this.gT();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      boolean $$2 = !this.n_() && this.gL() && $$0.fY();
      if (!this.bZ() && !$$2) {
         daa $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.ha();
               return but.a;
            }

            if (!this.t() && $$3.a(dae.fh)) {
               this.d($$0, $$3);
               return but.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(crz $$0, daa $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gT();
   }

   @Override
   protected void x() {
      this.a(awr.hF, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ad_() {
      return this.t() ? 5 : 0;
   }
}
