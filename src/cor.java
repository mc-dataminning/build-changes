import javax.annotation.Nullable;

public class cor extends cop {
   private static final int f = 600;
   private static final int g = -1;
   private static final akk<Integer> h = ako.a(cor.class, akm.b);
   private static final byte i = 0;

   public cor(bug<? extends cor> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cor(dev $$0, double $$1, double $$2, double $$3, cvx $$4, @Nullable cvx $$5) {
      super(bug.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.J();
   }

   public cor(dev $$0, buv $$1, cvx $$2, @Nullable cvx $$3) {
      super(bug.e, $$1, $$0, $$2, $$3);
      this.J();
   }

   private cxw I() {
      return this.w().a(kt.P, cxw.a);
   }

   private void a(cxw $$0) {
      this.w().b(kt.P, $$0);
      this.J();
   }

   @Override
   protected void a(cvx $$0) {
      super.a($$0);
      this.J();
   }

   private void J() {
      cxw $$0 = this.I();
      this.am.a(h, $$0.equals(cxw.a) ? -1 : $$0.b());
   }

   public void a(bte $$0) {
      this.a(this.I().a($$0));
   }

   @Override
   protected void a(ako.a $$0) {
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
      } else if (this.b && this.c != 0 && !this.I().equals(cxw.a) && this.c >= 600) {
         this.dX().a(this, (byte)0);
         this.a(new cvx(cwb.ox));
      }
   }

   private void b(int $$0) {
      int $$1 = this.E();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dX().a(lj.a(lq.u, $$1), this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int E() {
      return this.am.a(h);
   }

   @Override
   protected void a(buv $$0) {
      super.a($$0);
      btz $$1 = this.F();
      cxw $$2 = this.I();
      if ($$2.e().isPresent()) {
         for (bte $$3 : $$2.e().get().a().a()) {
            $$0.b(new bte($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bte $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cvx v() {
      return new cvx(cwb.ox);
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
               this.dX().a(lj.a(lq.u, $$2, $$3, $$4), this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
