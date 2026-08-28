import javax.annotation.Nullable;

public class cph extends cpf {
   private static final int d = 600;
   private static final int e = -1;
   private static final ajy<Integer> f = akc.a(cph.class, aka.b);
   private static final byte g = 0;

   public cph(but<? extends cph> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cph(dgj $$0, double $$1, double $$2, double $$3, cwq $$4, @Nullable cwq $$5) {
      super(but.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.H();
   }

   public cph(dgj $$0, bvi $$1, cwq $$2, @Nullable cwq $$3) {
      super(but.g, $$1, $$0, $$2, $$3);
      this.H();
   }

   private cyp G() {
      return this.w().a(kv.Q, cyp.a);
   }

   private void a(cyp $$0) {
      this.w().b(kv.Q, $$0);
      this.H();
   }

   @Override
   protected void a(cwq $$0) {
      super.a($$0);
      this.H();
   }

   private void H() {
      cyp $$0 = this.G();
      this.al.a(f, $$0.equals(cyp.a) ? -1 : $$0.b());
   }

   public void a(btr $$0) {
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
      } else if (this.l() && this.a != 0 && !this.G().equals(cyp.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cwq(cwu.pb));
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
   protected void a(bvi $$0) {
      super.a($$0);
      bum $$1 = this.E();
      cyp $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (btr $$3 : $$2.e().get().a().a()) {
            $$0.b(new btr($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (btr $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwq v() {
      return new cwq(cwu.pb);
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
