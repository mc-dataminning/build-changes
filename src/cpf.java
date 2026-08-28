import javax.annotation.Nullable;

public class cpf extends cpd {
   private static final int d = 600;
   private static final int e = -1;
   private static final ajy<Integer> f = akc.a(cpf.class, aka.b);
   private static final byte g = 0;

   public cpf(bur<? extends cpf> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpf(dgh $$0, double $$1, double $$2, double $$3, cwo $$4, @Nullable cwo $$5) {
      super(bur.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.H();
   }

   public cpf(dgh $$0, bvg $$1, cwo $$2, @Nullable cwo $$3) {
      super(bur.g, $$1, $$0, $$2, $$3);
      this.H();
   }

   private cyn G() {
      return this.w().a(kv.Q, cyn.a);
   }

   private void a(cyn $$0) {
      this.w().b(kv.Q, $$0);
      this.H();
   }

   @Override
   protected void a(cwo $$0) {
      super.a($$0);
      this.H();
   }

   private void H() {
      cyn $$0 = this.G();
      this.al.a(f, $$0.equals(cyn.a) ? -1 : $$0.b());
   }

   public void a(btp $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(f, -1);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.l()) {
            if (this.a % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.l() && this.a != 0 && !this.G().equals(cyn.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cwo(cws.pb));
      }
   }

   private void b(int $$0) {
      int $$1 = this.D();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dV().a(lm.a(lt.u, $$1), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int D() {
      return this.al.a(f);
   }

   @Override
   protected void a(bvg $$0) {
      super.a($$0);
      buk $$1 = this.E();
      cyn $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (btp $$3 : $$2.e().get().a().a()) {
            $$0.b(new btp($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (btp $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwo v() {
      return new cwo(cws.pb);
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
               this.dV().a(lm.a(lt.u, $$2, $$3, $$4), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
