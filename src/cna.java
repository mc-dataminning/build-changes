public class cna extends cmy {
   private static final int f = 600;
   private static final int g = -1;
   private static final akg<Integer> h = akk.a(cna.class, aki.b);
   private static final byte i = 0;

   public cna(bsv<? extends cna> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cna(dbt $$0, double $$1, double $$2, double $$3, cuk $$4) {
      super(bsv.e, $$1, $$2, $$3, $$0, $$4);
      this.M();
   }

   public cna(dbt $$0, btk $$1, cuk $$2) {
      super(bsv.e, $$1, $$0, $$2);
      this.M();
   }

   private cwl K() {
      return this.y().a(km.F, cwl.a);
   }

   private void a(cwl $$0) {
      this.y().b(km.F, $$0);
      this.M();
   }

   @Override
   protected void a(cuk $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      cwl $$0 = this.K();
      this.ao.a(h, $$0.equals(cwl.a) ? -1 : $$0.b());
   }

   public void a(brx $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
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
      } else if (this.b && this.c != 0 && !this.K().equals(cwl.a) && this.c >= 600) {
         this.dP().a(this, (byte)0);
         this.a(new cuk(cun.ov));
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dP().a(lb.a(lj.u, $$1), this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int H() {
      return this.ao.a(h);
   }

   @Override
   protected void a(btk $$0) {
      super.a($$0);
      bsp $$1 = this.I();
      cwl $$2 = this.K();
      if ($$2.e().isPresent()) {
         for (brx $$3 : $$2.e().get().a().a()) {
            $$0.b(new brx($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (brx $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cuk x() {
      return new cuk(cun.ov);
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
               this.dP().a(lb.a(lj.u, $$2, $$3, $$4), this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
