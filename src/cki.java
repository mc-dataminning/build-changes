public class cki extends ckg {
   private static final int g = 600;
   private static final int h = -1;
   private static final aja<Integer> i = aje.a(cki.class, ajc.b);
   private static final byte j = 0;

   public cki(bqg<? extends cki> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cki(czg $$0, double $$1, double $$2, double $$3, crs $$4) {
      super(bqg.e, $$1, $$2, $$3, $$0, $$4);
      this.M();
   }

   public cki(czg $$0, bqt $$1, crs $$2) {
      super(bqg.e, $$1, $$0, $$2);
      this.M();
   }

   private ctq K() {
      return this.y().a(jr.x, ctq.a);
   }

   private void a(ctq $$0) {
      this.y().b(jr.x, $$0);
      this.M();
   }

   @Override
   protected void a(crs $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      ctq $$0 = this.K();
      this.an.a(i, $$0.equals(ctq.a) ? -1 : $$0.c());
   }

   public void a(bpm $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(i, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(ctq.a) && this.c >= 600) {
         this.dM().a(this, (byte)0);
         this.a(new crs(crv.ou));
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dM().a(kn.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int H() {
      return this.an.a(i);
   }

   @Override
   protected void a(bqt $$0) {
      super.a($$0);
      bqa $$1 = this.I();
      ctq $$2 = this.K();
      if ($$2.f().isPresent()) {
         for (bpm $$3 : $$2.f().get().a().a()) {
            $$0.b(new bpm($$3.b(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.d(), $$3.e(), $$3.f()), $$1);
         }
      }

      for (bpm $$4 : $$2.e()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected crs x() {
      return new crs(crv.ou);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.H();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dM().a(kn.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
