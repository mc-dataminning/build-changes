import javax.annotation.Nullable;

public class cpe extends cpc {
   private static final int d = 600;
   private static final int e = -1;
   private static final ajx<Integer> f = akb.a(cpe.class, ajz.b);
   private static final byte g = 0;

   public cpe(buq<? extends cpe> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpe(dgg $$0, double $$1, double $$2, double $$3, cwn $$4, @Nullable cwn $$5) {
      super(buq.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.H();
   }

   public cpe(dgg $$0, bvf $$1, cwn $$2, @Nullable cwn $$3) {
      super(buq.g, $$1, $$0, $$2, $$3);
      this.H();
   }

   private cym G() {
      return this.w().a(kv.Q, cym.a);
   }

   private void a(cym $$0) {
      this.w().b(kv.Q, $$0);
      this.H();
   }

   @Override
   protected void a(cwn $$0) {
      super.a($$0);
      this.H();
   }

   private void H() {
      cym $$0 = this.G();
      this.al.a(f, $$0.equals(cym.a) ? -1 : $$0.b());
   }

   public void a(bto $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(f, -1);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         if (this.l()) {
            if (this.a % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.l() && this.a != 0 && !this.G().equals(cym.a) && this.a >= 600) {
         this.dW().a(this, (byte)0);
         this.a(new cwn(cwr.pb));
      }
   }

   private void b(int $$0) {
      int $$1 = this.D();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dW().a(lm.a(lt.u, $$1), this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int D() {
      return this.al.a(f);
   }

   @Override
   protected void a(bvf $$0) {
      super.a($$0);
      buj $$1 = this.E();
      cym $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (bto $$3 : $$2.e().get().a().a()) {
            $$0.b(new bto($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bto $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwn v() {
      return new cwn(cwr.pb);
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
               this.dW().a(lm.a(lt.u, $$2, $$3, $$4), this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
