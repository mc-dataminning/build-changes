import javax.annotation.Nullable;

public class cog extends coe {
   private static final int f = 600;
   private static final int g = -1;
   private static final akh<Integer> h = akl.a(cog.class, akj.b);
   private static final byte i = 0;

   public cog(bty<? extends cog> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cog(dej $$0, double $$1, double $$2, double $$3, cvs $$4, @Nullable cvs $$5) {
      super(bty.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.J();
   }

   public cog(dej $$0, bun $$1, cvs $$2, @Nullable cvs $$3) {
      super(bty.e, $$1, $$0, $$2, $$3);
      this.J();
   }

   private cxr I() {
      return this.w().a(ks.L, cxr.a);
   }

   private void a(cxr $$0) {
      this.w().b(ks.L, $$0);
      this.J();
   }

   @Override
   protected void a(cvs $$0) {
      super.a($$0);
      this.J();
   }

   private void J() {
      cxr $$0 = this.I();
      this.am.a(h, $$0.equals(cxr.a) ? -1 : $$0.b());
   }

   public void a(bsy $$0) {
      this.a(this.I().a($$0));
   }

   @Override
   protected void a(akl.a $$0) {
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
      } else if (this.b && this.c != 0 && !this.I().equals(cxr.a) && this.c >= 600) {
         this.dS().a(this, (byte)0);
         this.a(new cvs(cvw.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.E();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dS().a(lh.a(lo.u, $$1), this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int E() {
      return this.am.a(h);
   }

   @Override
   protected void a(bun $$0) {
      super.a($$0);
      btr $$1 = this.F();
      cxr $$2 = this.I();
      if ($$2.e().isPresent()) {
         for (bsy $$3 : $$2.e().get().a().a()) {
            $$0.b(new bsy($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bsy $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cvs v() {
      return new cvs(cvw.ox);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.E();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dS().a(lh.a(lo.u, $$2, $$3, $$4), this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
