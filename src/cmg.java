public class cmg extends cme {
   private static final int f = 600;
   private static final int g = -1;
   private static final ajs<Integer> h = ajw.a(cmg.class, aju.b);
   private static final byte i = 0;

   public cmg(bsc<? extends cmg> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmg(daz $$0, double $$1, double $$2, double $$3, ctq $$4) {
      super(bsc.e, $$1, $$2, $$3, $$0, $$4);
      this.M();
   }

   public cmg(daz $$0, bsq $$1, ctq $$2) {
      super(bsc.e, $$1, $$0, $$2);
      this.M();
   }

   private cvr K() {
      return this.y().a(kb.F, cvr.a);
   }

   private void a(cvr $$0) {
      this.y().b(kb.F, $$0);
      this.M();
   }

   @Override
   protected void a(ctq $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      cvr $$0 = this.K();
      this.ao.a(h, $$0.equals(cvr.a) ? -1 : $$0.c());
   }

   public void a(bre $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(ajw.a $$0) {
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
      } else if (this.b && this.c != 0 && !this.K().equals(cvr.a) && this.c >= 600) {
         this.dP().a(this, (byte)0);
         this.a(new ctq(ctt.ov));
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
      return this.ao.a(h);
   }

   @Override
   protected void a(bsq $$0) {
      super.a($$0);
      brw $$1 = this.I();
      cvr $$2 = this.K();
      if ($$2.f().isPresent()) {
         for (bre $$3 : $$2.f().get().a().a()) {
            $$0.b(new bre($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bre $$4 : $$2.e()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected ctq x() {
      return new ctq(ctt.ov);
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
