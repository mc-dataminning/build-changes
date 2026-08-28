import javax.annotation.Nullable;

public class cod extends cob {
   private static final int f = 600;
   private static final int g = -1;
   private static final akg<Integer> h = akk.a(cod.class, aki.b);
   private static final byte i = 0;

   public cod(btv<? extends cod> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cod(deg $$0, double $$1, double $$2, double $$3, cvp $$4, @Nullable cvp $$5) {
      super(btv.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.J();
   }

   public cod(deg $$0, buk $$1, cvp $$2, @Nullable cvp $$3) {
      super(btv.e, $$1, $$0, $$2, $$3);
      this.J();
   }

   private cxo I() {
      return this.w().a(kr.L, cxo.a);
   }

   private void a(cxo $$0) {
      this.w().b(kr.L, $$0);
      this.J();
   }

   @Override
   protected void a(cvp $$0) {
      super.a($$0);
      this.J();
   }

   private void J() {
      cxo $$0 = this.I();
      this.am.a(h, $$0.equals(cxo.a) ? -1 : $$0.b());
   }

   public void a(bsv $$0) {
      this.a(this.I().a($$0));
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
      } else if (this.b && this.c != 0 && !this.I().equals(cxo.a) && this.c >= 600) {
         this.dS().a(this, (byte)0);
         this.a(new cvp(cvt.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.E();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dS().a(lg.a(ln.u, $$1), this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int E() {
      return this.am.a(h);
   }

   @Override
   protected void a(buk $$0) {
      super.a($$0);
      bto $$1 = this.F();
      cxo $$2 = this.I();
      if ($$2.e().isPresent()) {
         for (bsv $$3 : $$2.e().get().a().a()) {
            $$0.b(new bsv($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bsv $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cvp v() {
      return new cvp(cvt.ox);
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
               this.dS().a(lg.a(ln.u, $$2, $$3, $$4), this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
