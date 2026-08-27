public abstract class ccn extends cco {
   private static final aii<Boolean> bW = ail.a(ccn.class, aik.k);
   public static final int bV = 15;
   private final boi bY;

   protected ccn(bol<? extends ccn> $$0, cwe $$1) {
      super($$0, $$1);
      this.cu = false;
      this.bY = $$0.n().a(boh.a().a(bog.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(awt $$0) {
      this.f(bqe.n).a((double)a($$0::a));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, false);
   }

   public static bqd.a u() {
      return gL().a(bqe.o, 0.175F).a(bqe.j, 0.5);
   }

   public boolean w() {
      return this.am.b(bW);
   }

   public void w(boolean $$0) {
      this.am.b(bW, $$0);
   }

   @Override
   protected int ac_() {
      return this.w() ? 16 : super.ac_();
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? this.bY : super.e($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.w()) {
         if (!this.dJ().B) {
            this.a(czh.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.w());
      if (this.w()) {
         te $$1 = new te();

         for (int $$2 = 1; $$2 < this.cq.b(); $$2++) {
            cpq $$3 = this.cq.a($$2);
            if (!$$3.b()) {
               sy $$4 = new sy();
               $$4.a("Slot", (byte)($$2 - 1));
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gH();
      if (this.w()) {
         te $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sy $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cq.b() - 1) {
               this.cq.a($$4 + 1, cpq.a($$3));
            }
         }
      }

      this.gI();
   }

   @Override
   public bpo a_(int $$0) {
      return $$0 == 499 ? new bpo() {
         @Override
         public cpq a() {
            return ccn.this.w() ? new cpq(cpt.eM) : cpq.h;
         }

         @Override
         public boolean a(cpq $$0) {
            if ($$0.b()) {
               if (ccn.this.w()) {
                  ccn.this.w(false);
                  ccn.this.gH();
               }

               return true;
            } else if ($$0.a(cpt.eM)) {
               if (!ccn.this.w()) {
                  ccn.this.w(true);
                  ccn.this.gH();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      boolean $$2 = !this.o_() && this.gA() && $$0.fK();
      if (!this.bM() && !$$2) {
         cpq $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gA()) {
               this.gR();
               return bml.a(this.dJ().B);
            }

            if (!this.w() && $$3.a(cpt.eM)) {
               this.d($$0, $$3);
               return bml.a(this.dJ().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cia $$0, cpq $$1) {
      this.w(true);
      this.gl();
      if (!$$0.fW().d) {
         $$1.h(1);
      }

      this.gH();
   }

   @Override
   protected void gl() {
      this.a(atp.gU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   public int gt() {
      return 5;
   }
}
