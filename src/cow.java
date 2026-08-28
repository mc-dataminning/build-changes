import javax.annotation.Nullable;

public class cow extends cou {
   private static final int f = 600;
   private static final int g = -1;
   private static final akl<Integer> h = akp.a(cow.class, akn.b);
   private static final byte i = 0;

   public cow(bul<? extends cow> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cow(dfb $$0, double $$1, double $$2, double $$3, cwb $$4, @Nullable cwb $$5) {
      super(bul.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.I();
   }

   public cow(dfb $$0, bva $$1, cwb $$2, @Nullable cwb $$3) {
      super(bul.e, $$1, $$0, $$2, $$3);
      this.I();
   }

   private cya G() {
      return this.w().a(ku.Q, cya.a);
   }

   private void a(cya $$0) {
      this.w().b(ku.Q, $$0);
      this.I();
   }

   @Override
   protected void a(cwb $$0) {
      super.a($$0);
      this.I();
   }

   private void I() {
      cya $$0 = this.G();
      this.am.a(h, $$0.equals(cya.a) ? -1 : $$0.b());
   }

   public void a(btj $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.G().equals(cya.a) && this.c >= 600) {
         this.dX().a(this, (byte)0);
         this.a(new cwb(cwf.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.D();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dX().a(lk.a(lr.u, $$1), this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int D() {
      return this.am.a(h);
   }

   @Override
   protected void a(bva $$0) {
      super.a($$0);
      bue $$1 = this.E();
      cya $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (btj $$3 : $$2.e().get().a().a()) {
            $$0.b(new btj($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (btj $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwb v() {
      return new cwb(cwf.ox);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.D();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dX().a(lk.a(lr.u, $$2, $$3, $$4), this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
