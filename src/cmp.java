import javax.annotation.Nullable;

public class cmp extends cmn {
   private static final int f = 600;
   private static final int g = -1;
   private static final ajp<Integer> h = ajt.a(cmp.class, ajr.b);
   private static final byte i = 0;

   public cmp(bsj<? extends cmp> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cmp(dcd $$0, double $$1, double $$2, double $$3, cua $$4, @Nullable cua $$5) {
      super(bsj.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.M();
   }

   public cmp(dcd $$0, bsy $$1, cua $$2, @Nullable cua $$3) {
      super(bsj.e, $$1, $$0, $$2, $$3);
      this.M();
   }

   private cwb K() {
      return this.z().a(kn.G, cwb.a);
   }

   private void a(cwb $$0) {
      this.z().b(kn.G, $$0);
      this.M();
   }

   @Override
   protected void a(cua $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      cwb $$0 = this.K();
      this.ao.a(h, $$0.equals(cwb.a) ? -1 : $$0.b());
   }

   public void a(brl $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(cwb.a) && this.c >= 600) {
         this.dP().a(this, (byte)0);
         this.a(new cua(cud.ov));
      }
   }

   private void b(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dP().a(lc.a(lj.u, $$1), this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int H() {
      return this.ao.a(h);
   }

   @Override
   protected void a(bsy $$0) {
      super.a($$0);
      bsd $$1 = this.I();
      cwb $$2 = this.K();
      if ($$2.e().isPresent()) {
         for (brl $$3 : $$2.e().get().a().a()) {
            $$0.b(new brl($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (brl $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cua y() {
      return new cua(cud.ov);
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
               this.dP().a(lc.a(lj.u, $$2, $$3, $$4), this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
