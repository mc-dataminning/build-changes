import javax.annotation.Nullable;

public class cnd extends cnb {
   private static final int f = 600;
   private static final int g = -1;
   private static final ajv<Integer> h = ajz.a(cnd.class, ajx.b);
   private static final byte i = 0;

   public cnd(bsw<? extends cnd> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnd(dcu $$0, double $$1, double $$2, double $$3, cuo $$4, @Nullable cuo $$5) {
      super(bsw.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.N();
   }

   public cnd(dcu $$0, btl $$1, cuo $$2, @Nullable cuo $$3) {
      super(bsw.e, $$1, $$0, $$2, $$3);
      this.N();
   }

   private cws L() {
      return this.z().a(kq.G, cws.a);
   }

   private void a(cws $$0) {
      this.z().b(kq.G, $$0);
      this.N();
   }

   @Override
   protected void a(cuo $$0) {
      super.a($$0);
      this.N();
   }

   private void N() {
      cws $$0 = this.L();
      this.ao.a(h, $$0.equals(cws.a) ? -1 : $$0.b());
   }

   public void a(bry $$0) {
      this.a(this.L().a($$0));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.L().equals(cws.a) && this.c >= 600) {
         this.dQ().a(this, (byte)0);
         this.a(new cuo(cur.ow));
      }
   }

   private void b(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dQ().a(lf.a(lm.u, $$1), this.d(0.5), this.dy(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int H() {
      return this.ao.a(h);
   }

   @Override
   protected void a(btl $$0) {
      super.a($$0);
      bsq $$1 = this.J();
      cws $$2 = this.L();
      if ($$2.e().isPresent()) {
         for (bry $$3 : $$2.e().get().a().a()) {
            $$0.b(new bry($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bry $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cuo y() {
      return new cuo(cur.ow);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.H();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dQ().a(lf.a(lm.u, $$2, $$3, $$4), this.d(0.5), this.dy(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
