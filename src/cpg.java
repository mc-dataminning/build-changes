import javax.annotation.Nullable;

public class cpg extends cpe {
   private static final int d = 600;
   private static final int e = -1;
   private static final ajy<Integer> f = akc.a(cpg.class, aka.b);
   private static final byte g = 0;

   public cpg(bus<? extends cpg> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpg(dgi $$0, double $$1, double $$2, double $$3, cwp $$4, @Nullable cwp $$5) {
      super(bus.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.H();
   }

   public cpg(dgi $$0, bvh $$1, cwp $$2, @Nullable cwp $$3) {
      super(bus.g, $$1, $$0, $$2, $$3);
      this.H();
   }

   private cyo G() {
      return this.w().a(kv.Q, cyo.a);
   }

   private void a(cyo $$0) {
      this.w().b(kv.Q, $$0);
      this.H();
   }

   @Override
   protected void a(cwp $$0) {
      super.a($$0);
      this.H();
   }

   private void H() {
      cyo $$0 = this.G();
      this.al.a(f, $$0.equals(cyo.a) ? -1 : $$0.b());
   }

   public void a(btq $$0) {
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
      } else if (this.l() && this.a != 0 && !this.G().equals(cyo.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cwp(cwt.pb));
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
   protected void a(bvh $$0) {
      super.a($$0);
      bul $$1 = this.E();
      cyo $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (btq $$3 : $$2.e().get().a().a()) {
            $$0.b(new btq($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (btq $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cwp v() {
      return new cwp(cwt.pb);
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
