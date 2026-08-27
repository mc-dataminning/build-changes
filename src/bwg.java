public abstract class bwg extends bwh {
   private static final adx<Boolean> bU = aea.a(bwg.class, adz.k);
   public static final int bT = 15;

   protected bwg(bik<? extends bwg> $$0, cpk $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(art $$0) {
      this.a(bkd.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bkc.a p() {
      return gz().a(bkd.d, 0.175F).a(bkd.n, 0.5);
   }

   public boolean q() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int V_() {
      return this.q() ? 17 : super.V_();
   }

   @Override
   protected float a(bih $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.q()) {
         if (!this.dK().B) {
            this.a(csl.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.q());
      if (this.q()) {
         qy $$1 = new qy();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            ciw $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               qs $$4 = new qs();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gv();
      if (this.q()) {
         qy $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qs $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, ciw.a($$3));
            }
         }
      }

      this.gw();
   }

   @Override
   public bjp a_(int $$0) {
      return $$0 == 499 ? new bjp() {
         @Override
         public ciw a() {
            return bwg.this.q() ? new ciw(ciz.er) : ciw.b;
         }

         @Override
         public boolean a(ciw $$0) {
            if ($$0.b()) {
               if (bwg.this.q()) {
                  bwg.this.w(false);
                  bwg.this.gv();
               }

               return true;
            } else if ($$0.a(ciz.er)) {
               if (!bwg.this.q()) {
                  bwg.this.w(true);
                  bwg.this.gv();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      boolean $$2 = !this.i_() && this.go() && $$0.fG();
      if (!this.bO() && !$$2) {
         ciw $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.go()) {
               this.gF();
               return bgo.a(this.dK().B);
            }

            if (!this.q() && $$3.a(ciz.er)) {
               this.d($$0, $$3);
               return bgo.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cbl $$0, ciw $$1) {
      this.w(true);
      this.fZ();
      if (!$$0.fR().d) {
         $$1.h(1);
      }

      this.gv();
   }

   @Override
   protected void fZ() {
      this.a(aou.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gh() {
      return 5;
   }
}
