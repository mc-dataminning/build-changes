public abstract class cgr extends cgs {
   private static final ajp<Boolean> cb = ajt.a(cgr.class, ajr.k);
   public static final int ca = 15;
   private final bsg cd;

   protected cgr(bsj<? extends cgr> $$0, dcd $$1) {
      super($$0, $$1);
      this.cy = false;
      this.cd = $$0.n().a(bsf.a().a(bse.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bug.s).a((double)a($$0::a));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   public static buf.a s() {
      return gM().a(bug.v, 0.175F).a(bug.o, 0.5);
   }

   public boolean u() {
      return this.ao.a(cb);
   }

   public void w(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   protected int ab_() {
      return this.u() ? 16 : super.ab_();
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? this.cd : super.e($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.u()) {
         if (!this.dP().B) {
            this.a(dfh.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         ud $$1 = new ud();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cua $$3 = this.cu.a($$2);
            if (!$$3.e()) {
               tx $$4 = new tx();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dR(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gJ();
      if (this.u()) {
         ud $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cua.a(this.dR(), (uu)$$3).orElse(cua.l));
            }
         }
      }

      this.gK();
   }

   @Override
   public btq a_(int $$0) {
      return $$0 == 499 ? new btq() {
         @Override
         public cua a() {
            return cgr.this.u() ? new cua(cud.eN) : cua.l;
         }

         @Override
         public boolean a(cua $$0) {
            if ($$0.e()) {
               if (cgr.this.u()) {
                  cgr.this.w(false);
                  cgr.this.gJ();
               }

               return true;
            } else if ($$0.a(cud.eN)) {
               if (!cgr.this.u()) {
                  cgr.this.w(true);
                  cgr.this.gJ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      boolean $$2 = !this.p_() && this.gC() && $$0.fN();
      if (!this.bS() && !$$2) {
         cua $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bqd.a(this.dP().B);
            }

            if (!this.u() && $$3.a(cud.eN)) {
               this.d($$0, $$3);
               return bqd.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmh $$0, cua $$1) {
      this.w(true);
      this.gn();
      $$1.a(1, $$0);
      this.gJ();
   }

   @Override
   protected void gn() {
      this.a(avf.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gv() {
      return 5;
   }
}
