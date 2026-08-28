public abstract class chg extends chh {
   private static final akj<Boolean> bZ = akn.a(chg.class, akl.k);
   public static final int bY = 15;
   private final bsv cb;

   protected chg(bsy<? extends chg> $$0, dbw $$1) {
      super($$0, $$1);
      this.cw = false;
      this.cb = $$0.n().a(bsu.a().a(bst.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azf $$0) {
      this.f(buv.q).a((double)a($$0::a));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static buu.a s() {
      return gP().a(buv.r, 0.175F).a(buv.m, 0.5);
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
   public bsv e(btz $$0) {
      return this.p_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.u()) {
         if (!this.dP().B) {
            this.a(dez.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         ux $$1 = new ux();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            cun $$3 = this.cs.a($$2);
            if (!$$3.e()) {
               ur $$4 = new ur();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dR(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gM();
      if (this.u()) {
         ux $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ur $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, cun.a(this.dR(), (vo)$$3).orElse(cun.l));
            }
         }
      }

      this.gN();
   }

   @Override
   public buf a_(int $$0) {
      return $$0 == 499 ? new buf() {
         @Override
         public cun a() {
            return chg.this.u() ? new cun(cuq.eN) : cun.l;
         }

         @Override
         public boolean a(cun $$0) {
            if ($$0.e()) {
               if (chg.this.u()) {
                  chg.this.w(false);
                  chg.this.gM();
               }

               return true;
            } else if ($$0.a(cuq.eN)) {
               if (!chg.this.u()) {
                  chg.this.w(true);
                  chg.this.gM();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cun $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqs.a(this.dP().B);
            }

            if (!this.u() && $$3.a(cuq.eN)) {
               this.d($$0, $$3);
               return bqs.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cmv $$0, cun $$1) {
      this.w(true);
      this.gq();
      $$1.a(1, $$0);
      this.gM();
   }

   @Override
   protected void gq() {
      this.a(avz.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gy() {
      return 5;
   }
}
