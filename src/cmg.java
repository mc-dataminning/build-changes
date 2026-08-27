public class cmg extends cme {
   private static final int g = 600;
   private static final int h = -1;
   private static final ajy<Integer> i = akc.a(cmg.class, aka.b);
   private static final byte j = 0;

   public cmg(bsb<? extends cmg> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmg(dca $$0, double $$1, double $$2, double $$3, cuh $$4) {
      super(bsb.e, $$1, $$2, $$3, $$0, $$4);
      this.L();
   }

   public cmg(dca $$0, bso $$1, cuh $$2) {
      super(bsb.e, $$1, $$0, $$2);
      this.L();
   }

   private cwr K() {
      return this.y().a(ke.E, cwr.a);
   }

   private void a(cwr $$0) {
      this.y().b(ke.E, $$0);
      this.L();
   }

   @Override
   protected void a(cuh $$0) {
      super.a($$0);
      this.L();
   }

   private void L() {
      cwr $$0 = this.K();
      this.as.a(i, $$0.equals(cwr.a) ? -1 : $$0.c());
   }

   public void a(brh $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(i, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dU().C) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(cwr.a) && this.c >= 600) {
         this.dU().a(this, (byte)0);
         this.a(new cuh(cuk.pL));
      }
   }

   private void c(int $$0) {
      int $$1 = this.G();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dU().a(kt.a(lb.u, $$1), this.d(0.5), this.dC(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int G() {
      return this.as.a(i);
   }

   @Override
   protected void a(bso $$0) {
      super.a($$0);
      brv $$1 = this.I();
      cwr $$2 = this.K();
      if ($$2.f().isPresent()) {
         for (brh $$3 : $$2.f().get().a().a()) {
            $$0.b(new brh($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (brh $$4 : $$2.e()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cuh x() {
      return new cuh(cuk.pL);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.G();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dU().a(kt.a(lb.u, $$2, $$3, $$4), this.d(0.5), this.dC(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
