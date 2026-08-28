import javax.annotation.Nullable;

public class cnf extends cnd {
   private static final int f = 600;
   private static final int g = -1;
   private static final ajw<Integer> h = aka.a(cnf.class, ajy.b);
   private static final byte i = 0;

   public cnf(bsx<? extends cnf> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnf(dcw $$0, double $$1, double $$2, double $$3, cuq $$4, @Nullable cuq $$5) {
      super(bsx.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.K();
   }

   public cnf(dcw $$0, btn $$1, cuq $$2, @Nullable cuq $$3) {
      super(bsx.e, $$1, $$0, $$2, $$3);
      this.K();
   }

   private cwu J() {
      return this.y().a(kq.G, cwu.a);
   }

   private void a(cwu $$0) {
      this.y().b(kq.G, $$0);
      this.K();
   }

   @Override
   protected void a(cuq $$0) {
      super.a($$0);
      this.K();
   }

   private void K() {
      cwu $$0 = this.J();
      this.ao.a(h, $$0.equals(cwu.a) ? -1 : $$0.b());
   }

   public void a(brz $$0) {
      this.a(this.J().a($$0));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.J().equals(cwu.a) && this.c >= 600) {
         this.dO().a(this, (byte)0);
         this.a(new cuq(cut.ow));
      }
   }

   private void b(int $$0) {
      int $$1 = this.F();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dO().a(lf.a(lm.u, $$1), this.d(0.5), this.dw(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int F() {
      return this.ao.a(h);
   }

   @Override
   protected void a(btn $$0) {
      super.a($$0);
      bsr $$1 = this.H();
      cwu $$2 = this.J();
      if ($$2.e().isPresent()) {
         for (brz $$3 : $$2.e().get().a().a()) {
            $$0.b(new brz($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (brz $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cuq x() {
      return new cuq(cut.ow);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.F();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dO().a(lf.a(lm.u, $$2, $$3, $$4), this.d(0.5), this.dw(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
