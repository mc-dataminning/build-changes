public abstract class cgj extends cgk {
   private static final ajs<Boolean> bZ = ajw.a(cgj.class, aju.k);
   public static final int bY = 15;
   private final brz cb;

   protected cgj(bsc<? extends cgj> $$0, daz $$1) {
      super($$0, $$1);
      this.cw = false;
      this.cb = $$0.n().a(bry.a().a(brx.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bty.q).a((double)a($$0::a));
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static btx.a s() {
      return gO().a(bty.r, 0.175F).a(bty.m, 0.5);
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
   public brz e(btc $$0) {
      return this.p_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.u()) {
         if (!this.dP().B) {
            this.a(dec.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         uj $$1 = new uj();

         for (int $$2 = 1; $$2 < this.cs.b(); $$2++) {
            ctq $$3 = this.cs.a($$2);
            if (!$$3.e()) {
               ud $$4 = new ud();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dR(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gL();
      if (this.u()) {
         uj $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ud $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cs.b() - 1) {
               this.cs.a($$4 + 1, ctq.a(this.dR(), (va)$$3).orElse(ctq.i));
            }
         }
      }

      this.gM();
   }

   @Override
   public bti a_(int $$0) {
      return $$0 == 499 ? new bti() {
         @Override
         public ctq a() {
            return cgj.this.u() ? new ctq(ctt.eN) : ctq.i;
         }

         @Override
         public boolean a(ctq $$0) {
            if ($$0.e()) {
               if (cgj.this.u()) {
                  cgj.this.w(false);
                  cgj.this.gL();
               }

               return true;
            } else if ($$0.a(ctt.eN)) {
               if (!cgj.this.u()) {
                  cgj.this.w(true);
                  cgj.this.gL();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fR();
      if (!this.bS() && !$$2) {
         ctq $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return bpw.a(this.dP().B);
            }

            if (!this.u() && $$3.a(ctt.eN)) {
               this.d($$0, $$3);
               return bpw.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cly $$0, ctq $$1) {
      this.w(true);
      this.gp();
      $$1.a(1, $$0);
      this.gL();
   }

   @Override
   protected void gp() {
      this.a(avi.hh, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gx() {
      return 5;
   }
}
