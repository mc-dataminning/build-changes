public class cme extends cmc {
   private static final int g = 600;
   private static final int h = -1;
   private static final ajr<Integer> i = ajv.a(cme.class, ajt.b);
   private static final byte j = 0;

   public cme(bsa<? extends cme> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cme(dax $$0, double $$1, double $$2, double $$3, cto $$4) {
      super(bsa.e, $$1, $$2, $$3, $$0, $$4);
      this.M();
   }

   public cme(dax $$0, bso $$1, cto $$2) {
      super(bsa.e, $$1, $$0, $$2);
      this.M();
   }

   private cvp K() {
      return this.y().a(kb.F, cvp.a);
   }

   private void a(cvp $$0) {
      this.y().b(kb.F, $$0);
      this.M();
   }

   @Override
   protected void a(cto $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      cvp $$0 = this.K();
      this.ao.a(i, $$0.equals(cvp.a) ? -1 : $$0.c());
   }

   public void a(brc $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(i, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(cvp.a) && this.c >= 600) {
         this.dP().a(this, (byte)0);
         this.a(new cto(ctr.ov));
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dP().a(kq.a(ky.u, $$1), this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int H() {
      return this.ao.a(i);
   }

   @Override
   protected void a(bso $$0) {
      super.a($$0);
      bru $$1 = this.I();
      cvp $$2 = this.K();
      if ($$2.f().isPresent()) {
         for (brc $$3 : $$2.f().get().a().a()) {
            $$0.b(new brc($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (brc $$4 : $$2.e()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cto x() {
      return new cto(ctr.ov);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.H();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dP().a(kq.a(ky.u, $$2, $$3, $$4), this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
