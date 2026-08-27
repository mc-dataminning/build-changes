public abstract class bwv extends bww {
   private static final aef<Boolean> bU = aei.a(bwv.class, aeh.k);
   public static final int bT = 15;

   protected bwv(bja<? extends bwv> $$0, cqb $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(ash $$0) {
      this.a(bks.l).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bkr.a s() {
      return gE().a(bks.m, 0.175F).a(bks.h, 0.5);
   }

   public boolean t() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int Z_() {
      return this.t() ? 17 : super.Z_();
   }

   @Override
   protected float a(bix $$0, float $$1) {
      return $$0.b - (this.m_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.t()) {
         if (!this.dL().B) {
            this.a(cte.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         rc $$1 = new rc();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cjl $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               qw $$4 = new qw();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gA();
      if (this.t()) {
         rc $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qw $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cjl.a($$3));
            }
         }
      }

      this.gB();
   }

   @Override
   public bke a_(int $$0) {
      return $$0 == 499 ? new bke() {
         @Override
         public cjl a() {
            return bwv.this.t() ? new cjl(cjo.er) : cjl.b;
         }

         @Override
         public boolean a(cjl $$0) {
            if ($$0.b()) {
               if (bwv.this.t()) {
                  bwv.this.w(false);
                  bwv.this.gA();
               }

               return true;
            } else if ($$0.a(cjo.er)) {
               if (!bwv.this.t()) {
                  bwv.this.w(true);
                  bwv.this.gA();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      boolean $$2 = !this.m_() && this.gt() && $$0.fI();
      if (!this.bO() && !$$2) {
         cjl $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bhe.a(this.dL().B);
            }

            if (!this.t() && $$3.a(cjo.er)) {
               this.d($$0, $$3);
               return bhe.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cca $$0, cjl $$1) {
      this.w(true);
      this.ge();
      if (!$$0.fT().d) {
         $$1.h(1);
      }

      this.gA();
   }

   @Override
   protected void ge() {
      this.a(apg.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gm() {
      return 5;
   }
}
