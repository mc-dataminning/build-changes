public abstract class cmd extends cme {
   private static final aku<Boolean> bI = aky.a(cmd.class, akw.k);
   private static final boolean bJ = false;
   private final bxh bK;

   protected cmd(bxn<? extends cmd> $$0, dkj $$1) {
      super($$0, $$1);
      this.ce = false;
      this.bK = $$0.n().a(bxg.a().a(bxf.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(bai $$0) {
      this.g(bzl.s).a((double)a($$0::a));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   public static bzk.a q() {
      return gV().a(bzl.v, 0.175F).a(bzl.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bI);
   }

   public void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public bxh e(byr $$0) {
      return this.n_() ? this.bK : super.e($$0);
   }

   @Override
   protected void f(asb $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dnq.cG);
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
            dak $$3 = this.ca.a($$2);
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
               this.ca.a($$4, dak.a(this.dX(), $$3).orElse(dak.l));
            }
         }
      }
   }

   @Override
   public byw a_(int $$0) {
      return $$0 == 499 ? new byw() {
         @Override
         public dak a() {
            return cmd.this.t() ? new dak(dao.fh) : dak.l;
         }

         @Override
         public boolean a(dak $$0) {
            if ($$0.f()) {
               if (cmd.this.t()) {
                  cmd.this.w(false);
                  cmd.this.gT();
               }

               return true;
            } else if ($$0.a(dao.fh)) {
               if (!cmd.this.t()) {
                  cmd.this.w(true);
                  cmd.this.gT();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      boolean $$2 = !this.n_() && this.gL() && $$0.fY();
      if (!this.bZ() && !$$2) {
         dak $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.ha();
               return bvc.a;
            }

            if (!this.t() && $$3.a(dao.fh)) {
               this.d($$0, $$3);
               return bvc.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(csi $$0, dak $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gT();
   }

   @Override
   protected void x() {
      this.a(awy.hF, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ae_() {
      return this.t() ? 5 : 0;
   }
}
