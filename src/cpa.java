import javax.annotation.Nullable;

public class cpa extends coy {
   private static final int f = 600;
   private static final int g = -1;
   private static final ako<Integer> h = aks.a(cpa.class, akq.b);
   private static final byte i = 0;

   public cpa(bup<? extends cpa> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpa(dff $$0, double $$1, double $$2, double $$3, cwf $$4, @Nullable cwf $$5) {
      super(bup.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.I();
   }

   public cpa(dff $$0, bve $$1, cwf $$2, @Nullable cwf $$3) {
      super(bup.e, $$1, $$0, $$2, $$3);
      this.I();
   }

   private cye G() {
      return this.w().a(ku.Q, cye.a);
   }

   private void a(cye $$0) {
      this.w().b(ku.Q, $$0);
      this.I();
   }

   @Override
   protected void a(cwf $$0) {
      super.a($$0);
      this.I();
   }

   private void I() {
      cye $$0 = this.G();
      this.am.a(h, $$0.equals(cye.a) ? -1 : $$0.b());
   }

   public void a(btn $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.G().equals(cye.a) && this.c >= 600) {
         this.dY().a(this, (byte)0);
         this.a(new cwf(cwj.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.D();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dY().a(ll.a(ls.u, $$1), this.d(0.5), this.dG(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int D() {
      return this.am.a(h);
   }

   @Override
   protected void a(bve $$0) {
      super.a($$0);
      bui $$1 = this.E();
      cye $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (btn $$3 : $$2.e().get().a().a()) {
            $$0.b(new btn($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (btn $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwf v() {
      return new cwf(cwj.ox);
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
               this.dY().a(ll.a(ls.u, $$2, $$3, $$4), this.d(0.5), this.dG(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
