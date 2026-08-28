import javax.annotation.Nullable;

public class cny extends cnw {
   private static final int f = 600;
   private static final int g = -1;
   private static final akg<Integer> h = akk.a(cny.class, aki.b);
   private static final byte i = 0;

   public cny(btq<? extends cny> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cny(dds $$0, double $$1, double $$2, double $$3, cvl $$4, @Nullable cvl $$5) {
      super(btq.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.I();
   }

   public cny(dds $$0, buf $$1, cvl $$2, @Nullable cvl $$3) {
      super(btq.e, $$1, $$0, $$2, $$3);
      this.I();
   }

   private cxn G() {
      return this.w().a(kr.I, cxn.a);
   }

   private void a(cxn $$0) {
      this.w().b(kr.I, $$0);
      this.I();
   }

   @Override
   protected void a(cvl $$0) {
      super.a($$0);
      this.I();
   }

   private void I() {
      cxn $$0 = this.G();
      this.am.a(h, $$0.equals(cxn.a) ? -1 : $$0.b());
   }

   public void a(bsq $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.G().equals(cxn.a) && this.c >= 600) {
         this.dS().a(this, (byte)0);
         this.a(new cvl(cvo.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.D();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dS().a(lg.a(ln.u, $$1), this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int D() {
      return this.am.a(h);
   }

   @Override
   protected void a(buf $$0) {
      super.a($$0);
      btj $$1 = this.E();
      cxn $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (bsq $$3 : $$2.e().get().a().a()) {
            $$0.b(new bsq($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bsq $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cvl v() {
      return new cvl(cvo.ox);
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
               this.dS().a(lg.a(ln.u, $$2, $$3, $$4), this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
