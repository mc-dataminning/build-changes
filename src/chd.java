public abstract class chd extends che {
   private static final akg<Boolean> bZ = akk.a(chd.class, aki.k);
   public static final int bY = 15;
   private final bss cb;

   protected chd(bsv<? extends chd> $$0, dbt $$1) {
      super($$0, $$1);
      this.cw = false;
      this.cb = $$0.n().a(bsr.a().a(bsq.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azc $$0) {
      this.f(bus.q).a((double)a($$0::a));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static bur.a s() {
      return gP().a(bus.r, 0.175F).a(bus.m, 0.5);
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
   public bss e(btw $$0) {
      return this.p_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.u()) {
         if (!this.dP().B) {
            this.a(dew.cv);
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
            cuk $$3 = this.cs.a($$2);
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
               this.cs.a($$4 + 1, cuk.a(this.dR(), (vo)$$3).orElse(cuk.l));
            }
         }
      }

      this.gN();
   }

   @Override
   public buc a_(int $$0) {
      return $$0 == 499 ? new buc() {
         @Override
         public cuk a() {
            return chd.this.u() ? new cuk(cun.eN) : cuk.l;
         }

         @Override
         public boolean a(cuk $$0) {
            if ($$0.e()) {
               if (chd.this.u()) {
                  chd.this.w(false);
                  chd.this.gM();
               }

               return true;
            } else if ($$0.a(cun.eN)) {
               if (!chd.this.u()) {
                  chd.this.w(true);
                  chd.this.gM();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cuk $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqp.a(this.dP().B);
            }

            if (!this.u() && $$3.a(cun.eN)) {
               this.d($$0, $$3);
               return bqp.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cms $$0, cuk $$1) {
      this.w(true);
      this.gq();
      $$1.a(1, $$0);
      this.gM();
   }

   @Override
   protected void gq() {
      this.a(avw.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gy() {
      return 5;
   }
}
